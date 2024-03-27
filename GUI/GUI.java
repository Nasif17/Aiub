import javax.swing.* ;
import java.awt.*;



    


public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My first GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        JPanel panel1 = new JPanel();
        panel1.setBounds(100,100,100,700);
        panel1.setBackground(Color.BLUE);
        frame.add(panel1);
        JButton button1 = new JButton("Click");
        button1.setBounds(50,100,80,30);
        JButton button2 = new JButton("Press");
         button1.setBounds(100,100,80,30);
         panel1.add(button1);
         panel1.add(button2);
       // frame.getContentPane().add(button1);
       // frame.getContentPane().add(button2);
       // frame.setLayout(new FlowLayout());// to bring everything middle
        frame.setLayout(null);



         frame.setVisible(true);
    }
    
}
