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

    public static String modifiedTxt = null;

    public static String replace(String str, String toSearch, String toReplace) {
        int index = str.indexOf(toSearch);
        String newString = str;
        while (index >= 0) {

            newString = newString.substring(0, index) + toReplace + newString.substring(index + toSearch.length());

            index = newString.indexOf(toSearch, index + toSearch.length());

        }
        return newString;
    }

    public static int searchAndCount(String str, String toSearch) {
        int index;
        int count = 0;
        if (toSearch.equals("")) {

        } else {
            index = str.indexOf(toSearch);
            count = 0;
            while (index >= 0) {
                index = str.indexOf(toSearch, index + toSearch.length());
                count++;
            }
        }

        return count;
    }

    public static String replaceToUpper(String str, String toReplace) {
        String modified = null;
        modified = str.replace(toReplace, toReplace.toUpperCase());
        return modified;
    }

    public static String replaceToLower(String str, String toReplace) {
        String modified = null;
        modified = str.replace(toReplace, toReplace.toLowerCase());
        return modified;
    }

    public static String replaceOccurence(String str, String toSearch, String toReplace, int occurence) {
        int index = str.indexOf(toSearch);
        int count = 0;
        String newString = null;
        while (index >= 0) {
            if (count == occurence - 1) {
                newString = str.substring(0, index) + toReplace + str.substring(index + toSearch.length());
                break;
            }
            index = str.indexOf(toSearch, index + toSearch.length());
            count++;

        }
        return newString;
    }

    public static String appendHead(String str, String toAppend) {
        String newString = toAppend + str;
        return newString;
    }

    public static String appendTail(String str, String toAppend) {
        String newString = str + toAppend;
        return newString;
    }

}
