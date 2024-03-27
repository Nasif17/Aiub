package classes.admin;
import java.lang.*;
import java.util.*;
import javax.swing.*;

import classes.basic.*;

import java.awt.*;
import java.awt.event.*;
import interfaces.*;

public class AdminDash implements ActionListener,IBasic{
    JFrame frame;
    JPanel pan1,pan2,pAdmin,pTeacher,pStudent,pEmployee;
    JLabel logo, dash,adminPic,teachPic,stuPic,emPic;
    JButton back,userN,logout,admin,teacher,student,employee;
    private String userName;
    AdminPro ap;
    LoginWin login;

    public AdminDash(String userName){
      this.userName = userName;
        frame = new JFrame("HARVARD");
        frame.setSize(width,height);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setIconImage(new ImageIcon("images/logo.png").getImage());
        frame.setLocationRelativeTo(null);
        
        //Panels
        pan1 = new JPanel();
        pan1.setBounds(0,0,1000,100);
        pan1.setLayout(null);
        pan1.setBackground(c4);

        pan2 = new JPanel();
        pan2.setSize(1000,463);
        pan2.setLayout(null);
        pan2.setLocation(0,100);
        pan2.setBackground(c2);
        
        pAdmin = new JPanel();
        pAdmin.setBounds(20,50,215,250);
        pAdmin.setLayout(null);
        pAdmin.setBackground(c3);

        pTeacher = new JPanel();
        pTeacher.setBounds(263,50,215,250);
        pTeacher.setLayout(null);
        pTeacher.setBackground(c4);

        pStudent = new JPanel();
        pStudent.setBounds(506,50,215,250);
        pStudent.setLayout(null);
        pStudent.setBackground(c3);

        pEmployee = new JPanel();
        pEmployee.setBounds(749,50,215,250);
        pEmployee.setLayout(null);
        pEmployee.setBackground(c4);

        //Images
        ImageIcon a = new ImageIcon("images/admin.png");
        Image ap = a.getImage();
        Image modA = ap.getScaledInstance(195, 190, Image.SCALE_SMOOTH);
        a = new ImageIcon(modA);

        ImageIcon t = new ImageIcon("images/teacher.png");
        Image te = t.getImage();
        Image modT = te.getScaledInstance(195, 190, Image.SCALE_SMOOTH);
        t = new ImageIcon(modT);

        ImageIcon s = new ImageIcon("images/student.png");
        Image st = s.getImage();
        Image modS = st.getScaledInstance(195, 190, Image.SCALE_SMOOTH);
        s = new ImageIcon(modS);

        ImageIcon e = new ImageIcon("images/employee.png");
        Image em = e.getImage();
        Image modE = em.getScaledInstance(195, 190, Image.SCALE_SMOOTH);
        e = new ImageIcon(modE);


        //Jlabels
        dash = new JLabel("Admin Dashboard");
        dash.setFont(new Font(font, Font.BOLD, 35));
        dash.setForeground(c2);
        dash.setBounds(350, 30, 300, 35);

        adminPic = new JLabel();
        adminPic.setIcon(a);
        adminPic.setBounds(10,10,195,190);

        teachPic = new JLabel();
        teachPic.setIcon(t);
        teachPic.setBounds(10,10,195,190);

        stuPic = new JLabel();
        stuPic.setIcon(s);
        stuPic.setBounds(10,10,195,190);

        emPic = new JLabel();
        emPic.setIcon(e);
        emPic.setBounds(10,10,195,190);

        //Jbuttons
         back = new JButton(new ImageIcon("images/back.png"));
         back.setBounds(20,20,35,35);
         back.setFocusPainted(false);
         back.setBackground(null);
         back.addActionListener(this);
         back.setCursor(new Cursor(Cursor.HAND_CURSOR));
         back.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
         back.setContentAreaFilled(false);

        userN = new JButton(this.userName+"...");
        userN.setBounds(750, 50, 150, 30);
        userN.setForeground(c2);
        userN.setFont(new Font(font, Font.BOLD, 15));
        userN.setCursor(new Cursor(Cursor.HAND_CURSOR));
        userN.setFocusPainted(false);
        userN.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        userN.setContentAreaFilled(false);
        userN.addActionListener(this);

        logout = new JButton("Sign Out");
        logout.setBounds(900, 50, 70, 30);
        logout.setForeground(c2);
        logout.setFont(new Font(font, Font.BOLD, 15));
        logout.setCursor(new Cursor(Cursor.HAND_CURSOR));
        logout.setFocusPainted(false);
        logout.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        logout.setContentAreaFilled(false);
        logout.addActionListener(this);

        admin = new JButton("Administrator");
        admin.setBounds(18, 200, 180, 30);
        admin.setForeground(c1);
        admin.setFont(new Font(font, Font.BOLD, 25));
        admin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        admin.setFocusPainted(false);
        admin.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        admin.setContentAreaFilled(false);
        admin.addActionListener(this);

        teacher = new JButton("Teacher");
        teacher.setBounds(60, 200, 100, 30);
        teacher.setForeground(c2);
        teacher.setFont(new Font(font, Font.BOLD, 25));
        teacher.setCursor(new Cursor(Cursor.HAND_CURSOR));
        teacher.setFocusPainted(false);
        teacher.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        teacher.setContentAreaFilled(false);
        teacher.addActionListener(this);

        student = new JButton("Student");
        student.setBounds(60, 200, 100, 30);
        student.setForeground(c1);
        student.setFont(new Font(font, Font.BOLD, 25));
        student.setCursor(new Cursor(Cursor.HAND_CURSOR));
        student.setFocusPainted(false);
        student.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        student.setContentAreaFilled(false);
        student.addActionListener(this);

        employee = new JButton("Employee");
        employee.setBounds(42, 200, 130, 30);
        employee.setForeground(c2);
        employee.setFont(new Font(font, Font.BOLD, 25));
        employee.setCursor(new Cursor(Cursor.HAND_CURSOR));
        employee.setFocusPainted(false);
        employee.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        employee.setContentAreaFilled(false);
        employee.addActionListener(this);

        

        //Panel 1
        pan1.add(back);
        pan1.add(dash);
        pan1.add(userN);
        pan1.add(logout);

        //Panel 2
        pan2.add(pAdmin);
        pan2.add(pTeacher);
        pan2.add(pStudent);
        pan2.add(pEmployee);

        pAdmin.add(adminPic);
        pAdmin.add(admin);
        
        pTeacher.add(teachPic);
        pTeacher.add(teacher);

        pStudent.add(stuPic);
        pStudent.add(student);

        pEmployee.add(emPic);
        pEmployee.add(employee);

        frame.add(pan1);
        frame.add(pan2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

     public void actionPerformed(ActionEvent e) {
        if(e.getSource()== back){
          frame.setVisible(false);
         login = new LoginWin();
        }

        if(e.getSource()== userN){
          frame.setVisible(false);
          ap = new AdminPro(userName);
        }
        if(e.getSource()==logout){
          frame.setVisible(false);
         login = new LoginWin();
        }
        if(e.getSource()==admin || e.getSource()==teacher||e.getSource()==employee||e.getSource()==student){
          JOptionPane.showMessageDialog(frame, "This Feature is Not Available:(", "OOPs!!!",JOptionPane.INFORMATION_MESSAGE);
        }
        
      }
}
