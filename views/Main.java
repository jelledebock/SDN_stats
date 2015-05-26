package views;

import controllers.AppController;
import main.Controller;
import main.Switch;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.IOException;

/**
 * Created by jelle on 26.05.15.
 */
public class Main{
    private JPanel sdnpanel;
    private JTextField txtHosts;
    private JTextField txtSwitches;
    private JTable tblSwitches;
    private JLabel lblError;
    private String controller_ip;
    private AppController controller;

    public void createUIComponents()
    {

    }

    public Main(String ip) {
        this.controller_ip=ip;
        controller = new AppController(this.controller_ip);
        try {
            this.fillController(controller.getControlerInfo());
            this.fillTable(controller.getSwitchInfo());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Error occurred: "+e.getMessage(),"Error!",JOptionPane.ERROR_MESSAGE);
            controller.getSettings();
        }
    }

    public JPanel getPanel()
    {
        return this.sdnpanel;
    }
    public void fillController(Controller controller)
    {
        txtHosts.setText(Integer.toString(controller.getHosts()));
        txtSwitches.setText(Integer.toString(controller.getNum_switches()));
    }

    public void fillTable(Switch[] switches)
    {
        String[] columns = {"IP","Connected since","ID"};

        Object[][] data = new String[switches.length][3];
        for(int i=0; i<switches.length; i++)
        {
            Switch sw = switches[i];
            data[i][0]=sw.getIp();
            data[i][1]=Long.toString(sw.getConnected_since());
            data[i][2]=sw.getID();
        }

        DefaultTableModel model = new DefaultTableModel(data, columns);

        tblSwitches.setModel(model);
    }


}
