package Button;

import Main.CalculatorPanel;

import java.awt.*;

public class ButtonManager {



    CalculatorPanel cp;
    public Button[] buttons;
    String buttonName;

    public ButtonManager(CalculatorPanel cp) {

        this.cp = cp;
        buttons = new Button[15];
        createButtons();

    }

    public void createButtons() {

        int buttonColumn = 0;
        int buttonRow = 0;
        int counter = 13;

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
                buttonName = "";
            }

            buttons[counter] = new Button(buttonName, cp.buttonWidth, cp.buttonHeight);

            buttons[counter].setBackground(Color.orange);
            buttons[counter].setBounds(cp.buttonWidth*buttonColumn, cp.buttonHeight*(buttonRow+1), cp.buttonWidth, cp.buttonHeight);
            cp.add(buttons[counter]);

            buttonColumn ++;
            if (buttonColumn == 5) {
                buttonColumn = 0;
                buttonRow ++;
            }
        }
    }
}
