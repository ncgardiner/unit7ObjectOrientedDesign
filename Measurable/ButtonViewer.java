import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**

*/
public class ButtonViewer
{
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 100;
    
    private JFrame frame;
    private JPanel panel;
    private JButton a;
    private JButton b;
    private JLabel label;
    public ButtonViewer()
    {
        this.frame = new JFrame();
        this.panel = new JPanel();
        
        this.a = new JButton("A bruh");
        this.panel.add(a);
        this.b = new JButton("B boy");
        this.panel.add(b);
        this.frame.add(panel);
        
        this.label = new JLabel();
        this.panel.add(this.label);
        
        ClickListener listener = new ClickListener();
        this.a.addActionListener(listener);
        this.b.addActionListener(listener);
        
        this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.frame.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        ButtonViewer view = new ButtonViewer();
    }
    
    public class ClickListener implements ActionListener
    {
        /** description of instance variable x (add comment for each instance variable) */
        public void actionPerformed(ActionEvent event)
        {
            label.setText("Button "+event.getActionCommand()+" was clicked.");
        }

    }
}