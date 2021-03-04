import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame implements ActionListener
{
    
   JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    FDemo ()
    {

        GridLayout g =new GridLayout(3,3);
      setLayout(g);
       Font f=new Font("",Font.BOLD,100);
       setFont(f);

   b1 =  new Button();
         b1.setSize(100,100);
         add(b1);

            b2=new Button();
       b2.setSize(100,100);
       add(b2);

       b3 =new Button();
       b3.setSize(100,100);
   add(b3);

        b4=new Button();
     b4.setSize(100,100);
    add(b4);

        b5=new Button();
   //  b5.setSize(100,100);
   add(b5);

        b6=new Button();
  add(b6);

        b7=new Button();
   add(b7);

      b8=new Button();
    add(b8);

         b9=new Button();
    add(b9);

  b1.addActionListener(this);
       b2.addActionListener(this);
     b3.addActionListener(this);
     b4.addActionListener(this);
     b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
     b8.addActionListener(this);
     b9.addActionListener(this);

    }
    int c=0;
    public void actionPerformed(ActionEvent e)
    {
JButton b =(JButton)e.getSource();

       if(c%2==0)
       {
        b.setLabel("X");
  //   Font f=new Font("Lucida Fax",Font.BOLD,80);
    //   b.setFont(f);
       }
       else{
        b.setLabel("0");
       }
    // b1.removeActionListener(this);
       c++;
    }

//condition for checking winner one  :
if(
(b[0].getLabel()=="0" && b[1].getLabel()=="0" && b[2].getLabel()=="0")
  ||
(b[3].getLabel()=="0" && b[3].getLabel()=="0" && b[6].getLabel()=="0")
||
(b[6].getLabel()=="0" && b[4].getLabel()=="0" && b[8].getLabel()=="0")
  ||
(b[2].getLabel()=="0" && b[4].getLabel()=="0" && b[6].getLabel()=="0")
||
(b[0].getLabel()=="0" && b[4].getLabel()=="0" && b[7].getLabel()=="0")
  ||
(b[1].getLabel()=="0" && b[5].getLabel()=="0" && b[8].getLabel()=="0")
||
(b[6].getLabel()=="0" && b[4].getLabel()=="0" && b[5].getLabel()=="0")
  ||
(b[6].getLabel()=="0" && b[7].getLabel()=="0" && b[8].getLabel()=="0")
)
{
    System.out.println("player one is winner");
    
}
//condition for checking winner two :
else if(
(b[0].getLabel()=="0" && b[1].getLabel()=="0" && b[2].getLabel()=="0")
  ||
(b[3].getLabel()=="0" && b[3].getLabel()=="0" && b[6].getLabel()=="0")
||
(b[6].getLabel()=="0" && b[4].getLabel()=="0" && b[8].getLabel()=="0")
  ||
(b[2].getLabel()=="0" && b[4].getLabel()=="0" && b[6].getLabel()=="0")
||
(b[0].getLabel()=="0" && b[4].getLabel()=="0" && b[7].getLabel()=="0")
  ||
(b[1].getLabel()=="0" && b[5].getLabel()=="0" && b[8].getLabel()=="0")
||
(b[6].getLabel()=="0" && b[4].getLabel()=="0" && b[5].getLabel()=="0")
  ||
(b[6].getLabel()=="0" && b[7].getLabel()=="0" && b[8].getLabel()=="0")
)
    {
    System.out.println("player two is winner");
    
    }
}

}
class tictac
{
    public static void main(String ar[])
    {
        FDemo f = new FDemo();
        f.setVisible(true);
        f.setBounds(100,100,500,500);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}
