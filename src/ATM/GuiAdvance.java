package ATM;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GuiAdvance extends JFrame implements ActionListener
{
     JTextField text;
    JButton[] numButtons = new JButton[10];
    JButton eq, back,left,right;
    String s0="";
    JLabel card;

     GuiAdvance(){
        setLayout(new FlowLayout());
        setTitle("ATM");
         setSize(600, 400);
        JPanel panel = new JPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        card = new JLabel("enter card no:");
        text = new JTextField(10);
        eq = new JButton("=");
        back = new JButton("clr");
        left = new JButton("<");
        right = new JButton(">");
        for(int i=0;i<=9;i++)
        {
            numButtons[i]=new JButton(String.valueOf(i));
            numButtons[i].addActionListener(this);
        }
        eq.addActionListener(this);
        back.addActionListener(this);
        left.addActionListener(this);
        right.addActionListener(this);
        
        //add
        add(card);
        add(text);
        for(int i=0;i<=9;i++)
        {
            add(numButtons[i]);
        }
        add(eq);
        add(back);
        add(left);
        add(right);

    }
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.charAt(0) >= '0' && s.charAt(0) <= '9') {
            s0 += s;
            text.setText(s0);
//            if (!s0.equals("")) {
//                text.setText("enter no:");
//            } else {
//                s0 += s;
//            }
//            text.setText(s0);
        }
        else if(s.equals("clr")){
            s0 = "";
            text.setText(s0);
        }
        else if(s.equals("=")){
            JOptionPane.showMessageDialog(this, "Entered card number: " + s0);
        }

    }
public static void main(String[] args) {
        new GuiAdvance().setVisible(true);
    }
};