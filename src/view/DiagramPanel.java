package view;

import javax.swing.*;
import java.awt.*;

public class DiagramPanel extends JPanel {

    BarPanel barPanel;
    PiePanel piePanel;
    CardLayout cardLayout;

    public DiagramPanel() {
        cardLayout = new CardLayout();
        this.setBackground(Color.MAGENTA);
        this.setLayout(cardLayout);
        barPanel = new BarPanel();
        piePanel = new PiePanel();
        add(barPanel,"DiagramBar");
        add(piePanel,"DiagramPie");
        cardLayout.show(this,"DiagramBar");
    }

    public void showPanelBar(){
        cardLayout.show(this,"DiagramBar");
    }

    public void showPanelPie(){
        cardLayout.show(this,"DiagramPie");
    }

    public BarPanel getBarPanel() {
        return barPanel;
    }

    public PiePanel getPiePanel() {
        return piePanel;
    }
}
