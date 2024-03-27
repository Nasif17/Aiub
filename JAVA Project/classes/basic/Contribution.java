package classes.basic;
import java.lang.*;
import javax.swing.*;

import classes.HomeWindow;
import classes.admin.*;

import java.awt.*;
import java.awt.event.*;
import interfaces.*;

public class Contribution implements ActionListener,IBasic {
    JFrame frame;

    JPanel pan,pAdmin,pTeacher,pStudent,pEmployee;
    JLabel contri,adminPic,adminN,adminID,teacherPic,teacherN,teacherID,
    stuPic,stuN,stuID,emPic,emN,emID;
    JButton back;
    HomeWindow home;

    public Contribution(){
        frame = new JFrame("HARVARD");
        frame.setSize(width,height);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setIconImage(new ImageIcon("images/logo.png").getImage());
        frame.setLocationRelativeTo(null);

        //Panels
        pan = new JPanel();
        pan.setBounds(0,0,width,height);
        pan.setLayout(null);
        pan.setBackground(c3);

        pAdmin = new JPanel();
        pAdmin.setBounds(20,100,215,350);
        pAdmin.setLayout(null);
        pAdmin.setBackground(c4);

        pTeacher = new JPanel();
        pTeacher.setBounds(263,100,215,350);
        pTeacher.setLayout(null);
        pTeacher.setBackground(c4);

        pStudent = new JPanel();
        pStudent.setBounds(506,100,215,350);
        pStudent.setLayout(null);
        pStudent.setBackground(c4);

        pEmployee = new JPanel();
        pEmployee.setBounds(749,100,215,350);
        pEmployee.setLayout(null);
        pEmployee.setBackground(c4);

        //Images
        ImageIcon a = new ImageIcon("images/admin.png");
        Image ap = a.getImage();
        Image modA = ap.getScaledInstance(190, 190, Image.SCALE_SMOOTH);
        a = new ImageIcon(modA);

        ImageIcon t = new ImageIcon("images/teacher.png");
        Image te = t.getImage();
        Image modT = te.getScaledInstance(190, 190, Image.SCALE_SMOOTH);
        t = new ImageIcon(modT);

        ImageIcon s = new ImageIcon("images/student.png");
        Image st = s.getImage();
        Image modS = st.getScaledInstance(190, 190, Image.SCALE_SMOOTH);
        s = new ImageIcon(modS);

        ImageIcon e = new ImageIcon("images/employee.png");
        Image em = e.getImage();
        Image modE = em.getScaledInstance(190, 190, Image.SCALE_SMOOTH);
        e = new ImageIcon(modE);

        //Jlabel
        contri = new JLabel("Contributions");
        contri.setFont(new Font(font, Font.BOLD, 35));
        contri.setForeground(c2);
        contri.setBounds(380, 20, 240, 50);

        adminPic = new JLabel();
        adminPic.setIcon(a);
        adminPic.setBounds(10,10,190,190);

        adminN = new JLabel("Name: Syed Iftear Hasan");
        adminN.setFont(new Font(font, Font.BOLD, 15));
        adminN.setForeground(c2);
        adminN.setBounds(10, 230, 190, 25);

        adminID = new JLabel("ID: 23-51367-1");
        adminID.setFont(new Font(font, Font.BOLD, 15));
        adminID.setForeground(c2);
        adminID.setBounds(10, 260, 190, 25);

        teacherPic = new JLabel();
        teacherPic.setIcon(t);
        teacherPic.setBounds(10,10,190,190);

        teacherN = new JLabel("Md.Nur Rahatul Islam");
        teacherN.setFont(new Font(font, Font.BOLD, 15));
        teacherN.setForeground(c2);
        teacherN.setBounds(10, 230, 190, 25);

        teacherID = new JLabel("ID: 23-51007-1");
        teacherID.setFont(new Font(font, Font.BOLD, 15));
        teacherID.setForeground(c2);
        teacherID.setBounds(10, 260, 190, 25);

        stuPic = new JLabel();
        stuPic.setIcon(s);
        stuPic.setBounds(10,10,190,190);

        stuN = new JLabel("MD. Nasif Rafidi");
        stuN.setFont(new Font(font, Font.BOLD, 15));
        stuN.setForeground(c2);
        stuN.setBounds(10, 230, 190, 25);

        stuID = new JLabel("ID: 23-51361-1");
        stuID.setFont(new Font(font, Font.BOLD, 15));
        stuID.setForeground(c2);
        stuID.setBounds(10, 260, 190, 25);

        emPic = new JLabel();
        emPic.setIcon(e);
        emPic.setBounds(10,10,190,190);

        emN = new JLabel("Mashrafi Ahsan");
        emN.setFont(new Font(font, Font.BOLD, 15));
        emN.setForeground(c2);
        emN.setBounds(10, 230, 190, 25);

        emID = new JLabel("ID: 23-51355-1");
        emID.setFont(new Font(font, Font.BOLD, 15));
        emID.setForeground(c2);
        emID.setBounds(10, 260, 190, 25);

        //Jbuttons
        back = new JButton(new ImageIcon("images/back.png"));
        back.setBounds(20,20,35,35);
        back.setFocusPainted(false);
        back.setBackground(null);
        back.addActionListener(this);
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        back.setContentAreaFilled(false);


        //Admin
        pAdmin.add(adminPic);
        pAdmin.add(adminN);
        pAdmin.add(adminID);

        //Teacher
        pTeacher.add(teacherPic);
        pTeacher.add(teacherN);
        pTeacher.add(teacherID);

        //Student
        pStudent.add(stuPic);
        pStudent.add(stuN);
        pStudent.add(stuID);

        //Employee
        pEmployee.add(emPic);
        pEmployee.add(emN);
        pEmployee.add(emID);

        pan.add(contri);
        pan.add(pAdmin);
        pan.add(pTeacher);
        pan.add(pStudent);
        pan.add(pEmployee);
        pan.add(back);


        frame.add(pan);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== back){
          frame.setVisible(false);
         home = new HomeWindow();
        }
        
      }
    
}
