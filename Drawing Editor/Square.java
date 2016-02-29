import java.awt.Color;
import java.awt.geom.Point2D;
public class Square extends Shape
{
    public Square(double x_coord,double y_coord, double radiusInput, Color shapeColor)
    {
        x=x_coord;
        y=y_coord;
        radius=radiusInput;
        color=shapeColor;
    }
    
    public boolean isInside(Point2D.Double point)
    {
        x_in = point.getX();
        y_in = point.getY();
        
    }
}