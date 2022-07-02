package Main;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Calculator");

        CalculatorPanel calculatorPanel = new CalculatorPanel();
        window.add(calculatorPanel);
        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
