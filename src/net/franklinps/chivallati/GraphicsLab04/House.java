package net.franklinps.chivallati.GraphicsLab04;

import net.franklinps.chivallati.Util;

import java.awt.*;
import java.applet.*;

public class House extends Applet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static void houseBase(Graphics g)
	{
		
		g.setColor( new Color ( 238 , 224 , 182 ) );
		
		g.fillRect( 100 , 350 , 300 , 100 );
		
		g.setColor( Color.gray);
		
		g.drawRect( 100 , 350 , 300 , 100 );
		
	}
	
	public static void houseSecondFloor(Graphics g)
	{
		
		g.setColor( new Color ( 255 , 244 , 202 ) );
		
		g.fillRect( 100 , 250 , 300 , 100 );
		
		g.setColor( Color.gray);
		
		g.drawRect( 100 , 250 , 300 , 100 );
		
	}
	
	public static void houseRoof(Graphics g)
	{
		
		g.setColor( new Color ( 211, 107, 71 ) );

		g.fillPolygon ( Util.tri ( 100, 250, 250, 150, 400, 250 ) );
		
	}
	
	public static void drawWindows(Graphics g)
	{
		
		//---------//
		
		int x = 115;
		int y = 365;
		int width = 50;
		int height = 70;	
		
		g.setColor( Color.gray );
			g.drawRect( x , y , width , height );
		
		g.setColor( Color.white );
			g.fillRect( x + 1 , y + 1 , width - 1 , height - 1 );
		
			//---------//
		
			x = 335;
			y = 365;
			width = 50;
			height = 70;
		
			g.setColor( Color.gray );
				g.drawRect( x , y , width , height );
		
			g.setColor( Color.white );
				g.fillRect( x + 1 , y + 1 , width - 1 , height - 1 );
			
				//---------//
			
				x = 335;
				y = 265;
				width = 50;
				height = 70;
			
				g.setColor( Color.gray );
					g.drawRect( x , y , width , height );
			
				g.setColor( Color.white );
					g.fillRect( x + 1 , y + 1 , width - 1 , height - 1 );
			
					//---------//
			
					x = 115;
					y = 265;
					width = 50;
					height = 70;	
			
					g.setColor( Color.gray );
						g.drawRect( x , y , width , height );
			
						g.setColor( Color.white );
							g.fillRect( x + 1 , y + 1 , width - 1 , height - 1 );

							//---------//
							
							x = 190;
							y = 265;
							width = 50;
							height = 70;	
				
							g.setColor( Color.gray );
								g.drawRect( x , y , width , height );

								g.setColor( Color.white );
									g.fillRect( x + 1 , y + 1 , width - 1 , height - 1 );
									
									//---------//
									
									x = 265;
									y = 265;
									width = 50;
									height = 70;	
						
									g.setColor( Color.gray );
										g.drawRect( x , y , width , height );

										g.setColor( Color.white );
											g.fillRect( x + 1 , y + 1 , width - 1 , height - 1 );
		
	}
	
	public static void drawDoor(Graphics g)
	{
		
		int x = 230;
		int y = 365;
		int width = 50;
		int height = 85;
		
			g.setColor( new Color ( 211, 107, 71 , 150 ) );
			
				g.fillRect( x , y , width , height );
				
			g.setColor( Color.black );
				g.drawRect( x - 1 , y - 1 , width + 1 , height + 1 );
		
	}

}
