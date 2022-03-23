package UI.Panel;

import javax.swing.*;

public class TablePanel extends JPanel {
    private JTable t;

    public TablePanel(String[][] data, String[] headers) {
        super();

        t = new JTable(data, headers);
        add(new JScrollPane(t));
    }


}
