package main;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

/**
 * Created by jelle on 23.05.15.
 */
public class Controller {
    public IntegerProperty num_switches;
    public IntegerProperty num_quarantine_ports;
    public IntegerProperty i_switch_links;
    public IntegerProperty hosts;

    public Controller(int num_switches, int num_quarantine_ports, int i_switch_links, int hosts) {
        this.num_switches = new SimpleIntegerProperty(num_switches);
        this.num_quarantine_ports = new SimpleIntegerProperty(num_quarantine_ports);
        this.i_switch_links = new SimpleIntegerProperty(i_switch_links);
        this.hosts = new SimpleIntegerProperty(hosts);
    }

    public int getNum_switches() {
        return num_switches.get();
    }

    public IntegerProperty num_switchesProperty() {
        return num_switches;
    }

    public void setNum_switches(int num_switches) {
        this.num_switches.set(num_switches);
    }

    public int getNum_quarantine_ports() {
        return num_quarantine_ports.get();
    }

    public IntegerProperty num_quarantine_portsProperty() {
        return num_quarantine_ports;
    }

    public void setNum_quarantine_ports(int num_quarantine_ports) {
        this.num_quarantine_ports.set(num_quarantine_ports);
    }

    public int getI_switch_links() {
        return i_switch_links.get();
    }

    public IntegerProperty i_switch_linksProperty() {
        return i_switch_links;
    }

    public void setI_switch_links(int i_switch_links) {
        this.i_switch_links.set(i_switch_links);
    }

    public int getHosts() {
        return hosts.get();
    }

    public IntegerProperty hostsProperty() {
        return hosts;
    }

    public void setHosts(int hosts) {
        this.hosts.set(hosts);
    }

    public String toString()
    {
        return "The controller has "+this.num_switches+" switches connected, there are "+this.hosts+" active hosts for the moment";
    }
}
