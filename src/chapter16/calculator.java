package chapter16;

import javax.swing.*;

public class calculator extends JFrame {
    calculator() {
        setTitle("계산기");

        JButton b = new JButton("버튼");
        add(b);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(100, 100);
        setVisible(true);
    }
    public static void main(String[] args) {
        new calculator();
    }
}