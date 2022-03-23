package UI.Panel;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LeftPanel extends JPanel implements ActionListener {
    private TablePanel table;
    private ButtonPanel bPanel;
    JTable tb;
    int row;

    public LeftPanel(ArrayList<String> InvoicesTable) {
        super();
        setBorder(BorderFactory.createTitledBorder( BorderFactory.createEtchedBorder(), "Invoices Table", TitledBorder.LEFT, TitledBorder.TOP));
        setLayout( new GridLayout(2, 1) );

        final int rows = InvoicesTable.size() / 4;

        String[][] d = new String[rows][4];

        for(int i = 0; i < d.length; i++) {
            for(int j = 0; j < d[i].length; j++) {
                d[i][j] = InvoicesTable.get( i * 4 + j );
            }
        }

        String[] Headers = {"NO.", "Date", "Customer", "Total"};

        //table = new TablePanel(d, Headers);
        JPanel t = new JPanel();
        tb = new JTable(d, Headers);
        t.add(new JScrollPane(tb));

        row = tb.getSelectedRow();

        //table.add(new JScrollPane(t))

        bPanel = new ButtonPanel("Create New Invoice", "Delete Invoice");

        //add(table);
        add(t);
        add(bPanel);
        setSize( 200, 100 );
        //setLocation( 230, 20 );
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals( "Delete Invoice" )) {
            if(row != -1) {

            }
        }
    }
}
