package net.franklinps.GraphicsLab04;
import java.awt.*;

public class Utility
{
	
	//---------- Random Color MethodS ----------//

	public static Color randomColor()
	{
		
		int r = (int)( Math.random() * 256 );
		int g = (int)( Math.random() * 256 );
		int b = (int)( Math.random() * 256 );
		
		Color randomColor = new Color ( r , g , b );
		
		return randomColor;
		
	}
	
	public static Color colorRandomAlpha( int r , int g , int b , int minAlpha , int maxAlpha )
	{
		
		int range = maxAlpha - minAlpha;
		
		int a = (int)( ( Math.random() * range) + minAlpha );
		
		
		Color randomColorA = new Color ( r , g , b , a );
		
		return randomColorA;
		
	}
	
	public static Color randomGrayscale( int minAlpha , int maxAlpha )
	{
		
		int range = maxAlpha - minAlpha;
		
		int a = (int)( ( Math.random() * range) + minAlpha );
		
		
		Color randomGrayscale = new Color ( 0 , 0 , 0 , a );
		
		return randomGrayscale;
		
	}
	
	public static Color randomWhiteShades( int minAlpha , int maxAlpha )
	{
		
		int range = maxAlpha - minAlpha;
		
		int a = (int)( ( Math.random() * range) + minAlpha );
		
		
		Color randomWhiteShades = new Color ( 255 , 255 , 255 , a );
		
		return randomWhiteShades;
		
	}
	
	//---------- Random X and Y Coord Methods ---------//
	
	public static int randomX( int xMin , int xMax )
	{
		
		int range = xMax - xMin;
		
		int randomX = (int)( ( Math.random() * range ) + xMin );
		
		return randomX;
		
	}
	
	public static int randomY( int yMin , int yMax )
	{
		
		int range = yMax - yMin;
		
		int randomY = (int)( ( Math.random() * range ) + yMin );
		
		return randomY;
		
	}
	
	//---------- Random Diameter for Circle Method ----------//
	
	public static int randomDiam( int diamMin , int diamMax )
	{
		
		int range = diamMax - diamMin;
		
		int randomDiam = (int)( ( Math.random() * range ) + diamMin );
		
		return randomDiam;
		
	}
	
	//---------- Quadralateral Polygon Method ----------//
	
	public static Polygon quad( int x1 , int y1 , int x2 , int y2 , int x3 , int y3 , int x4 , int y4 )
	{
		
		int x[] = { x1 , x2 , x3 , x4 };
		
		int y[] = { y1 , y2 , y3 , y4 };
		
		Polygon quad = new Polygon( x , y , 4 );
		
		
		return quad;
		
	}
	
	//---------- Trianlge Polygon Method ----------//
	
	public static Polygon tri( int x1 , int y1 , int x2 , int y2 , int x3 , int y3 )
	{
		
		int x[] = { x1 , x2 , x3 };
		
		int y[] = { y1 , y2 , y3 };
		
		Polygon tri = new Polygon( x , y , 3 );
		
		return tri;
		
	}
	
}
