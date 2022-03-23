package UI.Panel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class RightPanel extends JPanel {
    private DataPanel InvoiceData;
    private TablePanel InvoiceItems;
    private ButtonPanel ChangesButtons;

    public RightPanel(ArrayList<String> InvoicesTable, ArrayList<String> InvoiceLine) {
        super();
        setLayout( new BoxLayout( this, BoxLayout.Y_AXIS ) );


        final int rows = InvoiceLine.size() / 5;

        String[][] d = new String[rows][5];

        for(int i = 0; i < d.length; i++) {
            for(int j = 0; j < 5; j++) {
                d[i][j] = InvoiceLine.get( i * 5 + j );
            }
        }

        String[] headers = {"No.", "Item Name", "Item Price", "Count", "Item Total"};
        InvoiceItems = new TablePanel( d, headers );

        InvoiceData = new DataPanel( d );

        ChangesButtons  = new ButtonPanel("Save", "Cancel");

        add(InvoiceData);
        add(InvoiceItems);
        add(ChangesButtons);
        setSize( 100, 50 );
        setLocation( 230, 20 );
    }
}
