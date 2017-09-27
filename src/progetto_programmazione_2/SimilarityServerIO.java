/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progetto_programmazione_2;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import org.apache.commons.codec.digest.DigestUtils;
import org.json.JSONObject;

/**
 *
 * @author Antonio
 */
public class SimilarityServerIO {

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        SimilarityServerIO.address = address;
    }

    public static String getPort() {
        return port;
    }

    public static void setPort(String port) {
        SimilarityServerIO.port = port;
    }

    private static String address;
    private static String port;

    public static boolean sendToServer(String title, String content) throws MalformedURLException, IOException {
        title = StringManipulation.replace(title, ".txt", "");
        boolean res = SimilarityServerIO.fileIsPresent(SimilarityServerIO.generateMD5(content));
        if (!res) {
            /*SimilarityServerIO.executePost("http://" + address + ":" + port + "/upload/", "t," + title);
            SimilarityServerIO.executePost("http://" + address + ":" + port + "/upload/", "c," + content);*/
            JSONObject obj = new JSONObject("{\"title\": \""+title+"\",\"content\": \""+content+"\",\"md5\": \""+SimilarityServerIO.generateMD5(content)+"\"}");
            SimilarityServerIO.executePost("http://" + address + ":" + port + "/upload/", obj.toString());
            return true;
        } else 
            return false;

    }

    public static String getSR(String index1, String index2, String alg) throws MalformedURLException, IOException {
        SimilarityServerIO.executePost("http://" + address + ":" + port + "/setAlg/", alg);
        SimilarityServerIO.executePost("http://" + address + ":" + port + "/setIndex/", index1);
        SimilarityServerIO.executePost("http://" + address + ":" + port + "/setIndex/", index2);
        String result = null;
        URL url = new URL("http://" + address + ":" + port + "/getSR/");
        URLConnection conn = url.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        conn.getInputStream()));
        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
            if (inputLine != null) {
                result = inputLine;
            }
        }
        in.close();
        return result;
    }

    public static String getUploaded() throws MalformedURLException, IOException {
        String result = null;
        URL url = new URL("http://" + address + ":" + port + "/getFUSituation/");
        URLConnection conn = url.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        conn.getInputStream()));
        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
            if (inputLine != null) {
                result = inputLine;
            }
        }
        in.close();
        result = result.replace("-", "\n");
        result = result.replace(")", " - ");
        result = "ID - Title \n" + result;
        return result;
    }

    public static int getNumberOfUploaded() throws MalformedURLException, IOException {
        String result = null;
        URL url = new URL("http://" + address + ":" + port + "/getNumber/");
        URLConnection conn = url.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        conn.getInputStream()));
        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
            if (inputLine != null) {
                result = inputLine;
            }
        }
        in.close();
        return Integer.parseInt(result);
    }

    public static void removeFile(String index) throws IOException {
        SimilarityServerIO.executePost("http://" + address + ":" + port + "/removeFile/", index);
    }
    
    public static String readFile(String index) throws IOException {
        SimilarityServerIO.executePost("http://" + address + ":" + port + "/setIndex/", index);
        SimilarityServerIO.executePost("http://" + address + ":" + port + "/setIndex/", "0");
        String res = SimilarityServerIO.executePost("http://" + address + ":" + port + "/readFile/", index);
        return res;
    }

    private static String executePost(String targetURL, String urlParameters) throws MalformedURLException, IOException {
        HttpURLConnection connection = null;

        try {
            //Create connection
            URL url = new URL(targetURL);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type",
                    "application/x-www-form-urlencoded");

            connection.setRequestProperty("Content-Length",
                    Integer.toString(urlParameters.getBytes().length));
            connection.setRequestProperty("Content-Language", "en-US");

            connection.setUseCaches(false);
            connection.setDoOutput(true);

            //Send request
            DataOutputStream wr = new DataOutputStream(
                    connection.getOutputStream());
            wr.writeBytes(urlParameters);
            wr.close();

            //Get Response  
            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            StringBuilder response = new StringBuilder(); // or StringBuffer if Java version 5+
            String line;
            while ((line = rd.readLine()) != null) {
                response.append(line);
                response.append('\r');
            }
            rd.close();
            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

    public static String generateMD5(String content) {
        String contentMod = content.replace("\n", "");
        contentMod = contentMod.replace("\r", "");
        String hashContent = DigestUtils.md5Hex(contentMod).toUpperCase();
        return hashContent;
    }

    public static boolean fileIsPresent(String md5) throws IOException {
        String result = SimilarityServerIO.executePost("http://" + address + ":" + port + "/fileIsPresent/", md5);
      
        if (result.equals("\u0001\r")) {
            return true;
        } else {
            return false;
        }
    }

}
