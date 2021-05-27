package week14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDemoResistance extends JFrame implements ActionListener {
    JTextField txtDisplay;
    JButton jbtLabel1, jbtLabel2, jbtLabel3, jbtLabel4, jbtLabel5;
    JPanel panelButton;

    public JDemoResistance(){
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        txtDisplay = new JTextField("Choose a complaint");
        txtDisplay.setEditable(false);
        container.add(txtDisplay, BorderLayout.NORTH);

        panelButton = new JPanel();
        panelButton.setLayout(new GridLayout(3, 2));
        jbtLabel1 = new JButton("Too expensive");
        jbtLabel2 = new JButton("Bad quality");
        jbtLabel3 = new JButton("Unattractive");
        jbtLabel4 = new JButton("Broken");
        jbtLabel5 = new JButton("Hard to use");

        panelButton.add(jbtLabel1);
        panelButton.add(jbtLabel2);
        panelButton.add(jbtLabel3);
        panelButton.add(jbtLabel4);
        panelButton.add(jbtLabel5);

        container.add(panelButton, BorderLayout.CENTER);

        jbtLabel1.addActionListener(this);
        jbtLabel2.addActionListener(this);
        jbtLabel3.addActionListener(this);
        jbtLabel4.addActionListener(this);
        jbtLabel5.addActionListener(this);
    }
    public static void main(String[] args){
        JDemoResistance negativeGUI = new JDemoResistance();
        negativeGUI.setSize(400,400);
        negativeGUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
        negativeGUI.setLocationRelativeTo(null);
        negativeGUI.setTitle("Negative Feedback");
        negativeGUI.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbtLabel1) {
            panelButton.remove(jbtLabel1);
            panelButton.repaint();
        }
        else if (e.getSource() == jbtLabel2){
            panelButton.remove(jbtLabel2);
            panelButton.repaint();
        }
        else if (e.getSource() == jbtLabel3){
            panelButton.remove(jbtLabel3);
            panelButton.repaint();
        }
        else if (e.getSource() == jbtLabel4){
            panelButton.remove(jbtLabel4);
            panelButton.repaint();
        }
        else if (e.getSource() == jbtLabel5){
            panelButton.remove(jbtLabel5);
            panelButton.repaint();
        }
    }
}
