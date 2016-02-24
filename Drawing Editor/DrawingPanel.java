import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JColorChooser;
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
    
    public void pickColor()
    {
        Color newColor = JColorChooser.showDialog(this,"Choose Your Color", drawingColor);
        if (newColor!=null)
            drawingColor = newColor;
    }
    public void addCircle()
    {
        
    }
    public void addSquare()
    {
        
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
