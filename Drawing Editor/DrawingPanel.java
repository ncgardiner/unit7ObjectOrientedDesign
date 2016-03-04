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
    private double previousX;
    private double previousY;
    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
        //set up basic information
        setBackground(Color.WHITE);
        drawingColor=Color.BLACK;
        shapes = new ArrayList<Shape>();
        activeShape=-1;
        //add the appropriate listeners 
        MousePressListener listener = new MousePressListener();
        addMouseListener(listener);
        addMouseMotionListener(listener);
    }
    
    public Color getColor()
    {
        return drawingColor;
    }
    
    public Dimension getPreferredSize()
    {
        //allows for customized dimensions of the panel, instead of presets
        Dimension dimensions = new Dimension(FRAME_WIDTH,FRAME_HEIGHT);
        return dimensions;
    }
    
    public void pickColor()
    {
        //creates and displays a JColorChooser, which allows a new color to be chosen
        Color newColor = JColorChooser.showDialog(this,"Choose Your Color", drawingColor);
        if (newColor!=null)
            drawingColor = newColor;
    }
    
    public void addCircle()
    {
        //creates a new circle object, adds it to the array, and repaints
        Circle newCircle = new Circle(FRAME_HEIGHT/2,FRAME_WIDTH/2, 100, drawingColor);
        shapes.add(newCircle);
        activeShape = shapes.size()-1;
        repaint();
    }
    
    public void addSquare()
    {
        //creates a new square object, adds it to the array, and repaints
        Square newSquare = new Square(FRAME_HEIGHT/2,FRAME_WIDTH/2, 100, drawingColor);
        shapes.add(newSquare);
        activeShape = shapes.size()-1;
        repaint();
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        //cycle through the array of shapes, backwards, and draw all but the active shape
        for (int i = shapes.size()-1; i>=0; i--)
        {
            if (i!=activeShape)
                shapes.get(i).draw(g2,true);
        }
        //draw the active shape last so that it's on top
        if (activeShape>-1)
            shapes.get(activeShape).draw(g2,false);
    }
    
    class MousePressListener implements MouseListener, MouseMotionListener, KeyListener
    {
        //MouseListener
        public void mousePressed(MouseEvent event)
        {
            boolean n = false;
            //loop through all shapes and test if the click was inside any of them, sets
            //the active shape as that shape if there was one
            for (int i = shapes.size()-1; i>=0; i--)
            {
                if (shapes.get(i).isInside(new Point2D.Double(event.getX(),event.getY())))
                {
                    activeShape = i;
                    n=true;
                }
            }
            //if click wasn't in any of the shapes, there is no longer any active shape
            if (n==false)
                activeShape = -1;
            repaint();
            //stores the previous X and Y at the beginning of the click to help with smooth dragging
            previousX=event.getX();
            previousY=event.getY();
        }
        public void mouseReleased(MouseEvent event){}
        public void mouseClicked(MouseEvent event){}
        public void mouseEntered(MouseEvent event){}
        public void mouseExited(MouseEvent event){}
        //MouseMotionListener
        public void mouseMoved(MouseEvent event){}
        public void mouseDragged(MouseEvent event)
        {
            //moves the shape and then resets the values of the previous X and Y to the current ones
            if (activeShape>-1)
            {
                shapes.get(activeShape).move(event.getX(),event.getY(),previousX,previousY);
                previousX = event.getX();
                previousY = event.getY();
        }
            repaint();
        }
        //KeyListener
        public void keyReleased(KeyEvent event){}
        public void keyPressed(KeyEvent event){}
        public void keyTyped(KeyEvent event){}
    }
    
}
