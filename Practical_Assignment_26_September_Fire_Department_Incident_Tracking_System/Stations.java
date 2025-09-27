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

public class Stations extends JPanel implements ActionListener {
    JTextField txtName, txtLocation;
    JButton btnAdd, btnView;
    JTextArea output;

    public Stations() {
        setLayout(new BorderLayout());

        JPanel form = new JPanel(new GridLayout(3, 2));
        form.add(new JLabel("Name:"));
        txtName = new JTextField();
        form.add(txtName);

        form.add(new JLabel("Location:"));
        txtLocation = new JTextField();
        form.add(txtLocation);

        btnAdd = new JButton("Add Station");
        btnView = new JButton("View Stations");
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
                PreparedStatement ps = con.prepareStatement("INSERT INTO stations (name, location) VALUES (?, ?)");
                ps.setString(1, txtName.getText());
                ps.setString(2, txtLocation.getText());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Station Added!");
            } else if (e.getSource() == btnView) {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM stations");
                output.setText("");
                while (rs.next()) {
                    output.append(rs.getInt("stationid") + " - " +
                                  rs.getString("name") + " (" +
                                  rs.getString("location") + ")\n");
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
