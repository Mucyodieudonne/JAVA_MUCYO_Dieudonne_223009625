/**
=====Group Members(Group number 31)=====
1)MUCYO Dieudonne 223009625
2)NDAGIJIMANA Aloyz 223017789
3)UZABAKIRIHO Theogene 223009518
 **/
package com.FDITS;
//import com.FDITS.UserPanel;
import com.FDITS.Firefighters_panel;   // Firefighters
import com.FDITS.Incidents;   // Incidents
import com.FDITS.Stations;  // Stations
import com.FDITS.Assignments;     // Assignments

import javax.swing.*;

public class TestFDITS extends JFrame {

    JTabbedPane tabs = new JTabbedPane();

    public TestFDITS() {
        setTitle("🔥 Fire Department Incident Tracking System");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add all system panels
        tabs.addTab("Users", new UserPanel());          // System users
        tabs.addTab("Firefighters", new Firefighters_panel()); // Firefighters panel
        tabs.addTab("Incidents", new Incidents());     // Incidents panel
        tabs.addTab("Stations", new Stations());     // Fire stations
        tabs.addTab("Assignments", new Assignments());     // Assignments

        add(tabs);
        setVisible(true);
    }



public static void main(String[] args) {
    new LoginForm();
}}