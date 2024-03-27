package classes;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
import interfaces.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;



public class EProfile extends JFrame implements  ActionListener,IBasic{
    //Frame
    JFrame f;

    //Panel
     JPanel panel,p1,p2,p3,
                  p4,p5,p6,
                  p7,p8,p9,
                  p10,p11,p12,
                  p13,p14,p15,
                  p16,p17,p18;

     //Label
     JLabel l1,l2,l3,
            l4,l5,l6,
            l7,l8,l9,
            l10,l11,l12,
            l13,l14,l15,
            l16,l17,l18,
            le1,le2,le3,
            le4,le5,le6,
            le7,le8,le9,
            le10,le11,le12;
            
            public String userName;	   

      //Button
      JButton b; 
      
      BufferedImage i;

      public String firstName, lastName,DOB,Email,Nationality,
                     Gender;
            
      String emPath = ".\\File\\employee.txt";

    public EProfile(String userN) 
    {
        this.userName = userN;
        f = new JFrame(" Profile"); 
        f.setSize(1000, 563); 
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setResizable(false);
        f.setIconImage(new ImageIcon("images/logo.png").getImage());
        f.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
        
        try {
            File fr = new File(emPath);
            if (fr.exists()) {
                BufferedReader br = new BufferedReader(new FileReader(emPath));
                int j = 0;

                while ((br.readLine()) != null) {
                    j++;
                }
                br.close();
                for (int i = 0; i < j; i++) {

                    String line = Files.readAllLines(Paths.get(emPath)).get(i).substring(11);
                    if (line.equals(this.userName)) {

                        firstName = Files.readAllLines(Paths.get(emPath)).get(i + 2).substring(12);
                        lastName = Files.readAllLines(Paths.get(emPath)).get(i + 3).substring(11);
                        DOB = Files.readAllLines(Paths.get(emPath)).get(i + 4).substring(5);
                        Email = Files.readAllLines(Paths.get(emPath)).get(i + 7).substring(7);
                        Nationality = Files.readAllLines(Paths.get(emPath)).get(i + 8).substring(13);
                        Gender = Files.readAllLines(Paths.get(emPath)).get(i + 5).substring(7);
                        break;
                    }
                }

            }
        } catch (Exception ex) {
      System.out.print(ex);
        }

        //panel
        panel= new JPanel();
         
        panel.setSize(1000,563);
        panel.setLocation(0,0);
        panel.setLayout(null);
		panel.setBorder(new LineBorder(Color.BLUE));
        panel.setBackground(c4);

        //p1
        p1= new JPanel();
        p1.setBackground(c1); 
        p1.setSize(200,55);
        p1.setLocation(100,0);
        p1.setLayout(null);
		p1.setBorder(new LineBorder(Color.BLUE));
        panel.add(p1);

        le1=new JLabel("Profile");
        le1.setBounds(20, 2, 200,55);
        le1.setFont(new Font("Segoe UI",3,50));
        p1.add(le1);

        


        //image
        try{
        i=ImageIO.read(new File("images/me3.png"));
        i.getScaledInstance(100,100,Image.SCALE_DEFAULT);
        l1 = new JLabel(new ImageIcon(i));
        l1.setBounds(580,10,400,463);}
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Enter Proper image file type");
        }

        panel.add(l1);
        //all labels
        
        l2 = new JLabel("Name: ");
        l2.setBounds(40,70,400,25);
        l2.setFont(new Font("Segoe UI",3,17));
        l2.setForeground(c1);
        panel.add(l2);
        
        le2 = new JLabel(this.firstName+" "+this.lastName);
        le2.setBounds(110,70,400,25);
        le2.setFont(new Font("Segoe UI",3,17));
        le2.setForeground(c1);
        panel.add(le2);

        l3 = new JLabel("DOB :");
        l3.setBounds(40,100,400,25);
        l3.setFont(new Font("Segoe UI",3,17));
        l3.setForeground(c1);
        panel.add(l3);

        le3 = new JLabel(this.DOB);
        le3.setBounds(110,100,400,25);
        le3.setFont(new Font("Segoe UI",3,17));
        le3.setForeground(c1);
        panel.add(le3);

        

        l4 = new JLabel("Email :");
        l4.setBounds(40,130,400,25);
        l4.setFont(new Font("Segoe UI",3,17));
        l4.setForeground(c1);
        panel.add(l4);

        le4 = new JLabel(this.Email);
        le4.setBounds(110,130,400,25);
        le4.setFont(new Font("Segoe UI",3,17));
        le4.setForeground(c1);
        panel.add(le4);
        
        l5 = new JLabel("Occupation:IT Stuff");
        l5.setBounds(40,160,400,25);
        l5.setFont(new Font("Segoe UI",3,17));
        l5.setForeground(c1);
        panel.add(l5);


        l9 = new JLabel("Gender : ");
        l9.setBounds(35,190,500,25);
        l9.setFont(new Font("Segoe UI",3,17));
        l9.setForeground(c1);
        panel.add(l9);

        le9 = new JLabel(this.Gender);
        le9.setBounds(110,190,500,25);
        le9.setFont(new Font("Segoe UI",3,17));
        le9.setForeground(c1);
        panel.add(le9);

        l10 = new JLabel("Nationality : ");
        l10.setBounds(35,220,500,25);
        l10.setFont(new Font("Segoe UI",3,17));
        l10.setForeground(c1);
        panel.add(l10);

        le10 = new JLabel(this.Nationality);
        le10.setBounds(150,220,500,25);
        le10.setFont(new Font("Segoe UI",3,17));
        le10.setForeground(c1);
        panel.add(le10);

    

        
        //button b
        b =new JButton();
        b.setForeground(Color.WHITE);
        b.addActionListener(this);
        b.setBounds(15,0,25,25);
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b.setFocusPainted(false);
        b.setBorder(BorderFactory.createEmptyBorder(4,6,4,5));
        b.setContentAreaFilled(false);
        b.setIcon(new ImageIcon("images/back.png"));
        panel.add(b);

        
        f.add(panel);
        f.setVisible(true);


        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
    
                if (e.getSource() == b) {
                    f.setVisible(false);
                    try {
                        new Employee(userN);
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
	

}
    
}
