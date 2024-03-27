package classes.basic;

import java.lang.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import classes.*;
import interfaces.*;
import classes.*;
import classes.logic.*;
import classes.admin.*;

public class LoginWin implements ActionListener,IBasic{
    JFrame frame;
    JPanel pan1, pan2,pan3;
    ImageIcon pic1,pic2;
    JLabel wel,sign,user,pass,ul,pl,dont,userPng;
    JButton back,forgot,login,up,see,noSee;
    JRadioButton rBtn1,rBtn2,rBtn3,rBtn4;
    ButtonGroup grp;
    JTextField text;
    JPasswordField passF;
    JCheckBox check;
    String passWord,userType="";
    public static String userName;//static
    int x;
    loginLogic log;
    Recover recover;
    RegWin resgis;
    AdminDash adminDas;
    HomeWindow home;
    Dashboard teacherDash;
    Student studentDash;
    Employee emDash;
    

    public LoginWin(){
      //Frame
        frame = new JFrame("HARVARD");
        frame.setSize(width,height);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setIconImage(new ImageIcon("images/logo.png").getImage());
        frame.setLocationRelativeTo(null);

        //JPanels
        pan1 = new JPanel();
        pan1.setBounds(0,0,175,563);
        pan1.setLayout(null);
        pan1.setBackground(c4);

        pan2 = new JPanel();
        pan2.setSize(650,563);
        pan2.setLayout(null);
        pan2.setLocation(175,0);
        pan2.setBackground(c3);

        pan3 = new JPanel();
        pan3.setBounds(825,0,175,563);
        pan3.setLayout(null);
        pan3.setBackground(c4);

        //ImageIcons
        pic1 = new ImageIcon("images/login.png");
        pic2 = new ImageIcon("images/back.png");

        //JLabel

        wel = new JLabel("Login Page");
        wel.setFont(new Font(font, Font.BOLD, 35));
        wel.setForeground(c1);
        wel.setBounds(225, 25, 200, 45);

        sign = new JLabel("Sign in with your User Name & Password");
        sign.setFont(new Font(font, Font.BOLD, 15));
        sign.setForeground(c1);
        sign.setBounds(175, 75, 300, 25);

        user = new JLabel("User Name");
        user.setFont(new Font(font, Font.PLAIN, 20));
        user.setForeground(c1);
        user.setBounds(145, 150, 150, 25);
        ul = new JLabel("______________________________________________________");
        ul.setForeground(c1);
        ul.setBounds(150,185,350,30);
        ul.setCursor(new Cursor(Cursor.TEXT_CURSOR));

        pass = new JLabel("Password");
        pass.setFont(new Font(font, Font.PLAIN, 20));
        pass.setForeground(c1);
        pass.setBounds(145, 235, 100, 25);
        pl = new JLabel("______________________________________________________");
        pl.setForeground(c1);
        pl.setBounds(150,270,350,30);
        pl.setCursor(new Cursor(Cursor.TEXT_CURSOR));

        dont = new JLabel("Don't have an account?");
        dont.setFont(new Font(font, Font.PLAIN, 15));
        dont.setForeground(c1);
        dont.setBounds(200, 410, 160, 30);

        userPng = new JLabel();
        userPng.setIcon(new ImageIcon("images/user.png"));
        userPng.setBounds(250, 150, 30, 30);
        userPng.setForeground(c2);
        
        
        

        //Buttons
        back = new JButton(pic2);
        back.setBounds(20,20,35,35);
        back.setFocusPainted(false);
        back.setBackground(null);
        back.addActionListener(this);
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        back.setContentAreaFilled(false);

        forgot = new JButton("Forgot Password?");
        forgot.setBounds(330, 300, 170, 30);
        forgot.setForeground(c1);
        forgot.setFont(new Font(font, Font.BOLD, 15));
        forgot.setCursor(new Cursor(Cursor.HAND_CURSOR));
        forgot.setFocusPainted(false);
        forgot.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        forgot.setContentAreaFilled(false);
        forgot.addActionListener(this);

        login = new JButton("Login");
        login.setBounds(150, 350, 350, 50);
        login.setFont(new Font(font, Font.BOLD, 25));
        login.setForeground(c1);
        login.setBackground(c4);
        login.setCursor(new Cursor(Cursor.HAND_CURSOR));
        login.setFocusPainted(false);
        login.addActionListener(this);

        up = new JButton("Sign Up");
        up.setBounds(337, 410, 100, 30);
        up.setForeground(c1);
        up.setFont(new Font(font, Font.BOLD, 15));
        up.setCursor(new Cursor(Cursor.HAND_CURSOR));
        up.setFocusPainted(false);
        up.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        up.setContentAreaFilled(false);
        up.addActionListener(this);

         noSee = new JButton();
        noSee.setIcon(new ImageIcon("images/noSee.png"));
        noSee.setBounds(235, 235, 30, 30);
        noSee.setForeground(c2);
        noSee.setCursor(new Cursor(Cursor.HAND_CURSOR));
        noSee.setFocusPainted(false);
        noSee.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        noSee.setContentAreaFilled(false);
        noSee.addActionListener(this);

        see = new JButton();
        see.setIcon(new ImageIcon("images/see.png"));
        see.setBounds(235, 235, 30, 30);
        see.setForeground(c2);
        see.setCursor(new Cursor(Cursor.HAND_CURSOR));
        see.setFocusPainted(false);
        see.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        see.setContentAreaFilled(false);
        see.setVisible(false);
        see.addActionListener(this);


        //Radio Buttons
        grp = new ButtonGroup();
        rBtn1 = new JRadioButton("Admin");
        rBtn1.setFont(new Font(font,Font.BOLD,15));
        rBtn1.setForeground(c1);
        rBtn1.setContentAreaFilled(false);
        rBtn1.setBounds(125,110,100,25);
        rBtn1.setBorderPainted(false);
        rBtn1.setFocusPainted(false);
        rBtn1.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
        rBtn1.addActionListener(this);

        rBtn2 = new JRadioButton("Teacher");
        rBtn2.setFont(new Font(font,Font.BOLD,15));
        rBtn2.setForeground(c1);
        rBtn2.setContentAreaFilled(false);
        rBtn2.setBounds(225,110,100,25);
        rBtn2.setBorderPainted(false);
        rBtn2.setFocusPainted(false);
        rBtn2.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
        rBtn2.addActionListener(this);

        rBtn3 = new JRadioButton("Student");
        rBtn3.setFont(new Font(font,Font.BOLD,15));
        rBtn3.setForeground(c1);
        rBtn3.setContentAreaFilled(false);
        rBtn3.setBounds(325,110,100,25);
        rBtn3.setBorderPainted(false);
        rBtn3.setFocusPainted(false);
        rBtn3.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
        rBtn3.addActionListener(this);

        rBtn4 = new JRadioButton("Employee");
        rBtn4.setFont(new Font(font,Font.BOLD,15));
        rBtn4.setForeground(c1);
        rBtn4.setContentAreaFilled(false);
        rBtn4.setBounds(425,110,100,25);
        rBtn4.setBorderPainted(false);
        rBtn4.setFocusPainted(false);
        rBtn4.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
        rBtn4.addActionListener(this);

        //TextField
        text = new JTextField();
        text.setBounds(150, 180, 350, 30);
        text.setFont(new Font(font, Font.PLAIN, 20));
        text.setForeground(c1);
        text.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        text.setCaretColor(c1);
        text.setBorder(null);
        text.setOpaque(false);

        //Password Field
        passF = new JPasswordField();
        passF.setBounds(150, 265, 350, 30);
        passF.setFont(new Font(font, Font.PLAIN, 20));
        passF.setForeground(c1);
        passF.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        passF.setCaretColor(c1);
        passF.setBorder(null);
        passF.setOpaque(false);

        //Check Box
        check = new JCheckBox("Remember me");
        check.setBounds(150, 300, 200, 30);
        check.setFont(new Font(font, Font.BOLD,15));
        check.setCursor(new Cursor(Cursor.HAND_CURSOR));
        check.setForeground(c1);
        check.setFocusPainted(false);
        check.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        check.setContentAreaFilled(false);
        

      
        pan2.add(wel);
        pan2.add(sign);

        pan2.add(rBtn1);
        pan2.add(rBtn2);
        pan2.add(rBtn3);
        pan2.add(rBtn4);

        pan2.add(user);
        pan2.add(ul);
        pan2.add(text);
        pan2.add(userPng);

        pan2.add(pass);
        pan2.add(pl);
        pan2.add(passF);
        pan2.add(noSee);
        pan2.add(see);

        pan2.add(check);
        pan2.add(forgot);
        pan2.add(login);
        pan2.add(dont);
        pan2.add(up);

        grp.add(rBtn1);
        grp.add(rBtn2);
        grp.add(rBtn3);
        grp.add(rBtn4);

        pan1.add(back);
        frame.add(pan1);
        frame.add(pan2);
        frame.add(pan3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        
    }

    
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()== back){
        frame.setVisible(false);
       home = new HomeWindow();
      }

