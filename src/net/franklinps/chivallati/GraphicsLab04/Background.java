package net.franklinps.chivallati.GraphicsLab04;
import java.awt.*;
import java.applet.*;

public class Background extends Applet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static void gradientBG(Graphics g)
	{
		
		int R = 200;
		int G = 220;
		int B = 255;
		
		int x1 = 10;
		int y = 500;
		int x2 = 900;
		
		while ( R >= 175 )
		{
			
			Color bgGradient = new Color ( R , G , B );
			
			g.setColor( bgGradient );
			
			for ( int i = 0 ; i < 20 ; i++)
			{
				
				g.drawLine( x1 , y , x2 , y );
				
				y--;
				
				if ( y == 10 )
					i = 20;
				
			}
			
			if ( y == 10 )
				R = 175;
			
			
			
			R--;
			G--;
			B--;
			
		}
		
	}
	
	public static void drawSun(Graphics g)
	{
		
		g.setColor( Color.yellow );
		
		g.fillArc( -90 , -90 , 200 , 200 , 270 , 90 );
		
	}
	
	public static void drawGround(Graphics g)
	{
		
		int x1 = 10;
		int y = 500;
		int x2 = 900;
		int R = 82;
		int G = 165;
		int B = 92;
			
		while ( y >= 400 )
		{
			
			Color groundColor = new Color ( R , G , B );
		
			for ( int i = 0 ; i < 2 ; i++)
			{
			
				g.setColor( groundColor );
				
				g.drawLine( x1 , y , x2 , y );
			
					y--;
			
			}
			
			if ( R < 256 )
			{
				
				R++;
				G++;
				B++;
				
			}
		
		}
		
	}
	
//----------------- Cloud Methods -------------------//
	
	// Method that draws the actual clouds
	
	public static void drawClouds(Graphics g)
	{
		//--{ Cloud #1 }--//
		cloudGrouping( g , 20 , 80 , 100 , 20 , 40 );
		
		//--{ Cloud #2 }--//
		cloudGrouping( g , 20 , 400 , 50 , 70 , 100 );
		
		//--{ Cloud #3 }--//
		cloudGrouping( g , 30 , 600 , 100 , 30 , 50 );
		
	}
	
	// Method that creates the actual cloud
	
	public static void cloudGrouping( Graphics g , int numClouds , int xMin , int xMax , int yMin , int yMax )
	{
		
		for ( int i = 0 ; i < numClouds ; i++ )
		{
			g.setColor( Utility.randomWhiteShades( 10 , 225 ) );
			
			g.fillOval( Utility.randomX( xMin , xMax ) ,
						Utility.randomY( yMin , yMax ) ,
						Utility.randomDiam( 10 , 50 ) ,
						Utility.randomDiam( 10 , 40 ) );
			
		}
		
	}
	
}
