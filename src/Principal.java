import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
 
public class Principal extends JFrame{
 
    private JDesktopPane desktopPane;
    private JMenuBar menuBar;
    private JMenu menu;
    private InternalFrameUm frameUm;
    private InternalFrameDois frameDois;
 
    public static void main(String args[]){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

    }
    
    public Principal(){
 
        super("Exemplo de JDesktopPane");
 
        int inset = 50;
 
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(inset, inset,
                   screenSize.width  - inset*2,
                  screenSize.height - inset*2);
 
        desktopPane = new JDesktopPane();
        setContentPane(desktopPane);                                

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        menu = new JMenu("Opções");
        menuBar.add(menu);
                
        JMenuItem menuItem1 = new JMenuItem("InternalFrameUm");
        menuItem1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
            	exibeFrameUm();
            }
        });
        menu.add(menuItem1);
        
        JMenuItem menuItem2 = new JMenuItem("InternalFrameDois");
        menuItem2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
            	exibeFrameDois();            	
            }
        });
        menu.add(menuItem2);
        
        setVisible(true);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
	private void exibeFrameUm()	{
		 if(frameUm == null){
             frameUm = new InternalFrameUm();
             frameUm.setVisible(true);
             desktopPane.add(frameUm);
         }
         else if(!frameUm.isVisible()){
             frameUm.setVisible(true);
             desktopPane.add(frameUm);
         }
	}
	
	private void exibeFrameDois()	{
        if(frameDois == null){
            frameDois = new InternalFrameDois();
            frameDois.setVisible(true);
            desktopPane.add(frameDois);
        }
        else if(!frameDois.isVisible()){
            frameDois.setVisible(true);
            desktopPane.add(frameDois);
        }
	}
	

 
}