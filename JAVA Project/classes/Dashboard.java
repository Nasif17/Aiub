package classes;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;
import javax.swing.*;
import classes.basic.LoginWin;
import interfaces.IBasic;

public class Dashboard extends JFrame implements ActionListener, IBasic {
  private JButton p1, p2, p3, p4, l1, l2, l3, l4, l5;
  private JLabel l6, l7;
  private Font f, f1;
  protected static String firstName, lastName;
  String teachPath = ".\\File\\teacher.txt";

  public Dashboard() {
    initcomponents();
  }

  public void initcomponents() {
    this.setTitle("HARVARD");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(1000, 563);
    this.setIconImage(new ImageIcon("images/logo.png").getImage());
    this.setResizable(false);
    this.setLayout(null);
    this.setLocationRelativeTo(null);
    this.setVisible(true);

    JPanel panel = new JPanel();
    panel.setBackground(IBasic.c3);
    panel.setBounds(0, 0, 1000, 563);
    panel.setLayout(null);
    this.add(panel);

    p1 = new JButton(new ImageIcon("images/rf.png"));
    p1.setBounds(160, 180, 150, 150);
    p1.setFocusPainted(false);
    p1.setCursor(new Cursor(Cursor.HAND_CURSOR));
    p1.setContentAreaFilled(false);
    p1.setBorderPainted(true);
    panel.add(p1);

    p2 = new JButton(new ImageIcon("images/online.png"));
    p2.setBounds(340, 180, 150, 150);
    p2.setFocusPainted(false);
    p2.setCursor(new Cursor(Cursor.HAND_CURSOR));
    p2.setContentAreaFilled(false);
    p2.setBorderPainted(true);
    panel.add(p2);

    p3 = new JButton(new ImageIcon("images/sp.png"));
    p3.setBounds(520, 180, 150, 150);
    p3.setFocusPainted(false);
    p3.setCursor(new Cursor(Cursor.HAND_CURSOR));
    p3.setContentAreaFilled(false);
    p3.setBorderPainted(true);
    panel.add(p3);

    p4 = new JButton(new ImageIcon("images/profile.png"));
    p4.setBounds(700, 180, 150, 150);
    p4.setFocusPainted(false);
    p4.setCursor(new Cursor(Cursor.HAND_CURSOR));
    p4.setContentAreaFilled(false);
    p4.setBorderPainted(true);
    panel.add(p4);

    f = new Font("Segoe UI", Font.BOLD, 20);
    f1 = new Font("Segoe UI", Font.BOLD, 15);
    l1 = new JButton();
    l1.setText("Logout");
    l1.setBounds(900, 0, 100, 50);
    l1.setCursor(new Cursor(Cursor.HAND_CURSOR));
    l1.setFont(f1);
    l1.setForeground(Color.WHITE);
    l1.setContentAreaFilled(false);
    l1.setBorderPainted(false);
    panel.add(l1);

    l2 = new JButton();
    l2.setText("Class Routine");
    l2.setBounds(160, 340, 150, 50);
    l2.setCursor(new Cursor(Cursor.HAND_CURSOR));
    l2.setFont(f1);
    l2.setForeground(Color.WHITE);
    l2.setContentAreaFilled(false);
    l2.setBorderPainted(false);
    panel.add(l2);

    l3 = new JButton();
    l3.setText("Online Class");
    l3.setBounds(340, 340, 150, 50);
    l3.setCursor(new Cursor(Cursor.HAND_CURSOR));
    l3.setFont(f1);
    l3.setForeground(Color.WHITE);
    l3.setContentAreaFilled(false);
    l3.setBorderPainted(false);
    panel.add(l3);

    l4 = new JButton();
    l4.setText("Registration");
    l4.setBounds(520, 340, 150, 50);
    l4.setCursor(new Cursor(Cursor.HAND_CURSOR));
    l4.setFont(f1);
    l4.setForeground(Color.WHITE);
    l4.setContentAreaFilled(false);
    l4.setBorderPainted(false);
    panel.add(l4);

    l5 = new JButton();
    l5.setText("Profile");
    l5.setBounds(700, 340, 150, 50);
    l5.setCursor(new Cursor(Cursor.HAND_CURSOR));
    l5.setFont(f1);
    l5.setForeground(Color.WHITE);
    l5.setContentAreaFilled(false);
    l5.setBorderPainted(false);
    panel.add(l5);

    f1 = new Font("Times New Roman", Font.BOLD, 40);

    l7 = new JLabel(new ImageIcon("images/teacherpanel.png"));
    l7.setText("Teacher panel");
    l7.setBounds(0, 0, 200, 50);
    l7.setFont(f);
    l7.setForeground(Color.WHITE);
    panel.add(l7);

    l6 = new JLabel();
    try {
      File userfile = new File(teachPath);
      if (userfile.exists()) {
        BufferedReader readFile = new BufferedReader(new FileReader(teachPath));
        int totalLines = 0;
        while (readFile.readLine() != null) {
          totalLines++;
        }
        readFile.close();

        for (int i = 0; i < totalLines; i++) {

          String line = Files.readAllLines(Paths.get(teachPath)).get(i).substring(11);
          if (line.equals(LoginWin.userName)) {

            firstName = Files.readAllLines(Paths.get(teachPath)).get(i + 2).substring(12);
            lastName = Files.readAllLines(Paths.get(teachPath)).get(i + 3).substring(11);
            break;
          }
        }
      }
    } catch (Exception ex) {
      System.out.print(ex);

    }
    l6.setText("Welcome" + " " + firstName + " " + lastName + "!");
    l6.setBounds(320, 50, 500, 100);
    l6.setFont(f1);
    l6.setForeground(Color.WHITE);
    panel.add(l6);

    l1.addActionListener(this);

    p1.addActionListener(this);
    l2.addActionListener(this);

    p2.addActionListener(this);
    l3.addActionListener(this);

    p3.addActionListener(this);
    l4.addActionListener(this);

    p4.addActionListener(this);
    l5.addActionListener(this);

  }

  public void actionPerformed(ActionEvent e) {

    if (e.getSource() == l1) {
      int yesOrno = JOptionPane.showConfirmDialog(null, "Are you sure?", "Alert!", JOptionPane.YES_NO_OPTION);
      if (yesOrno == 0) {
      this.setVisible(false);
      new LoginWin();
      } else {
        this.setVisible(true);
      }
    } 

    else if (e.getSource() == p1 || e.getSource() == l2) {
      this.setVisible(false);
      new Routine();
    }

    else if (e.getSource() == p2 || e.getSource() == l3) {
      JOptionPane.showMessageDialog(null, "You have created online class successfully!");
    }

    else if (e.getSource() == p3 || e.getSource() == l4) {
      this.setVisible(false);
      new RegistrationB();
    } 
    
    else if (e.getSource() == p4 || e.getSource() == l5) {
      this.setVisible(false);
      new Profile();
    }    
  }
}