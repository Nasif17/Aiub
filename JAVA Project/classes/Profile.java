package classes;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;
import javax.swing.*;
import classes.basic.LoginWin;
import interfaces.IBasic;

public class Profile extends JFrame implements ActionListener,IBasic{
  private JButton back;
  private JLabel profile,info,fname,lname,dob1,gen,position1,email1,national;
  private Font f;
  protected static String firstName, lastName,uname,dob,nationality,gender,email,position;
  String teachPath = ".\\File\\teacher.txt";

    public Profile(){
        initcomponents();
    }
    public void initcomponents(){
      this.setTitle("HARVARD");
      this.setIconImage(new ImageIcon("images/logo.png").getImage());
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setSize(1000,563);
      this.setResizable(false);
      this.setLayout(null);
      this.setLocationRelativeTo(null);
      this.setVisible(true);

      JPanel panel=new JPanel();
      panel.setBackground(IBasic.c3);
      panel.setBounds(0, 0, 1000, 563);
      panel.setLayout(null);
      this.add(panel);

      back=new JButton(new ImageIcon("images/back.png"));
      back.setBounds(20, 20, 35, 35);
      back.setFocusPainted(false);
      back.setCursor(new Cursor(Cursor.HAND_CURSOR));
      back.setContentAreaFilled(false);
      back.setBorderPainted(true);
      panel.add(back);

      profile=new JLabel(new ImageIcon("images/profile1.png"));
      profile.setBounds(450,20,100,100);
      panel.add(profile);

      f=new Font("Times New Roman",Font.BOLD,30);

      info=new JLabel();
      info.setBounds(360,130,280,30);
      info.setText("Personal Information");
      info.setForeground(Color.decode("#FFFFFF"));
      info.setFont(f);
      panel.add(info);
      
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
            firstName = Files.readAllLines(Paths.get(teachPath)).get(i + 2);
            lastName = Files.readAllLines(Paths.get(teachPath)).get(i + 3);
            dob=Files.readAllLines(Paths.get(teachPath)).get(i + 4);
            gender=Files.readAllLines(Paths.get(teachPath)).get(i + 5);
            position= uname=Files.readAllLines(Paths.get(teachPath)).get(i + 6);
            email=Files.readAllLines(Paths.get(teachPath)).get(i + 7);
            nationality=Files.readAllLines(Paths.get(teachPath)).get(i + 8);

            break;
          }
        }
      }
    } catch (Exception ex) {
      System.out.print(ex);
    }
      fname = new JLabel(firstName);
      fname.setBounds(360, 180, 300, 30);
      Font fnameFont = new Font("Times New Roman", Font.PLAIN, 22);
      fname.setFont(fnameFont);
      fname.setForeground(Color.decode("#FFFFFF"));
      panel.add(fname);

      lname = new JLabel(lastName);
      lname.setBounds(360, 220, 300, 30);
      Font lnameFont = new Font("Times New Roman", Font.PLAIN, 22);
      lname.setFont(lnameFont);
      lname.setForeground(Color.decode("#FFFFFF"));
      panel.add(lname);

      dob1 = new JLabel(dob);
      dob1.setBounds(360, 260, 300, 30);
      Font dob1Font = new Font("Times New Roman", Font.PLAIN, 22);
      dob1.setFont(dob1Font);
      dob1.setForeground(Color.decode("#FFFFFF"));
      panel.add(dob1);

      gen = new JLabel(gender);
      gen.setBounds(360, 300, 300, 30);
      Font genFont = new Font("Times New Roman", Font.PLAIN, 22);
      gen.setFont(genFont);
      gen.setForeground(Color.decode("#FFFFFF"));
      panel.add(gen);

      position1= new JLabel(position);
      position1.setBounds(360, 340, 300, 30);
      Font position1Font = new Font("Times New Roman", Font.PLAIN, 22);
      position1.setFont(position1Font);
      position1.setForeground(Color.decode("#FFFFFF"));
      panel.add(position1);

      email1 = new JLabel(email);
      email1.setBounds(360, 380, 300, 30);
      Font email1Font = new Font("Times New Roman", Font.PLAIN, 22);
      email1.setFont(email1Font);
      email1.setForeground(Color.decode("#FFFFFF"));
      panel.add(email1);

      national = new JLabel(nationality);
      national.setBounds(360, 420, 300, 30);
      Font nationalFont = new Font("Times New Roman", Font.PLAIN, 22);
      national.setFont(nationalFont);
      national.setForeground(Color.decode("#FFFFFF"));
      panel.add(national);
      back.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==back){
        this.setVisible(false);
        new Dashboard();
       }
    }
}
