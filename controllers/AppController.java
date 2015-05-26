package controllers;

import help.IPV4Matcher;
import main.Controller;
import main.ControllerParser;
import main.Switch;
import main.SwitchParser;
import views.Main;

import javax.swing.*;
import java.io.IOException;

/**
 * Created by jelle on 26.05.15.
 */
public class AppController {
    public String controllerip;

    public AppController() {
        this.getSettings();
    }

    public AppController(String ip) {
        this.controllerip = ip;
    }

    public void getSettings() {
        try
        {
            String cip = JOptionPane.showInputDialog("Please enter your controller ip-address");
            while(!IPV4Matcher.isValidIPV4(cip)){
                cip = JOptionPane.showInputDialog("Please enter your controller ip-address");
            }
            this.controllerip = cip;

            this.getMain();
        }catch (NullPointerException e)
        {
            JOptionPane.showMessageDialog(null,"Goodbye!");
        }

    }

    public void getMain()
    {
        JFrame jf = new JFrame("Controller info: "+this.controllerip);
        System.out.println("Controller ip "+this.controllerip);

        Main mainview = new Main(this.controllerip);

        jf.setContentPane(mainview.getPanel());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
    }

    public Controller getControlerInfo() throws IOException {
        ControllerParser cp = new ControllerParser(controllerip);

        return cp.getControllerInfo();
    }

    public Switch[] getSwitchInfo() throws IOException {
        SwitchParser sp = new SwitchParser(controllerip);

        return sp.getSwitches();
    }
}
