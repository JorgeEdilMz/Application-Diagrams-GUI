package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class SelectionPanel extends JPanel {

    JButton btnBar,btnPie;

    public SelectionPanel(ActionListener listener) {
        this.setLayout(new FlowLayout());
        this.setBackground(Color.green);
        btnBar = new JButton("See bar diagram");
        btnPie = new JButton("See pie diagram");
        btnPie.addActionListener(listener);
        btnBar.addActionListener(listener);
        this.add(btnBar);
        this.add(btnPie);
    }

    public JButton getBtnBar() {
        return btnBar;
    }

    public JButton getBtnPie() {
        return btnPie;
    }
}
