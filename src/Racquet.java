import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import static java.awt.image.ImageObserver.HEIGHT;

/**
 *
 * @author Giuliana
 */
public class Racquet {
    
	int x = 0;
	int xa = 0;
	private Juego game;
        private static final int Y = 330;
	private static final int WITH = 60;
	private static final int HEIGHT = 20;

	public Racquet(Juego juego) {
		this.game= juego;
	}

	public void move() {
		if (x + xa > 0 && x + xa < game.getWidth()-60) 
			x = x + xa;
	}

	public void paint(Graphics2D g) {
		g.fillRect(x, Y, WITH, 10);
	}

	public void keyReleased(KeyEvent e) {
		xa = 0;
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) 
			xa = -game.speed;
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			xa = game.speed;
	}
        	public Rectangle getBounds() {
		return new Rectangle(x, Y, WITH, HEIGHT);
	}
                public int getTopY() {
		return Y - HEIGHT;
	}
}
    

