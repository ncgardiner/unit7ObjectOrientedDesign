import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
public class Square extends Shape
{
    Rectangle2D.Double square;
    public Square(double x_coord,double y_coord,double radiusInput,Color shapeColor)
    {
        //utilizes the superclass to create the shape and initialize the variables
        super(x_coord,y_coord,radiusInput,shapeColor);
        square= new Rectangle2D.Double(x,y,radius/2,radius/2);
    }
    
    public boolean isInside(Point2D.Double point)
    {
        //creates a new square and tests if the point is inside
        Rectangle2D.Double newSquare= new Rectangle2D.Double(x,y,radius/2,radius/2);
        return newSquare.contains(point.getX(),point.getY());
    }
    
    public void draw(Graphics2D g,boolean fill)
    {
        //creates a new square to be drawn with all the current attributes, fills it if told to do so
        Rectangle2D.Double newSquare= new Rectangle2D.Double(x,y,radius/2,radius/2);
        g.setColor(color);
        g.draw(newSquare);
        if (fill)
            g.fill(newSquare);
    }
}