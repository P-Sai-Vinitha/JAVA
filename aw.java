import java.awt.*;
class abc
{
public abc()
{
Frame f=new Frame("first");
f.setSize(400,600);
f.setVisible(true);
Panel p=new Panel();
f.add(p);
Button b=new Button("yes");
p.add(b);
Label l=new Label("enter you name");
p.add(l);
}}

class aw
{
public static void main(String args[])
{
abc e=new abc();
}
}