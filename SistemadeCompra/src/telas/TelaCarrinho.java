/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import controladores.ControladorCarrinho;
import controladores.ControladorEntidades;
import entidades.Funcionario;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;




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
        refresh();
    }

    public void refresh(){
        lista.setListData(ControladorCarrinho.getInstance().CodNomePrecoProdutos());
          lbl_total.setText("R$: " + ControladorCarrinho.getInstance().getTotal());
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
        btn_concluir_compra = new javax.swing.JButton();
        btn_continuar_compra = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        carrinho = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        carrinho1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

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
        setToolTipText("a");

        btn_concluir_compra.setBackground(new java.awt.Color(52, 163, 55));
        btn_concluir_compra.setForeground(new java.awt.Color(250, 250, 250));
        btn_concluir_compra.setText("Concluir sua compra");
        btn_concluir_compra.setActionCommand("");
        btn_concluir_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_concluir_compraActionPerformed(evt);
            }
        });

        btn_continuar_compra.setBackground(new java.awt.Color(95, 0, 0));
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

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setForeground(new java.awt.Color(250, 250, 250));
        jButton1.setText("Cancelar Produto");
        jButton1.setToolTipText("Chame um funcionário para confirmar o cancelamento!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(carrinho)
                        .addGap(665, 665, 665))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_continuar_compra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(523, 523, 523)
                                .addComponent(btn_concluir_compra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(515, 515, 515)
                                .addComponent(carrinho1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_total)
                                .addGap(4, 4, 4)))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(carrinho)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(carrinho1)
                        .addComponent(lbl_total))
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_concluir_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_continuar_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_concluir_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_concluir_compraActionPerformed
         if(ControladorCarrinho.getInstance().getTotalDouble() == 0.0){
            JOptionPane.showMessageDialog(null, "O carrinho está vazio!");
           
        }else{
        ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaPagamento();
         }
         
    }//GEN-LAST:event_btn_concluir_compraActionPerformed
    
    private void btn_continuar_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_continuar_compraActionPerformed
       ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaCompra();
        
    }//GEN-LAST:event_btn_continuar_compraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           if(lista.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "Não há itens selecionados.");   
            return;
        }
        
        String option = JOptionPane.showInputDialog("Entre com o ID do funcionário:");
        Funcionario funcionario = ControladorEntidades.getInstance().getFuncionarioById(option);
        if (funcionario != null) {
           ControladorCarrinho.getInstance().remove(lista.getSelectedIndex());
           refresh();
        } else if (option != null) {
            JOptionPane.showMessageDialog(null, "Erro, funcionário não encontrado.");
       
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_concluir_compra;
    private javax.swing.JButton btn_continuar_compra;
    private javax.swing.JLabel carrinho;
    private javax.swing.JLabel carrinho1;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JList<String> lista;
    // End of variables declaration//GEN-END:variables
}
