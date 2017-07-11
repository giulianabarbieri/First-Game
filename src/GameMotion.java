class GameMotion implements Runnable {
	private Juego game;

	public GameMotion(Juego game) {
		this.game = game;
	}

	public void run() {
		while (true) {
			game.move();
			game.repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) { }
		}
	}
}