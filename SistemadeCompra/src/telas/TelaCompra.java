/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import controladores.ControladorEntidades;
import entidades.Funcionario;
import entidades.Produto;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author jsouza
 */
public class TelaCompra extends javax.swing.JPanel {

    /**
     * Creates new form TelaCompra
     */
      Component frame = null;
    public TelaCompra() {
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

        btn_produto1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_produto5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_produto2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_produto3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_produto4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_produto8 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_produto6 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btn_produto7 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        adicionar_cod = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 250, 250));

        btn_produto1.setIcon(new javax.swing.ImageIcon("/home/jsouza/Área de Trabalho/DSO-II-Sistema-de-Compra/SistemadeCompra/public/abacaxi.jpg")); // NOI18N
        btn_produto1.setActionCommand("abacaxi");
        btn_produto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_produto1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(79, 79, 79));
        jLabel1.setForeground(new java.awt.Color(79, 79, 79));
        jLabel1.setText("Abacaxi Pérola AV 1un");

        jLabel2.setForeground(new java.awt.Color(52, 163, 55));
        jLabel2.setText("R$ 5,99");

        btn_produto5.setIcon(new javax.swing.ImageIcon("/home/jsouza/Área de Trabalho/DSO-II-Sistema-de-Compra/SistemadeCompra/public/kapo.jpeg")); // NOI18N

        jLabel3.setBackground(new java.awt.Color(79, 79, 79));
        jLabel3.setForeground(new java.awt.Color(79, 79, 79));
        jLabel3.setText("Água de Coco DO BEM");

        jLabel4.setForeground(new java.awt.Color(52, 163, 55));
        jLabel4.setText("R$ 7,99");

        btn_produto2.setIcon(new javax.swing.ImageIcon("/home/jsouza/Área de Trabalho/DSO-II-Sistema-de-Compra/SistemadeCompra/public/aguacoco.jpeg")); // NOI18N

        jLabel5.setBackground(new java.awt.Color(79, 79, 79));
        jLabel5.setForeground(new java.awt.Color(79, 79, 79));
        jLabel5.setText("Bombom Lacta Minions");

        jLabel6.setForeground(new java.awt.Color(52, 163, 55));
        jLabel6.setText("R$ 11,95");

        btn_produto3.setIcon(new javax.swing.ImageIcon("/home/jsouza/Área de Trabalho/DSO-II-Sistema-de-Compra/SistemadeCompra/public/bombom.jpeg")); // NOI18N

        jLabel7.setBackground(new java.awt.Color(79, 79, 79));
        jLabel7.setForeground(new java.awt.Color(79, 79, 79));
        jLabel7.setText("Sopinha Nestlé Frango");

        jLabel8.setForeground(new java.awt.Color(52, 163, 55));
        jLabel8.setText("R$ 5,83");

        btn_produto4.setIcon(new javax.swing.ImageIcon("/home/jsouza/Área de Trabalho/DSO-II-Sistema-de-Compra/SistemadeCompra/public/sopinha.jpeg")); // NOI18N

        jLabel9.setBackground(new java.awt.Color(79, 79, 79));
        jLabel9.setForeground(new java.awt.Color(79, 79, 79));
        jLabel9.setText("Bolacha Bono Recheado");

        jLabel10.setForeground(new java.awt.Color(52, 163, 55));
        jLabel10.setText("R$ 2,14");

        btn_produto8.setIcon(new javax.swing.ImageIcon("/home/jsouza/Área de Trabalho/DSO-II-Sistema-de-Compra/SistemadeCompra/public/nescau.jpeg")); // NOI18N
        btn_produto8.setText("");
        btn_produto8.setActionCommand("abacaxi");
        btn_produto8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_produto8ActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(79, 79, 79));
        jLabel11.setForeground(new java.awt.Color(79, 79, 79));
        jLabel11.setText("Suco KAPO 200ml");

        jLabel12.setForeground(new java.awt.Color(52, 163, 55));
        jLabel12.setText("R$ 2,78");

        btn_produto6.setIcon(new javax.swing.ImageIcon("/home/jsouza/Área de Trabalho/DSO-II-Sistema-de-Compra/SistemadeCompra/public/bono.jpeg")); // NOI18N
        btn_produto6.setActionCommand("abacaxi");
        btn_produto6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_produto6ActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(79, 79, 79));
        jLabel13.setForeground(new java.awt.Color(79, 79, 79));
        jLabel13.setText("Refrigerante cocacola café");

        jLabel14.setForeground(new java.awt.Color(52, 163, 55));
        jLabel14.setText("R$ 1,89");

        btn_produto7.setIcon(new javax.swing.ImageIcon("/home/jsouza/Área de Trabalho/DSO-II-Sistema-de-Compra/SistemadeCompra/public/coca.jpeg")); // NOI18N
        btn_produto7.setActionCommand("abacaxi");
        btn_produto7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_produto7ActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(79, 79, 79));
        jLabel15.setForeground(new java.awt.Color(79, 79, 79));
        jLabel15.setText("Nescau achocolatado");

        jLabel16.setForeground(new java.awt.Color(52, 163, 55));
        jLabel16.setText("R$ 7,99");

        adicionar_cod.setText("Adicionar código de barra");
        adicionar_cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionar_codActionPerformed(evt);
            }
        });

        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        jButton3.setText("Carrinho");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_voltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(adicionar_cod))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_produto5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(btn_produto1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel12)
                                            .addComponent(btn_produto6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(btn_produto2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)))))
                            .addComponent(jLabel10))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(btn_produto3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel6))
                                    .addComponent(btn_produto7, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addGap(62, 62, 62)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(btn_produto4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_produto8, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_produto1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_produto2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_produto3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn_produto4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel6)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)))))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_produto5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_produto6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_produto7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_produto8, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel13)
                        .addComponent(jLabel15))
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_voltar)
                    .addComponent(adicionar_cod)
                    .addComponent(jButton3))
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_produto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_produto1ActionPerformed
      JOptionPane.showMessageDialog(frame, "Cód. 204237");


    }//GEN-LAST:event_btn_produto1ActionPerformed

    private void btn_produto8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_produto8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_produto8ActionPerformed

    private void btn_produto6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_produto6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_produto6ActionPerformed

    private void btn_produto7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_produto7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_produto7ActionPerformed

    private void adicionar_codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionar_codActionPerformed
          String option = JOptionPane.showInputDialog("Digite o código de barras:");
           Produto produto = ControladorEntidades.getInstance().getProdutoByCod(option);
        if (produto != null) {
            ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaPrincipal();
        } else if (option != null) {
            JOptionPane.showMessageDialog(null, "Erro, produto não encontrado.");
        }
    }//GEN-LAST:event_adicionar_codActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        String option = JOptionPane.showInputDialog("Entre com o ID do funcionário:");

        Funcionario funcionario = ControladorEntidades.getInstance().getFuncionarioById(option);
        if (funcionario != null) {
            ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaPrincipal();
        } else if (option != null) {
            JOptionPane.showMessageDialog(null, "Erro, funcionário não encontrado.");
        }
      
    }//GEN-LAST:event_btn_voltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionar_cod;
    private javax.swing.JButton btn_produto1;
    private javax.swing.JButton btn_produto2;
    private javax.swing.JButton btn_produto3;
    private javax.swing.JButton btn_produto4;
    private javax.swing.JButton btn_produto5;
    private javax.swing.JButton btn_produto6;
    private javax.swing.JButton btn_produto7;
    private javax.swing.JButton btn_produto8;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
