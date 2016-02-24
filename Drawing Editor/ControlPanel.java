import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
/**
 * Write a description of class ControlPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlPanel extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */
    JButton circle;
    JButton color;
    JButton square;
    JPanel colorPanel;
    DrawingPanel canvas;
    /**
     * Default constructor for objects of class ControlPanel
     */
    public ControlPanel(DrawingPanel canvasIn)
    {
        canvas = canvasIn;
        color = new JButton("Pick a Color");
        add(color);
        colorPanel = new JPanel();
        colorPanel.setBackground(canvas.getColor());
        add(colorPanel);
        circle = new JButton("Add a Circle");
        add(circle);
        square = new JButton("Add a Square");
        add(square);
        
        ClickListener listener = new ClickListener();
        color.addActionListener(listener);
        circle.addActionListener(listener);
        square.addActionListener(listener);
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
    public void sampleMethod(int y)
    {
        
    }
    
    public class ClickListener implements ActionListener
    {
        /** description of instance variable x (add comment for each instance variable) */
        public void actionPerformed(ActionEvent event)
        {
            if (event.getActionCommand()=="Pick a Color")
            {
                canvas.pickColor();
                colorPanel.setBackground(canvas.getColor());
            }
            if (event.getActionCommand()=="Add a Circle")
            {
                canvas.addCircle();
            }
            if (event.getActionCommand()=="Add a Square")
            {
                canvas.addSquare();
            }
        }

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
