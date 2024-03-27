package classes.basic;

import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import interfaces.*;
import classes.logic.*;

public class RegWin implements IBasic, ActionListener {
  JFrame frame;
  JPanel pan1, pan2, pan3;
  JLabel create, fName, lName, dob, line1, line2, line3, line4,
      line5, line6, line7, line8, line9, line10, mail, user, nation, pass,
      rePass, secure, ans, captcha, capLabel, all;
  JTextField tN1, tN2, tDob, email, userName, nationality, answer, capField;
  JPasswordField password, rePassword;
  JButton back, submit, log, see1, see2, noSee1, noSee2;
  String[] secQues, genders, users;
  JComboBox<String> quesBox, genderBox, userBox;
  Random random;
  int x, y, m;
  RegLogic logic;
  LoginWin login;

  public RegWin() {
    // Frame
    frame = new JFrame("HARVARD");
    frame.setSize(width, height);
    frame.setLayout(null);
    frame.setResizable(false);
    frame.setIconImage(new ImageIcon("images/logo.png").getImage());
    frame.setLocationRelativeTo(null);

    // Panel
    pan1 = new JPanel();
    pan1.setBounds(0, 0, 150, 563);
    pan1.setLayout(null);
    pan1.setBackground(c4);

    pan2 = new JPanel();
    pan2.setSize(700, 563);
    pan2.setLayout(null);
    pan2.setLocation(150, 0);
    pan2.setBackground(c3);

    pan3 = new JPanel();
    pan3.setBounds(850, 0, 150, 563);
    pan3.setLayout(null);
    pan3.setBackground(c4);

    // Jlabel
    create = new JLabel("Create New Account");
    create.setFont(new Font(font, Font.BOLD, 30));
    create.setForeground(c1);
    create.setBounds(200, 10, 300, 35);

    fName = new JLabel("First Name:");
    fName.setFont(new Font(font, Font.PLAIN, 15));
    fName.setForeground(c1);
    fName.setBounds(100, 60, 150, 25);
    line1 = new JLabel("_____________________________");
    line1.setForeground(c1);
    line1.setBounds(100, 85, 200, 25);
    line1.setCursor(new Cursor(Cursor.TEXT_CURSOR));

    lName = new JLabel("Last Name:");
    lName.setFont(new Font(font, Font.PLAIN, 15));
    lName.setForeground(c1);
    lName.setBounds(400, 60, 150, 25);
    line2 = new JLabel("_____________________________");
    line2.setForeground(c1);
    line2.setBounds(400, 85, 200, 25);
    line2.setCursor(new Cursor(Cursor.TEXT_CURSOR));

    dob = new JLabel("Date of Birth (dd/mm//yyyy)");
    dob.setFont(new Font(font, Font.PLAIN, 15));
    dob.setForeground(c1);
    dob.setBounds(100, 110, 200, 25);
    line3 = new JLabel("_____________________________");
    line3.setForeground(c1);
    line3.setBounds(100, 135, 200, 25);
    line3.setCursor(new Cursor(Cursor.TEXT_CURSOR));

    mail = new JLabel("Email:");
    mail.setFont(new Font(font, Font.PLAIN, 15));
    mail.setForeground(c1);
    mail.setBounds(100, 160, 150, 25);
    line4 = new JLabel("______________________________________________");
    line4.setForeground(c1);
    line4.setBounds(100, 185, 300, 25);
    line4.setCursor(new Cursor(Cursor.TEXT_CURSOR));

    user = new JLabel("User Name:");
    user.setFont(new Font(font, Font.PLAIN, 15));
    user.setForeground(c1);
    user.setBounds(100, 210, 200, 25);
    line5 = new JLabel("_____________________________");
    line5.setForeground(c1);
    line5.setBounds(100, 235, 200, 25);
    line5.setCursor(new Cursor(Cursor.TEXT_CURSOR));

    nation = new JLabel("Nationality:");
    nation.setFont(new Font(font, Font.PLAIN, 15));
    nation.setForeground(c1);
    nation.setBounds(400, 210, 150, 25);
    line6 = new JLabel("_____________________________");
    line6.setForeground(c1);
    line6.setBounds(400, 235, 200, 25);
    line6.setCursor(new Cursor(Cursor.TEXT_CURSOR));

    pass = new JLabel("Password:");
    pass.setFont(new Font(font, Font.PLAIN, 15));
    pass.setForeground(c1);
    pass.setBounds(100, 260, 80, 25);
    line7 = new JLabel("_____________________________");
    line7.setForeground(c1);
    line7.setBounds(100, 285, 200, 25);
    line7.setCursor(new Cursor(Cursor.TEXT_CURSOR));

    rePass = new JLabel("Re-type Password:");
    rePass.setFont(new Font(font, Font.PLAIN, 15));
    rePass.setForeground(c1);
    rePass.setBounds(400, 260, 130, 25);
    line8 = new JLabel("_____________________________");
    line8.setForeground(c1);
    line8.setBounds(400, 285, 200, 25);
    line8.setCursor(new Cursor(Cursor.TEXT_CURSOR));

    secure = new JLabel("Security Question:");
    secure.setFont(new Font(font, Font.PLAIN, 15));
    secure.setForeground(c1);
    secure.setBounds(100, 310, 200, 25);

    ans = new JLabel("Your answer:");
    ans.setFont(new Font(font, Font.PLAIN, 15));
    ans.setForeground(c1);
    ans.setBounds(100, 350, 90, 25);
    line9 = new JLabel("_____________________________");
    line9.setForeground(c1);
    line9.setBounds(200, 355, 200, 25);
    line9.setCursor(new Cursor(Cursor.TEXT_CURSOR));

    capLabel = new JLabel("Captcha:");
    capLabel.setFont(new Font(font, Font.PLAIN, 15));
    capLabel.setForeground(c1);
    capLabel.setBounds(100, 400, 100, 25);

    // Random num
    random = new Random();
    x = random.nextInt(15);
    y = random.nextInt(15);

    captcha = new JLabel();
    captcha.setText("   " + x + " + " + y + "  ");
    captcha.setBounds(175, 400, 75, 25);
    captcha.setForeground(Color.black);
    captcha.setBackground(c1);
    captcha.setFont(new Font(font, Font.BOLD, 15));
    captcha.setBorder(null);
    captcha.setOpaque(true);
    line10 = new JLabel("_____________________________");
    line10.setForeground(c1);
    line10.setBounds(260, 405, 200, 25);
    line10.setCursor(new Cursor(Cursor.TEXT_CURSOR));

    all = new JLabel("Already have an account?");
    all.setFont(new Font(font, Font.PLAIN, 15));
    all.setForeground(c1);
    all.setBounds(225, 485, 175, 25);

    // TextFields
    tN1 = new JTextField();
    tN1.setBounds(100, 80, 190, 25);
    tN1.setFont(new Font(font, Font.PLAIN, 15));
    tN1.setForeground(c1);
    tN1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
    tN1.setCaretColor(c1);
    tN1.setBorder(null);
    tN1.setOpaque(false);

    tN2 = new JTextField();
    tN2.setBounds(400, 80, 190, 25);
    tN2.setFont(new Font(font, Font.PLAIN, 15));
    tN2.setForeground(c1);
    tN2.setCursor(new Cursor(Cursor.TEXT_CURSOR));
    tN2.setCaretColor(c1);
    tN2.setBorder(null);
    tN2.setOpaque(false);

    tDob = new JTextField();
    tDob.setBounds(100, 130, 190, 25);
    tDob.setFont(new Font(font, Font.PLAIN, 15));
    tDob.setForeground(c1);
    tDob.setCursor(new Cursor(Cursor.TEXT_CURSOR));
    tDob.setCaretColor(c1);
    tDob.setBorder(null);
    tDob.setOpaque(false);

    email = new JTextField();
    email.setBounds(100, 180, 290, 25);
    email.setFont(new Font(font, Font.PLAIN, 15));
    email.setForeground(c1);
    email.setCursor(new Cursor(Cursor.TEXT_CURSOR));
    email.setCaretColor(c1);
    email.setBorder(null);
    email.setOpaque(false);

    userName = new JTextField();
    userName.setBounds(100, 230, 190, 25);
    userName.setFont(new Font(font, Font.PLAIN, 15));
    userName.setForeground(c1);
    userName.setCursor(new Cursor(Cursor.TEXT_CURSOR));
    userName.setCaretColor(c1);
    userName.setBorder(null);
    userName.setOpaque(false);

    nationality = new JTextField();
    nationality.setBounds(400, 230, 190, 25);
    nationality.setFont(new Font(font, Font.PLAIN, 15));
    nationality.setForeground(c1);
    nationality.setCursor(new Cursor(Cursor.TEXT_CURSOR));
    nationality.setCaretColor(c1);
    nationality.setBorder(null);
    nationality.setOpaque(false);

    answer = new JTextField();
    answer.setBounds(200, 350, 190, 25);
    answer.setFont(new Font(font, Font.PLAIN, 15));
    answer.setForeground(c1);
    answer.setCursor(new Cursor(Cursor.TEXT_CURSOR));
    answer.setCaretColor(c1);
    answer.setBorder(null);
    answer.setOpaque(false);

    capField = new JTextField();
    capField.setBounds(260, 400, 190, 25);
    capField.setFont(new Font(font, Font.PLAIN, 15));
    capField.setForeground(c1);
    capField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
    capField.setCaretColor(c1);
    capField.setBorder(null);
    capField.setOpaque(false);

    // Password Fields
    password = new JPasswordField();
    password.setBounds(100, 280, 190, 25);
    password.setFont(new Font(font, Font.PLAIN, 15));
    password.setForeground(c1);
    password.setCursor(new Cursor(Cursor.TEXT_CURSOR));
    password.setCaretColor(c1);
    password.setBorder(null);
    password.setOpaque(false);

    rePassword = new JPasswordField();
    rePassword.setBounds(400, 280, 190, 25);
    rePassword.setFont(new Font(font, Font.PLAIN, 15));
    rePassword.setForeground(c1);
    rePassword.setCursor(new Cursor(Cursor.TEXT_CURSOR));
    rePassword.setCaretColor(c1);
    rePassword.setBorder(null);
    rePassword.setOpaque(false);

    // Buttons
    back = new JButton(new ImageIcon("images/back.png"));
    back.setBounds(20, 20, 35, 35);
    back.setFocusPainted(false);
    back.setBackground(null);
    back.addActionListener(this);
    back.setCursor(new Cursor(Cursor.HAND_CURSOR));
    back.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    back.setContentAreaFilled(false);

    submit = new JButton("SUBMIT");
    submit.setBounds(150, 440, 400, 35);
    submit.setFont(new Font(font, Font.BOLD, 20));
    submit.setBackground(c2);
    submit.setForeground(c4);
    submit.setCursor(new Cursor(Cursor.HAND_CURSOR));
    submit.setFocusPainted(false);
    submit.addActionListener(this);

    log = new JButton("Login");
    log.setBounds(400, 485, 50, 25);
    log.setForeground(c1);
    log.setFont(new Font(font, Font.BOLD, 15));
    log.setCursor(new Cursor(Cursor.HAND_CURSOR));
    log.setFocusPainted(false);
    log.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    log.setContentAreaFilled(false);
    log.addActionListener(this);

    noSee1 = new JButton();
    noSee1.setIcon(new ImageIcon("images/noSee.png"));
    noSee1.setBounds(180, 260, 30, 30);
    noSee1.setForeground(c2);
    noSee1.setCursor(new Cursor(Cursor.HAND_CURSOR));
    noSee1.setFocusPainted(false);
    noSee1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    noSee1.setContentAreaFilled(false);
    noSee1.addActionListener(this);

    see1 = new JButton();
    see1.setIcon(new ImageIcon("images/see.png"));
    see1.setBounds(180, 260, 30, 30);
    see1.setForeground(c2);
    see1.setCursor(new Cursor(Cursor.HAND_CURSOR));
    see1.setFocusPainted(false);
    see1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    see1.setContentAreaFilled(false);
    see1.setVisible(false);
    see1.addActionListener(this);

    noSee2 = new JButton();
    noSee2.setIcon(new ImageIcon("images/noSee.png"));
    noSee2.setBounds(530, 260, 30, 30);
    noSee2.setForeground(c2);
    noSee2.setCursor(new Cursor(Cursor.HAND_CURSOR));
    noSee2.setFocusPainted(false);
    noSee2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    noSee2.setContentAreaFilled(false);
    noSee2.addActionListener(this);

    see2 = new JButton();
    see2.setIcon(new ImageIcon("images/see.png"));
    see2.setBounds(530, 260, 30, 30);
    see2.setForeground(c2);
    see2.setCursor(new Cursor(Cursor.HAND_CURSOR));
    see2.setFocusPainted(false);
    see2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    see2.setContentAreaFilled(false);
    see2.setVisible(false);
    see2.addActionListener(this);

    // Combo Box
    secQues = new String[] { "Choose a Security Question.", "What's your father's name?",
        "What's your mother's name?", "What's your favourite pet's name?",
        "What's your favorite anime?", "What's your favourite movie?" };
    quesBox = new JComboBox<>(secQues);
    quesBox.setBounds(240, 310, 220, 25);
    quesBox.setSelectedIndex(0);
    quesBox.setBackground(c2);
    quesBox.setForeground(c4);

    genders = new String[] { "Select Gender", "Male", "Female", "Other" };
    genderBox = new JComboBox<>(genders);
    genderBox.setBounds(365, 130, 220, 25);
    genderBox.setSelectedIndex(0);
    genderBox.setBackground(c2);
    genderBox.setForeground(c4);

    users = new String[] { "Select Position", "Admin", "Teacher", "Student", "Employee" };
    userBox = new JComboBox<>(users);
    userBox.setBounds(435, 180, 150, 25);
    userBox.setSelectedIndex(0);
    userBox.setBackground(c2);
    userBox.setForeground(c4);

    pan2.add(create);
    pan1.add(back);
    // First Name
    pan2.add(fName);
    pan2.add(line1);
    pan2.add(tN1);
    // Last Name
    pan2.add(lName);
    pan2.add(line2);
    pan2.add(tN2);

    // DOB
    pan2.add(dob);
    pan2.add(line3);
    pan2.add(tDob);

    // Gender and user
    pan2.add(genderBox);
    pan2.add(userBox);

    // Email
    pan2.add(mail);
    pan2.add(line4);
    pan2.add(email);

    // User Name
    pan2.add(user);
    pan2.add(line5);
    pan2.add(userName);

    // Nationality
    pan2.add(nation);
    pan2.add(line6);
    pan2.add(nationality);

    // Password
    pan2.add(pass);
    pan2.add(line7);
    pan2.add(password);
    pan2.add(rePass);
    pan2.add(line8);
    pan2.add(rePassword);
    pan2.add(noSee1);
    pan2.add(see1);
    pan2.add(noSee2);
    pan2.add(see2);

    // Security Questions
    pan2.add(secure);
    pan2.add(quesBox);

    // Your Answer
    pan2.add(ans);
    pan2.add(line9);
    pan2.add(answer);

    // Captcha
    pan2.add(capLabel);
    pan2.add(captcha);
    pan2.add(line10);
    pan2.add(capField);

    // Buttons
    pan2.add(submit);
    pan2.add(all);
    pan2.add(log);

    frame.add(pan1);
    frame.add(pan2);
    frame.add(pan3);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == back) {
      frame.setVisible(false);
      login =new LoginWin();
    }
    if (e.getSource() == log) {
      frame.setVisible(false);
      login =new LoginWin();
    }

