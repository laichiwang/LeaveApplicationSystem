package lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Enyan Huang on 5/3/2016.
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
        final JTextField usernameTextField = new JTextField("", 20);
        centerPanel.add(usernameTextField);
        centerPanel.add(new JPanel());
        centerPanel.add(new JLabel("Password", SwingConstants.RIGHT));
        final JTextField passwordTextField = new JTextField("", 20);
        centerPanel.add(passwordTextField);
        centerPanel.add(new JPanel());
        centerPanel.add(new JPanel());
        JButton button = new JButton("Login");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (usernameTextField.getText().length() >= 3 && passwordTextField.getText().equals("password")) {
                    JOptionPane.showMessageDialog(MyWindow.this, "Hello " + usernameTextField.getText());
                } else {
                    JOptionPane.showMessageDialog(MyWindow.this, "Wrong username or password!");
                }
            }
        });
        centerPanel.add(button);
        centerPanel.add(new JPanel());
        for (int i = 0; i < 9; i++) {
            centerPanel.add(new JPanel());
        }
        aPanel.add(centerPanel, BorderLayout.CENTER);

        this.add(aPanel);
        this.setVisible(true);
    }
}