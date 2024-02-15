package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup2 extends JFrame implements ActionListener {
    JComboBox combobox,comboBox2,comboBox3,comboBox4;
    JTextField panNO,addharNo;
    String formon;
    JRadioButton r1,r2,e1,e2;

    JComboBox comboBox1;

    JButton next;

    signup2(String first){

        super("Application form");





        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

      this.formon=formon;

      JLabel l1=new JLabel("page 2");
      l1.setFont(new Font("Railway",Font.BOLD,22));
      l1.setBounds(300,30,600,40);
      add(l1);

      JLabel l2=new JLabel("Additional Details");
        l2.setFont(new Font("Railway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3=new JLabel("Religion");
        l3.setFont(new Font("Railway",Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String religion []={"hindu","muslim","sikh","chrition","other"};
        combobox=new JComboBox<>(religion);
        combobox.setBackground(new Color(252,208,76));
        combobox.setFont(new Font("Railway",Font.BOLD,14));
        combobox.setBounds(350,120,320,30);
        add(combobox);


        JLabel l4=new JLabel("Category");
        l4.setFont(new Font("Railway",Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);

        String Category []={"genral","obc","st","sc","other"};
        comboBox2=new JComboBox<>(Category);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Railway",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);



        JLabel l5=new JLabel("Income");
        l5.setFont(new Font("Railway",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String Income []={"null","<1,50,000","<2,50,000","<3,50,000"};
        comboBox3=new JComboBox<>(Income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Railway",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);



        JLabel l6=new JLabel("Education");
        l6.setFont(new Font("Railway",Font.BOLD,18));
        l6.setBounds(100,270,100,30);
        add(l6);

        String Education []={"non-graduate","garduate","post-garduate","PHD","other"};
        comboBox4=new JComboBox<>(Education);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Railway",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);



        JLabel l7=new JLabel("Occupation");
        l7.setFont(new Font("Railway",Font.BOLD,18));
        l7.setBounds(100,320,100,30);
        add(l7);

        String occupation []={"salerid","self-employe","Bussnes","Student","Retaired","other"};
        comboBox4=new JComboBox<>(Education);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Railway",Font.BOLD,14));
        comboBox4.setBounds(350,320,320,30);
        add(comboBox4);

        JLabel l8=new JLabel("PanNo");
        l8.setFont(new Font("Railway",Font.BOLD,18));
        l8.setBounds(100,390,100,30);
        add(l8);

        panNO=new JTextField();
       panNO.setFont(new Font("Railway",Font.BOLD,14));
        panNO.setBounds(350,390,300,30);
        add(panNO);


        JLabel l9=new JLabel("AddharNo");
        l9.setFont(new Font("Railway",Font.BOLD,18));
        l9.setBounds(100,440,100,30);
        add(l9);

        addharNo=new JTextField();
        addharNo.setFont(new Font("Railway",Font.BOLD,14));
        addharNo.setBounds(350,440,300,30);
        add(addharNo);


        JLabel l10=new JLabel("SeniorCitizan");
        l10.setFont(new Font("Railway",Font.BOLD,18));
        l10.setBounds(100,490,100,30);
        add(l10);

        r1=new JRadioButton("yes");
        r1.setFont(new Font("Railway",Font.BOLD,14));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,490,300,30);
        add(r1);

        r2=new JRadioButton("No");
        r2.setFont(new Font("Railway",Font.BOLD,14));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(460,490,300,30);
        add(r2);

//////////
        JLabel l11=new JLabel("Exicting account");
        l11.setFont(new Font("Railway",Font.BOLD,18));
        l11.setBounds(100,540,100,30);
        add(l11);

        e1=new JRadioButton("yes");
        e1.setFont(new Font("Railway",Font.BOLD,14));
        e1.setBackground(new Color(252,208,76));
        e1.setBounds(350,540,300,30);
        add(e1);

        e2=new JRadioButton("No");
        e2.setFont(new Font("Railway",Font.BOLD,14));
        e2.setBackground(new Color(252,208,76));
        e2.setBounds(460,540, 300,30);
        add(e2);



        next=new JButton("Next");
        next.setFont(new Font("Railway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);



















        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(255,255,255));
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[]args){
      new signup2(" ");

    }

}
