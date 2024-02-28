import javax.swing.*;
import java.awt.event.*;

class myclass1 implements ActionListener {
    JFrame j;
    JTextField tf1, tf2, tf3; 
    JButton btn1, btn2, btn3, btn4; 

    myclass1() {
        j = new JFrame();

        tf1 = new JTextField();
        tf1.setBounds(10, 40, 150, 30);

        tf2 = new JTextField();
        tf2.setBounds(170, 40, 150, 30);

        tf3 = new JTextField();
        
        tf3.setBounds(10, 80, 310, 30);
        tf3.setEditable(false);
        
        btn1 = new JButton("+");
        btn1.setBounds(10, 120, 50, 50);
        btn1.addActionListener(this);

        btn2 = new JButton("-");
        btn2.setBounds(70, 120, 50, 50);
        btn2.addActionListener(this);
        
        btn3 = new JButton("*");
        btn3.setBounds(130, 120, 50, 50);

        btn4= new JButton("/");
        btn4.setBounds(190, 120, 50, 50);

        j.add(tf1);
        j.add(tf2);
        j.add(tf3);
        j.add(btn1);
        j.add(btn2);
        j.add(btn3);
        j.add(btn4);

        j.setLayout(null);
        j.setSize(350, 250);
        j.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String s1=tf1.getText();  
        String s2=tf2.getText();  
        int a=Integer.parseInt(s1);  
        int b=Integer.parseInt(s2);  
        int c=0;  
        if(e.getSource()==btn1){  
            c=a+b;  
        }else if(e.getSource()==btn2){  
            c=a-b;  
        }  
        String result=String.valueOf(c);  
        tf3.setText(result);  
    }  
    }


public class Pro {
    public static void main(String[] args) {
        new myclass1();
    }
}
