package net.franklinps.chivallati.GraphicsLab04;
import java.awt.*;


public class Pool
{
	
	public static void drawPool(Graphics g)
	{
		
		int x1 = 500;
		int x2 = 800;
		int y = 490;
		
		while( y >= 410 )
		{
			
			for ( int step = 0 ; step < 3 ; step++ )
			{
				g.setColor( Utility.colorRandomAlpha( 0 , 48 , 110 , 55 , 200 ) );
		
				g.drawLine( x1 , y , x2 , y );
			}
			
				x1++;
				x2--;
				y--;
		}
		
	}
	
	public static void drawPoolBG(Graphics g)
	{
		
		int x1 = 500;
		int x2 = 800;
		int y = 490;
		
		while( y >= 410 )
		{
			
			for ( int step = 0 ; step < 3 ; step++ )
			{
				g.setColor( Color.white);
		
				g.drawLine( x1 , y , x2 , y );
			}
			
				x1++;
				x2--;
				y--;
		}
		
	}

}
