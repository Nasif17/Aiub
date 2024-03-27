package classes.basic;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import interfaces.*;

public class Recover implements ActionListener,IBasic {
    JFrame frame;
    JPanel pan1, pan2,pan3;
    JLabel rec,user,mail,line1,line2,line3,secure,ans;
    JTextField userName,email,answer;
    JButton back,recover;
    String[] secQues;
    JComboBox<String> quesBox;
    LoginWin login;

    public Recover(){
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

         //JLabels
         rec = new JLabel("Password Recovery");
         rec.setFont(new Font(font, Font.BOLD, 30));
         rec.setForeground(c1);
         rec.setBounds(185, 30, 280, 40);

         user = new JLabel("User Name:");
         user.setFont(new Font(font, Font.PLAIN, 15));
         user.setForeground(c1);
         user.setBounds(175, 90, 200, 25);
         line1 = new JLabel("______________________________________________");
         line1.setForeground(c1);
         line1.setBounds(175,110,300,25);
         line1.setCursor(new Cursor(Cursor.TEXT_CURSOR));

         mail = new JLabel("Recovery Email:");
         mail.setFont(new Font(font, Font.PLAIN, 15));
         mail.setForeground(c1);
         mail.setBounds(175, 140, 200, 25);
         line2 = new JLabel("______________________________________________");
         line2.setForeground(c1);
         line2.setBounds(175,160,300,25);
         line2.setCursor(new Cursor(Cursor.TEXT_CURSOR));

         secure = new JLabel("Security Question:");
         secure.setFont(new Font(font, Font.PLAIN, 15));
         secure.setForeground(c1);
         secure.setBounds(175, 190, 200, 25);
 
         ans = new JLabel("Your answer:");
         ans.setFont(new Font(font, Font.PLAIN, 15));
         ans.setForeground(c1);
         ans.setBounds(175, 240, 90, 25);
         line3 = new JLabel("_____________________________");
         line3.setForeground(c1);
         line3.setBounds(275,245,200,25);
         line3.setCursor(new Cursor(Cursor.TEXT_CURSOR));
 

         //JTextFields
         userName = new JTextField();
         userName.setBounds(175, 105, 290, 25);
         userName.setFont(new Font(font, Font.PLAIN, 15));
         userName.setForeground(c1);
         userName.setCursor(new Cursor(Cursor.TEXT_CURSOR));
         userName.setCaretColor(c1);
         userName.setBorder(null);
         userName.setOpaque(false);
         
         email = new JTextField();
         email.setBounds(175, 155, 290, 25);
         email.setFont(new Font(font, Font.PLAIN, 15));
         email.setForeground(c1);
         email.setCursor(new Cursor(Cursor.TEXT_CURSOR));
         email.setCaretColor(c1);
         email.setBorder(null);
         email.setOpaque(false);

         answer = new JTextField();
         answer.setBounds(275, 240, 190, 25);
         answer.setFont(new Font(font, Font.PLAIN, 15));
         answer.setForeground(c1);
         answer.setCursor(new Cursor(Cursor.TEXT_CURSOR));
         answer.setCaretColor(c1);
         answer.setBorder(null);
         answer.setOpaque(false);

         //Combo Box
         secQues = new String[] { "Choose a Security Question.", "What's your father's name?", 
                                  "What's your mother's name?","What's your favourite pet's name?",
                                   "What's your favorite anime?", "What's your favourite movie?" };
         quesBox = new JComboBox<>(secQues);
         quesBox.setBounds(305, 190, 220, 25);
         quesBox.setSelectedIndex(0);
         quesBox.setBackground(c1);

         //Buttons
         back = new JButton(new ImageIcon("images/back.png"));
         back.setBounds(20,20,35,35);
         back.setFocusPainted(false);
         back.setBackground(null);
         back.addActionListener(this);
         back.setCursor(new Cursor(Cursor.HAND_CURSOR));
         back.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
         back.setContentAreaFilled(false);

         recover = new JButton("Recover Password");
         recover.setBounds(175, 300, 300, 35);
         recover.setFont(new Font(font, Font.BOLD, 20));
         recover.setBackground(c2);
         recover.setForeground(c4);
         recover.setCursor(new Cursor(Cursor.HAND_CURSOR));
         recover.setFocusPainted(false);

         pan2.add(rec);
         pan1.add(back);

         //user
         pan2.add(user);
         pan2.add(line1);
         pan2.add(userName);

         //Mail
         pan2.add(mail);
         pan2.add(line2);
         pan2.add(email);

         //Security Questions
         pan2.add(secure);
         pan2.add(quesBox);

         //Answer
         pan2.add(ans);
         pan2.add(line3);
         pan2.add(answer);

         //Buttons
         pan2.add(recover);



        frame.add(pan1);
        frame.add(pan2);
        frame.add(pan3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== back){
          frame.setVisible(false);
         login= new LoginWin();
        }
        
      }
    
}
