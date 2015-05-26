package main;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

/**
 * Created by jelle on 23.05.15.
 */
public class JSONObjectParser extends JSONParser {
    protected JSONObject json_obj;

    public JSONObjectParser(String url) throws IOException {
        super(url);
        this.getJSONObject();
    }

    public void getJSONObject()
    {
        // build a JSON object
        this.json_obj = new JSONObject(super.json);
    }

}
