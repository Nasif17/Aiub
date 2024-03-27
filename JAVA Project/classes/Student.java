package classes;


import javax.swing.*;
import javax.swing.border.LineBorder;

import classes.basic.LoginWin;

import java.awt.*;
import java.awt.event.*;

import interfaces.*;
 public class  Student extends JFrame implements  ActionListener,IBasic{
    // Java Program to implement 
// AWT Panel
JFrame frame;

JButton b;

JLabel le1,le2,le3,
       le4,le5,le6,
       le7,le8,le9,
       le10,le11,le12;

	   private String userName;
	   LoginWin login;
	   SRoutine route;
	   SProfile pro;   

	
 public Student (String userN){
    this.userName = userN;
     frame = new JFrame("Student Portal"); 
    frame.setSize(1000, 563); 
    frame.setLocationRelativeTo(null);
    frame.setLayout(null);
	frame.setResizable(false);
    frame.setIconImage(new ImageIcon("images/logo.png").getImage());
    frame.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);


    
		JPanel panel1 = new JPanel(); 
		JPanel panel2 = new JPanel(); 

     // panel1
		panel1.setBackground(c3); 
        panel1.setSize(1000,100);
        panel1.setLocation(0,0);
        panel1.setLayout(null);
		panel1.setBorder(new LineBorder(Color.BLUE));
		

		//panel2 

		
		panel2.setBackground(c4); 
        panel2.setSize(1000,450);
        panel2.setLocation(0,105);
        panel2.setLayout(null);


		//Panel3

		JPanel p3 = new JPanel();
		p3.setBounds(35,20,260,175);
		p3.setBackground(Color.WHITE);
		p3.setLayout(null);

		JLabel l1 = new JLabel("Object oriented programming java [E]");
		JLabel l2 = new JLabel("Result: - A");
		JLabel l3= new JLabel("Status: - Valid");
		le1 = new JLabel("Faculty: - SIRAJUM MUNIRA SHIFAT");
        le2 = new JLabel("munirasirajum@aiub.edu");

		l1.setBounds(30,0,200,50);
		l2.setBounds(0,30,200,50);
		l3.setBounds(0,60,200,50);
		le1.setBounds(0,90,200,50);
		le2.setBounds(0,120,200,50);

        l1.setFont(new Font("Segoe UI",3,11));
		l2.setFont(new Font("Segoe UI",3,10));
		l3.setFont(new Font("Segoe UI",3,10));
		le1.setFont(new Font("Segoe UI",3,10));
		le2.setFont(new Font("Segoe UI",3,10));

        p3.add(l1);
		p3.add(l2);
		p3.add(l3);
		p3.add(le1);
		p3.add(le2);

		panel2.add(p3);

		//Panel4

		JPanel p4 = new JPanel();
		p4.setBounds(360,20,260,175);
		p4.setBackground(Color.WHITE);
		p4.setLayout(null);

		JLabel l4 = new JLabel("Bangladesh Studies [J]");
		JLabel l5 = new JLabel("Result: - A");
		JLabel l6= new JLabel("Status: - Valid");
		le3 = new JLabel("Faculty: - DR. ASHRAFUZZAMAN KHAN");
        le4 = new JLabel("ashraf@aiub.edu");

		l4.setBounds(60,0,200,50);
		l5.setBounds(0,30,200,50);
		l6.setBounds(0,60,200,50);
		le3.setBounds(0,90,200,50);
		le4.setBounds(0,120,200,50);

        l4.setFont(new Font("Segoe UI",3,11));
		l5.setFont(new Font("Segoe UI",3,10));
		l6.setFont(new Font("Segoe UI",3,10));
		le3.setFont(new Font("Segoe UI",3,10));
		le4.setFont(new Font("Segoe UI",3,10));

        p4.add(l4);
		p4.add(l5);
		p4.add(l6);
		p4.add(le3);
		p4.add(le4);
		
		panel2.add(p4);

		//Panel5

		JPanel p5 = new JPanel();
		p5.setBounds(680,20,260,175);
		p5.setBackground(Color.WHITE);
		p5.setLayout(null);

		JLabel l7 = new JLabel("Introduction to Electrical Circuit [B]");
		JLabel l8 = new JLabel("Result: - A");
		JLabel l9= new JLabel("Status: - Valid");
		le5 = new JLabel("DR. GOUR CHAND MAZUMDER");
        le6 = new JLabel("dr.mazumder@aiub.edu");

		l7.setBounds(40,0,260,50);
		l8.setBounds(0,30,200,50);
		l9.setBounds(0,60,200,50);
		le5.setBounds(0,90,200,50);
		le6.setBounds(0,120,200,50);
		
        l7.setFont(new Font("Segoe UI",3,11));
		l8.setFont(new Font("Segoe UI",3,10));
		l9.setFont(new Font("Segoe UI",3,10));
		le5.setFont(new Font("Segoe UI",3,10));
		le6.setFont(new Font("Segoe UI",3,10));

        p5.add(l7);
		p5.add(l8);
		p5.add(l9);
		p5.add(le5);
		p5.add(le6);

		panel2.add(p5);

		//Panel6

		JPanel p6 = new JPanel();
		p6.setBounds(35,205,260,175);
		p6.setBackground(Color.WHITE);
		p6.setLayout(null);

		JLabel l10 = new JLabel("Introduction to Electrical Circuit Lab [J]");
		JLabel l11 = new JLabel("Result: - A");
		JLabel l12= new JLabel("Status: - Valid");
		le7 = new JLabel("DR. MD. KAMRUL HASSAN");
        le8 = new JLabel("mdkamrul@aiub.edu");

		l10.setBounds(30,0,260,50);
		l11.setBounds(0,30,200,50);
		l12.setBounds(0,60,200,50);
		le7.setBounds(0,90,200,50);
		le8.setBounds(0,120,200,50);

        l10.setFont(new Font("Segoe UI",3,11));
		l11.setFont(new Font("Segoe UI",3,10));
		l12.setFont(new Font("Segoe UI",3,10));
		le7.setFont(new Font("Segoe UI",3,10));
		le8.setFont(new Font("Segoe UI",3,10));

        p6.add(l10);
		p6.add(l11);
		p6.add(l12);
		p6.add(le7);
		p6.add(le8);

		panel2.add(p6);

		//Panel7

		JPanel p7 = new JPanel();
		p7.setBounds(360,205,260,175);
		p7.setBackground(Color.WHITE);
		p7.setLayout(null);

		JLabel l13 = new JLabel("Complex Variable and Z Transformation[A]");
		JLabel l14 = new JLabel("Result: - A");
		JLabel l15= new JLabel("Status: - Valid");
		le9 = new JLabel("TANZIA ZERIN KHAN");
        le10 = new JLabel("tanzia@aiub.edu");

		l13.setBounds(20,0,260,50);
		l14.setBounds(0,30,200,50);
		l15.setBounds(0,60,200,50);
		le9.setBounds(0,90,200,50);
		le10.setBounds(0,120,200,50);

        l13.setFont(new Font("Segoe UI",3,11));
		l14.setFont(new Font("Segoe UI",3,10));
		l15.setFont(new Font("Segoe UI",3,10));
		le9.setFont(new Font("Segoe UI",3,10));
		le10.setFont(new Font("Segoe UI",3,10));

        p7.add(l13);
		p7.add(l14);
		p7.add(l15);
		p7.add(le9);
		p7.add(le10);

		panel2.add(p7);

		//Panel8

		JPanel p8 = new JPanel();
		p8.setBounds(680,205,260,175);
		p8.setBackground(Color.WHITE);
		p8.setLayout(null);

		JLabel l16 = new JLabel(" Principales of accounting [A]");
		JLabel l17 = new JLabel("Result: - A");
		JLabel l18= new JLabel("Status: - Valid");
		le11 = new JLabel("MOINUDDIN AHMED");
        le12 = new JLabel("moin@aiub.edu");
		

		l16.setBounds(60,0,260,50);
		l17.setBounds(0,30,200,50);
		l18.setBounds(0,60,200,50);
		le11.setBounds(0,90,200,50);
		le12.setBounds(0,120,200,50);

        l16.setFont(new Font("Segoe UI",3,11));
		l17.setFont(new Font("Segoe UI",3,10));
		l18.setFont(new Font("Segoe UI",3,10));
		le11.setFont(new Font("Segoe UI",3,10));
		le12.setFont(new Font("Segoe UI",3,10));

        p8.add(l16);
		p8.add(l17);
		p8.add(l18);
		p8.add(le11);
		p8.add(le12);

		panel2.add(p8);


        
        //button b
         b =new JButton("Logout");
        b.setForeground(Color.WHITE);
        b.addActionListener(this);
        b.setBounds(800,60,200,45);
        
		b.setCursor(new Cursor(Cursor.HAND_CURSOR));
       // b.setFocusPainted(false);
        b.setBorder(BorderFactory.createEmptyBorder(4,6,4,5));
        b.setContentAreaFilled(false);
        panel1.add(b);
		b.setFont(new Font(null, Font.BOLD, 20));

        //button b1
        JButton b1 =new JButton(this.userName);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        b1.setBounds(400,60,200,45);
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.setFocusPainted(false);
        b1.setBorder(BorderFactory.createEmptyBorder(4,6,4,5));
        b1.setContentAreaFilled(false);
        panel1.add(b1);
		b1.setFont(new Font(null, Font.BOLD, 20));

		 //button b2
		  JButton b2 =new JButton();
		 b2 =new JButton();
		 b2.setForeground(Color.WHITE);
		 b2.addActionListener(this);
		 b2.setBounds(15,0,25,25);
		 b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		 b2.setFocusPainted(false);
		 b2.setBorder(BorderFactory.createEmptyBorder(4,6,4,5));
		 b2.setContentAreaFilled(false);
		 b2.setIcon(new ImageIcon("images/back.png"));
		 panel1.add(b2);
 

        
       
        
        //button b3
        JButton b3 =new JButton("Routine");
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        b3.setBounds(20,60,200,45);
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setFocusPainted(false);
        b3.setBorder(BorderFactory.createEmptyBorder(4,6,4,5));
        b3.setContentAreaFilled(false);
        panel1.add(b3);
		b3.setFont(new Font(null, Font.BOLD, 20));


        //add panel
        panel1.add(b);
        panel1.add(b1);
        panel1.add(b3);



        frame.add(panel1); 
		frame.add(panel2);
		frame.setVisible(true); 

		

			
	

	b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == b) {
				frame.setVisible(false);
				login = new LoginWin();
			}
		}
	});

	b1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {

			if (ae.getSource() == b1) {
				frame.setVisible(false);
				
					try {
						pro = new SProfile(userN);
					} catch (Exception e) {
						// TO DO Auto-generated catch block
						e.printStackTrace();
					}
				
			}
			
		}
	});
	b3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {

			if (ae.getSource() == b3) {
				frame.setVisible(false);
				try {
					route =new SRoutine(userN);
				} catch (Exception e) {
					// TO DO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	});
	 

}

public void actionPerformed(ActionEvent e)
{
}

 }



		
		
    

 