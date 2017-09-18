/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progetto_programmazione_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author Antonio
 */
public class GUI extends javax.swing.JFrame {

    String originalTxt = null;
    String modifiedTxt = null;

    /**
     * Creates new form GUI
     */
    public GUI() {
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
        importButton = new javax.swing.JButton();
        readText = new javax.swing.JLabel();
        replaceButton = new javax.swing.JButton();
        labelToInput = new javax.swing.JTextField();
        labelToReplace = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        previewButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        searchAndCountButton = new javax.swing.JButton();
        searchLabel = new javax.swing.JLabel();
        toUpperButton = new javax.swing.JButton();
        appendHeadButton = new javax.swing.JButton();
        appendTailButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboBoxRegex = new javax.swing.JComboBox<>();
        buttonReplaceRegex = new javax.swing.JButton();
        deleteButtonRegex = new javax.swing.JButton();
        replaceTextRegex = new javax.swing.JTextField();
        toLowerButton = new javax.swing.JButton();
        searchAndCountRegexButton = new javax.swing.JButton();
        similarityButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Title");

        importButton.setText("Import");
        importButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importButton(evt);
            }
        });

        readText.setText("Preview");

        replaceButton.setText("Replace with");
        replaceButton.setEnabled(false);
        replaceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replaceButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.setEnabled(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        previewButton.setText("Preview");
        previewButton.setEnabled(false);
        previewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previewButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Write a string");

        searchAndCountButton.setText("Search and count");
        searchAndCountButton.setEnabled(false);
        searchAndCountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchAndCountButtonActionPerformed(evt);
            }
        });

        toUpperButton.setText("To Upper");
        toUpperButton.setEnabled(false);
        toUpperButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toUpperButtonActionPerformed(evt);
            }
        });

        appendHeadButton.setText("Append head");
        appendHeadButton.setEnabled(false);
        appendHeadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appendHeadButtonActionPerformed(evt);
            }
        });

        appendTailButton.setText("Append tail");
        appendTailButton.setEnabled(false);
        appendTailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appendTailButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("FAST STRING MANIPULATION");

        jLabel4.setText("REGEX MANIPULATION");

        jLabel5.setText("Select regex");

        comboBoxRegex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "E-Mail", "Fiscal Code", "Date", "Item 4" }));

        buttonReplaceRegex.setText("Replace with");
        buttonReplaceRegex.setEnabled(false);
        buttonReplaceRegex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReplaceRegexActionPerformed(evt);
            }
        });

        deleteButtonRegex.setText("Delete");
        deleteButtonRegex.setEnabled(false);
        deleteButtonRegex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonRegexActionPerformed(evt);
            }
        });

        toLowerButton.setText("To Lower");
        toLowerButton.setEnabled(false);
        toLowerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toLowerButtonActionPerformed(evt);
            }
        });

        searchAndCountRegexButton.setText("Search and count");
        searchAndCountRegexButton.setEnabled(false);
        searchAndCountRegexButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchAndCountRegexButtonActionPerformed(evt);
            }
        });

        similarityButton.setText("Similarity Check");
        similarityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                similarityButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 554, Short.MAX_VALUE)
                                .addComponent(saveButton)))
                        .addGap(223, 223, 223))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(554, 554, 554)
                        .addComponent(previewButton)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(comboBoxRegex, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(searchAndCountRegexButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonReplaceRegex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deleteButtonRegex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(34, 34, 34)
                                .addComponent(replaceTextRegex, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 315, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(readText, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(importButton)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(136, 136, 136)
                                    .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(labelToInput)
                                        .addComponent(searchAndCountButton, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(replaceButton)
                                            .addGap(33, 33, 33)
                                            .addComponent(labelToReplace, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(35, 35, 35)
                                            .addComponent(appendHeadButton)
                                            .addGap(37, 37, 37)
                                            .addComponent(appendTailButton)
                                            .addGap(65, 65, 65)
                                            .addComponent(toUpperButton)
                                            .addGap(18, 18, 18)
                                            .addComponent(toLowerButton))))
                                .addComponent(similarityButton)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(importButton)
                            .addComponent(saveButton))
                        .addGap(18, 18, 18)
                        .addComponent(readText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(previewButton))
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelToInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(replaceButton)
                    .addComponent(labelToReplace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchAndCountButton)
                    .addComponent(toUpperButton)
                    .addComponent(appendHeadButton)
                    .addComponent(appendTailButton)
                    .addComponent(toLowerButton))
                .addGap(35, 35, 35)
                .addComponent(similarityButton)
                .addGap(31, 31, 31)
                .addComponent(searchLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxRegex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonReplaceRegex)
                    .addComponent(replaceTextRegex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(deleteButtonRegex)
                .addGap(18, 18, 18)
                .addComponent(searchAndCountRegexButton)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void importButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importButton
        // TODO add your handling code here:
        ImportTextFile file = new ImportTextFile();
        file.selectFile();
        this.originalTxt = file.getTextFile();
        this.modifiedTxt = file.getTextFile();
        if(this.modifiedTxt != null) this.enableAllButtons();
        else this.disableAllButtons();
    }//GEN-LAST:event_importButton

    private void replaceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replaceButtonActionPerformed
        // TODO add your handling code here:
        int count = StringManipulating.searchAndCount(this.modifiedTxt, this.labelToInput.getText());
        if (this.labelToInput.getText().equals("") || this.labelToReplace.getText().equals("") || count == 0) {
            JFrame f = new JFrame();
            ErrorDialog error = new ErrorDialog(f, true, "Some field is empty");
            error.setVisible(true);
        } else {

            if (count == 1) {
                
                this.modifiedTxt = StringManipulating.replace(this.modifiedTxt, this.labelToInput.getText(), this.labelToReplace.getText());
            } else if(count > 1) {
                this.modifiedTxt = StringManipulating.replaceOccurenceOpenDialog(this.modifiedTxt, this.labelToInput.getText(), this.labelToReplace.getText(), "Simple Replace");
            }
        }


    }//GEN-LAST:event_replaceButtonActionPerformed

    private void previewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previewButtonActionPerformed
        // TODO add your handling code here:
        if (this.modifiedTxt != null) {
            this.readText.setText(this.modifiedTxt);
        } else {
            //error
        }
    }//GEN-LAST:event_previewButtonActionPerformed

    private void searchAndCountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchAndCountButtonActionPerformed
        // TODO add your handling code here:
        
        int count;
        count = StringManipulating.searchAndCount(modifiedTxt, this.labelToInput.getText());
        this.searchLabel.setText("This string is present: " + Integer.toString(count) + " times");
    }//GEN-LAST:event_searchAndCountButtonActionPerformed

    private void toUpperButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toUpperButtonActionPerformed
        // TODO add your handling code here:
        int num = 0;
        num = StringManipulating.searchAndCount(modifiedTxt, this.labelToInput.getText());
        if(num>0) this.modifiedTxt = StringManipulating.replaceToUpper(modifiedTxt, this.labelToInput.getText());
        else {
            JFrame f = new JFrame();
            ErrorDialog ed = new ErrorDialog(f,true,"This string is not present");
            ed.setVisible(true);
        }
    }//GEN-LAST:event_toUpperButtonActionPerformed

    private void appendTailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appendTailButtonActionPerformed
        // TODO add your handling code here:
        
        this.modifiedTxt = StringManipulating.appendTail(this.modifiedTxt, this.labelToInput.getText());
    }//GEN-LAST:event_appendTailButtonActionPerformed

    private void appendHeadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appendHeadButtonActionPerformed
        // TODO add your handling code here:
        
        this.modifiedTxt = StringManipulating.appendHead(this.modifiedTxt, this.labelToInput.getText());
    }//GEN-LAST:event_appendHeadButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:

        JFrame f = new JFrame();
        SaveDialog saveDialog = new SaveDialog(f, true);
        saveDialog.setVisible(true);
        if (saveDialog.save) {
            JFileChooser chooser = new JFileChooser();
            chooser.setCurrentDirectory(new java.io.File("."));
            chooser.setDialogTitle("Select a path to save");
            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            chooser.setAcceptAllFileFilterUsed(false);
            String path = null;
            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                path = chooser.getSelectedFile().toString();
            } else {
                System.out.println("No Selection ");
            }
            BufferedWriter writer = null;
            try {
                writer = new BufferedWriter(new FileWriter(path + "\\" +saveDialog.getNameOfFile()+".txt"));
                writer.write(this.modifiedTxt);

            } catch (IOException e) {
            } finally {
                try {
                    if (writer != null) {
                        writer.close();
                    }
                } catch (IOException e) {
                }
            }
        } else {
            
        }

    }//GEN-LAST:event_saveButtonActionPerformed

    private void buttonReplaceRegexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReplaceRegexActionPerformed
        // TODO add your handling code here:
        int index = this.comboBoxRegex.getSelectedIndex();
        this.modifiedTxt = StringManipulating.replaceRegex(this.modifiedTxt, this.replaceTextRegex.getText(), index);
    }//GEN-LAST:event_buttonReplaceRegexActionPerformed

    private void deleteButtonRegexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonRegexActionPerformed
        // TODO add your handling code here:
        int index = this.comboBoxRegex.getSelectedIndex();
        this.modifiedTxt = StringManipulating.replaceRegex(this.modifiedTxt, "", index);
    }//GEN-LAST:event_deleteButtonRegexActionPerformed

    private void searchAndCountRegexButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchAndCountRegexButtonActionPerformed
        // TODO add your handling code here:
        int index = this.comboBoxRegex.getSelectedIndex();
        int count = StringManipulating.searchAndCountRegex(this.modifiedTxt, index);
        this.searchLabel.setText("This type of string is present: " + Integer.toString(count) + " times");
    }//GEN-LAST:event_searchAndCountRegexButtonActionPerformed

    private void similarityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_similarityButtonActionPerformed
        // TODO add your handling code here:
        SimilarityCheckGUI scFrame = new SimilarityCheckGUI();
        scFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_similarityButtonActionPerformed

    private void toLowerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toLowerButtonActionPerformed
        // TODO add your handling code here:
        int num = 0;
        num = StringManipulating.searchAndCount(modifiedTxt, this.labelToInput.getText());
        if(num>0) this.modifiedTxt = StringManipulating.replaceToLower(modifiedTxt, this.labelToInput.getText());
        else {
            JFrame f = new JFrame();
            ErrorDialog ed = new ErrorDialog(f,true,"This string is not present");
            ed.setVisible(true);
        }
    }//GEN-LAST:event_toLowerButtonActionPerformed

    private void enableAllButtons() {
        this.appendHeadButton.setEnabled(true);
        this.appendTailButton.setEnabled(true);
        this.buttonReplaceRegex.setEnabled(true);
        this.deleteButtonRegex.setEnabled(true);
        this.previewButton.setEnabled(true);
        this.replaceButton.setEnabled(true);
        this.saveButton.setEnabled(true);
        this.searchAndCountButton.setEnabled(true);
        this.toUpperButton.setEnabled(true);
        this.toLowerButton.setEnabled(true);
        this.searchAndCountRegexButton.setEnabled(true);
    }
    
    private void disableAllButtons() {
        this.appendHeadButton.setEnabled(false);
        this.appendTailButton.setEnabled(false);
        this.buttonReplaceRegex.setEnabled(false);
        this.deleteButtonRegex.setEnabled(false);
        this.previewButton.setEnabled(false);
        this.replaceButton.setEnabled(false);
        this.saveButton.setEnabled(false);
        this.searchAndCountButton.setEnabled(false);
        this.toUpperButton.setEnabled(false);
        this.toLowerButton.setEnabled(false);
        this.searchAndCountRegexButton.setEnabled(false);
    }
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appendHeadButton;
    private javax.swing.JButton appendTailButton;
    private javax.swing.JButton buttonReplaceRegex;
    private javax.swing.JComboBox<String> comboBoxRegex;
    private javax.swing.JButton deleteButtonRegex;
    private javax.swing.JButton importButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField labelToInput;
    private javax.swing.JTextField labelToReplace;
    private javax.swing.JButton previewButton;
    private javax.swing.JLabel readText;
    private javax.swing.JButton replaceButton;
    private javax.swing.JTextField replaceTextRegex;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchAndCountButton;
    private javax.swing.JButton searchAndCountRegexButton;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JButton similarityButton;
    private javax.swing.JButton toLowerButton;
    private javax.swing.JButton toUpperButton;
    // End of variables declaration//GEN-END:variables
}