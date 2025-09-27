/**
=====Group Members(Group number 31)=====
1)MUCYO Dieudonne 223009625
2)NDAGIJIMANA Aloyz 223017789
3)UZABAKIRIHO Theogene 223009518
 **/package com.FDITS;
import java.awt.*;

import javax.swing.*;

import com.FDITS.*;
public class FDITS extends JFrame {
    JTabbedPane tabs = new JTabbedPane();

    public FDITS(String role, int userid) {
        setTitle("Fire Department Incident Tracking System");
        setSize(900, 600);
        setLayout(new BorderLayout());

        if(role.equalsIgnoreCase("admin")){
           tabs.add("Users", new UserPanel());           // system users
            tabs.add("Firefighters", new Firefighters_panel()); 
            tabs.add("Incidents", new Incidents());     //
            tabs.add("Stations", new Stations());     // 
            tabs.add("Assignments", new Assignments());     //
        }else if(role.equalsIgnoreCase("dispatcher")){
            tabs.add("Incidents", new Incidents());
            tabs.add("Assignments", new Assignments());
        }else if(role.equalsIgnoreCase("firefighter")){
            tabs.add("My Assignments", new Assignments());
        }
        add(tabs, BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
