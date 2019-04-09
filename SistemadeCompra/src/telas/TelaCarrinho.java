/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import controladores.ControladorCarrinho;
import controladores.ControladorEntidades;
import controladores.ControladorProduto;
import entidades.Carrinho;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author jsouza
 */
public class TelaCarrinho extends javax.swing.JPanel {

    /**
     * Creates new form Carrinho
     */
     
    public TelaCarrinho() {
        initComponents(); 
          lista.setListData(ControladorCarrinho.getInstance().nomesProdutos());
          lbl_total.setText(ControladorCarrinho.getInstance().getTotal());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        btn_cancelar_compra = new javax.swing.JButton();
        btn_continuar_compra = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        carrinho = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        carrinho1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));

        btn_cancelar_compra.setBackground(new java.awt.Color(52, 163, 55));
        btn_cancelar_compra.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btn_cancelar_compra.setForeground(new java.awt.Color(250, 250, 250));
        btn_cancelar_compra.setText("Concluir sua compra");
        btn_cancelar_compra.setActionCommand("");
        btn_cancelar_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_compraActionPerformed(evt);
            }
        });

        btn_continuar_compra.setBackground(new java.awt.Color(95, 0, 0));
        btn_continuar_compra.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btn_continuar_compra.setForeground(new java.awt.Color(250, 250, 250));
        btn_continuar_compra.setText("Continuar comprando");
        btn_continuar_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_continuar_compraActionPerformed(evt);
            }
        });

        lista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Teste", "teste", "teste" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lista);

        carrinho.setFont(new java.awt.Font("Noto Sans CJK KR Black", 0, 24)); // NOI18N
        carrinho.setForeground(new java.awt.Color(95, 0, 0));
        carrinho.setText("MEU CARRINHO");

        lbl_total.setFont(new java.awt.Font("Noto Sans CJK TC Black", 1, 24)); // NOI18N
        lbl_total.setForeground(new java.awt.Color(95, 0, 0));
        lbl_total.setText("jLabel2");

        carrinho1.setFont(new java.awt.Font("Noto Sans CJK KR Black", 0, 24)); // NOI18N
        carrinho1.setForeground(new java.awt.Color(95, 0, 0));
        carrinho1.setText("Total:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(carrinho1)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_total))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btn_continuar_compra)
                                    .addGap(523, 523, 523)
                                    .addComponent(btn_cancelar_compra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(carrinho)
                                    .addGap(665, 665, 665)))
                            .addComponent(jScrollPane1))))
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(carrinho)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carrinho1)
                    .addComponent(lbl_total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_continuar_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelar_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_compraActionPerformed
      ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaPagamento();
    }//GEN-LAST:event_btn_cancelar_compraActionPerformed

    private void btn_continuar_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_continuar_compraActionPerformed
          ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaCompra();
    }//GEN-LAST:event_btn_continuar_compraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar_compra;
    private javax.swing.JButton btn_continuar_compra;
    private javax.swing.JLabel carrinho;
    private javax.swing.JLabel carrinho1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JList<String> lista;
    // End of variables declaration//GEN-END:variables
}
