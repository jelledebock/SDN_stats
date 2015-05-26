package main;

import org.json.JSONArray;

import java.io.IOException;

/**
 * Created by jelle on 23.05.15.
 */
public class JSONArrayParser extends JSONParser {
    protected JSONArray json_arr;

    public JSONArrayParser(String url) throws IOException {
        super(url);
        getJSONArray();
    }

    public void getJSONArray()
    {
        // build a JSON object
        this.json_arr = new JSONArray(super.json);
    }


    public int getLength()
    {
        return this.json_arr.length();
    }
}
