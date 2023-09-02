import java.applet.Applet;
import java.awt.Graphics;
public class ho extends Applet
{
public void paint(Graphics g)
{

g.drawRect(50, 100, 200, 150);

        
int[] xPoints = {50, 150, 250};
int[] yPoints = {100, 50, 100};
 g.drawPolygon(xPoints, yPoints, 3);

        
g.drawRect(120, 150, 60, 100);


        

}
}