package classes.admin;
import java.lang.*;
import java.util.*;
import javax.swing.*;

import classes.logic.*;

import java.awt.*;
import java.awt.event.*;
import interfaces.*;

public class AdminPro extends AdminInfo implements IBasic,ActionListener {
    JFrame frame;
    JPanel pan1,pan2,pan3,panPic;
    JLabel jTitle,jName,name,jDob,dob,jemail,email,jUser,userN,
           jnation,nation,jGender,gender,jPosition,position,proPic;
    JButton back;
   private String fName,lName,sDOb,sEmail,sUser,sNation,sGender,sPosition;
   AdminDash dash;

    public AdminPro(String userName){
      super(userName);
      sUser = userName;
      fName = getFName();
      lName = getLName();
      sDOb = getDob();
      sEmail = getEmail();
      sNation = getNation();
      sPosition=getPosition();
      sGender = getGender();
        //Frame
        frame = new JFrame("HARVARD");
        frame.setSize(width,height);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setIconImage(new ImageIcon("images/logo.png").getImage());
        frame.setLocationRelativeTo(null);

        //Panel
        pan1 = new JPanel();
        pan1.setBounds(0,0,150,563);
        pan1.setLayout(null);
        pan1.setBackground(c3);

        pan2 = new JPanel();
        pan2.setSize(700,563);
        pan2.setLayout(null);
        pan2.setLocation(150,0);
        pan2.setBackground(c4);

        pan3 = new JPanel();
        pan3.setBounds(850,0,150,563);
        pan3.setLayout(null);
        pan3.setBackground(c3);

        panPic = new JPanel();
        panPic.setBounds(450,100,200,200);
        panPic.setLayout(null);
        panPic.setBackground(c3);

        //Picture
        ImageIcon pic = new ImageIcon("images/admin.png");
        Image ipic = pic.getImage();
        Image mPic = ipic.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        pic = new ImageIcon(mPic);

        //Jlabel
        jTitle = new JLabel("ADMIN PROFILE");
        jTitle.setFont(new Font(font, Font.BOLD, 35));
        jTitle.setForeground(c2);
        jTitle.setBounds(220, 20, 270, 40);

        proPic = new JLabel();
        proPic.setIcon(pic);
        proPic.setBounds(0,0,200,200);

        jName = new JLabel("Name: ");
        jName.setFont(new Font(font, Font.PLAIN, 20));
        jName.setForeground(c2);
        jName.setBounds(50, 150, 70, 30);
        
        name = new JLabel(fName+" "+lName);
        name.setFont(new Font(font, Font.PLAIN, 20));
        name.setForeground(c2);
        name.setBounds(120, 150, 200, 30);

        jUser = new JLabel("User Name: ");
        jUser.setFont(new Font(font, Font.PLAIN, 20));
        jUser.setForeground(c2);
        jUser.setBounds(50, 200, 110, 30);

        userN = new JLabel(sUser);
        userN.setFont(new Font(font, Font.PLAIN, 20));
        userN.setForeground(c2);
        userN.setBounds(160, 200, 200, 30);

        jemail = new JLabel("Email: ");
        jemail.setFont(new Font(font, Font.PLAIN, 20));
        jemail.setForeground(c2);
        jemail.setBounds(50, 250, 70, 30);

        email = new JLabel(sEmail);
        email.setFont(new Font(font, Font.PLAIN, 20));
        email.setForeground(c2);
        email.setBounds(110, 250, 350, 30);

        jPosition = new JLabel("Position: ");
        jPosition.setFont(new Font(font, Font.PLAIN, 20));
        jPosition.setForeground(c2);
        jPosition.setBounds(50, 300, 90, 30);

        position = new JLabel(sPosition);
        position.setFont(new Font(font, Font.PLAIN, 20));
        position.setForeground(c2);
        position.setBounds(135, 300, 200, 30);

        jGender = new JLabel("Gender: ");
        jGender.setFont(new Font(font, Font.PLAIN, 20));
        jGender.setForeground(c2);
        jGender.setBounds(50, 350, 80, 30);

        gender = new JLabel(sGender);
        gender.setFont(new Font(font, Font.PLAIN, 20));
        gender.setForeground(c2);
        gender.setBounds(130, 350, 200, 30);
        
        jDob = new JLabel("DOB: ");
        jDob.setFont(new Font(font, Font.PLAIN, 20));
        jDob.setForeground(c2);
        jDob.setBounds(50, 400, 60, 30);

        dob = new JLabel(sDOb);
        dob.setFont(new Font(font, Font.PLAIN, 20));
        dob.setForeground(c2);
        dob.setBounds(105, 400, 200, 30);

        jnation = new JLabel("Nationality: ");
        jnation.setFont(new Font(font, Font.PLAIN, 20));
        jnation.setForeground(c2);
        jnation.setBounds(50, 450, 110, 30);

        nation = new JLabel(sNation);
        nation.setFont(new Font(font, Font.PLAIN, 20));
        nation.setForeground(c2);
        nation.setBounds(160, 450, 200, 30);

        //Buttons
        back = new JButton(new ImageIcon("images/back.png"));
        back.setBounds(20,20,35,35);
        back.setFocusPainted(false);
        back.setBackground(null);
        back.addActionListener(this);
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        back.setContentAreaFilled(false);

        


        pan1.add(back);

        //Panel 2
        pan2.add(jTitle);
        panPic.add(proPic);
        pan2.add(panPic);

        pan2.add(jName);
        pan2.add(name);
        
        pan2.add(jUser);
        pan2.add(userN);

        pan2.add(jemail);
        pan2.add(email);

        pan2.add(jPosition);
        pan2.add(position);

        pan2.add(jGender);
        pan2.add(gender);

        pan2.add(jDob);
        pan2.add(dob);

        pan2.add(jnation);
        pan2.add(nation);

        frame.add(pan1);
        frame.add(pan2);
        frame.add(pan3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== back){
          frame.setVisible(false);
          dash = new AdminDash(sUser);
        }
      }
    
}
