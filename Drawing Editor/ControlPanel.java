import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
public class ControlPanel extends JPanel
{
    JButton circle;
    JButton color;
    JButton square;
    JPanel colorPanel;
    DrawingPanel canvas;
    public ControlPanel(DrawingPanel canvasIn)
    {
        //set up of all the buttons, colors, background, etc
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
        //add the listeners to the buttons so they work
        ClickListener listener = new ClickListener();
        color.addActionListener(listener);
        circle.addActionListener(listener);
        square.addActionListener(listener);
    }

    public class ClickListener implements ActionListener
    {
        //Initiates methods when buttons are clicked
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
