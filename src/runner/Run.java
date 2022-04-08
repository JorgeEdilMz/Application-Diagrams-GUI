package runner;

import presenter.Presenter;

import javax.swing.*;

public class Run {
    public static void main(String[] args) {
        new Presenter();
        System.out.println("First commit");
        JOptionPane.showMessageDialog(null, "Menu");
    }
}
