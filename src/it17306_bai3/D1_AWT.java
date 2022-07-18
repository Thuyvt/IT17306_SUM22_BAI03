/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it17306_bai3;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author THUYVU
 */
public class D1_AWT extends Frame implements ActionListener {
    Button btnRed, btnYellow;
    Label lblText = new Label();
    
    public D1_AWT(String title) throws HeadlessException {
        setTitle(title);// Tao tieu de cho form
        setLayout(new FlowLayout());// tao bo cuc cho form
        btnRed = new Button("Nut do");
        add(btnRed);// Them btnRed vào GUI
        btnRed.addActionListener(this);// them su kien cho nut
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();// lang nghe thao tac tren GUI
        if (str.equals("Nut do")) {
            this.setBackground(Color.RED);
        }
    }
    
    public static void main(String[] args) {
        D1_AWT awtForm = new D1_AWT("FPT POLY AWT FORM");
        awtForm.setSize(500, 300);
        awtForm.show();
    }
}
