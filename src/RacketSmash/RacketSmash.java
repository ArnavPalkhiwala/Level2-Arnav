package RacketSmash;

import java.awt.Dimension;

import javax.swing.JFrame;



public class RacketSmash extends TennisGamePanel{
	
	JFrame frame;
	
	TennisGamePanel tgp;
	
	final int width = 500;
	
	final int height = 800;
	
	public RacketSmash() {
		
		frame = new JFrame();
		
		tgp = new TennisGamePanel();
		
		
		
	}

	public static void main(String[] args) {
		
		RacketSmash rs = new RacketSmash();
		rs.setupWindow();
		
	}
	
	void setupWindow () {
		
		frame.setSize(1000,2000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(tgp);
		frame.addKeyListener(tgp);

		frame.getContentPane().setPreferredSize(new Dimension(1000,3500));
		frame.pack();
		frame.setVisible(true);
		
		

		
		
	}

	private void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}

}