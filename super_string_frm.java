//By Ajlal Paracha for Mr. Martins Gr.11 CS NighSchool Class on March 6th, 2021
//This is the Super String Software
public class super_string_frm extends javax.swing.JFrame {
    
      
    public super_string_frm() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_title = new javax.swing.JLabel();
        label_length = new javax.swing.JLabel();
        txt_input_length = new javax.swing.JTextField();
        btn_length = new javax.swing.JButton();
        label_4th = new javax.swing.JLabel();
        txt_input_4th = new javax.swing.JTextField();
        btn_4th = new javax.swing.JButton();
        btn_upper = new javax.swing.JButton();
        txt_input_upper = new javax.swing.JTextField();
        label_upper = new javax.swing.JLabel();
        lbl_anwser_length = new javax.swing.JLabel();
        lbl_anwser_4th = new javax.swing.JLabel();
        lbl_anwser_upper = new javax.swing.JLabel();
        label_4to6 = new javax.swing.JLabel();
        lbl_anwser_identical = new javax.swing.JLabel();
        label_identical = new javax.swing.JLabel();
        txt_input_letter_letter = new javax.swing.JTextField();
        btn_identical = new javax.swing.JButton();
        label_letter = new javax.swing.JLabel();
        txt_input_letter_string = new javax.swing.JTextField();
        btn_letter = new javax.swing.JButton();
        btn_4to6 = new javax.swing.JButton();
        lbl_anwser_letter = new javax.swing.JLabel();
        txt_input_4to6 = new javax.swing.JTextField();
        lbl_anwser_4to6 = new javax.swing.JLabel();
        label_x = new javax.swing.JLabel();
        btn_x = new javax.swing.JButton();
        txt_input_x = new javax.swing.JTextField();
        lbl_anwser_x = new javax.swing.JLabel();
        txt_input_identical2 = new javax.swing.JTextField();
        txt_input_identical1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_title.setForeground(new java.awt.Color(0, 0, 200));
        label_title.setText("Super String Software");

        label_length.setText("Enter a string. The program will output the number of character in it.");

