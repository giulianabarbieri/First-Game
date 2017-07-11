import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			// Lo que sigue es ejecutado por el EDT (Event Dispatch Thread) de Swing.
			// Swing usa un unico thread para ejecutar casi cualquier cosa, y todas aquellas
			// acciones que involucre graficar componentes Swing, deben ponerse en la cola
			// del EDT para que este las ejecute cuando considere apropiado. 
			public void run() {
				JFrame frame = new JFrame("Mini Tennis");
				Juego game = new Juego();

				frame.setSize(300, 400);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// Al apretar la cruz, cerrar el programa.

				frame.add(game);			// Agregamos el panel al frame.
				frame.setVisible(true);		// Mostrar el frame.
				
				// GameMotion se encarga de hacer que las cosas se muevan y que el juego
				// se repinte regularmente. Es basicamente un while(true) que mueve y repinta.
				// Tenemos que ejecutarlo en otro thread, porque recordemos que todo esto se 
				// ejecuta en el EDT, y GameMotion hace un loop infinito. Si lo ejecutamos en el
				// EDT, el EDT se cuelga, y por ende se congela la ventana.
				GameMotion motion = new GameMotion(game);
				Thread t = new Thread(motion);
				t.start();
			}	
		});
	}
}