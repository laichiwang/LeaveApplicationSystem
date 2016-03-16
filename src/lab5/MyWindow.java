package lab5;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Enyan Huang on 22/2/2016.
 */
public class MyWindow extends JFrame {

    public MyWindow() {
        super("COMP5134 Demo");
        this.setSize(500, 300);
        this.setLocation(100, 100);

        JPanel aPanel = new JPanel(new BorderLayout());
        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("COMP5134 Demo System"));
        aPanel.add(topPanel, BorderLayout.NORTH);
        JPanel centerPanel = new JPanel(new GridLayout(8, 3, 5, 10));
        for (int i = 0; i < 6; i++) {
            centerPanel.add(new JPanel());
        }
        centerPanel.add(new JLabel("Username", SwingConstants.RIGHT));
        centerPanel.add(new JTextField("", 20));
        centerPanel.add(new JPanel());
        centerPanel.add(new JLabel("Password", SwingConstants.RIGHT));
        centerPanel.add(new JTextField("", 20));
        centerPanel.add(new JPanel());
        centerPanel.add(new JPanel());
        centerPanel.add(new JButton("Login"));
        centerPanel.add(new JPanel());
        for (int i = 0; i < 9; i++) {
            centerPanel.add(new JPanel());
        }
        aPanel.add(centerPanel, BorderLayout.CENTER);

        this.add(aPanel);
        this.setVisible(true);
    }
}