import java.awt.Color;
import java.awt.geom.Point2D;
public class Shape
{
    double x;
    double y;
    double radius;
    Color color;
    public Shape()
    {
        
    }
    
    public Point2D.Double getCenter()
    {
        return new Point2D.Double(x,y);
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public void move(double x_in, double y_in)
    {
        x = x + x_in;
        y = y + y_in;
    }
    
    public void setRadius(double r)
    {
        radius = r;
    }
    
    public abstract boolean isInside(Point2D.Double point);
}








