package leagueInvaders;

import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject {

	public Alien(int x, int y, int height, int width) {
		super(x, y, height, width);
		// TODO Auto-generated constructor stub
	}
	
	void update () {
		
		y += 5;
		
	}
	
	void draw (Graphics g) {
		
		g.setColor(Color.YELLOW);

		g.fillRect(x, y, width, height);
		
	}

}
