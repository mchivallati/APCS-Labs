package net.franklinps.chivallati.GraphicsLab04;
import java.awt.*;
import java.applet.*;


public class Paint extends Applet
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g)
	{
		
		Background.gradientBG(g);
		Background.drawGround(g);
		Background.drawSun(g);
		Background.drawClouds(g);
		
		House.houseBase(g);
		House.houseSecondFloor(g);
		House.houseRoof(g);
		House.drawWindows(g);
		House.drawDoor(g);
		
		Pool.drawPoolBG(g);
		Pool.drawPool(g);
		
	}

}
