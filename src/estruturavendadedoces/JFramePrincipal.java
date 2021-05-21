
package estruturavendadedoces;
/**
 *
 * @author arauj
 */
public class JFramePrincipal extends javax.swing.JFrame {


    public JFramePrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jButtonFazerPedido = new javax.swing.JButton();
        jButtonConfirmarPagamento = new javax.swing.JButton();
        jButtonConfirmarEntrega = new javax.swing.JButton();
        jButtonLancarTodosPedidos = new javax.swing.JButton();
        jButtonListarPagamentosPendentes = new javax.swing.JButton();
        jButtonListarEntregasPendentes = new javax.swing.JButton();
        jButtonDeletarPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Venda de Doces");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButtonFazerPedido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonFazerPedido.setText("Lançar Pedido");
        jButtonFazerPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFazerPedidoActionPerformed(evt);
            }
        });

        jButtonConfirmarPagamento.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonConfirmarPagamento.setText("Confirmar Pagamento");
        jButtonConfirmarPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarPagamentoActionPerformed(evt);
            }
        });

        jButtonConfirmarEntrega.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonConfirmarEntrega.setText("Confirmar Entrega");

        jButtonLancarTodosPedidos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonLancarTodosPedidos.setText("Listar Todos os Pedidos");

        jButtonListarPagamentosPendentes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonListarPagamentosPendentes.setText("Listar Pagamentos Pendentes");

        jButtonListarEntregasPendentes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonListarEntregasPendentes.setText("Listar Entregas Pendentes");

        jButtonDeletarPedido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonDeletarPedido.setText("Deletar Pedido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonFazerPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonConfirmarPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(jButtonConfirmarEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonListarPagamentosPendentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonLancarTodosPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonListarEntregasPendentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButtonDeletarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButtonFazerPedido))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonLancarTodosPedidos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmarPagamento)
                    .addComponent(jButtonListarPagamentosPendentes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmarEntrega)
                    .addComponent(jButtonListarEntregasPendentes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonDeletarPedido)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //botão fazer pedido
    private void jButtonFazerPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFazerPedidoActionPerformed
        // faz pedido
        new JFrameFazerPedido().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonFazerPedidoActionPerformed

    //confirmar pagamento
    private void jButtonConfirmarPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarPagamentoActionPerformed
        new JFrameConfirmarPagamento().setVisible(true);
    }//GEN-LAST:event_jButtonConfirmarPagamentoActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmarEntrega;
    private javax.swing.JButton jButtonConfirmarPagamento;
    private javax.swing.JButton jButtonDeletarPedido;
    private javax.swing.JButton jButtonFazerPedido;
    private javax.swing.JButton jButtonLancarTodosPedidos;
    private javax.swing.JButton jButtonListarEntregasPendentes;
    private javax.swing.JButton jButtonListarPagamentosPendentes;
    // End of variables declaration//GEN-END:variables
}
