package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TablePanel extends JPanel {

    JTable table;
    JScrollPane scroll;

    public TablePanel() {
        table = new JTable();
        scroll = new JScrollPane(table);
        add(scroll);
    }

    public void fillData(DefaultTableModel model){
        table.setModel(model);
    }

}