    if (e.getSource() == noSee1) {
      if (password.getEchoChar() != '\u0000') {
        password.setEchoChar('\u0000');
        noSee1.setVisible(false);
        see1.setVisible(true);
      }
    }

    if (e.getSource() == see1) {
      password.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
      see1.setVisible(false);
      noSee1.setVisible(true);
    }

    if (e.getSource() == noSee2) {
      if (rePassword.getEchoChar() != '\u0000') {
        rePassword.setEchoChar('\u0000');
        noSee2.setVisible(false);
        see2.setVisible(true);
      }
    }

    if (e.getSource() == see2) {
      rePassword.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
      see2.setVisible(false);
      noSee2.setVisible(true);
    }

    if (e.getSource() == submit) {
      String fName = tN1.getText();// First Name
      String lName = tN2.getText();// Last Name
      String dob = tDob.getText();// Date of Birth
      String gender = String.valueOf(genderBox.getSelectedItem());
      String position = String.valueOf(userBox.getSelectedItem());
      String mail = email.getText();// Email
      String user = userName.getText();// UserName
      String nation = nationality.getText();// Nationality
      String pass = String.valueOf(password.getPassword());// Password
      String rePass = String.valueOf(rePassword.getPassword());// Re-type password
      String question = String.valueOf(quesBox.getSelectedItem());// Security Question
      String ans = answer.getText();// Answer
      String ansCaptcha = capField.getText();// Captcha
      logic = new RegLogic(fName, lName, dob, gender, position, mail, user, nation, pass, rePass, question, ans);

      if (logic.empty() == "true" || (quesBox.getSelectedIndex() == 0) || (genderBox.getSelectedIndex() == 0)
          || (userBox.getSelectedIndex() == 0) || ansCaptcha.isEmpty()) {
        JOptionPane.showMessageDialog(frame, "Please, Fill all necessary Fields", "Warning!",
            JOptionPane.WARNING_MESSAGE);
      } else {
        int cap=0;
        try{
          cap = Integer.parseInt(ansCaptcha);
        }catch(NumberFormatException ex){
          System.out.println(ex);
        }
        if (logic.checkPass() == 0) {
          JOptionPane.showMessageDialog(frame, "Password does not match the re typed password", "Password Mismatch",
              JOptionPane.WARNING_MESSAGE);
        } else if (cap != x + y) {
          JOptionPane.showMessageDialog(frame, "Captcha does not match, try again.", "Captcha Mismatch",
              JOptionPane.WARNING_MESSAGE);
        } else {
          m = logic.createUser();
          if (m == 1) {
            JOptionPane.showMessageDialog(frame, "Account has been created,Login?", "Success!!!",
                JOptionPane.INFORMATION_MESSAGE);
           login= new LoginWin();
            frame.setVisible(false);
          }
        }
      }

    }
  }
}
