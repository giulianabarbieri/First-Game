/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;
import java.applet.Applet;
import java.applet.AudioClip;
/**
 *
 * @author Claudia
 */
public class Sound {
    
	public static final AudioClip BALL = Applet.newAudioClip(Sound.class.getResource("Randomize24.wav"));
	public static final AudioClip GAMEOVER = Applet.newAudioClip(Sound.class.getResource("gameover.wav"));
	public static final AudioClip BACK = Applet.newAudioClip(Sound.class.getResource("ZeldaFinal.wav"));

}
