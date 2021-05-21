
package estruturavendadedoces;

import java.sql.*; //o * coloca .sql para todos
import java.util.*;

public class ConexaoAccess {
    
    public void InserirDados(String nome, String dataPedido, int qtdDoceLeite200, int qtdDoceLeite500, int qtdDoceCoco200, int qtdDoceCoco500, float valorTotal, float valorAdiantado, float valorAPagar, String obs) throws SQLException{
        
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://D:/HDD_Este Computador/HDD_Documentos/projeto_venda_doces/EstruturaVendaDeDoces/Vendas_Doces.accdb");
            //Statement stmt = con.createStatement();
            
            //coloca-se esta stirng me SQL para dizer ao banco de dados o que inserir e então usando a preparedstatement consigo atriuie variaveis
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO VENDAS (NOME,DATA_DO_PEDIDO,TOTAL_DA_COMPRA,VALOR_ADIANTADO,VALOR_A_PAGAR,QTD_DOCE_DE_LEITE_200G,QTD_DOCE_DE_LEITE_500G,QTD_DOCE_DE_COCO_200G,QTD_DOCE_DE_COCO_500G,OBSERVAÇÕES,PAGAMENTO,DATA_ENTREGA) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            pstmt.setString(1, nome);
            pstmt.setString(2, dataPedido);
            pstmt.setFloat(3, valorTotal);
            pstmt.setFloat(4, valorAdiantado);
            pstmt.setFloat(5,valorAPagar);
            pstmt.setInt(6, qtdDoceLeite200);
            pstmt.setInt(7, qtdDoceLeite500);
            pstmt.setInt(8, qtdDoceCoco200);
            pstmt.setInt(9, qtdDoceCoco500);
            pstmt.setString(10,obs);
            pstmt.setString(11, "PENDENTE");
            pstmt.setString(12,"N/A");
            
            pstmt.execute();
            con.close();
        
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void ConfirmaPagamento(int codPedido){
            
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://D:/HDD_Este Computador/HDD_Documentos/projeto_venda_doces/EstruturaVendaDeDoces/Vendas_Doces.accdb");
            //Statement stmt = con.createStatement();
            
            //coloca-se esta stirng me SQL para dizer ao banco de dados o que inserir e então usando a preparedstatement consigo atriuie variaveis
            PreparedStatement pstmt = con.prepareStatement("UPDATE VENDAS SET PAGAMENTO = 'PAGO' WHERE CODE_PEDIDO = (?)");            
            pstmt.setInt(1, codPedido);
            
            pstmt = con.prepareStatement("UPDATE VENDAS SET VALOR_A_PAGAR = 0.0 WHERE CODE_PEDIDO = (?)");
            pstmt.setInt(1, codPedido);
            
            pstmt.execute();
            con.close();
        
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void ConfirmarEntrega(String dataEntrega, int codPedido){
        
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://D:/HDD_Este Computador/HDD_Documentos/projeto_venda_doces/EstruturaVendaDeDoces/Vendas_Doces.accdb");
            //Statement stmt = con.createStatement();
            
            //coloca-se esta string em SQL para dizer ao banco de dados o que inserir e então usando a preparedstatement consigo atriuie variaveis
            PreparedStatement pstmt = con.prepareStatement("UPDATE VENDAS SET DATA_ENTREGA = (?) WHERE CODE_PEDIDO = (?)");
            pstmt.setString(1, dataEntrega);
            pstmt.setInt(2, codPedido);
            pstmt.execute();
            con.close();
        
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void ListarTodosPedidos(){
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://D:/HDD_Este Computador/HDD_Documentos/projeto_venda_doces/EstruturaVendaDeDoces/Vendas_Doces.accdb");
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM VENDAS");
            
            while(result.next()){
                System.out.println(result.getInt(1) +" "+ result.getString(2)+" "+result.getString(3)+" "+result.getString(4)+" "+result.getFloat(5)+" "+result.getFloat(6)+" "+result.getFloat(7)+" "+result.getString(8)+" "+result.getString(13));// + result.getString(2) /*+ result.getString(3) + result.getString(4)*/ + result.getFloat(5) + result.getFloat(6) + result.getFloat(7) + result.getString(8) + result.getString(13));
            }
            
            con.close();
        
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        } catch(SQLException e){
            e.printStackTrace();
        }       
    }
    
    public ArrayList<String> ListarPagamentosPendentes(){
        
        //lista que vai armazenar os dados do access  
        ArrayList<String> objPendentes = new ArrayList();
        
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://D:/HDD_Este Computador/HDD_Documentos/projeto_venda_doces/EstruturaVendaDeDoces/Vendas_Doces.accdb");
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM VENDAS WHERE PAGAMENTO = 'PENDENTE'");
     
            while(result.next()){
               
                objPendentes.add(result.getInt(1) +"                "+ result.getString(2)+"                "+result.getString(3)+"             "+result.getFloat(7)+"              "+result.getString(8));
            }
           
            con.close();
        
        } catch(ClassNotFoundException e){
            e.printStackTrace();
            objPendentes = null;
        } catch(SQLException e){
            e.printStackTrace();
            objPendentes = null;
        }      
        return objPendentes;
    }
    
    public void ListarEntregasPendentes(){
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://D:/HDD_Este Computador/HDD_Documentos/projeto_venda_doces/EstruturaVendaDeDoces/Vendas_Doces.accdb");
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM VENDAS WHERE DATA_ENTREGA = 'N/A'");
            //PreparedStatement pstmt = con.prepareStatement("");
            
            while(result.next()){
                System.out.println(result.getInt(1) +" "+ result.getString(2)+" "+result.getString(3)+" "+result.getString(4)+" "+result.getFloat(5)+" "+result.getFloat(6)+" "+result.getFloat(7)+" "+result.getString(8)+" "+result.getString(13));// + result.getString(2) /*+ result.getString(3) + result.getString(4)*/ + result.getFloat(5) + result.getFloat(6) + result.getFloat(7) + result.getString(8) + result.getString(13));
            }
            
            con.close();
        
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        } catch(SQLException e){
            e.printStackTrace();
        }      
    }
    
    public void ApagarPedido(int codePedido){
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://D:/HDD_Este Computador/HDD_Documentos/projeto_venda_doces/EstruturaVendaDeDoces/Vendas_Doces.accdb");
            
            PreparedStatement pstmt = con.prepareStatement("DELETE FROM VENDAS WHERE CODE_PEDIDO = (?)");
            pstmt.setInt(1, codePedido);
            pstmt.execute();
            
            System.out.println("Pedido deletado com sucesso!");
            
            con.close();
        
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        } catch(SQLException e){
            e.printStackTrace();
        }        
    }
    
    

}
