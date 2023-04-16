/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package exercicio.exemplo.java.swing;

import java.awt.Color;

/**
 *
 * @author kanaiama
 */
public class TelaAluno extends javax.swing.JFrame {

    /**
     * Creates new form TelaAluno
     */
    public TelaAluno() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloTela = new javax.swing.JLabel();
        txtNota01 = new javax.swing.JTextField();
        txtNota02 = new javax.swing.JTextField();
        btnCalcularMedia = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblResultadoAprovacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTituloTela.setText("Tela para cálculo de média");

        txtNota01.setText("---");
        txtNota01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNota01ActionPerformed(evt);
            }
        });

        txtNota02.setText("---");
        txtNota02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNota02ActionPerformed(evt);
            }
        });

        btnCalcularMedia.setText("Resultado");
        btnCalcularMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularMediaActionPerformed(evt);
            }
        });

        lblResultadoAprovacao.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblResultadoAprovacao.setText("---");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(txtNota01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNota02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblResultadoAprovacao)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(lblTituloTela))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(btnCalcularMedia)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lblTituloTela)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNota01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNota02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btnCalcularMedia)
                .addGap(37, 37, 37)
                .addComponent(lblResultadoAprovacao)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNota01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNota01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNota01ActionPerformed

    private void txtNota02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNota02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNota02ActionPerformed

    private void btnCalcularMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularMediaActionPerformed
        // TODO add your handling code here:
        String nota01 = txtNota01.getText();
        Double nota01Convertida = Double.valueOf(nota01);
        
        Double nota02Convertida = Double.valueOf(txtNota02.getText());
        
        Double resultadoNota = (nota01Convertida * 0.4) + (nota02Convertida * 0.6);
        
        
        if(resultadoNota >= 6) {
//             OPCIONAL: 
//            String resultadoFormatado = String.format("%.2f",
//                    resultadoNota); 
            lblResultadoAprovacao.setText("Aprovado " + resultadoNota.toString());
            lblResultadoAprovacao.setForeground(Color.GREEN);
        } else {
            lblResultadoAprovacao.setText("Reprovado " + resultadoNota.toString());
            lblResultadoAprovacao.setForeground(Color.RED);

        }
    }//GEN-LAST:event_btnCalcularMediaActionPerformed

    /**[255,255,255]
     * @param args [255,255,255]the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularMedia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblResultadoAprovacao;
    private javax.swing.JLabel lblTituloTela;
    private javax.swing.JTextField txtNota01;
    private javax.swing.JTextField txtNota02;
    // End of variables declaration//GEN-END:variables
}