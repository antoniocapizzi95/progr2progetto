/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progetto_programmazione_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Antonio
 */
public class ImportTextFile {
    
    public static String textFile = null;

    public static String importFile() {

        FileReader f = null;
        try {
            f = new FileReader("C:\\Users\\Antonio\\Desktop\\prova.txt");
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
        ImportTextFile.textFile = fileContent;
        return fileContent;
    }
}
        
    
