import javax.swing.JInternalFrame;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JPanel;
 
public class InternalFrameB extends JInternalFrame {  
 
     public InternalFrameB() {
         super("Internal Frame Um",
               true, //resizable
               true, //closable
                true, //maximizable
               true);//iconifiable  
 
         setSize(300,300);  
 
        JPanel panel = new JPanel();
         panel.setBackground(Color.YELLOW);  
 
         Container container = getContentPane();
         container.add(panel);
 
     }
}
