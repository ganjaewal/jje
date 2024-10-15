package chapter16;

import javax.swing.*;

public class calculator extends JFrame {
    calculator() {
        setTitle("계산기");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new calculator();
    }
}