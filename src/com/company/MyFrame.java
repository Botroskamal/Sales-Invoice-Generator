package com.company;

import UI.Panel.MainPanel;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MyFrame extends JFrame implements ActionListener {
    private MainPanel panel;

    public MyFrame(ArrayList<String> InvoicesTable, ArrayList<String> InvoiceLine){
        super("SIG");
        setLayout(new FlowLayout());

        panel = new MainPanel(InvoicesTable, InvoiceLine);

        add(panel);
        setSize( 1000, 400 );
        setLocation( 100, 100 );
        setDefaultCloseOperation( EXIT_ON_CLOSE );
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
