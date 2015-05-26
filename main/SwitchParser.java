package main;

import org.json.JSONObject;

import java.io.IOException;

/**
 * Created by jelle on 23.05.15.
 */
public class SwitchParser extends JSONArrayParser {
    public SwitchParser(String url) throws IOException {
        super("http://"+url+":8080/wm/core/controller/switches/json");
    }

    public Switch[] getSwitches()
    {
        Switch[] sw_return = new Switch[super.json_arr.length()];
        for(int i=0; i<super.json_arr.length(); i++){
            JSONObject helper = super.json_arr.getJSONObject(i);
            sw_return[i] = new Switch(helper.getString("inetAddress"),helper.getLong("connectedSince"),helper.getString("switchDPID"));
            System.out.println(sw_return[i].toString());
        }

        return sw_return;
    }

}
