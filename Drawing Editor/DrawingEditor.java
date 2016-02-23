import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Button;
/**
 * Write a description of class DrawingEditor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingEditor extends JFrame
{
    /** description of instance variable x (add comment for each instance variable) */
    private static final int FRAME_HEIGHT= 500;
    private static final int FRAME_WIDTH= 500;
    private DrawingPanel canvas;
    private ControlPanel controls;
    /**
     * Default constructor for objects of class DrawingEditor
     */
    public DrawingEditor()
    {
        setLayout(new BorderLayout());
        
        setTitle("Drawing Editor");
        
        canvas = new DrawingPanel();
        controls = new ControlPanel(canvas);
        
        add(controls,BorderLayout.SOUTH);
        add(canvas,BorderLayout.CENTER);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(FRAME_HEIGHT,FRAME_WIDTH);
        setVisible(true);
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public static void main(String[] args)
    {
        JFrame frame = new DrawingEditor();
        
    }

}
