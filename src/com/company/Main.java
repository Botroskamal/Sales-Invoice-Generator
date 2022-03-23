package com.company;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.io.*;
import java.nio.CharBuffer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String line = new String();
        ArrayList<String> InvoicesTable = new ArrayList<String>();
        ArrayList<String> InvoiceLine = new ArrayList<String>();

        try {
            BufferedReader Br1 = new BufferedReader( new FileReader( "src/com/company/InvoiceHeader.csv" ) );
            BufferedReader Br2 = new BufferedReader( new FileReader( "src/com/company/InvoiceLine.csv" ) );

            while((line = Br1.readLine()) != null) {
                String[] data = line.split( "," );
                for(int i = 0; i < data.length; i++){
                    InvoicesTable.add(data[i]);
                }
            }

            while((line = Br2.readLine()) != null) {
                String[] data = line.split( "," );
                for(int i = 0; i < data.length; i++){
                    InvoiceLine.add(data[i]);
                }
            }

            MyFrame frame = new MyFrame(InvoicesTable, InvoiceLine);
            frame.setVisible( true );

        } catch (Exception e) {
            System.out.println(e);
        }

        //MyFrame frame = new MyFrame();
        //frame.setVisible( true );


//        JFrame frame = new JFrame("SIG");
//        frame.setLayout( new FlowLayout() );

//        JPanel northOnlyPanel = new JPanel();
//        northOnlyPanel.setLayout(new BorderLayout());
//
//        JPanel panel1 = new JPanel();
//        JPanel panel2 = new JPanel();
//        JPanel panel21 = new JPanel();
//        JPanel panel22 = new JPanel();
//        JPanel panel23 = new JPanel();
//
//
//        panel2.setLayout( new GridLayout(2, 1) );
//
//        panel22.setLayout( new FlowLayout() );
//
//        panel23.setLayout( new GridLayout(4, 4) );
//
//
//        //panel1.setBorder(BorderFactory.createTitledBorder( BorderFactory.createEtchedBorder(), "ODI Rankings", TitledBorder.LEFT, TitledBorder.TOP));
//
//        String[][] rec = {
//                { "1", "Steve", "AUS" },
//                { "2", "Virat", "IND" },
//                { "3", "Kane", "NZ" },
//                { "4", "David", "AUS" },
//                { "5", "Ben", "ENG" },
//                { "6", "Eion", "ENG" },
//        };
//        String[] header = { "Rank", "Player", "Country" };
//        JTable table = new JTable(rec, header);
//
//        panel1.add(new JScrollPane(table));
//
//        String[] columns = {"ID", "NAme"};
//        String[][] data = {
//                {"1234", "Botros"}
//        };
//        JTable t = new JTable(data, columns);
//        panel21.add(new JScrollPane(t));
//
//        JButton btn1 = new JButton("OK");
//        JButton btn2 = new JButton("Cancel");
//
//        panel22.add(btn1);
//        panel22.add( btn2 );
//
//        panel23.add(new JLabel("INvoice Number"));
//        panel23.add(new JLabel("50"));
//        panel23.add(new JLabel("INvoice Date"));
//        panel23.add(new JTextField(5));
//        panel23.add(new JLabel("INvoice Name"));
//        panel23.add(new JTextField(5));
//        panel23.add(new JLabel("INvoice total"));
//        panel23.add(new JLabel("300"));
//
//        northOnlyPanel.add(panel23, BorderLayout.NORTH);
//
//        panel2.add(northOnlyPanel);
//        panel2.add(panel21);
//        panel2.add(panel22);
//
//
//        frame.add(panel1);
//        frame.add(panel2);
//
//        panel23.setSize( 20, 20 );
//
//        panel1.setSize( 200, 500 );
//        panel1.setLocation( 20, 20 );
//
//        panel2.setSize( 200, 500 );
//        panel2.setLocation( 230, 20 );
//
//
//
//
//        frame.setSize( 1000, 600 );
//        frame.setLocation( 100, 100 );
//        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
//
//        frame.setVisible( true );

    }


}
