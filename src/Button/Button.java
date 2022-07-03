package Button;


import javax.swing.JButton;
import java.awt.*;

import Main.ArithmeticCalc;
import Main.CalculatorPanel;


public class Button extends JButton {

    public ArithmeticCalc ac;
    public String buttonName;

    public Button(String name, int buttonWidth, int buttonHeight) {
        super(name);
        this.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        this.buttonName = name;
        this.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
    }

    public void runOnClick(String name, CalculatorPanel cp) {
        cp.im.bar.setText(cp.im.bar.getText() + name);
    }

    public void runOnClickEquals(String name, CalculatorPanel cp) {
        String expression = cp.im.bar.getText();
        double answer = ac.eval(expression);
        String stringAnswer = Double.toString(answer);
        System.out.println(expression);
        System.out.println(stringAnswer);
        cp.im.bar.setText(stringAnswer);
    }

    public void runOnClickClear(String name, CalculatorPanel cp) {
        cp.im.bar.setText("");
    }

}


