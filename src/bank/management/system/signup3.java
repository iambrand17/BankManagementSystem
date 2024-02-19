package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup3  extends JFrame implements ActionListener {

    JRadioButton r1,r2,r3,r4;

    JCheckBox c1,c2,c3,c4,c5,c6,c7;

    JButton s,c;

    String formno;




    signup3( String formno){
        this.formno=formno;
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



        JLabel l8=new JLabel("PIN");
        l8.setFont(new Font("Railway",Font.BOLD,18 ));
        l8.setBounds(100,370,200,30);
        add(l8);


        JLabel l9=new JLabel("XXXX");
        l9.setFont(new Font("Railway",Font.BOLD,17 ));
        l9.setBounds(330,370,200,18);
        add(l9);


        JLabel l10=new JLabel("4-digit-Password");
        l10.setFont(new Font("Railway",Font.BOLD,12 ));
        l10.setBounds(330,400,200,18);
        add(l10);

        JLabel l11=new JLabel("Service-Required");
        l11.setFont(new Font("Railway",Font.BOLD,12 ));
        l11.setBounds(100,450,200,30);
        add(l11);


        c1=new JCheckBox("ATM CARD");
        c1.setBackground(new Color(252,252,252));
        c1.setFont(new Font("Railway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);

        c2=new JCheckBox("INTERNATE BANKING");
        c2.setBackground(new Color(252,252,252));
        c2.setFont(new Font("Railway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);

        c3=new JCheckBox("MOBILE BANKING");
        c3.setBackground(new Color(252,252,252));
        c3.setFont(new Font("Railway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);

        c4=new JCheckBox("EMAIL Alters");
        c4.setBackground(new Color(252,252,252));
        c4.setFont(new Font("Railway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);


        c5=new JCheckBox("Cheque Book");
        c5.setBackground(new Color(252,252,252));
        c5.setFont(new Font("Railway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);


        c6=new JCheckBox("E-statement");
        c6.setBackground(new Color(252,252,252));
        c6.setFont(new Font("Railway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);


        JCheckBox c7=new JCheckBox("I here by declares that the above entire details corrected to the best of my knowlage .");
        c7.setBackground(new Color(252,252,252));
        c7.setFont(new Font("Railway",Font.BOLD,16));
        c7.setBounds(100,680,600,20);
        add(c7);

        JLabel l12=new JLabel("Form no");
        l12.setFont(new Font("Railway",Font.BOLD,17 ));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13=new JLabel("");
        l13.setFont(new Font("Railway",Font.BOLD,17 ));
        l13.setBounds(700,10,100,30);
        add(l13);


        s=new JButton("Submit");
        s.setFont(new Font("Railway",Font.BOLD,14));
        s.setBackground(Color.WHITE);
        s.setForeground(Color.BLACK);
        s.setBounds(250,720,100,30);
        s.addActionListener(this);
        add(s);


        c=new JButton("Cancel");
        c.setFont(new Font("Railway",Font.BOLD,14));
        c.setBackground(Color.WHITE);
        c.setForeground(Color.BLACK);
        c.setBounds(420,720,100,30);
        c.addActionListener(this);
        add(c);

        setLayout(null);
        setSize(850,800);
        setLocation(400,20);
        getContentPane().setBackground(new Color(255,255,255));
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String atype=null;
        if (r1.isSelected()){
            atype="Saving account";
        } else if (r2.isSelected()) {
            atype="Fix deposte";
            
        } else if (r3.isSelected()) {
            atype="Current Account";
            
        } else if (r4.isSelected()) {
            atype="Recurring Deposite account";

        }
        Random ran=new Random();
        long first7 =(ran.nextLong()%900000000L)+ 14099630000000L;
        String cardno=" "+Math.abs(first7);

        long first3=(ran.nextLong()%900000L)+1000L;

        String pin=" "+Math.abs(first3);

        String fac=" ";
        if(c1.isSelected()){
            fac= fac+"ATM CARD ";
        } else if (c2.isSelected()) {
            fac=fac+"INTERNATE BANKING";

        } else if (c3.isSelected()) {
            fac=fac+"MOBILE BANKING";

        }else if (c4.isSelected()){
            fac=fac+"EMAIL Alters";
        } else if (c5.isSelected()) {
            fac=fac+"Cheque Book";

        } else if (c6.isSelected()) {
            fac=fac+"E-statement";

        }
        try{
            if (e.getSource()==s){
                if (atype.equals("")){
                    JOptionPane.showMessageDialog(null,"fill all the fileds");
                }else {
                    con c1=new con();
                    String q1="insert into bankSystem.signpthree values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                    String q2="insert into bankSystem.login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"card no :"+cardno+"\n Pin:"+pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            } else if (e.getSource()==c) {
                System.exit(0);
                
            }

        }catch (Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[]args){
        new signup3("");

    }
}
