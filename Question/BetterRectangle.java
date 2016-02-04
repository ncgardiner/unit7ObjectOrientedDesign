import java.awt.Rectangle;
public class BetterRectangle extends Rectangle
{
    public void BetterRectangle(int width,int height)
    {
        this.setLocation(0,0);
        this.setSize(width,height);
    }
    public double getPerimeter()
    {
        return (this.getWidth()*2)+(this.getHeight()*2);
    }
    public double getArea()
    {
        return this.getWidth()*this.getHeight();
    }
}
