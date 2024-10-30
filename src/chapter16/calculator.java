package chapter16;

import javax.swing.*;
import java.awt.*;

public class calculator extends JFrame {
    calculator() {
        setTitle("계산기");

        setLayout(new BorderLayout());
        showNorth();
        showCenter();
        showSouth();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(330, 540);
        setVisible(true);
    }
    void showNorth() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT,10,10));

        JLabel l1 = new JLabel("통화환율");

        panel.add(l1);

        add(panel, BorderLayout.NORTH);

    }
    void showCenter() {
        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT,20,5));
        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT,20,5));
        JPanel panel = new JPanel(new GridLayout(2, 0));

        JLabel l1 = new JLabel("₩");
        JTextField t1 = new JTextField(25);
        JLabel l2 = new JLabel("한국-원");

        JLabel l3 = new JLabel("$");
        JTextField t2 = new JTextField(25);

        String[] c = {"미국-달러","일본-엔"};

        JComboBox<String> cb = new JComboBox<>(c);

        p1.add(l1);p1.add(t1);p1.add(l2);
        p2.add(l3);p2.add(t2);p2.add(cb);

        panel.add(p1);
        panel.add(p2);

        add(panel, BorderLayout.CENTER);



    }
    void showSouth() {
        JPanel panel = new JPanel(new GridLayout(5, 3,10,15));
        JButton b1 = new JButton("");
        JButton b2 = new JButton("");
        JButton dot = new JButton(".");
        JButton ce = new JButton("ce");
        JButton del= new JButton("x");
        JButton num = new JButton("0");
        JButton num1 = new JButton("1");
        JButton num2 = new JButton("2");
        JButton num3 = new JButton("3");
        JButton num4 = new JButton("4");
        JButton num5 = new JButton("5");
        JButton num6 = new JButton("6");
        JButton num7 = new JButton("7");
        JButton num8 = new JButton("8");
        JButton num9 = new JButton("9");

        panel.add(b1); panel.add(ce); panel.add(del); panel.add(num7); panel.add(num8); panel.add(num9);
        panel.add(num4); panel.add(num5); panel.add(num6); panel.add(num1); panel.add(num2); panel.add(num3);
        panel.add(b2); panel.add(num); panel.add(dot);
        add(panel, BorderLayout.SOUTH);
    }
    public static void main(String[] args) {
        new calculator();
    }
}