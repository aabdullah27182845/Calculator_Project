package Main;

import javax.swing.JPanel;
import java.awt.*;
import Button.ButtonManager;
import Input.InputManager;

public class CalculatorPanel extends JPanel {

    public final int buttonWidth = 72;
    public final int buttonHeight = 48;

    public final int tileX = 5;
    public final int tileY = 4;

    public final int screenX = tileX * buttonWidth;
    public final int screenY = tileY * buttonHeight;

    public ButtonManager bm;
    public InputManager im;

    public CalculatorPanel() {

        this.setLayout(null);
        this.setPreferredSize(new Dimension(screenX, screenY));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.setFocusable(true);

        bm = new ButtonManager(this);
        im = new InputManager(this);


    }

}
