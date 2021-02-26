import java.awt.Frame;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Graphics;

class name extends Frame
{
	name()
	{
           setVisible(true);
           setSize(500,500);
           setLocation(300,100);
           setBackground(Color.pink);
           addWindowListener(new WindowAdapter()
{
	public void WindowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}
           	);
	}


public void paint(Graphics g)
{
	int x=10;
	int y=10;
/*
 int w=500;
	int h=500;*/
/*
	for(int i=1;i<=25;i++)
	{
       int r1=(int)Math.round(Math.random()*225);
       int g1=(int)Math.round(Math.random()*225);
       int b1=(int)Math.round(Math.random()*225);
        Color c = new Color(r1,g1,b1);
        g.setColor(c);

    //g.fillRect(x,y,w,h);
        g.drawString("AYushi",x,y);
	try{Thread.sleep(100);}
		catch(Exception e){}
		
	x=x+20;
	y=y+20;
    }



    int x1=10;
    int y1=50;
	for(int i=1;i<=20;i++)
	{
       int r1=(int)Math.round(Math.random()*225);
       int g1=(int)Math.round(Math.random()*225);
       int b1=(int)Math.round(Math.random()*225);
        Color c = new Color(r1,g1,b1);
        g.setColor(c);

    //g.fillRect(x,y,w,h);
        g.drawString("AYushi",x1,y1);
	try{Thread.sleep(10);}
		catch(Exception e){}
		
	x1=x1+50;
	y1=y1+50;
    }

    int x2=60;
    int y2=20;
	for(int i=1;i<=20;i++)
	{
       int r1=(int)Math.round(Math.random()*225);
       int g1=(int)Math.round(Math.random()*225);
       int b1=(int)Math.round(Math.random()*225);
        Color c = new Color(r1,g1,b1);
        g.setColor(c);

    //g.fillRect(x,y,w,h);
        g.drawString("AYushi",x2,y2);
	try{Thread.sleep(10);}
		catch(Exception e){}
		
	x2=x2+30;
	y2=y2+30;
    }



    int x3=0;
    int y3=40;
	for(int i=1;i<=20;i++)
	{
       int r1=(int)Math.round(Math.random()*225);
       int g1=(int)Math.round(Math.random()*225);
       int b1=(int)Math.round(Math.random()*225);
        Color c = new Color(r1,g1,b1);
        g.setColor(c);

    //g.fillRect(x,y,w,h);
        g.drawString("AYushi",x3,y3);
	try{Thread.sleep(10);}
		catch(Exception e){}
		x3=x3+20;
	y3=y3+20;
    }




    int x4=70;
    int y4=0;
	for(int i=1;i<=20;i++)
	{
       int r1=(int)Math.round(Math.random()*225);
       int g1=(int)Math.round(Math.random()*225);
       int b1=(int)Math.round(Math.random()*225);
        Color c = new Color(r1,g1,b1);
        g.setColor(c);

    //g.fillRect(x,y,w,h);
        g.drawString("AYushi",x4,y4);
	try{Thread.sleep(10);}
		catch(Exception e){}
		
	x4=x4+60;
	y4=y4+60;
    }

    

    int x5=100;
    int y5=0;
	for(int i=1;i<=50;i++)
	{
       int r1=(int)Math.round(Math.random()*225);
       int g1=(int)Math.round(Math.random()*225);
       int b1=(int)Math.round(Math.random()*225);
        Color c = new Color(r1,g1,b1);
        g.setColor(c);

    //g.fillRect(x,y,w,h);
        g.drawString("AYushi",x5,y5);
	try{Thread.sleep(10);}
		catch(Exception e){}
		
	x5=x5+30;
	y5=y5+30;
    }

    

    int x6=200;
    int y6=200;
	for(int i=1;i<=20;i++)
	{
       int r1=(int)Math.round(Math.random()*225);
       int g1=(int)Math.round(Math.random()*225);
       int b1=(int)Math.round(Math.random()*225);
        Color c = new Color(r1,g1,b1);
        g.setColor(c);

    //g.fillRect(x,y,w,h);
        g.drawString("AYushi",x6,y6);
	try{Thread.sleep(100);}
		catch(Exception e){}
		
	x6=x6+40;
	y6=y6+40;
    }


*/

for(int j=1;j<=20;j++)

{    int x7=0;
    int y7=0;
	for(int i=1;i<=20;i++)
	{
       int r1=(int)Math.round(Math.random()*225);
       int g1=(int)Math.round(Math.random()*225);
       int b1=(int)Math.round(Math.random()*225);
        Color c = new Color(r1,g1,b1);
        g.setColor(c);

    //g.fillRect(x,y,w,h);
        g.drawString("AYushi",x7,y7);
	try{Thread.sleep(100);}
		catch(Exception e){}
		
	x7=x7+30;
	y7=y7+30;
    }
    x7=x7+50;
    y7=y7+50;
   
}

}
public static void main(String ar[])
{
	name n =new name();
}
}