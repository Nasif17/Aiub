package classes;
import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.*;
import interfaces.*;


public class SRoutine extends JFrame implements  ActionListener,IBasic{
    //Frame
    JFrame f;
    private String userName;

    //Panel
     JPanel panel,p1,p2,p3,
                  p4,p5,p6,
                  p7,p8,p9,
                  p10,p11,p12,
                  p13,p14,p15,
                  p16,p17,p18,pr;

     //Label
     JLabel l1,l2,l3,
            l4,l5,l6,
            l7,l8,l9,
            l10,l11,l12,
            l13,l14,l15,
            l16,l17,l18,lr;

      //Button
      JButton b;   
      Student stu;   


    public SRoutine(String userN)
    {
        this.userName = userN;
        f = new JFrame("Routine"); 
        f.setSize(1000, 563); 
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setIconImage(new ImageIcon("images/logo.png").getImage());
        f.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
        

        //panel
        panel= new JPanel();
        panel.setBackground(c3); 
        panel.setSize(1000,563);
        panel.setLocation(0,0);
        panel.setLayout(null);
		panel.setBorder(new LineBorder(Color.BLUE));


        //pr
        pr = new JPanel();
        pr.setLayout(null);
        pr.setBounds(300, 5, 400, 55);
        //lr
        lr = new JLabel("Routine");
        lr.setBounds(100, 2, 400,55);
        lr.setFont(new Font("Segoe UI",3,50));

        pr.add(lr);
        panel.add(pr);


        //p1,p2,p3
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();

         p1.setLayout(null);
         p2.setLayout(null);
         p3.setLayout(null);

        p1.setBounds(35,65,465,60);
        p2.setBounds(500,65,220,60);
        p3.setBounds(720,65,200,60);

        //l1,l2,l3
        l1 = new JLabel("Object oriented programming java [E], Room : DN208");
        l2 = new JLabel("Monday 10:00 am- 12:00 pm");
        l3 = new JLabel("Wednesday 11:00 am - 2:00 pm");

        l1.setBounds(0,0,400,50);
        l2.setBounds(0,0,400,50);
        l3.setBounds(0,0,400,50);

        l1.setFont(new Font("Segoe UI",3,12));
        l2.setFont(new Font("Segoe UI",3,12));
        l3.setFont(new Font("Segoe UI",3,12));
        
        p1.add(l1);
        p2.add(l2);
        p3.add(l3);

        panel.add(p1);
        panel.add(p2);
        panel.add(p3);

        //p4,p5,p6
        p4 = new JPanel();
        p5 = new JPanel();
        p6 = new JPanel();

         p4.setLayout(null);
         p5.setLayout(null);
         p6.setLayout(null);

        p4.setBounds(35,140,465,60);
        p5.setBounds(500,140,220,60);
        p6.setBounds(720,140,200,60);

        //l4,l5,l6

        l4 = new JLabel("Bangladesh Studies [J], Room : 1116");
        l5 = new JLabel("Sunday 2:00 pm - 3:30 pm ");
        l6 = new JLabel("Wuesday 2:00 pm - 3:30 pm");

        l4.setBounds(0,0,400,50);
        l5.setBounds(0,0,400,50);
        l6.setBounds(0,0,400,50);

        l4.setFont(new Font("Segoe UI",3,12));
        l5.setFont(new Font("Segoe UI",3,12));
        l6.setFont(new Font("Segoe UI",3,12));
        

        p4.add(l4);
        p5.add(l5);
        p6.add(l6);

        panel.add(p4);
        panel.add(p5);
        panel.add(p6);

         //p7,p8,p9
        p7 = new JPanel();
        p8 = new JPanel();
        p9 = new JPanel();

         p7.setLayout(null);
         p8.setLayout(null);
         p9.setLayout(null);

        p7.setBounds(35,220,465,60);
        p8.setBounds(500,220,220,60);
        p9.setBounds(720,220,200,60);

        //l7,l8,l9

        l7 = new JLabel("Introduction to Electrical Circuit [B], Room : 1119");
        l8 = new JLabel("Monday 2:00 pm -3:30 pm");
        l9 = new JLabel("Wednesday 2:00 pm- 3:30 pm");

        l7.setBounds(0,0,400,50);
        l8.setBounds(0,0,400,50);
        l9.setBounds(0,0,400,50);

        l7.setFont(new Font("Segoe UI",3,12));
        l8.setFont(new Font("Segoe UI",3,12));
        l9.setFont(new Font("Segoe UI",3,12));

        

        p7.add(l7);
        p8.add(l8);
        p9.add(l9);

        panel.add(p7);
        panel.add(p8);
        panel.add(p9);

         //p10,p11,p12
        p10 = new JPanel();
        p11 = new JPanel();
        p12 = new JPanel();

         p10.setLayout(null);
         p11.setLayout(null);
         p12.setLayout(null);

        p10.setBounds(35,300,465,60);
        p11.setBounds(500,300,220,60);
        p12.setBounds(720,300,200,60);

        //l10,l11,l12

        l10 = new JLabel("Introduction to Electrical Circuit Lab [J], Room : DS305");
        l11 = new JLabel("Sunday 11:00 am - 2:00 pm");
        l12 = new JLabel("Tuesday 11:00 am -2:00 pm");

        l10.setBounds(0,0,400,50);
        l11.setBounds(0,0,400,50);
        l12.setBounds(0,0,400,50);

        l10.setFont(new Font("Segoe UI",3,12));
        l11.setFont(new Font("Segoe UI",3,12));
        l12.setFont(new Font("Segoe UI",3,12));

        p10.add(l10);
        p11.add(l11);
        p12.add(l12);

        panel.add(p10);
        panel.add(p11);
        panel.add(p12);

         //p13,p14,p113
        p13 = new JPanel();
        p14 = new JPanel();
        p15 = new JPanel();

         p13.setLayout(null);
         p14.setLayout(null);
         p15.setLayout(null);

        p13.setBounds(35,380,465,60);
        p14.setBounds(500,380,220,60);
        p15.setBounds(720,380,200,60);

        //l13,l14,l15

        l13 = new JLabel("Complex Variable, Laplace and Z Transformation [A], Room : 5103");
        l14 = new JLabel("Sunday 8:00 am- 9:00 am");
        l15 = new JLabel("Tuesday 8:00 am - 9:00 am");

        l13.setBounds(0,0,400,50);
        l14.setBounds(0,0,400,50);
        l15.setBounds(0,0,400,50);

        l13.setFont(new Font("Segoe UI",3,12));
        l14.setFont(new Font("Segoe UI",3,12));
        l15.setFont(new Font("Segoe UI",3,12));


        p13.add(l13);
        p14.add(l14);
        p15.add(l15);

        panel.add(p13);
        panel.add(p14);
        panel.add(p15);

         //p16,p17,p18
        p16 = new JPanel();
        p17 = new JPanel();
        p18 = new JPanel();

         p16.setLayout(null);
         p17.setLayout(null);
         p18.setLayout(null);

        p16.setBounds(35,460,465,60);
        p17.setBounds(500,460,220,60);
        p18.setBounds(720,460,200,60);

        //l16,l17,l18

        l16 = new JLabel("Principales of accounting [A], Room : 3101");
        l17 = new JLabel("Monday 8:00 am - 9:30 pm");
        l18 = new JLabel("Wednesday 8:00 am - 9:30 pm");

        l16.setBounds(0,0,400,50);
        l17.setBounds(0,0,400,50);
        l18.setBounds(0,0,400,50);

        l16.setFont(new Font("Segoe UI",3,12));
        l17.setFont(new Font("Segoe UI",3,12));
        l18.setFont(new Font("Segoe UI",3,12));

        p16.add(l16);
        p17.add(l17);
        p18.add(l18);

        panel.add(p16);
        panel.add(p17);
        panel.add(p18);


        
        //button b
        b =new JButton();
        b.setForeground(Color.WHITE);
        b.addActionListener(this);
        b.setBounds(5,0,25,25);
        b.setIcon(new ImageIcon("images/back.png"));
       
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b.setFocusPainted(false);
        b.setBorder(BorderFactory.createEmptyBorder(4,6,4,5));
        b.setContentAreaFilled(false);
        panel.add(b);

        

    
       
        f.add(panel);
        f.setVisible(true);


        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
    
                if (e.getSource() == b) {
                    f.setVisible(false);
                    try {
                        stu = new Student(userN);
                    } catch (Exception e1) {
                        // TO DO Auto-generated catch block
                        e1.printStackTrace();
                    }
                }
            }
        });
    }

    public void actionPerformed(ActionEvent e)
{
	//if (e.getSource()==b){

	//}

}
    
}
