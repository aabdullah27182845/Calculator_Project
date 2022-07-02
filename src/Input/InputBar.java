package Input;

import javax.swing.JTextArea;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;

public class InputBar extends JTextArea {

    public InputBar(int InputBarWidth, int InputBarHeight) {

        this.setPreferredSize(new Dimension(InputBarWidth, InputBarHeight));
        this.setFont(new Font("Segoe UI Semilight", Font.BOLD, 40));
        this.setBackground(Color.DARK_GRAY);
    }
}
