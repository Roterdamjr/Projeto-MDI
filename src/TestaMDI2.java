import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TestaMDI2 extends JFrame {

	private JPanel contentPane;
	JDesktopPane desktopPane;
    private InternalFrameUm frameUm;
    private InternalFrameDois frameDois;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestaMDI2 frame = new TestaMDI2();
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
	public TestaMDI2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JMenuBar menuBar = new JMenuBar();
		contentPane.add(menuBar, BorderLayout.NORTH);
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("item 1");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				exibeFrameUm();
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("item 2");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				exibeFrameUm();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		 desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);
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
