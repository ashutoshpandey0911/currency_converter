import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class currency {
  
    
    public static void convert()
    {
  
        // Creating a new frame using JFrame
        JFrame f = new JFrame("CONVERTER");
  
        // Creating two labels
        JLabel lb1, lb2;
  
        // Creating two text fields.
        // One for rupee and one for
        // the dollar
        JTextField t1, t2;
  
        
        JButton bt1, bt2, bt3;
  
        
        lb1 = new JLabel("Rupees:");
        lb1.setBounds(20, 40, 60, 30);
        lb2 = new JLabel("Dollars:");
        lb2.setBounds(170, 40, 60, 30);
  
        // Initializing the text fields with
        // 0 by default and setting the
        // bounds for the text fields
        t1 = new JTextField("0");
        t1.setBounds(80, 40, 50, 30);
        t2 = new JTextField("0");
        t2.setBounds(240, 40, 50, 30);
  
       
        bt1 = new JButton("INR");
        bt1.setBounds(50, 80, 60, 15);
        bt2 = new JButton("Dollar");
        bt2.setBounds(190, 80, 60, 15);
        bt3 = new JButton("close");
        bt3.setBounds(150, 150, 60, 30);
  
        
        bt1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                // Converting to double
                double d = Double.parseDouble(t1.getText());
  
                // Converting rupees to dollars
                double d1 = (d / 65.25);
  
                // Getting the string value of the
                // calculated value
                String s1 = String.valueOf(d1);
  
                // Placing it in the text box
                t2.setText(s1);
            }
        });
  
        
        bt2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
               
                double d2 = Double.parseDouble(t2.getText());
  
                
                double d3 = (d2 * 65.25);
  
                String s2 = String.valueOf(d3);
  
                
                t1.setText(s2);
            }
        });
  
        
        bt3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                f.dispose();
            }
        });
  
        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
  
        
        f.add(lb1);
        f.add(t1);
        f.add(lb2);
        f.add(t2);
        f.add(bt1);
        f.add(bt2);
        f.add(bt3);
  
        f.setLayout(null);
        f.setSize(400, 300);
        f.setVisible(true);
    }
  
    
    public static void main(String args[])
    {
        convert();
    }
}
