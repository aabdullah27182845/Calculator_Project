package Button;

import Input.InputManager;
import Main.CalculatorPanel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonManager {

    public final int buttonWidth = 72;
    public final int buttonHeight = 48;

    public final int tileX = 5;
    public final int tileY = 4;

    public final int screenX = tileX * buttonWidth;
    public final int screenY = tileY * buttonHeight;

    public Button[] buttons;

    public ButtonManager() {

        buttons = new Button[15];

    }

    public void createButtons(CalculatorPanel cp) {

        int buttonColumn = 0;
        int buttonRow = 0;
        int counter = 13;
        String buttonName;

        while (buttonRow < 3 && buttonColumn < 5) {

            if (buttonColumn < 3) {
                buttonName = String.valueOf(3*(3-buttonRow) - buttonColumn);
            } else if (buttonColumn == 3  && buttonRow == 0) {
                buttonName = "÷";
            }else if (buttonColumn == 4 && buttonRow == 0) {
                buttonName = "×";
            }else if (buttonColumn == 3 && buttonRow == 1) {
                buttonName = "-";
            }else if (buttonColumn == 4 && buttonRow == 1) {
                buttonName = "+";
            } else if (buttonColumn == 3 && buttonRow == 2) {
                buttonName = "=";
            } else {
                buttonName = "CLR";
            }

            buttons[counter] = new Button(buttonName, buttonWidth, buttonHeight);

            buttons[counter].setBackground(Color.orange);
            buttons[counter].setBounds(buttonWidth*buttonColumn, buttonHeight*(buttonRow+1), buttonWidth, buttonHeight);
            cp.add(buttons[counter]);

            String finalButtonName = buttonName;
            if (!finalButtonName.equals("CLR") && !finalButtonName.equals("=")) {
                buttons[counter].addActionListener(new ActionListener() {  //copied from stackOverflow
                    public void actionPerformed(ActionEvent e) {
                        buttons[counter].runOnClick(finalButtonName, cp);
                    }
                });
            } else if (finalButtonName.equals("CLR")) {
                buttons[counter].addActionListener(new ActionListener() {  //copied from stackOverflow
                    public void actionPerformed(ActionEvent e) {
                        buttons[counter].runOnClickClear(finalButtonName, cp);
                    }
                });
            } else {
                buttons[counter].addActionListener(new ActionListener() {  //copied from stackOverflow
                    public void actionPerformed(ActionEvent e) {
                        buttons[counter].runOnClickEquals(finalButtonName, cp);
                    }
                });

            }

            buttonColumn ++;
            if (buttonColumn == 5) {
                buttonColumn = 0;
                buttonRow ++;
            }
        }
    }
}
