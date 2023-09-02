import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class smi extends Applet
{
public void paint(Graphics g)
{ 

g.setColor(Color.BLACK);
g.fillOval(80, 150, 40, 80);

g.fillOval(280, 150, 40, 80);  

g.setColor(Color.YELLOW);
g.fillOval(100, 100, 200, 200);

g.setColor(Color.BLACK);
g.fillOval(140, 150, 40, 40);
   
g.fillOval(230, 150, 40, 40); 

g.setColor(Color.WHITE);
g.fillOval(160, 160, 20, 20);

g.fillOval(250, 160, 20, 20);

g.setColor(Color.BLACK);
g.drawLine(195, 140, 195, 170);


g.setColor(Color.BLACK);
g.drawArc(150, 200, 100, 60, 0, -180);

}
}