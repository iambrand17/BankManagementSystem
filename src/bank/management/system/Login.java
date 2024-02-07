package bank.management.system;
import javax.swing.*;
import java.awt.*;
public class Login  extends JFrame{
    JLabel label1,label2,label3;
    JTextField textField1;
    JPasswordField  passwordField2;


    Login(){
        super("umars bank");
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
     Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
     ImageIcon i3=new ImageIcon(i2);
     JLabel image=new JLabel(i3);
     image.setBounds(350,10,100,100);
     add(image);


        ImageIcon image1=new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image image2=image1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon image3=new ImageIcon(image2);
        JLabel imagee=new JLabel(image3);
        imagee.setBounds(630,350,100,100);
        add(imagee);


        label1=new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde",Font.BOLD,38));
        label1.setBounds(230,125,450,40);
        add(label1);

        label2=new JLabel("card no");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setBounds(150,190,375,30);
        add(label2);

        label3=new JLabel("PIN");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Railway", Font.BOLD,28));
        label3.setBounds(150,250,375,30);
        add(label3);











        ImageIcon iii1=new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2=iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3=new ImageIcon(iii2);
        JLabel iiimage=new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);







        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        setVisible(true);
    }

    public static void main(String[] args) {
      new Login();

    }


}
