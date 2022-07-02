package Button;

import Main.CalculatorPanel;

import javax.swing.JButton;
import java.awt.*;
import java.util.Map;

public class Button extends JButton {

    public String buttonName;

    public Button (String name, int buttonWidth, int buttonHeight) {
        super(name);
        this.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        this.buttonName = name;
        this.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
    }


}
