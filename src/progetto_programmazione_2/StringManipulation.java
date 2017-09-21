/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progetto_programmazione_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;

/**
 *
 * @author Antonio
 */
public class StringManipulation {

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
        int count;
        count = StringManipulation.searchAndCount(str, toReplace);
        if (count == 0) {

        } else if (count == 1) {
            modified = str.replace(toReplace, toReplace.toUpperCase());
        } else if (count > 1) {
            modified = StringManipulation.replaceOccurenceOpenDialog(str, toReplace, toReplace.toUpperCase(), "Replace to Upper Case");
        }

        return modified;
    }

    public static String replaceToLower(String str, String toReplace) {
        String modified = null;
        int count;
        count = StringManipulation.searchAndCount(str, toReplace);
        if (count == 0) {

        } else if (count == 1) {
            modified = str.replace(toReplace, toReplace.toLowerCase());
        } else if (count > 1) {
            modified = StringManipulation.replaceOccurenceOpenDialog(str, toReplace, toReplace.toUpperCase(), "Replace to Lower Case");
        }
        return modified;
    }

    public static String replaceOccurenceOpenDialog(String modifiedTxt, String input, String toReplace, String typeOfReplace) {
        String newString = modifiedTxt;
        JFrame f = new JFrame();
        ReplaceDialog repDial = new ReplaceDialog(f, true, typeOfReplace, modifiedTxt, input, toReplace);
        repDial.setModal(true);
        repDial.setVisible(true);
        newString = StringManipulation.modifiedTxt;
        return newString;
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

    public static int searchAndCountRegex(String str, int type) {
        String newString = str;
        int count = 0;
        if (type == 0) {
            String regex = "[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(str);

            while (matcher.find()) {
                count++;
            }
        }

        if (type == 1) {
            String regex = "[a-z]{6}[0-9]{2}[a-z][0-9]{2}[a-z][0-9]{3}[a-z]";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(str);

            while (matcher.find()) {
                count++;
            }
        }

        if (type == 2) {
            String regex = "[0-3]?[0-9].[0-3]?[0-9].(?:[0-9]{2})?[0-9]{2}";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(str);

            while (matcher.find()) {
                count++;
            }
        }

        return count;
    }

    public static String replaceRegex(String str, String toReplace, int type) {
        String newString = str;
        if (type == 0) {
            String regex = "[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(str);

            while (matcher.find()) {
                newString = StringManipulation.replace(newString, matcher.group(), toReplace);
            }
        }

        if (type == 1) {
            String regex = "[a-z]{6}[0-9]{2}[a-z][0-9]{2}[a-z][0-9]{3}[a-z]";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(str);

            while (matcher.find()) {
                newString = StringManipulation.replace(newString, matcher.group(), toReplace);

            }
        }

        if (type == 2) {
            String regex = "[0-3]?[0-9].[0-3]?[0-9].(?:[0-9]{2})?[0-9]{2}";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(str);

            while (matcher.find()) {
                newString = StringManipulation.replace(newString, matcher.group(), toReplace);
            }
        }

        return newString;
    }

}
