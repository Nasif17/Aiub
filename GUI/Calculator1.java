import javax.swing.*;
import java.awt.*;
public class Calculator1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Nonfunctional Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        JPanel panel1= new JPanel();
       // panel1.setLayout(null);
        JLabel label = new JLabel("Enter Number");
        JTextField jr = new JTextField(10);
       

        panel1.setBounds(0,0,500,500);
        panel1.setBackground(Color.BLACK);
        frame.add(panel1);
        
         frame.add(jr, BorderLayout.NORTH);
        panel1.setLayout(new GridLayout(3,3));

        /*  JPanel panel2= new JPanel();
        panel2.setBounds(0,0,500,400);
        panel2.setBackground(Color.DARK_GRAY);
        frame.add(panel2);*/
        System.out.println();

        JButton button1 =new JButton("1");
        button1.setBounds(100, 300, 200, 200);

         JButton button2 =new JButton("2");
        button1.setBounds(50, 250, 200, 200);
         JButton button3 =new JButton("3");
        button1.setBounds(100,50, 80, 80);
         JButton button4 =new JButton("4");
        button1.setBounds(150, 50, 80, 80);
         JButton button5 =new JButton("5");
        button1.setBounds(200, 50, 80, 80);
         JButton button6 =new JButton("6");
        button1.setBounds(250, 50, 80, 80);
         JButton button7 =new JButton("7");
        button1.setBounds(300, 50, 80, 80);
         JButton button8 =new JButton("8");
        button1.setBounds(350, 50, 80, 80);
         JButton button9 =new JButton("9");
        button1.setBounds(50, 100, 80, 80);
         JButton button10 =new JButton("+");
        button1.setBounds(100, 100, 80, 80);
         JButton button11 =new JButton("-");
        button1.setBounds(100, 100, 80, 80);
         JButton button12 =new JButton("*");
        button1.setBounds(150,100 , 80, 80);
         JButton button13 =new JButton("/");
        button1.setBounds(200, 100, 80, 80);
         JButton button14 =new JButton("AC");
        button1.setBounds(200, 100, 80, 80);
         JButton button15 =new JButton("=");
        button1.setBounds(200, 100, 80, 80);
        
       panel1.add(button1);
       panel1.add(button2);
       panel1.add(button3);
       panel1.add(button4);
       panel1.add(button5);
       panel1.add(button6);
       panel1.add(button7);
       panel1.add(button8);
       panel1.add(button9);
       panel1.add(button9);
       panel1.add(button10);
       panel1.add(button11);
       panel1.add(button12);
       panel1.add(button13);
       panel1.add(button14);
       panel1.add(button15);

       button1.setBackground(Color.BLACK);
       button2.setBackground(Color.BLACK);
       button3.setBackground(Color.BLACK);
       button4.setBackground(Color.BLACK);
       button5.setBackground(Color.BLACK);
       button6.setBackground(Color.BLACK);
       button7.setBackground(Color.BLACK);
       button8.setBackground(Color.BLACK);
       button9.setBackground(Color.BLACK);
       button10.setBackground(Color.BLACK);
       button11.setBackground(Color.BLACK);
       button12.setBackground(Color.BLACK);
       button13.setBackground(Color.BLACK);
       button14.setBackground(Color.BLACK);
       button15.setBackground(Color.BLACK);

       button1.setFont(new Font(null, Font.BOLD, 40));
       button2.setFont(new Font(null, Font.BOLD, 40));
       button3.setFont(new Font(null, Font.BOLD, 40));
       button4.setFont(new Font(null, Font.BOLD, 40));
       button5.setFont(new Font(null, Font.BOLD, 40));
       button6.setFont(new Font(null, Font.BOLD, 40));
       button7.setFont(new Font(null, Font.BOLD, 40));
       button8.setFont(new Font(null, Font.BOLD, 40));
       button9.setFont(new Font(null, Font.BOLD, 40));
       button10.setFont(new Font(null, Font.BOLD, 40));
       button11.setFont(new Font(null, Font.BOLD, 40));
       button12.setFont(new Font(null, Font.BOLD, 40));
       button13.setFont(new Font(null, Font.BOLD, 40));
       button14.setFont(new Font(null, Font.BOLD, 40));
       button15.setFont(new Font(null, Font.BOLD, 40));
       
    

       // frame.setLayout(null);
        frame.setVisible(true);

    }
}
