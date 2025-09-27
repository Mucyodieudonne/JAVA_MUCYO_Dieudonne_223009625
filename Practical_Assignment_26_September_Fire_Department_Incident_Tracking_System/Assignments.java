/**
=====Group Members(Group number 31)=====
1)MUCYO Dieudonne 223009625
2)NDAGIJIMANA Aloyz 223017789
3)UZABAKIRIHO Theogene 223009518
 **/
package com.FDITS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Assignments extends JPanel implements ActionListener {
    JTextField txtIncident, txtFirefighter, txtStation, txtRole;
    JButton btnAssign, btnView;
    JTextArea output;

    public Assignments() {
        setLayout(new BorderLayout());

        JPanel form = new JPanel(new GridLayout(5, 2));
        form.add(new JLabel("Incident ID:"));
        txtIncident = new JTextField();
        form.add(txtIncident);

        form.add(new JLabel("Firefighter ID:"));
        txtFirefighter = new JTextField();
        form.add(txtFirefighter);

        form.add(new JLabel("Station ID:"));
        txtStation = new JTextField();
        form.add(txtStation);

        form.add(new JLabel("Role:"));
        txtRole = new JTextField();
        form.add(txtRole);

        btnAssign = new JButton("Assign Firefighter");
        btnView = new JButton("View Assignments");
        form.add(btnAssign);
        form.add(btnView);

        add(form, BorderLayout.NORTH);

        output = new JTextArea();
        add(new JScrollPane(output), BorderLayout.CENTER);

        btnAssign.addActionListener(this);
        btnView.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fire_db", "root", "")) {
            if (e.getSource() == btnAssign) {
                PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO assignments (incident_id, firefighterid, stationid, role) VALUES (?, ?, ?, ?)"
                );
                ps.setInt(1, Integer.parseInt(txtIncident.getText()));
                ps.setInt(2, Integer.parseInt(txtFirefighter.getText()));
                ps.setInt(3, Integer.parseInt(txtStation.getText()));
                ps.setString(4, txtRole.getText());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Assignment Added!");
            } else if (e.getSource() == btnView) {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM assignments");
                output.setText("");
                while (rs.next()) {
                    output.append("Assignment #" + rs.getInt("assignment_id") +
                                  " -> Incident " + rs.getInt("incident_id") +
                                  ", Firefighter " + rs.getInt("firefighterid") +
                                  ", Station " + rs.getInt("stationid") +
                                  ", Role: " + rs.getString("role") + "\n");
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
