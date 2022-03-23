package UI.Panel;

import javax.swing.*;
import java.awt.*;

public class DataPanel extends JPanel {
    private int invoiceNo;
    private String invoiceData;
    private String CustomerName;
    private double InvoiceTotal;
    JPanel innerPanel;
    JPanel inner1;
    JPanel inner2;

    public DataPanel(String[][] data) {
        super();
        innerPanel = new JPanel();
        inner1 = new JPanel();
        inner2 = new JPanel();


        innerPanel.setLayout( new GridLayout(4, 4) );
        innerPanel.add(new JLabel("INvoice Number"));
        innerPanel.add(new JLabel());
        innerPanel.add(new JLabel("INvoice Date"));
        innerPanel.add(new JTextField(5));
        innerPanel.add(new JLabel("INvoice Name"));
        innerPanel.add(new JTextField(5));
        innerPanel.add(new JLabel("INvoice total"));
        innerPanel.add(new JLabel("300"));

        setBorder(BorderFactory.createLineBorder(Color.blue));
        setSize( 30, 30 );
        inner2.add(innerPanel, BorderLayout.NORTH);


        add(inner2);
    }
}
