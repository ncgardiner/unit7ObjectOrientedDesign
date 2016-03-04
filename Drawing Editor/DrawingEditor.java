import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Button;
public class DrawingEditor extends JFrame
{
    private static final int FRAME_HEIGHT= 800;
    private static final int FRAME_WIDTH= 800;
    private DrawingPanel canvas;
    private ControlPanel controls;
    public DrawingEditor()
    {
        //Set up the overall GUI for the drawing editor
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

    public static void main(String[] args)
    {
        //start everything up
        JFrame frame = new DrawingEditor();
    }

}
