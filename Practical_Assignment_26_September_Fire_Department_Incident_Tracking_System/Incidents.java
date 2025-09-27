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

public class Incidents extends JPanel implements ActionListener {
    JTextField txtType, txtLocation;
    JButton btnAdd, btnView;
    JTextArea output;

    public Incidents() {
        setLayout(new BorderLayout());

        JPanel form = new JPanel(new GridLayout(3, 2));
        form.add(new JLabel("Incident Type:"));
        txtType = new JTextField();
        form.add(txtType);

        form.add(new JLabel("Location:"));
        txtLocation = new JTextField();
        form.add(txtLocation);

        btnAdd = new JButton("Report Incident");
        btnView = new JButton("View Incidents");
        form.add(btnAdd);
        form.add(btnView);

        add(form, BorderLayout.NORTH);

        output = new JTextArea();
        add(new JScrollPane(output), BorderLayout.CENTER);

        btnAdd.addActionListener(this);
        btnView.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fire_db", "root", "")) {
            if (e.getSource() == btnAdd) {
                PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO incidents (incident_type, location, date_reported) VALUES (?, ?, CURDATE())"
                );
                ps.setString(1, txtType.getText());
                ps.setString(2, txtLocation.getText());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Incident Reported!");
            } else if (e.getSource() == btnView) {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM incidents");
                output.setText("");
                while (rs.next()) {
                    output.append(rs.getInt("incident_id") + " - " +
                                  rs.getString("incident_type") + " at " +
                                  rs.getString("location") + " (" +
                                  rs.getDate("date_reported") + ")\n");
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

