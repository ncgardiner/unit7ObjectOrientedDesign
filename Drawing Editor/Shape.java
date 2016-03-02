import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.Graphics;
import java.awt.Graphics2D;
public abstract class Shape
{
    double x;
    double y;
    double radius;
    Color color;
    public Shape(double x_coord,double y_coord, double radiusInput, Color shapeColor)
    {
        x=x_coord;
        y=y_coord;
        radius=radiusInput;
        color=shapeColor;
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
        x = x_in;
        y = y_in;
    }
    
    public void setRadius(double r)
    {
        radius = r;
    }
    
    public abstract boolean isInside(Point2D.Double point);
    public abstract void draw(Graphics2D g,boolean fill);
}








