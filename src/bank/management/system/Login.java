package bank.management.system;
import javax.swing.*;
import java.awt.*;


public class Login  extends JFrame{
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



        ImageIcon photo1=new ImageIcon(ClassLoader.getSystemResource("icon/backbg"));
        Image photo2=photo1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);

        ImageIcon photo3=new ImageIcon(photo2);
        JLabel photos=new JLabel(photo3);
        photos.setBounds(0,0,850,480);
        add(photos);


        setLayout(null);
        setSize(850,480);
        setLocation(450,200);

        setVisible(true);
    }

    public static void main(String[] args) {
      new Login();

    }


}
