package classes;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import interfaces.*;
import classes.basic.*;


public class HomeWindow extends JFrame implements ActionListener,IBasic{
    JFrame frame;
    JPanel pan;
    JLabel wel;
    JButton en,con;
    LoginWin login;
    Contribution contri;

    public HomeWindow(){
        frame = new JFrame("HARVARD");
        frame.setSize(width,height);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setIconImage(new ImageIcon("images/logo.png").getImage());
        frame.setLocationRelativeTo(null);

        pan = new JPanel();
        pan.setBounds(0,0,width,height);
        pan.setLayout(null);
        pan.setBackground(c4);

        wel = new JLabel("WELCOME");
        wel.setFont(new Font(font, Font.BOLD, 40));
        wel.setForeground(c2);
        wel.setBounds(400, 150, 200, 50);
                

        en = new JButton("Login");
        en.setBounds(375,210,250,50);
        en.setFont(new Font(font,Font.BOLD,30));
        en.setForeground(c1);
        en.setBackground(c3);
        en.setFocusPainted(false);
        en.addActionListener(this);
        
        
        con = new JButton("Contribution");
        con.setBounds(375,280,250,50);
        con.setFont(new Font(font,Font.BOLD,30));
        con.setForeground(c1);
        con.setBackground(c3);
        con.setFocusPainted(false);
        con.addActionListener(this);


        pan.add(con);
        pan.add(en);
        pan.add(wel);
        frame.add(pan);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==en){
            frame.setVisible(false);
           login= new LoginWin();
        }
        if(e.getSource()==con){
            frame.setVisible(false);
           contri = new Contribution();
        }

    }
    
}
