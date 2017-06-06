/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progetto_programmazione_2;

/**
 *
 * @author Antonio
 */
public class StringManipulating {

    public String replace(String a, String b, String c) {
        a = a.replace(b, c);
        return a;
    }

    public int searchAndCount(String str, String toSearch) {
        int index = str.indexOf(toSearch);
        int count = 0;
        while (index >= 0) {
            index = str.indexOf(toSearch, index + toSearch.length());
            count++;
        }
        return count;
    }
    
   public String replaceToUpper(String str, String toReplace) {
       String modified = null;
       modified = str.replace(toReplace, toReplace.toUpperCase());
       return modified;
   }
   
   public String replaceToLower(String str, String toReplace) {
       String modified = null;
       modified = str.replace(toReplace, toReplace.toLowerCase());
       return modified;
   }

}
