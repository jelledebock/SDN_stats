package main;

import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Switch {
    private String ip;
    private long connected_since;
    private String ID;

    public Switch(String ip, long connected_since, String ID) {
        this.ip = ip;
        this.connected_since = connected_since;
        this.ID = ID;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip =ip;
    }

    public long getConnected_since() {
        return connected_since;
    }

    public void setConnected_since(long connected_since) {
        this.connected_since = connected_since;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String toString()
    {
        return "Switch with ID "+this.ID+" has an ip of "+this.ip+" and is connected since "+connected_since;
    }
}
