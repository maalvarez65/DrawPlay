import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;

public class Cat {
	// drawing constants are private - noone needs to know what we're doing
	// pick a head dimension
	private static final int HEAD_DIMENSION = 200;
	// eyes will be about 1/4 from top of head and 1/4 from left
	private static final int EYE_Y = HEAD_DIMENSION/4;
	private static final int EYE_X = HEAD_DIMENSION/4;
	private static final int EYE_SEPARATION = HEAD_DIMENSION/3;
	// pick eye dimensions
	private static final int EYE_HEIGHT = 40;
	private static final int EYE_WIDTH = 5;
	// pick mouth height, width is based on head dimension
	private static final int MOUTH_HEIGHT = 20;
	private static final int MOUTH_WIDTH = HEAD_DIMENSION/4;
	// mouth starts about 40% from left edge of head
	private static final int MOUTH_X = HEAD_DIMENSION/5 * 2;
	private static final int MOUTH_Y = HEAD_DIMENSION/5 * 3;
	// ear dimensions
	private static final int EAR_X = HEAD_DIMENSION/3;
	private static final int EAR_SEPARATION = HEAD_DIMENSION/2;
	// pick ear dimensions
	private static final int EAR_HEIGHT = 100;
	private static final int EAR_WIDTH = 20;
	// Foot dimensions
	private static final int FOOT_Y = HEAD_DIMENSION*4/5;
	private static final int FOOT_X = HEAD_DIMENSION/20;
	private static final int FOOT_SEPARATION = HEAD_DIMENSION/2;
	// pick foot dimensions
	private static final int FOOT_HEIGHT = 50;
	private static final int FOOT_WIDTH = 100;

	// draw will render the Cat on the Graphics object
	public void draw(Graphics g, int catX, int catY)
	{
		Graphics2D g2 = (Graphics2D) g;
		int x=catX + 25;
		int y=catY;
		//Draw ears
		g2.setColor(Color.red);
		x = catX + EAR_X; 
		g2.fillOval(x, y, EAR_WIDTH, EAR_HEIGHT);
		x += EAR_SEPARATION;
		g2.fillOval(x, y, EAR_WIDTH, EAR_HEIGHT);
		// Draw the head
		x = catX + 25;
		y = catY;
		g2.setColor(Color.pink);
		g2.fillOval(x, y, HEAD_DIMENSION, HEAD_DIMENSION);
		// Draw the eyes
		g2.setColor(Color.green);
		x = catX + EYE_X; 
		y = catY + EYE_Y;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		x += EYE_SEPARATION;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		// Draw the feet
		g2.setColor(Color.red);
		x = catX - FOOT_X; 
		y = catY + FOOT_Y;
		g2.fillOval(x, y, FOOT_WIDTH, FOOT_HEIGHT);
		x += FOOT_SEPARATION;
		g2.fillOval(x, y, FOOT_WIDTH, FOOT_HEIGHT);
		// Draw the mouth
		g2.setColor(Color.black);
		x = catX + MOUTH_X - 5;
		y = catY + MOUTH_Y + 10;
		g2.fillOval(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		g2.setColor(Color.black);
		// Meow text appears below cat head, +10 places below 
		// so it doesn't overlap the drawing
		g2.drawString("WOOF! I'm a naked mole-cat", catX + 50, catY+HEAD_DIMENSION + 50);	
	}
}
