/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
@SuppressWarnings("serial")
 
public class Canva extends JPanel { //creamos una clase para el lienzo que extiende de obj JPanel
    @Override
	public void paint(Graphics g) { //por compatibilidad usamos Graphics
		Graphics2D g2d = (Graphics2D) g; //luego lo casteamos a graphics2d
		g2d.setColor(Color.RED);    //le damos un color
		g2d.fillOval(0, 0, 30, 30); //dibuja un ovalo, pero si son iguales el alto y ancho queda un circulo
		g2d.drawOval(0, 50, 30, 30);//las primeras dos son los xy, de las coordenadas del lienzo		
		g2d.fillRect(50, 0, 30, 30);//fill es cuando esta lleno
		g2d.drawRect(50, 50, 30, 30);

		g2d.draw(new Ellipse2D.Double(0, 100, 30, 30)); //esta es otra forma de pintar una elipse
                
	}
}
   
    




