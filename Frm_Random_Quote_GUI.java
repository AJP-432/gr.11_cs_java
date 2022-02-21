// By Ajlal Paracha Feb 5th, 2021 in Mr. Martins Gr. 11 CS Night School Class

import java.lang.Math;

public class Frm_Random_Quote_GUI extends javax.swing.JFrame {

    String quote;    //initializing quote variable which will eventually be outputted
    
    public Frm_Random_Quote_GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_generate = new javax.swing.JButton();
        lbl_show_quote = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(100, 100, 187));
        jLabel1.setText("Random Quote Generator");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Click \"Generate\" to become INSPIRED!");

        btn_generate.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_generate.setForeground(new java.awt.Color(187, 100, 100));
        btn_generate.setText("Generate");
        btn_generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btn_generate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lbl_show_quote)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(btn_generate)
                        .addGap(34, 34, 34)
                        .addComponent(lbl_show_quote)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generateActionPerformed
        
        int random_number = (int)Math.round(Math.random()*9+1); //a random integer between 1-10 is generated
        
        //using switch cases we can assign a string value to the variable quote depending on the value of random_number
        switch (random_number) {
        
            case 1:  
                quote = "\"Act as if what you do makes a difference. It does\" - William James";
                break;
            case 2:
                quote = "\"Believe you can and you're halfway there\" - Theodore Roosevelt";
             break;
            case 3:
                quote = "\"When you have a dream, you've got to grab it and never let go\" - Carol Burnett";
                break;
            case 4:
                quote = "\"Limit your 'ALWAYS' and your 'NEVERS'\" - Amy Poehler";
                break;
            case 5:
                quote = "\"Nothing is IMPOSSIBLE. The word itself says I'M POSSIBLE!\" - Audrey Hepburn";
                break;
            case 6:
                quote = "\"Try to become a RAINBOW in someone else's cloud\" - Maya Angelou";
                break;
            case 7:
                quote = "\"You do not find the happy life. You MAKE IT!\" - Camilla Kimball";
                break;
            case 8:
                quote= "\"The most wasted of days is one without laughter\" - E.E. Cummings";
                break;
            case 9:
                quote = "\"You must do the things you think you cannot do.\" - Eleanor Roosevelt";
                break;
            case 10:
                quote = "\"It isn't where you came from. It's where you're going that counts.\" - Ella Fitzgerald";
                break;
            
        }
        
        lbl_show_quote.setText(String.valueOf(quote)); //outputting the quote
        
    }//GEN-LAST:event_btn_generateActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Random_Quote_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Random_Quote_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Random_Quote_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Random_Quote_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Random_Quote_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_generate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_show_quote;
    // End of variables declaration//GEN-END:variables
}
