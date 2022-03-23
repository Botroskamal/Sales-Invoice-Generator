package UI.Panel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainPanel extends JPanel {
    RightPanel RP;
    LeftPanel LP;

    public MainPanel(ArrayList<String> InvoicesTable, ArrayList<String> InvoiceLine) {
        super(new BorderLayout());
        setLayout(new BoxLayout( this, BoxLayout.X_AXIS ) );

        RP = new RightPanel(InvoicesTable, InvoiceLine);
        LP = new LeftPanel(InvoicesTable);

        add(LP);
        add(RP);
        setSize( 300, 200 );
    }
}
