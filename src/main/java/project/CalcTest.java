package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcTest extends JFrame implements ActionListener {

    int count=0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    private Pick pick;

    public CalcTest(){
        frame= new JFrame();

        JButton button= new JButton("Volume");
        button.addActionListener( this);
        JButton button1= new JButton("Area");
        JButton button2= new JButton("Pick");
        label= new JLabel("Please select: ");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
        panel.setLayout(new GridLayout(4,1));
        panel.add(label);
        panel.add(button);
        panel.add(button1);
        panel.add(button2);


        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calc");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CalcTest();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        pick.pickMethod();
        label.setText("Welcome "+ count);


    }
}