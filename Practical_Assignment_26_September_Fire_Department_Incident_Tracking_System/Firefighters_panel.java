/**
=====Group Members(Group number 31)=====
1)MUCYO Dieudonne 223009625
2)NDAGIJIMANA Aloyz 223017789
3)UZABAKIRIHO Theogene 223009518
 **/
package com.FDITS;

import com.FDITS.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Firefighters_panel extends JPanel implements ActionListener {
    JTextField idTxt = new JTextField(), nameTxt = new JTextField(), rankTxt = new JTextField(),
            phoneTxt = new JTextField(), stationTxt = new JTextField();
    JButton addbtn = new JButton("Add"), updatebtn = new JButton("Update"),
            deletebtn = new JButton("Delete"), loadbtn = new JButton("Load");
    JTable table;
    DefaultTableModel model;

    public Firefighters_panel() {
        setLayout(null);
        String[] labels = {"ID", "Name", "Rank", "Phone", "Station"};
        model = new DefaultTableModel(labels, 0);
        table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(20, 200, 800, 300);

        int y = 20;
        addField("ID", idTxt, y); y += 30;
        addField("Name", nameTxt, y); y += 30;
        addField("Rank", rankTxt, y); y += 30;
        addField("Phone", phoneTxt, y); y += 30;
        addField("Station ID", stationTxt, y);

        addButtons();
        add(sp);
    }

    private void addButtons() {
        addbtn.setBounds(300, 20, 100, 30);
        updatebtn.setBounds(300, 60, 100, 30);
        deletebtn.setBounds(300, 100, 100, 30);
        loadbtn.setBounds(300, 140, 100, 30);
        add(addbtn); add(updatebtn); add(deletebtn); add(loadbtn);
        addbtn.addActionListener(this);
        updatebtn.addActionListener(this);
        deletebtn.addActionListener(this);
        loadbtn.addActionListener(this);
    }

    private void addField(String lbl, JComponent txt, int y) {
        JLabel l = new JLabel(lbl);
        l.setBounds(20, y, 80, 25);
        txt.setBounds(100, y, 150, 25);
        add(l); add(txt);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try(Connection con = DB.getConnection()) {
            if(e.getSource()==addbtn){
                String sql="INSERT INTO firefighters (firefighterid, name, rank, phone, station_id) VALUES (?,?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(sql);
                ps.setInt(1, Integer.parseInt(idTxt.getText()));
                ps.setString(2, nameTxt.getText());
                ps.setString(3, rankTxt.getText());
                ps.setString(4, phoneTxt.getText());
                ps.setInt(5, Integer.parseInt(stationTxt.getText()));
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this,"Firefighter added!");
                clearFields();
            } else if(e.getSource()==updatebtn){
                String sql="UPDATE firefighters SET name=?, rank=?, phone=?, station_id=? WHERE firefighterid=?";
                PreparedStatement ps=con.prepareStatement(sql);
                ps.setString(1, nameTxt.getText());
                ps.setString(2, rankTxt.getText());
                ps.setString(3, phoneTxt.getText());
                ps.setInt(4, Integer.parseInt(stationTxt.getText()));
                ps.setInt(5, Integer.parseInt(idTxt.getText()));
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this,"Firefighter updated!");
                clearFields();
            } else if(e.getSource()==deletebtn){
                String sql="DELETE FROM firefighters WHERE firefighterid=?";
                PreparedStatement ps=con.prepareStatement(sql);
                ps.setInt(1, Integer.parseInt(idTxt.getText()));
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this,"Firefighter deleted!");
                clearFields();
            } else if(e.getSource()==loadbtn){
                model.setRowCount(0);
                ResultSet rs=con.createStatement().executeQuery("SELECT * FROM firefighters");
                while(rs.next()){
                    model.addRow(new Object[]{
                            rs.getInt("firefighterid"), rs.getString("name"),
                            rs.getString("rank"), rs.getString("phone"),
                            rs.getInt("station_id")
                    });
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,"Error: "+ex.getMessage());
        }
    }

    private void clearFields(){
        idTxt.setText(""); nameTxt.setText(""); rankTxt.setText("");
        phoneTxt.setText(""); stationTxt.setText("");
    }
}
