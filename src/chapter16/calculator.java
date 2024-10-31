package chapter16;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class calculator extends JFrame {
    JTextArea t1,t2;
    JLabel al,bl;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    JComboBox cb1,cb2;

    calculator() {
        setTitle("계산기");

        setLayout(new BorderLayout());
        showNorth();
        showCenter();
        showSouth();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.WHITE);
        setSize(320, 500);
        setVisible(true);
    }
    void showNorth() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT,10,15));
        Color color = Color.WHITE;
        panel.setOpaque(true);
        panel.setBackground(color);

        JLabel l1 = new JLabel("통화환율(10월 31일 오전 7:08 UTC )");

        panel.add(l1);

        add(panel, BorderLayout.NORTH);

    }
    void showCenter() {
        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT,20,10));
        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT,20,10));
        JPanel panel = new JPanel(new GridLayout(2, 0));

        al = new JLabel("단위");
        t1 = new JTextArea(1,20);
        t1.setText("0");
        t1.setEditable(false);

        bl = new JLabel("단위");
        t2 = new JTextArea(1,20);
        t2.setEditable(false);

        String[] c = {"-","한국-원","미국-달러","일본-엔"};

        cb1 = new JComboBox<>(c);
        cb2 = new JComboBox<>(c);

        p1.setBackground(Color.WHITE);
        p2.setBackground(Color.WHITE);
        p1.setOpaque(true);
        p2.setOpaque(true);
        panel.setBackground(Color.WHITE);
        panel.setOpaque(true);


        p1.add(al);p1.add(t1);p1.add(cb1);
        p2.add(bl);p2.add(t2);p2.add(cb2);

        panel.add(p1);
        panel.add(p2);

        add(panel, BorderLayout.CENTER);

        ItemListener listener2 = e -> {
          int index2 = ((JComboBox)cb2).getSelectedIndex();
          int index1 = ((JComboBox)cb1).getSelectedIndex();
          String a = t1.getText();
          double b = Double.parseDouble(a);
          if(index1 == 1){
              al.setText("₩");
              if(index2 == 1){
                  bl.setText("₩");
                  double result = b;
                  t2.setText(String.valueOf(result));
              }
              if(index2 == 2){
                  bl.setText("$");
                  double result = b*0.00072;
                  t2.setText(String.valueOf(result));
              }
              if(index2 == 3){
                  bl.setText("￥");
                  double result = b*0.11;
                  t2.setText(String.valueOf(result));

              }
          }
          else if(index1 == 2){
              al.setText("$");
              if(index2 == 1){
                  bl.setText("₩");
                  double result = b*1381.21;
                  t2.setText(String.valueOf(result));
              }
              if(index2 == 2){
                  bl.setText("$");
                  double result = b;
                  t2.setText(String.valueOf(result));
              }
              if(index2 == 3){
                  bl.setText("￥");
                  double result = b*152.19;
                  t2.setText(String.valueOf(result));

              }
          }
          else if(index1 == 3){
              al.setText("￥");
              if(index2 == 1){
                  bl.setText("₩");
                  double result = b*9.07;
                  t2.setText(String.valueOf(result));
              }
              if(index2 == 2){
                  bl.setText("$");
                  double result = b*0.0066;
                  t2.setText(String.valueOf(result));
              }
              if(index2 == 3){
                  bl.setText("￥");
                  double result = b;
                  t2.setText(String.valueOf(result));

              }

          }
        };
        cb1.addItemListener(listener2);
        cb2.addItemListener(listener2);



    }
    void showSouth() {
        JPanel panel = new JPanel(new GridLayout(5, 3,5,10));
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        b1 = new JButton("CE");
        b2 = new JButton("삭제");
        b3 = new JButton("7");
        b4 = new JButton("8");
        b5 = new JButton("9");
        b6 = new JButton("4");
        b7 = new JButton("5");
        b8 = new JButton("6");
        b9 = new JButton("3");
        b10 = new JButton("2");
        b11 = new JButton("1");
        b12 = new JButton("0");

        b1.setBorderPainted(false);
        b2.setBorderPainted(false);
        b3.setBorderPainted(false);
        b4.setBorderPainted(false);
        b5.setBorderPainted(false);
        b6.setBorderPainted(false);
        b7.setBorderPainted(false);
        b8.setBorderPainted(false);
        b9.setBorderPainted(false);
        b10.setBorderPainted(false);
        b11.setBorderPainted(false);
        b12.setBorderPainted(false);

        panel.setBackground(Color.WHITE);
        panel.setOpaque(true);
        p1.setBackground(Color.WHITE);
        p2.setBackground(Color.WHITE);
        p3.setBackground(Color.WHITE);
        p1.setOpaque(true);
        p2.setOpaque(true);
        p3.setOpaque(true);

        panel.add(p1);panel.add(b1);panel.add(b2);
        panel.add(b3);panel.add(b4);panel.add(b5);
        panel.add(p2);panel.add(b6);panel.add(b7);
        panel.add(b8);panel.add(b9);panel.add(b10);
        panel.add(b11);panel.add(p2);panel.add(b12);panel.add(p3);



        add(panel, BorderLayout.SOUTH);

        ActionListener listener = e ->{
          if(e.getSource() == b1){
              t1.setText("");
              t2.setText("");
          }
          else if(e.getSource() == b2){
              t1.setText("");
              t2.setText("");
          }
          else if(e.getSource() == b3){
              t1.setText(t1.getText()+"7");
          }
          else if(e.getSource() == b4){
              t1.setText(t1.getText()+"8");
          }
          else if(e.getSource() == b5){
              t1.setText(t1.getText()+"9");
          }
          else if(e.getSource() == b6){
              t1.setText(t1.getText()+"4");
          }
          else if(e.getSource() == b7){
              t1.setText(t1.getText()+"5");
          }
          else if(e.getSource() == b8){
              t1.setText(t1.getText()+"6");
          }
          else if(e.getSource() == b9){
              t1.setText(t1.getText()+"3");
          }
          else if(e.getSource() == b10){
              t1.setText(t1.getText()+"2");
          }
          else if(e.getSource() == b11){
              t1.setText(t1.getText()+"1");
          }
          else if(e.getSource() == b12){
              if(t1.getText().isEmpty())
                  t1.setText("");
              else
                  t1.setText(t1.getText()+"0");
          }
        };
        b1.addActionListener(listener);
        b2.addActionListener(listener);
        b3.addActionListener(listener);
        b4.addActionListener(listener);
        b5.addActionListener(listener);
        b6.addActionListener(listener);
        b7.addActionListener(listener);
        b8.addActionListener(listener);
        b9.addActionListener(listener);
        b10.addActionListener(listener);
        b11.addActionListener(listener);
        b12.addActionListener(listener);

    }
    public static void main(String[] args) {
        new calculator();
    }
}