        txt_input_length.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_input_lengthActionPerformed(evt);
            }
        });

        btn_length.setText("Length");
        btn_length.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lengthActionPerformed(evt);
            }
        });

        label_4th.setText("Enter a string. The program will output the character at the 4th spot.");

        txt_input_4th.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_input_4thActionPerformed(evt);
            }
        });

        btn_4th.setText("4th Spot");
        btn_4th.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4thActionPerformed(evt);
            }
        });

        btn_upper.setText("Uppercase");
        btn_upper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_upperActionPerformed(evt);
            }
        });

        txt_input_upper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_input_upperActionPerformed(evt);
            }
        });

        label_upper.setText("Enter a string using lowercase letters. The program will output it in uppercase.");

        lbl_anwser_length.setText("___");

        lbl_anwser_4th.setText("___");

        lbl_anwser_upper.setText("___");

        label_4to6.setText("Enter a string that is 8+ characters long and the program will output characters 4-6.");

        lbl_anwser_identical.setText("___");

        label_identical.setText("Enter 2 strings and the program will tell you if they are identical.");

        txt_input_letter_letter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_input_letter_letterActionPerformed(evt);
            }
        });

        btn_identical.setText("Identical?");
        btn_identical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_identicalActionPerformed(evt);
            }
        });

        label_letter.setText("Enter a string and a character. The program will tell you if the character is in the string. ");

        txt_input_letter_string.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_input_letter_stringActionPerformed(evt);
            }
        });

        btn_letter.setText("Letter Found?");
        btn_letter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_letterActionPerformed(evt);
            }
        });

        btn_4to6.setText("Characters 4-6");
        btn_4to6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4to6ActionPerformed(evt);
            }
        });

        lbl_anwser_letter.setText("___");

        txt_input_4to6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_input_4to6ActionPerformed(evt);
            }
        });

        lbl_anwser_4to6.setText("___");

        label_x.setText("Enter a string with at least one a. The program will change all the a's to x's. ");

        btn_x.setText("Replace a's");
        btn_x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xActionPerformed(evt);
            }
        });

        txt_input_x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_input_xActionPerformed(evt);
            }
        });

        lbl_anwser_x.setText("___");

        txt_input_identical2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_input_identical2ActionPerformed(evt);
            }
        });

        txt_input_identical1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_input_identical1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(label_title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(label_x)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txt_input_x, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(55, 55, 55)
                                    .addComponent(lbl_anwser_x)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_x)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(label_identical)
                                .addComponent(label_letter)
                                .addComponent(label_4to6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(label_length, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_upper, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_input_upper, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(lbl_anwser_upper)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_upper))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_input_4th, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56)
                                        .addComponent(lbl_anwser_4th)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_4th))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_input_length, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56)
                                        .addComponent(lbl_anwser_length)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_length))
                                    .addComponent(label_4th, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_anwser_identical)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_identical)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txt_input_4to6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(55, 55, 55)
                                    .addComponent(lbl_anwser_4to6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_4to6)
                                    .addGap(52, 52, 52))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txt_input_letter_string, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(103, 103, 103)
                                    .addComponent(txt_input_letter_letter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_anwser_letter)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_letter)
                                    .addGap(54, 54, 54))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(txt_input_identical2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(389, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(230, Short.MAX_VALUE)
                    .addComponent(txt_input_identical1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(215, 215, 215)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(label_title)
                .addGap(27, 27, 27)
                .addComponent(label_length)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_input_length, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_length)
                    .addComponent(lbl_anwser_length))
                .addGap(18, 18, 18)
                .addComponent(label_4th)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_input_4th, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_4th)
                    .addComponent(lbl_anwser_4th))
                .addGap(18, 18, 18)
                .addComponent(label_upper)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_input_upper, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_upper)
                    .addComponent(lbl_anwser_upper))
                .addGap(18, 18, 18)
                .addComponent(label_identical)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_identical)
                    .addComponent(lbl_anwser_identical))
                .addGap(37, 37, 37)
                .addComponent(label_letter)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_input_letter_string, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_letter)
                    .addComponent(lbl_anwser_letter)
                    .addComponent(txt_input_letter_letter, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(label_4to6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_input_4to6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_4to6)
                    .addComponent(lbl_anwser_4to6))
                .addGap(29, 29, 29)
                .addComponent(label_x)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_input_x, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_x)
                    .addComponent(lbl_anwser_x))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(431, Short.MAX_VALUE)
                    .addComponent(txt_input_identical2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(344, 344, 344)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(441, Short.MAX_VALUE)
                    .addComponent(txt_input_identical1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(334, 334, 334)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_lengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lengthActionPerformed
        //get string intput from text box
        String number_of_characters = txt_input_length.getText(); 
        //output length of string and output in respective label
        lbl_anwser_length.setText(String.valueOf(number_of_characters.length()));
    }//GEN-LAST:event_btn_lengthActionPerformed

    private void txt_input_lengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_input_lengthActionPerformed
       
    }//GEN-LAST:event_txt_input_lengthActionPerformed

    private void txt_input_4thActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_input_4thActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_input_4thActionPerformed

    private void btn_4thActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4thActionPerformed
        //get string intput from text box
        String position_4th = txt_input_4th.getText(); 
        //output character at position 4 of string and output in respective label
        lbl_anwser_4th.setText(String.valueOf(position_4th.charAt(3)));
    }//GEN-LAST:event_btn_4thActionPerformed

    private void btn_upperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_upperActionPerformed
        //get string intput from text box        
        String lowercase = txt_input_upper.getText();
        //output string in uppercase in respective label
        lbl_anwser_upper.setText(String.valueOf(lowercase.toUpperCase()));
    }//GEN-LAST:event_btn_upperActionPerformed

    private void txt_input_upperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_input_upperActionPerformed
        
    }//GEN-LAST:event_txt_input_upperActionPerformed

    private void txt_input_letter_letterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_input_letter_letterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_input_letter_letterActionPerformed

    private void btn_identicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_identicalActionPerformed
        //get string intput from text box        
        String identical1 = txt_input_identical1.getText();
        String identical2 = txt_input_identical2.getText();
        //Check if strings are identical. If so, print yes; else, no. 
        if (identical1.equals(identical2)) {
            lbl_anwser_identical.setText(String.valueOf("Yes"));
        }
        else {
            lbl_anwser_identical.setText(String.valueOf("No"));
        }
    }//GEN-LAST:event_btn_identicalActionPerformed

    private void txt_input_letter_stringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_input_letter_stringActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_input_letter_stringActionPerformed

    private void btn_letterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_letterActionPerformed
        //get string intput from text box and declaring temp to letter in char format and temp2 to index of temp in word string
        String word = txt_input_letter_string.getText();
        String letter = txt_input_letter_letter.getText();
        char temp = letter.charAt(0);
        int temp2 = word.indexOf(temp);
        //if temp2 is -1, then index method could not find the letter in the string and we output no
        if (temp2 == -1) {
            lbl_anwser_letter.setText(String.valueOf("No"));
        }
        //else it means the letter was found so we print yes
        else {
            lbl_anwser_letter.setText(String.valueOf("Yes"));
        }
        
        
    }//GEN-LAST:event_btn_letterActionPerformed

    private void btn_4to6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4to6ActionPerformed
        //get string intput from text box        
        String fourtosix = txt_input_4to6.getText();
        //checking if string is 8+ characters long and, if so, printing substring 4th-6th characters
        if ((fourtosix.length()) >= 8) {
            lbl_anwser_4to6.setText(String.valueOf(fourtosix.substring(3,6)));
        }
        //else inform user the string has to be longer
        else {
            lbl_anwser_4to6.setText(String.valueOf("Not long enough"));
        }
    }//GEN-LAST:event_btn_4to6ActionPerformed

    private void txt_input_4to6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_input_4to6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_input_4to6ActionPerformed

    private void btn_xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xActionPerformed
        //get string intput from text box and declaring temp3 variable to a  
        String x_to_a = txt_input_x.getText();
        int temp3 = x_to_a.indexOf('a');
        //if temp3 is -1, then index method could not find the letter a in the string and we inform user to enter another string
        if (temp3 == -1) {
            lbl_anwser_letter.setText(String.valueOf("No a's. New string please."));
        }
        //else it means a is in the string and we being replacing
        else {
            lbl_anwser_x.setText(String.valueOf(x_to_a.replaceAll("a", "x")));
        }
    }//GEN-LAST:event_btn_xActionPerformed

    private void txt_input_xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_input_xActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_input_xActionPerformed

    private void txt_input_identical2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_input_identical2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_input_identical2ActionPerformed

    private void txt_input_identical1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_input_identical1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_input_identical1ActionPerformed

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
            java.util.logging.Logger.getLogger(super_string_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(super_string_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(super_string_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(super_string_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new super_string_frm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_4th;
    private javax.swing.JButton btn_4to6;
    private javax.swing.JButton btn_identical;
    private javax.swing.JButton btn_length;
    private javax.swing.JButton btn_letter;
    private javax.swing.JButton btn_upper;
    private javax.swing.JButton btn_x;
    private javax.swing.JLabel label_4th;
    private javax.swing.JLabel label_4to6;
    private javax.swing.JLabel label_identical;
    private javax.swing.JLabel label_length;
    private javax.swing.JLabel label_letter;
    private javax.swing.JLabel label_title;
    private javax.swing.JLabel label_upper;
    private javax.swing.JLabel label_x;
    private javax.swing.JLabel lbl_anwser_4th;
    private javax.swing.JLabel lbl_anwser_4to6;
    private javax.swing.JLabel lbl_anwser_identical;
    private javax.swing.JLabel lbl_anwser_length;
    private javax.swing.JLabel lbl_anwser_letter;
    private javax.swing.JLabel lbl_anwser_upper;
    private javax.swing.JLabel lbl_anwser_x;
    private javax.swing.JTextField txt_input_4th;
    private javax.swing.JTextField txt_input_4to6;
    private javax.swing.JTextField txt_input_identical1;
    private javax.swing.JTextField txt_input_identical2;
    private javax.swing.JTextField txt_input_length;
    private javax.swing.JTextField txt_input_letter_letter;
    private javax.swing.JTextField txt_input_letter_string;
    private javax.swing.JTextField txt_input_upper;
    private javax.swing.JTextField txt_input_x;
    // End of variables declaration//GEN-END:variables
}
