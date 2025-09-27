/**
=====Group Members(Group number 31)=====
1)MUCYO Dieudonne 223009625
2)NDAGIJIMANA Aloyz 223017789
3)UZABAKIRIHO Theogene 223009518
 **/
package com.FDITS;
import com.FDITS.DB;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class LoginForm extends JFrame implements ActionListener {
    JTextField usernametxt = new JTextField("Enter your Username");
    JPasswordField passwordtxt = new JPasswordField("Enter your Password");
    JButton loginbtn = new JButton("Login");
    JButton cancelbtn = new JButton("Cancel");

    public LoginForm(){
        setTitle("Fire Department - Login");
        setBounds(100, 100, 300, 200);
        setLayout(null);
        usernametxt.setBounds(30, 30, 200, 30);
        passwordtxt.setBounds(30, 70, 200, 30);
        loginbtn.setBounds(30, 120, 100, 30);
        cancelbtn.setBounds(150, 120, 100, 30);
        add(usernametxt); add(passwordtxt); add(loginbtn); add(cancelbtn);

        loginbtn.addActionListener(this);
        cancelbtn.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try(Connection con = DB.getConnection()) {
            String sql = "Select * FROM users WHERE username =? "+"AND password =?";
            PreparedStatement stm  = con.prepareStatement(sql);
            stm.setString(1, usernametxt.getText());
            stm.setString(2, new String(passwordtxt.getPassword()));
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                String role = rs.getString("role");
                dispose();
                new FDITS(role, rs.getInt("userid"));
                JOptionPane.showMessageDialog(this, "Log in successful!");
            }else{
                JOptionPane.showMessageDialog(this, "Wrong Username or Password");
            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }
}
