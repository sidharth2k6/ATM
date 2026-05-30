//package ATM;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Gui extends JFrame implements ActionListener
{
    // Scanner scanner = new Scanner(System.in);
    // int cardNo;

    // int loginPage(Bank bank){
    //     System.out.print("Enter Card number: ");
    //     int cardno = scanner.nextInt();
    //     if(bank.isAvailable(cardno)){
    //         return cardno;
    //     }
    //     else{
    //         System.out.println("ERROR: Card number not found!");
    //         return 0;
    //     }
    // }
     JTextField Text;
    JButton[] numButtons = new JButton[10];
    JButton eq, back,left,right;
    String s0="";
    JLabel card;
     Gui()
    {
        setLayout(new FlowLayout());
        setTitle("ATM");
        //setSize(300, 400);//does not work 
        JPanel panel = new JPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        card = new JLabel("enter card no:");
        Text = new JTextField(10);
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
        add(Text);
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
        if (s.charAt(0) >= '0' && s.charAt(0) <= '9') 
        {
            s0+=s;
            Text.setText(s0);       
        }
        else if (s0.equals("="))
        {
            Text.setText("enter no:");
        }
        else if(s.equals ("clr"))
        {
            s0="";
            Text.setText(s0);
        }
        //  if (s.charAt(0) >= '0' && s.charAt(0) <= '9') 
        //  {
        //     s0+=s;
        //     Text.setText(s0);
        //  }
    }

public static void main(String[] args) {
        new Gui();
    }
};