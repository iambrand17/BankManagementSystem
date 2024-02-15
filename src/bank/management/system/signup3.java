package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class signup3  extends JFrame {

    JRadioButton r1,r2,r3,r4;

    signup3(){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);



        JLabel l1=new JLabel("page 3");
        l1.setFont(new Font("Railway",Font.BOLD,18));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel l2=new JLabel("Account detials");
        l2.setFont(new Font("Railway",Font.BOLD,18));
        l2.setBounds(280,70,400,40);
        add(l2);

        JLabel l3=new JLabel("Account Type");
        l3.setFont(new Font("Railway",Font.BOLD,18));
        l3.setBounds(100,140,200,30);
        add(l3);


        r1=new JRadioButton("Saving account");
        r1.setFont(new Font("Railway",Font.BOLD,16));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(100,180,150,30);
        add(r1);

        r2=new JRadioButton("Fix deposte");
        r2.setFont(new Font("Railway",Font.BOLD,16));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(350,180,300,30);
        add(r2);

        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Railway",Font.BOLD,16));
        r3.setBackground(new Color(252,208,76));
        r3.setBounds(100,220,250,30);
        add(r3);


        r4=new JRadioButton("Recurring Deposite account");
        r4.setFont(new Font("Railway",Font.BOLD,16));
        r4.setBackground(new Color(252,208,76));
        r4.setBounds(350 ,220,250,30);
        add(r4);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);



        JLabel l4=new JLabel("Card no");
        l4.setFont(new Font("Railway",Font.BOLD,18));
        l4.setBounds(100,300,200,30);
        add(l4);

        JLabel l5=new JLabel("(Your 16-digit card no)");
        l5.setFont(new Font("Railway",Font.BOLD,15));
        l5.setBounds(100,330,200,20);
        add(l5);

        JLabel l6=new JLabel("XXXX-XXXX-XXXX-1717");
        l6.setFont(new Font("Railway",Font.BOLD,18));
        l6.setBounds(330,300,250,30);
        add(l6);

        JLabel l7=new JLabel("(it would appear on tm card/chaque Book and Statement)");
        l7.setFont(new Font("Railway",Font.BOLD,10 ));
        l7.setBounds(330,330,200,18);
        add(l7);











        setLayout(null);
        setSize(850,800);
        setLocation(400,20);
        getContentPane().setBackground(new Color(255,255,255));
        setVisible(true);


    }

    public static void main(String[]args){
        new signup3();

    }
}
