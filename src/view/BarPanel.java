package view;

import javax.swing.*;
import java.awt.*;

public class BarPanel extends JPanel {

    int tam;
    String[] names;
    int maxValue;
    int[] sumColumn;


    public BarPanel() {
        this.setBackground(Color.ORANGE);
        this.add(new JLabel("Panel BarDiagram"));
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

    public void setData(int maxValue,String[] names,int[] sumColumn,int tam){
        this.setMaxValue(maxValue);
        this.setNames(names);
        this.setSumColumn(sumColumn);
        this.setTam(tam);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        drawLines(g);
        this.setBackground(new Color(255, 210, 246));
        showConventions(g);
        drawBar(g);
    }


    public void showConventions(Graphics g){
        //Fondo de etiquetas
        g.setColor(new Color(255, 255, 255));
        g.fillRect(10, 20, 110, 40);
        // Convenciones
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

    public void drawBar(Graphics g){
        //Barras
        int width = 400/getTam();// /header.length;
        float valorReal = (float) 400/getMaxValue(); //  /max total del header.f;
        g.setColor(new Color(12, 12, 255));
        g.fillRect(40, 500- (int) (valorReal*getSumColumn()[0]), width, (int)(valorReal*getSumColumn()[0]));//getData
        g.drawString(getNames()[1], 50+width/3, 520);

        g.setColor(new Color(171, 5, 216));
        g.fillRect(160, 500-(int)(valorReal*getSumColumn()[1]), width, (int)(valorReal*getSumColumn()[1]));
        g.drawString(getNames()[2], 170+width/3, 520);

        g.setColor(new Color(255, 0, 0));
        g.fillRect(280, 500-(int)(valorReal*getSumColumn()[2]), width, (int)(valorReal*getSumColumn()[2]));
        g.drawString(getNames()[3], 280+width/3, 520);

        g.setColor(new Color(58, 216, 47));
        g.fillRect(400, 500-(int)(valorReal*getSumColumn()[3]), width, (int)(valorReal*getSumColumn()[3]));
        g.drawString(getNames()[4], 400+width/3, 520);
    }

    public void drawLines(Graphics g){
        drawLinesY(g);
        drawEje(g);
    }

    public void drawLinesY(Graphics g){
        //lineas de las barras del eje y
        for (int i = 500; i >= 100; i -= 10) {
            g.drawLine(25, i, 35, i);
        }

        // Dibuja los numeros del eje y
        for (int i = 505, j = 0; i > 100; i -= 50, j += getMaxValue()/8) {
            if (j == 50)
                g.drawString(String.valueOf(j), 10, i);
            else if (j == 0) {
                g.drawString(String.valueOf(j), 15, i);
            } else
                g.drawString(String.valueOf(j), 5, i);
        }
    }

    public void drawEje(Graphics g){
        g.setColor(Color.black);
        g.drawString("Eje x(Años)",505,505);
        g.drawString("Eje y(#)",10,90);
        g.drawLine(30, 100, 30, 500);
        g.drawLine(30, 500, 500, 500);
    }
}
