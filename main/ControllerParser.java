package main;

import org.json.JSONObject;

import java.io.IOException;

/**
 * Created by jelle on 23.05.15.
 */
public class ControllerParser extends JSONObjectParser{
    public ControllerParser(String url) throws IOException {
        super("http://"+url+":8080/wm/core/controller/summary/json");
    }

    public Controller getControllerInfo()
    {
        JSONObject obj = super.json_obj;

        Controller ctrl = new Controller(obj.getInt("# Switches"),obj.getInt("# quarantine ports"),obj.getInt("# inter-switch links"),obj.getInt("# hosts"));

        return ctrl;
    }
}
