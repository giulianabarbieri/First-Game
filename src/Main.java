import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Mini Tennis");
		Juego game = new Juego();
		frame.add(game);
		frame.setSize(300, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		while (true) {
			game.move();
			game.repaint();
			try {
				Thread.sleep(10); 
			} catch (InterruptedException e) {}
		}
	}
}