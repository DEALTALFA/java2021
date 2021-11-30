import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class visitwebsite {
    public static void main(String[] args) 
    {
        HttpURLConnection http;
        try {
         URL url = new URL("http://152.70.199.233");
            http = (HttpURLConnection)url.openConnection();
            System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
             
    }
}