      if(e.getSource()==up){
        frame.setVisible(false);
        resgis=new RegWin();
      }

      if(e.getSource()==forgot){
        frame.setVisible(false);
        recover =new Recover();
      }

      if(e.getSource()==noSee){
        if(passF.getEchoChar() != '\u0000'){
          passF.setEchoChar('\u0000');
          noSee.setVisible(false);
          see.setVisible(true);
        }
      }

      if (e.getSource() == see) {
        passF.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
        see.setVisible(false);
        noSee.setVisible(true);
    }

      if(e.getSource()==rBtn1){
        userType = "admin";
      }

      if(e.getSource()==rBtn2){
        userType = "teacher";
      }

      if(e.getSource()==rBtn3){
        userType = "student";
      }

      if(e.getSource()==rBtn4){
        userType = "employee";
      }

      if(e.getSource()==login){
        userName = text.getText();//User Name
        passWord = String.valueOf(passF.getPassword());
        log = new loginLogic(userName, passWord, userType);
        if(log.check()==1){
         JOptionPane.showMessageDialog(frame, "Please, Fill all necessary Fields", 
          "Notice!", JOptionPane.WARNING_MESSAGE);
        }
        else if(userType.isEmpty()){
             JOptionPane.showMessageDialog(frame, "Select User Type", 
          "Notice!", JOptionPane.WARNING_MESSAGE);
          }
        else{
          x = log.matchUser();
          if(x==1){
            frame.setVisible(false);
            if(userType.equals("admin")){
             adminDas = new AdminDash(userName);
            }else if (userType.equals("teacher")){
              teacherDash = new Dashboard();
            }else if (userType.equals("student")){
              studentDash = new Student(userName);
            }
            else if (userType.equals("employee")){
              emDash = new Employee(userName);
            }
          }else if(x==0){
            JOptionPane.showMessageDialog(frame, "Incorrect Username or Password", "Mismatch",
             JOptionPane.WARNING_MESSAGE);
          }
        }

      }
    }
    
}
