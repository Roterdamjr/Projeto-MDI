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

public class TestaMDI extends JFrame {

	private JDesktopPane desktopPane;
    private InternalFrameUm frameUm;
    private InternalFrameDois frameDois;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestaMDI frame = new TestaMDI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TestaMDI() {
        super("Exemplo de JDesktopPane");
        
        int inset = 50;
 
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(inset, inset,
                   screenSize.width  - inset*2,
                  screenSize.height - inset*2);
        
		desktopPane = new JDesktopPane();		
		setContentPane(desktopPane);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		 
		
		JMenu menu = new JMenu("Opções");
		menuBar.add(menu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("item 1");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				exibeFrameUm();
			}
		});
		menu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("item 2");
		menu.add(mntmNewMenuItem_1);
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				exibeFrameDois();
			}
		});
				
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
