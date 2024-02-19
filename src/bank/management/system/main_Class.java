package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class main_Class extends JFrame {

    main_Class(){

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);



        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);

    }
    public static void main (String[]args){
        new main_Class();

    }



}
