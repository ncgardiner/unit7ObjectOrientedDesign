import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
public class Circle extends Shape
{
    Ellipse2D.Double circle;
    public Circle(double x_coord,double y_coord,double radiusInput,Color shapeColor)
    {
        //utilizes the superclass to create the shape and initialize the variables
        super(x_coord,y_coord,radiusInput,shapeColor);
        circle = new Ellipse2D.Double(x,y,radius/2,radius/2);
    }
    
    public boolean isInside(Point2D.Double point)
    {
        //creates a new circle and uses the pre existing class to test if the point is inside
        Ellipse2D.Double newCircle = new Ellipse2D.Double(x,y,radius/2,radius/2);
        return newCircle.contains(point.getX(),point.getY());
    }
    
    public void draw(Graphics2D g,boolean fill)
    {
        //creates a new circle with the given attributes and draws it, fills it if told to do so
        Ellipse2D.Double newCircle = new Ellipse2D.Double(x,y,radius/2,radius/2);
        g.setColor(color);
        g.draw(newCircle);
        if (fill)
            g.fill(newCircle);
    }
}
