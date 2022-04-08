package view;

import models.Data;

import javax.swing.*;
import java.awt.*;

public class PiePanel extends JPanel {

    int tam;
    String[] names;
    int maxValue;
    int[] sumColumn;
    int sumTotal;

    public PiePanel() {
        this.setBackground(Color.cyan);
        this.add(new JLabel("Panel PieDiagram"));
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int[] getSumColumn() {
        return sumColumn;
    }

    public void setSumColumn(int[] sumColumn) {
        this.sumColumn = sumColumn;
    }

    public int getSumTotal() {
        return sumTotal;
    }

    public void setSumTotal(int sumTotal) {
        this.sumTotal = sumTotal;
    }

    public void setData(int maxValue, String[] names, int[] sumColumn, int tam, int sumTotalColums){
        this.setMaxValue(maxValue);
        this.setNames(names);
        this.setSumColumn(sumColumn);
        this.setTam(tam);
        this.setSumTotal(sumTotalColums);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        showConventions(g);
        int total = getSumTotal();
        int angle1 = (getSumColumn()[0]*360)/total;
        int angle2 = (getSumColumn()[1]*360)/total;
        int angle3 = (getSumColumn()[2]*360)/total;
        int angle4 = (getSumColumn()[3]*360)/total;
        g.setColor(new Color(255, 255, 255));
        g.drawArc(75,75,400,400,0,0);
        g.setColor(new Color(12, 12, 255));
        g.fillArc(75,75,400,400,0,angle1);
        g.setColor(new Color(171, 5, 216));
        g.fillArc(75,75,400,400,angle1,angle2);
        g.setColor(new Color(255, 0, 0));
        g.fillArc(75,75,400,400,angle1+angle2,angle3);
        g.setColor(new Color(58, 216, 47));
        g.fillArc(75,75,400,400,angle1+angle2+angle3,angle4+2);


    }

    public void showConventions(Graphics g){
        g.setColor(new Color(255, 255, 255));
        g.fillRect(10, 20, 110, 40);
        g.setColor(new Color(12, 12, 255));
        g.fillRect(15, 25, 10, 10);
        g.drawString(getNames()[1], 30, 34);

        g.setColor(new Color(171, 5, 216));
        g.fillRect(15, 45, 10, 10);
        g.drawString(getNames()[2], 30, 54);

        g.setColor(new Color(255, 0, 0));
        g.fillRect(75, 25, 10, 10);
        g.drawString(getNames()[3], 90, 34);

        g.setColor(new Color(58, 216, 47));
        g.fillRect(75, 45, 10, 10);
        g.drawString(getNames()[4], 90, 54);
    }
}
