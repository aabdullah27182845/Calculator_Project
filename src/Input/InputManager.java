package Input;

import Main.CalculatorPanel;

public class InputManager {

    CalculatorPanel cp;
    public InputBar bar;

    public InputManager(CalculatorPanel cp) {
        this.cp = cp;
        addInputBar();

    }

    public void addInputBar() {
        int barWidth = cp.tileX * cp.buttonWidth;
        int barHeight = cp.buttonHeight;

        bar = new InputBar(barWidth, barHeight);
        bar.setBounds(0,0, barWidth, barHeight);
        cp.add(bar);

    }
}
