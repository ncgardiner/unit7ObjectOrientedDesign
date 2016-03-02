import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JColorChooser;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
/**
 * Write a description of class DrawingPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingPanel extends JPanel 
{
    /** description of instance variable x (add comment for each instance variable) */
    Color drawingColor;
    int activeShape;
    ArrayList<Shape> shapes;
    private final int FRAME_WIDTH=700;
    private final int FRAME_HEIGHT=600;
    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
        setBackground(Color.WHITE);
        drawingColor=Color.BLACK;
        
        MousePressListener listener = new MousePressListener();
        addMouseListener(listener);
        addMouseMotionListener(listener);
        
        shapes = new ArrayList<Shape>();
    }
    
    public Color getColor()
    {
        return drawingColor;
    }
    
    public Dimension getPreferredSize()
    {
        Dimension dimensions = new Dimension(FRAME_WIDTH,FRAME_HEIGHT);
        return dimensions;
    }
    
    public void pickColor()
    {
        Color newColor = JColorChooser.showDialog(this,"Choose Your Color", drawingColor);
        if (newColor!=null)
            drawingColor = newColor;
    }
    
    public void addCircle()
    {
        Circle newCircle = new Circle(FRAME_HEIGHT/2,FRAME_WIDTH/2, 100, drawingColor);
        shapes.add(newCircle);
        activeShape = shapes.size()-1;
        repaint();
    }
    
    public void addSquare()
    {
        Square newSquare = new Square(FRAME_HEIGHT/2,FRAME_WIDTH/2, 100, drawingColor);
        shapes.add(newSquare);
        activeShape = shapes.size()-1;
        repaint();
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (int i = shapes.size()-1; i>=0; i--)
        {
            if (i!=activeShape)
                shapes.get(i).draw(g2,true);
        }
        if (shapes.size()>0)
            shapes.get(activeShape).draw(g2,false);
    }
    
    class MousePressListener implements MouseListener, MouseMotionListener, KeyListener
    {
        //MouseListener
        public void mousePressed(MouseEvent event)
        {
            for (int i = shapes.size()-1; i>=0; i--)
            {
                if (shapes.get(i).isInside(new Point2D.Double(event.getX(),event.getY())))
                {
                    activeShape = i;
                    System.out.println(i);
                }
            }
            repaint();
        }
        public void mouseReleased(MouseEvent event){}
        public void mouseClicked(MouseEvent event){}
        public void mouseEntered(MouseEvent event){}
        public void mouseExited(MouseEvent event){}
        //MouseMotionListener
        public void mouseMoved(MouseEvent event){}
        public void mouseDragged(MouseEvent event)
        {
            shapes.get(activeShape).move(event.getX(),event.getY());
            repaint();
        }
        //KeyListener
        public void keyReleased(KeyEvent event){}
        public void keyPressed(KeyEvent event){}
        public void keyTyped(KeyEvent event){}
    }
    
}
