package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View extends JFrame {

    DiagramPanel diagramPanel;
    SelectionPanel selectionPanel;
    TablePanel tablePanel;

    public View(ActionListener listener) {
        this.setLayout(new BorderLayout());
        this.setLocation(100,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1050,600);
        initComponents(listener);
        this.setVisible(true);
    }

    public DiagramPanel getDiagramPanel() {
        return diagramPanel;
    }

    public SelectionPanel getSelectionPanel() {
        return selectionPanel;
    }

    public TablePanel getTablePanel() {
        return tablePanel;
    }

    public void initComponents(ActionListener listener){
        diagramPanel = new DiagramPanel();
        selectionPanel = new SelectionPanel(listener);
        tablePanel = new TablePanel();
        this.add(diagramPanel,BorderLayout.CENTER);
        this.add(tablePanel,BorderLayout.WEST);
        this.add(selectionPanel,BorderLayout.SOUTH);
    }
}
