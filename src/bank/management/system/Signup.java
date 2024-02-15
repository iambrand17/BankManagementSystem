package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.chrono.JapaneseDate;
import java.util.Random;
import javax.swing.JButton;



public class Signup extends JFrame implements ActionListener {




    JRadioButton r1,r2,m1,m2;


    JTextField textNmae,textFname,textGname,textMname, textAdd,textcity,textpin,textState;
    JDateChooser dateChooser;

    JButton button1;



    Random ran=new Random();
    long firs4=(ran.nextLong()%9000L)+1000L;

    String first=" "+Math.abs(firs4);
    Signup(){
        super("APPLICATION FORM");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1=new JLabel("APPLICATION FORM NO."+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Railway",Font.BOLD,36));
        add(label1);

        JLabel labal2=new JLabel("page 1");
        labal2.setFont(new Font("Railway",Font.BOLD,30));
        labal2.setBounds(330,70,600,30);
        add(labal2);

        JLabel label3=new JLabel("personal detials");
        label3.setFont(new Font("Railway",Font.BOLD,22));
        label3.setBounds(290,110,600,30);
        add(label3);

        //labal and text filed of name,father name

        JLabel labelName=new JLabel("name:");
        labelName.setFont(new Font("Railway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textNmae=new JTextField();
        textNmae.setFont(new Font("Railway",Font.BOLD,14));
        textNmae.setBounds(300,190,400,30);
        add(textNmae);



        JLabel labalFname=new JLabel("Father name:");
        labalFname.setFont(new Font("Railway",Font.BOLD,20));
        labalFname.setBounds(100,240,200,30);
        add(labalFname);

        textFname=new JTextField();
        textFname.setFont(new Font("Railway",Font.BOLD,14));
        textFname.setBounds(300,240,400,30);
        add( textFname);




        JLabel DOB=new JLabel("Date of birth:");
        DOB.setFont(new Font("Railway",Font.BOLD,20));
        DOB.setBounds(100,340,200,30);
        add(DOB);


        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);


        JLabel labalGname=new JLabel("Gender");
        labalGname.setFont(new Font("Railway",Font.BOLD,20));
        labalGname.setBounds(100,290,200,30);
        add(labalGname);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("Railway",Font.BOLD,14));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Railway",Font.BOLD,14));
        r2.setBounds(450,290,90,30);
        add(r2);

        ButtonGroup group=new ButtonGroup();
        group.add(r1);
        group.add(r2);


        JLabel mail=new JLabel("EMAIL:");
        mail.setFont(new Font("Railway",Font.BOLD,20));
        mail.setBounds(100,390,200,30);
        add(mail);

        textMname=new JTextField();
        textMname.setFont(new Font("Railway",Font.BOLD,14));
        textMname.setBounds(300,390,400,30);
        add( textMname);

        JLabel maridstatus=new JLabel(" Status");
        maridstatus.setFont(new Font("Railway",Font.BOLD,20));
        maridstatus.setBounds(100,440,200,30);
        add(maridstatus);

//        maridstatus1=new JTextField();
//        maridstatus1.setFont(new Font("Railway",Font.BOLD,14));
//        maridstatus1.setBounds(300,440,400,30);
//        add(maridstatus1);


        m1=new JRadioButton("singal ");
        m1.setFont(new Font("Railway",Font.BOLD,14));
        m1.setBounds(300,440,100,30);
        add(m1);

        m2=new JRadioButton("maride");
        m2.setFont(new Font("Railway",Font.BOLD,14));
        m2.setBounds(450,440,100,30);
        add(m2);

        ButtonGroup group1=new ButtonGroup();
        group1.add(m1);
        group1.add(m2);

        JLabel labalAdd=new JLabel(" Address");
        labalAdd.setFont(new Font("Railway",Font.BOLD,20));
        labalAdd.setBounds(100,490,200,30);
        add(labalAdd);

        textAdd=new JTextField();
        textAdd.setFont(new Font("Railway",Font.BOLD,14));
        textAdd.setBounds(300,490,400,30);
        add( textAdd);


        JLabel labalCity=new JLabel(" CITY");
        labalCity.setFont(new Font("Railway",Font.BOLD,20));
        labalCity.setBounds(100,540,200,30);
        add(labalCity);

        textcity=new JTextField();
        textcity.setFont(new Font("Railway",Font.BOLD,14));
        textcity.setBounds(300,540,400,30);
        add( textcity);

        JLabel labalpin=new JLabel(" Pin Code");
        labalpin.setFont(new Font("Railway",Font.BOLD,20));
        labalpin.setBounds(100,590,200,30);
        add( labalpin);

        textpin=new JTextField();
        textpin.setFont(new Font("Railway",Font.BOLD,14));
        textpin.setBounds(300,590,400,30);
        add(textpin);

        JLabel labalState=new JLabel("State");
        labalState.setFont(new Font("Railway",Font.BOLD,20));
       labalState.setBounds(100,640,200,30);
       add(labalState);

       textState=new JTextField();
       textState.setFont(new Font("Railway",Font.BOLD,20));
       textState.setBounds(300,640,400,30);
       add(textState);


        button1=new JButton("NEXT");
        button1.setFont(new Font("Railway",Font.BOLD,14));
        button1.setForeground(Color.BLACK);
        button1.setBackground(Color.WHITE);
        button1.setBounds(620,710,80,30);
        button1.addActionListener(this);
        add(button1);



        getContentPane().setBackground(new Color(255,255,255));
        setLayout(null);
        setSize(800,850);
        setLocation(360,40);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno=first;
        String name=textNmae.getText();
        String fname=textFname.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if (r1.isSelected()){
            gender="male";
        } else if (r2.isSelected()) {
            gender="femael";

        }

        String emial=textMname.getText();
        String status=null;
        if (m1.isSelected()){
           status="singal";
        } else if (m2.isSelected()) {
            status="maride";

        }

        String add=textAdd.getText();
        String city=textcity.getText();
        String pin=textpin.getText();
        String state=textState.getText();


        try {
            if (textNmae.getText().equals("")){
                JOptionPane.showMessageDialog(null,"fill all the fileds");
            }
            else {
                con con1= new con();
                String z="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+emial+"','"+status+"','"+add+"','"+city+"','"+pin+"','"+state+"')";
                con1.statement.executeUpdate(z);
                new signup2(first);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();

        }





    }

    public static void main(String[]args){
        new Signup();


    }
}
