/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progetto_programmazione_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Antonio
 */
public class ImportTextFile {

    public String textFile = null;
    public String fileName = null;

    public String getTextFile() {
        return this.textFile;
    }

    public void setTextFile(String textFile) {
        this.textFile = textFile;
    }

    public void selectFile() {
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("Select a txt file");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
        chooser.setFileFilter(filter);
        String path = null;
        File selectedFile;

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {

            selectedFile = chooser.getSelectedFile();
            path = selectedFile.getAbsolutePath();

        } else {
            System.out.println("No Selection ");
        }
        this.importFile(path);
        this.fileName = chooser.getSelectedFile().getName();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void importFile(String path) {

        FileReader f = null;
        try {
            f = new FileReader(path);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ImportTextFile.class.getName()).log(Level.SEVERE, null, ex);
        }

        BufferedReader b;
        b = new BufferedReader(f);

        String s = null;

        boolean firstLine = true;

        String fileContent = null;

        while (true) {
            String nextLine = "\n";
            try {
                if (firstLine) {
                    s = b.readLine();
                    if (s == null) {
                        break;
                    }
                    fileContent = s;
                    firstLine = false;
                } else {

                    s = b.readLine();
                    if (s == null) {
                        break;
                    }
                    fileContent = fileContent.concat(s);
                }
            } catch (IOException ex) {
                Logger.getLogger(ImportTextFile.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        this.setTextFile(fileContent);
    }
}
