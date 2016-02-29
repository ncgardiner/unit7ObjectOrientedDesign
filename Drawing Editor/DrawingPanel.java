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
    Shape activeShape;
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
        Circle newCircle = new Circle(FRAME_HEIGHT/2,FRAME_WIDTH/2, 50, drawingColor);
        shapes.add(newCircle);
        activeShape = newCircle;
        repaint();
    }
    
    public void addSquare()
    {
        Square newSquare = new Square(FRAME_HEIGHT/2,FRAME_WIDTH/2, 40, drawingColor);
        shapes.add(newSquare);
        activeShape = newSquare;
        repaint();
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        for (int i = shapes.size()-1; i>=0; i--)
        {
            if (shapes.get(i)!=activeShape)
                g2.draw(shapes.get(i));
        }
        g2.draw(activeShape);
    }
    
    class MousePressListener implements MouseListener, MouseMotionListener, KeyListener
    {
        //MouseListener
        public void mousePressed(MouseEvent event){}
        public void mouseReleased(MouseEvent event){}
        public void mouseClicked(MouseEvent event){}
        public void mouseEntered(MouseEvent event){}
        public void mouseExited(MouseEvent event){}
        //MouseMotionListener
        public void mouseMoved(MouseEvent event){}
        public void mouseDragged(MouseEvent event){}
        //KeyListener
        public void keyReleased(KeyEvent event){}
        public void keyPressed(KeyEvent event){}
        public void keyTyped(KeyEvent event){}
    }
    
}
