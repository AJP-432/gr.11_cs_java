/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AJ
 */
public class Frm_MakingPurchases_form extends javax.swing.JFrame {

    /**
     * Creates new form Frm_MakingPurchases_form
     */
    public Frm_MakingPurchases_form() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_blueberry = new javax.swing.JLabel();
        lbl_cherry = new javax.swing.JLabel();
        lbl_bloody = new javax.swing.JLabel();
        lbl_mango = new javax.swing.JLabel();
        lbl_mint = new javax.swing.JLabel();
        lbl_orange = new javax.swing.JLabel();
        txt_cherry = new javax.swing.JTextField();
        txt_mango = new javax.swing.JTextField();
        txt_blueberry = new javax.swing.JTextField();
        txt_bloody = new javax.swing.JTextField();
        txt_mint = new javax.swing.JTextField();
        txt_orange = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lbl_tax = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        lbl_subtotal = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MACMAC.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Harlow Solid Italic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(128, 0, 128));
        jLabel2.setText("Ajlal & Mr. Martin's Macaroons");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setText("1. Please enter the number of macaroons you would like to purchase.");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setText("3. Purchase on amazon.com.");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setText("2. Click \"Calculate\" to recieve pricing.  ");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel6.setText("4. Repeat!");

        lbl_blueberry.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_blueberry.setText("Blueberry Macaroon ($2.99): ");

        lbl_cherry.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_cherry.setText("Cherry Macaroon ($1.99): ");

        lbl_bloody.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_bloody.setText("Bloody Mary Macaroon ($3.49): ");

        lbl_mango.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_mango.setText("Mango Macaroon ($3.49): ");

        lbl_mint.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_mint.setText("Mint Macaroon ($4.99): ");

        lbl_orange.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_orange.setText("Orange Macaroon ($99.99): ");

        txt_cherry.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_cherry.setText("0");

        txt_mango.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_mango.setText("0");

        txt_blueberry.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_blueberry.setText("0");

        txt_bloody.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_bloody.setText("0");

        txt_mint.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_mint.setText("0");

        txt_orange.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_orange.setText("0");

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel13.setText("Subtotal: ");

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel14.setText("Tax (HST 13%): ");

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 187, 0));
        jLabel15.setText("Grand Total: ");
        jLabel15.setToolTipText("");

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 30)); // NOI18N
        jButton1.setForeground(new java.awt.Color(187, 0, 0));
        jButton1.setText("Caclulate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbl_tax.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lbl_tax.setText("$0");

        lbl_total.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lbl_total.setForeground(new java.awt.Color(0, 187, 0));
        lbl_total.setText("$0");

        lbl_subtotal.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lbl_subtotal.setText("$0");

        jLabel7.setText("Note:");

        jLabel8.setText("- All values must be integers");

        jLabel9.setText("- Input-boxes musn't be empty. Enter 0 for none.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)))
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(lbl_cherry)
                                                .addGap(85, 85, 85))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbl_blueberry)
                                                .addGap(58, 58, 58)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lbl_mango)
                                            .addGap(87, 87, 87)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_bloody)
                                        .addGap(35, 35, 35)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_mint)
                                    .addGap(108, 108, 108)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_orange)
                                .addGap(71, 71, 71)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_orange, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_mint, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                .addComponent(txt_bloody)
                                .addComponent(txt_mango)
                                .addComponent(txt_blueberry)
                                .addComponent(txt_cherry)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel15))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_tax, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addComponent(lbl_subtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cherry)
                    .addComponent(txt_cherry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(lbl_tax, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(lbl_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_blueberry)
                            .addComponent(txt_blueberry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_mango)
                            .addComponent(txt_mango, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_bloody)
                    .addComponent(txt_bloody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_mint)
                            .addComponent(txt_mint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(lbl_total, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_orange)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_orange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int cherry = Integer.parseInt(txt_cherry.getText());   //initializing all the variables and getting their variables from the form's text fields
        int blueberry = Integer.parseInt(txt_blueberry.getText());
        int mango = Integer.parseInt(txt_mango.getText());
        int bloody = Integer.parseInt(txt_bloody.getText());
        int mint = Integer.parseInt(txt_mint.getText()); 
        int orange = Integer.parseInt(txt_orange.getText());
        
        /*calculating subtotal by adding number of each macaroons and mutiplying by their 
        respective cost and adding them all up */
        
        double subtotal = (cherry*1.99) + (blueberry*2.99) + (cherry*3.49) + (blueberry*4.99) + (orange*99.99); 
        double tax = subtotal * 0.13; //getting tax amount by multiplying subtotal by HST 13%
        double total = subtotal + tax; //assigning total value
        
        //converting subtotal, tax, and total to string and rounding to 2 decimals
        String subtotal_2 = String.format("$%.2f", subtotal);  
        String tax_2 = String.format("$%.2f", tax);
        String total_2 = String.format("$%.2f", total);
        
        //outputting anwser to labels
        lbl_subtotal.setText(String.valueOf(subtotal_2));
        lbl_tax.setText(String.valueOf(tax_2));
        lbl_total.setText(String.valueOf(total_2));
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(Frm_MakingPurchases_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_MakingPurchases_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_MakingPurchases_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_MakingPurchases_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_MakingPurchases_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_bloody;
    private javax.swing.JLabel lbl_blueberry;
    private javax.swing.JLabel lbl_cherry;
    private javax.swing.JLabel lbl_mango;
    private javax.swing.JLabel lbl_mint;
    private javax.swing.JLabel lbl_orange;
    private javax.swing.JLabel lbl_subtotal;
    private javax.swing.JLabel lbl_tax;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JTextField txt_bloody;
    private javax.swing.JTextField txt_blueberry;
    private javax.swing.JTextField txt_cherry;
    private javax.swing.JTextField txt_mango;
    private javax.swing.JTextField txt_mint;
    private javax.swing.JTextField txt_orange;
    // End of variables declaration//GEN-END:variables
}
