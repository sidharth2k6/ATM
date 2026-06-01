package ATM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class GuiAdvance extends JFrame implements ActionListener {
    JTextField text;
    JButton[] numButtons = new JButton[10];
    JButton eq, back,left,right,nextBtn, prevBtn;
    String s0="";
     CardLayout card;
     JPanel cardPanel;
    GuiAdvance() {
        // Create CardLayout and panel
        card = new CardLayout();
        cardPanel = new JPanel(card);

        // Add different panels (cards)
        JPanel login = new JPanel();
        login.setBackground(Color.WHITE);
        login.add(new JLabel("This is login panel"));

        JPanel deposit = new JPanel();
        deposit.setBackground(Color.WHITE);
        deposit.add(new JLabel("This is Deposit panel"));


        JPanel withrawal = new JPanel();
        withrawal.setBackground(Color.WHITE);
        withrawal.add(new JLabel("This is Withrawal panel"));


        cardPanel.add(login, "Red");
        cardPanel.add(deposit, "Green");
        cardPanel.add(withrawal, "Blue");

        // Buttons to navigate
        eq = new JButton("=");
        back = new JButton("clr");
        left = new JButton("<");
        right = new JButton(">");
        // number button
        for (int i = 0; i <= 9; i++) {
            numButtons[i] = new JButton(String.valueOf(i));
            numButtons[i].addActionListener(this);
        }
        nextBtn = new JButton("Next");
        prevBtn = new JButton("Previous");
        //actionlisener
        nextBtn.addActionListener(this);
        prevBtn.addActionListener(this);
        eq.addActionListener(this);
        back.addActionListener(this);
        left.addActionListener(this);
        right.addActionListener(this);

        // Frame layout
        setLayout(new BorderLayout());
        add(cardPanel, BorderLayout.CENTER);

        JPanel btnPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        for (int i = 0; i <= 9; i++) {
            btnPanel.add(numButtons[i]);
        }
        btnPanel.add(back);
        btnPanel.add(eq);
        btnPanel.add(prevBtn);
        btnPanel.add(nextBtn);
        add(btnPanel, BorderLayout.SOUTH);
        text = new JTextField(20);
        add(text, BorderLayout.NORTH);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if (s.charAt(0) >= '0' && s.charAt(0) <= '9') {
            s0 += s;
            text.setText(s0);
        } else if (s.equals("C")) {
            s0 = "";
            text.setText("");
        } else if (s.equals("=")) {
            text.setText("Result:" + s0);
        } else if (e.getSource() == nextBtn) {
            card.next(cardPanel);
        } else if (e.getSource() == prevBtn) {
            card.previous(cardPanel);
        }     //Text.setText(s0);
        else {
            text.setText("enter number:");
        }
    }

    public static void main(String[] args)
    {
        new GuiAdvance();
    }    
}