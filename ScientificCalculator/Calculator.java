import calculator.*;

    
/*
How to Build a Java GUI Calculator

Md.Nasif Rafidi (23-51361-1)

https://youtu.be/duMNUwt5osw
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
    private final static int CBUTTONS = 16;//for constant final is used
    private JPanel keyPadPanel;
    private JTextField accumulator;
    private JButton keyPad[];
    private String label[] = {
            "0", "1", "2", "3",
            "4", "5", "6", "7",
            "8", "9", "+", "-",
            "*", "/", "=", "c"
    };
    ScientificCalculator sc = new ScientificCalculator();

    public Calculator(String title) {
        super(title);     ///?
        keyPadPanel = new JPanel();
        keyPadPanel.setLayout(new GridLayout(4, 4, 10, 10));// setting gap for buttons
        keyPad = new JButton[CBUTTONS];
        for (int i = 0; i < keyPad.length; i++) {
            keyPad[i] = new JButton(label[i]);         // adding labels to buttons
            keyPad[i].addActionListener(this);        //  adding action listener 
            keyPadPanel.add(keyPad[i]);

        }
        accumulator = new JTextField("0", 20);
        accumulator.setEditable(true);
        getContentPane().setLayout(new BorderLayout(10, 10));
        getContentPane().add("North", accumulator);      //positioning  the text fild
        getContentPane().add("Center", keyPadPanel);         // positioning all the buttones

    }

    public void actionPerformed(ActionEvent e) {      // it is controling all the action of the calculator
        for(int i =0;i<10;i++)
        {
             JButton button = (JButton) e.getSource(); 
             if (button == keyPad[i])
             {
                 String key = button.getText();                 
        accumulator.setText(accumulator.getText() + key);
             }   
        
        }
        for (int i=10;i<14;i++)
        {
            String value = accumulator.getText();
            double value1 = Double.valueOf(value);
            if (e.getSource()== keyPad[i]){
            accumulator.setText(accumulator.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource()==accumulator)

        {
              double value1 = Double.parseDouble(accumulator.getText());
              keyPad = "+";
        }
        

         
        // switch (key) {
        //     case "+":
        //         result= value1+value2;
        //         break;
        
        //     default:
        //         break;
        // }
    }



    public static void main(String[] args) {
        Calculator gui = new Calculator("Calculator GUI Demo");
        gui.setSize(500, 500);
        gui.setVisible(true);
        gui.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

} 
