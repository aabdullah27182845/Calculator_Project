package Input;


public class InputManager {

    public InputBar bar;

    public InputManager() {

        int barWidth = 5*72;
        int barHeight = 48;

        bar = new InputBar(barWidth, barHeight);
        bar.setBounds(0,0, barWidth, barHeight);
    }
}
