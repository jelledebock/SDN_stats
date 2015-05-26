package main;
import org.json.*;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class JSONParser {
    protected String url;
    protected String json;


    public JSONParser(String url) throws IOException {
        this.url = url;
        parseJSON();
    }

    public void parseJSON() throws IOException
    {
        this.json = "";
        URL page = new URL(this.url);
        // read from the URL
        Scanner scan = new Scanner(page.openStream());
        while (scan.hasNext())
            this.json += scan.nextLine();
        scan.close();
    }


}
