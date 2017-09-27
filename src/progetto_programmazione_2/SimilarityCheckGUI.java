/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progetto_programmazione_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import org.json.*;

/**
 *
 * @author Antonio
 */
public class SimilarityCheckGUI extends javax.swing.JFrame {

    /**
     * Creates new form SimilarityCheckGUI
     */
    public SimilarityCheckGUI() {
        initComponents();
        this.jaroRadio.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        uploadButton = new javax.swing.JButton();
        showUploadedButton = new javax.swing.JButton();
        getSimilarityButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        numberOne = new javax.swing.JTextField();
        numberTwo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        indexToRemove = new javax.swing.JTextField();
        removeButton = new javax.swing.JButton();
        connectButton = new javax.swing.JButton();
        jaroRadio = new javax.swing.JRadioButton();
        levRadio = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        readField = new javax.swing.JTextField();
        readButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        uploadButton.setText("Upload files");
        uploadButton.setEnabled(false);
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        showUploadedButton.setText("Show uploaded files");
        showUploadedButton.setEnabled(false);
        showUploadedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showUploadedButtonActionPerformed(evt);
            }
        });

        getSimilarityButton.setText("Get similarity check");
        getSimilarityButton.setEnabled(false);
        getSimilarityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getSimilarityButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Select the ID of files to compare");

        jLabel2.setText("Remove an uploaded file, write the ID");

        removeButton.setText("Remove");
        removeButton.setEnabled(false);
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        connectButton.setText("Connect");
        connectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectButtonActionPerformed(evt);
            }
        });

        jaroRadio.setText("Jaro Winkler Distance");
        jaroRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaroRadioActionPerformed(evt);
            }
        });

        levRadio.setText("Levenshtein Distance");
        levRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levRadioActionPerformed(evt);
            }
        });

        jLabel3.setText("Choose the algorithm to calculate similarity");

        readButton.setText("Read");
        readButton.setEnabled(false);
        readButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Read a file, write the ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showUploadedButton)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(connectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numberOne, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(numberTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(indexToRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(removeButton))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(readField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(readButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(getSimilarityButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jaroRadio, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(levRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(106, 106, 106))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(uploadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(92, 92, 92))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(connectButton)
                        .addGap(18, 18, 18)
                        .addComponent(uploadButton)
                        .addGap(26, 26, 26)
                        .addComponent(showUploadedButton)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jaroRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(levRadio)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(getSimilarityButton)
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(readField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(readButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(indexToRemove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeButton))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        // TODO add your handling code here:
        String title;
        String text;
        ImportTextFile importFile = new ImportTextFile();
        importFile.selectFile();
        title = importFile.getFileName();
        text = importFile.getTextFile();
        try {
            SimilarityServerIO.getNumberOfUploaded();
            JFrame fr = new JFrame();
            MessageDialog md = new MessageDialog(fr, false, "Uploading, please wait", false);
            md.setVisible(true);
            boolean res = SimilarityServerIO.sendToServer(title, text);
            if(res) {
                md.setVisible(false);
                md = new MessageDialog(fr, true, "Upload completed", true);
                md.setVisible(true);
            } else {
                md.setVisible(false);
                md = new MessageDialog(fr, true, "The file is already present on server", true);
                md.setVisible(true);
            }

        } catch (IOException ex) {
            String mess = ex.getMessage();
            if (mess.equals("Connection refused: connect") || mess.equals("Connection refused (Connection refused)")) {
                JFrame f = new JFrame();
                ErrorDialog ed = new ErrorDialog(f, true, "Error! The server is offline");
                ed.setVisible(true);
            }
            Logger.getLogger(SimilarityCheckGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_uploadButtonActionPerformed

    private void getSimilarityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getSimilarityButtonActionPerformed
        // TODO add your handling code here:
        String result = null;

        String alg = null;

        if (this.jaroRadio.isSelected()) {
            alg = "jaro";
        }
        if (this.levRadio.isSelected()) {
            alg = "lev";
        }
        int numberOne;
        int numberTwo;
        if (!this.numberOne.getText().equals("") && !this.numberTwo.getText().equals("")) {
            numberOne = Integer.parseInt(this.numberOne.getText());
            numberTwo = Integer.parseInt(this.numberTwo.getText());
            try {
                if ((numberOne > 0 && numberTwo > 0) && (numberOne <= SimilarityServerIO.getNumberOfUploaded() && numberTwo <= SimilarityServerIO.getNumberOfUploaded())) {
                    result = SimilarityServerIO.getSR(this.numberOne.getText(), this.numberTwo.getText(), alg);
                } else {
                    JFrame fr = new JFrame();
                    try {
                        ErrorDialog er = new ErrorDialog(fr, true, "Insert two numbers between 1 and " + Integer.toString(SimilarityServerIO.getNumberOfUploaded()));
                        er.setVisible(true);
                    } catch (IOException ex) {
                        String mess = ex.getMessage();
                        if (mess.equals("Connection refused: connect") || mess.equals("Connection refused (Connection refused)")) {
                            JFrame f = new JFrame();
                            ErrorDialog ed = new ErrorDialog(f, true, "Error! The server is offline");
                            ed.setVisible(true);
                        }
                        Logger.getLogger(SimilarityCheckGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (IOException ex) {
                String mess = ex.getMessage();
                if (mess.equals("Connection refused: connect") || mess.equals("Connection refused (Connection refused)")) {
                    JFrame fr = new JFrame();
                    ErrorDialog ed = new ErrorDialog(fr, true, "Error! The server is offline");
                    ed.setVisible(true);
                }
                Logger.getLogger(SimilarityCheckGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JFrame fr = new JFrame();
            ErrorDialog er = new ErrorDialog(fr, true, "Please, do not leave empty fields");
            er.setVisible(true);
            result = "";
        }
        //similarityLabel.setText("The similarity rate is: " + result + "%");
        JFrame frame = new JFrame();
        MessageDialog md = new MessageDialog(frame, true, "The similarity rate is: " + result + "%", true);
        md.setVisible(true);

    }//GEN-LAST:event_getSimilarityButtonActionPerformed

    private void showUploadedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showUploadedButtonActionPerformed
        // TODO add your handling code here:
        String uploadedFiles = null;
        try {
            uploadedFiles = SimilarityServerIO.getUploaded();
            JFrame f = new JFrame();
            MessageDialog ed = new MessageDialog(f, true, uploadedFiles, true);
            ed.setVisible(true);
        } catch (IOException ex) {
            String mess = ex.getMessage();
            if (mess.equals("Connection refused: connect") || mess.equals("Connection refused (Connection refused)")) {
                JFrame fr = new JFrame();
                ErrorDialog ed = new ErrorDialog(fr, true, "Error! The server is offline");
                ed.setVisible(true);
            }
            Logger.getLogger(SimilarityCheckGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        //this.uploadedLabel.setText(uploadedFiles);
    }//GEN-LAST:event_showUploadedButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
        String index = this.indexToRemove.getText();
        if (!index.equals("")) {
            try {
                if (Integer.parseInt(index) > 0 && Integer.parseInt(index) <= SimilarityServerIO.getNumberOfUploaded()) {
                    SimilarityServerIO.removeFile(this.indexToRemove.getText());
                } else {
                    JFrame fr = new JFrame();
                    try {
                        ErrorDialog er = new ErrorDialog(fr, true, "Insert a number between 1 and " + Integer.toString(SimilarityServerIO.getNumberOfUploaded()));
                        er.setVisible(true);
                    } catch (IOException ex) {
                        String mess = ex.getMessage();
                        if (mess.equals("Connection refused: connect") || mess.equals("Connection refused (Connection refused)")) {
                            JFrame f = new JFrame();
                            ErrorDialog ed = new ErrorDialog(f, true, "Error! The server is offline");
                            ed.setVisible(true);
                        }
                        Logger.getLogger(SimilarityCheckGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (IOException ex) {
                String mess = ex.getMessage();
                if (mess.equals("Connection refused: connect") || mess.equals("Connection refused (Connection refused)")) {
                    JFrame fr = new JFrame();
                    ErrorDialog ed = new ErrorDialog(fr, true, "Error! The server is offline");
                    ed.setVisible(true);
                }
                Logger.getLogger(SimilarityCheckGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JFrame fr = new JFrame();
            ErrorDialog er = new ErrorDialog(fr, true, "Please, do not leave empty fields");
            er.setVisible(true);
        }

    }//GEN-LAST:event_removeButtonActionPerformed

    private void enableButtons() {
        this.uploadButton.setEnabled(true);
        this.removeButton.setEnabled(true);
        this.showUploadedButton.setEnabled(true);
        this.getSimilarityButton.setEnabled(true);
        this.readButton.setEnabled(true);
    }

    private void connectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectButtonActionPerformed
        // TODO add your handling code here:
        ImportTextFile im = new ImportTextFile();
        try {
            im.importFile("param.json");
        } catch (Exception e) {
            System.out.println("file non trovato");
            JFrame f = new JFrame();
            CreateJSONDialog cjd = new CreateJSONDialog(f, true);
            cjd.setVisible(true);
        }
        String param = im.getTextFile();
        JSONObject obj = new JSONObject(param);
        String address = obj.getString("address");
        String port = obj.getString("port");
        SimilarityServerIO.setAddress(address);
        SimilarityServerIO.setPort(port);
        try {
            SimilarityServerIO.getNumberOfUploaded();
            this.enableButtons();
            JFrame f = new JFrame();
            MessageDialog md = new MessageDialog(f, false, "Connection with server completed", true);
            md.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(SimilarityCheckGUI.class.getName()).log(Level.SEVERE, null, ex);
            String mess = ex.getMessage();
            if (mess.equals("Connection refused: connect") || mess.equals("Connection refused (Connection refused)")) {
                JFrame fr = new JFrame();
                ErrorDialog ed = new ErrorDialog(fr, true, "Error! The server is offline");
                ed.setVisible(true);
            }
        }


    }//GEN-LAST:event_connectButtonActionPerformed

    private void jaroRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaroRadioActionPerformed
        // TODO add your handling code here:
        this.jaroRadio.setSelected(true);
        this.levRadio.setSelected(false);
    }//GEN-LAST:event_jaroRadioActionPerformed

    private void levRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levRadioActionPerformed
        // TODO add your handling code here:
        this.jaroRadio.setSelected(false);
        this.levRadio.setSelected(true);
    }//GEN-LAST:event_levRadioActionPerformed

    private void readButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readButtonActionPerformed
        // TODO add your handling code here:
        String index = this.readField.getText();
        if (!index.equals("")) {
            try {
                if (Integer.parseInt(index) > 0 && Integer.parseInt(index) <= SimilarityServerIO.getNumberOfUploaded()) {
                    String content = SimilarityServerIO.readFile(this.readField.getText());
                    JFrame fr = new JFrame();
                    MessageDialog md = new MessageDialog(fr,true,content,true);
                    md.setVisible(true);
                } else {
                    JFrame fr = new JFrame();
                    try {
                        ErrorDialog er = new ErrorDialog(fr, true, "Insert a number between 1 and " + Integer.toString(SimilarityServerIO.getNumberOfUploaded()));
                        er.setVisible(true);
                    } catch (IOException ex) {
                        String mess = ex.getMessage();
                        if (mess.equals("Connection refused: connect") || mess.equals("Connection refused (Connection refused)")) {
                            JFrame f = new JFrame();
                            ErrorDialog ed = new ErrorDialog(f, true, "Error! The server is offline");
                            ed.setVisible(true);
                        }
                        Logger.getLogger(SimilarityCheckGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (IOException ex) {
                String mess = ex.getMessage();
                if (mess.equals("Connection refused: connect") || mess.equals("Connection refused (Connection refused)")) {
                    JFrame fr = new JFrame();
                    ErrorDialog ed = new ErrorDialog(fr, true, "Error! The server is offline");
                    ed.setVisible(true);
                }
                Logger.getLogger(SimilarityCheckGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JFrame fr = new JFrame();
            ErrorDialog er = new ErrorDialog(fr, true, "Please, do not leave empty fields");
            er.setVisible(true);
        }
    }//GEN-LAST:event_readButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SimilarityCheckGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimilarityCheckGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimilarityCheckGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimilarityCheckGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimilarityCheckGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton connectButton;
    private javax.swing.JButton getSimilarityButton;
    private javax.swing.JTextField indexToRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jaroRadio;
    private javax.swing.JRadioButton levRadio;
    private javax.swing.JTextField numberOne;
    private javax.swing.JTextField numberTwo;
    private javax.swing.JButton readButton;
    private javax.swing.JTextField readField;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton showUploadedButton;
    private javax.swing.JButton uploadButton;
    // End of variables declaration//GEN-END:variables

}
