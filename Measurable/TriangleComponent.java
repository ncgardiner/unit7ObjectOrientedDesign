import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Line2D;
import java.awt.Point;
public class TriangleComponent extends JComponent
{
    private Point point1;
    private Point point2;
    private Point point3;
    private int triangleStatus;
    public TriangleComponent()
    {
        triangleStatus=-1;
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        if (triangleStatus == 1||triangleStatus==2)
            g2.draw(new Line2D.Double(point1.getX(),point1.getY(),point2.getX(),point2.getY()));
        if (triangleStatus == 2)
        {
            g2.draw(new Line2D.Double(point1.getX(),point1.getY(),point3.getX(),point3.getY()));
            g2.draw(new Line2D.Double(point2.getX(),point2.getY(),point3.getX(),point3.getY()));
        }
        else if (triangleStatus == 3)
            triangleStatus = -1;
        triangleStatus++;
    }
    public void newPoint(int x, int y)
    {
        if (triangleStatus == 0)
            point1 = new Point(x,y);
        else if (triangleStatus == 1)
            point2 = new Point(x,y);
        else if (triangleStatus ==2)
            point3= new Point(x,y);
        repaint();
    }
}