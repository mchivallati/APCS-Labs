package net.franklinps.chivallati.GraphicsLab03;// GraphicsLab03st.java
// Student Version


import java.awt.*;
import java.applet.*;
import java.util.*;


public class GraphicsLab03v100Chivallati extends Applet
{

//---------- Random Color Method ----------//

   public static Color randomColor()
   {
   
      int r = (int)( Math.random() * 256 );
      int g = (int)( Math.random() * 256 );
      int b = (int)( Math.random() * 256 );
      
   
      Color randomColor = new Color ( r , g , b );
      
      return randomColor;
   
   }
   
//---------- Random X and Y Coord Methods ---------//
   
   public static int randomX( int xMin , int xMax )
   {
   
      int randomX = (int)( ( Math.random() * xMax ) + xMin );
      
      return randomX;
   
   }
   public static int randomY( int yMin , int yMax )
   {
   
      int randomY = (int)( ( Math.random() * yMax ) + yMin );
      
      return randomY;
   
   }
   
//---------- Random Diameter for Circle Method ----------//

   public static int randomDiam( int diamMin , int diamMax )
   {
   
      int randomDiam = (int)( ( Math.random() * diamMax ) + diamMin );
      
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

//--------- Applet Window ----------//

	public void paint(Graphics g) 	
	{
   
		// Draw Grid
		g.drawRect( 10 , 10 , 780 , 580 );
		g.drawLine( 400 , 10 , 400 , 590 );
		g.drawLine( 10 , 300 , 790 , 300 );
		
		
		// Draw Random Lines
			
         for ( int i = 0 ; i < 100 ; i++ )
         {
         
            g.setColor( randomColor() );
            
            g.drawLine( randomX( 10 , 390 ) , randomY( 10 , 290 ) , randomX( 10 , 390 ) , randomY( 10 , 290 ) );
         
         }
		
		// Draw Random Squares

         for ( int i = 0 ; i < 100 ; i++ )
         {
         
            g.setColor( randomColor() );
            
            g.fillRect( randomX( 400 , 340 ) , randomY( 10 , 240 ) , 50 , 50 );
         
         }
		
		// Draw Random Circles

         for (int i = 0 ; i < 100 ; i++ )
         {
         
            g.setColor( randomColor() );
         
            int k = randomDiam( 10 , 200 );
            
            g.drawOval( randomX( 10 , 390 - k ) , randomY( 300 , 290 - k ) , k , k );
         
         }
		
		// Draw 3-D Box
      
         // Red Square
      
            g.setColor( Color.red );
         
               g.fillRect( 500 , 400 , 100 , 100 );
            
         // Blue Triangle
            
            g.setColor( Color.blue );
         
               g.fillPolygon( tri( 600 , 400 , 550 , 400 , 550 , 350 ) );
            
         // Yellow Trapazoid
         
            g.setColor( Color.yellow );
            
               g.fillPolygon( quad( 550 , 400 , 500 , 400 , 450 , 350 , 550 , 350 ) );
               
         // Green Parallelagram
         
            g.setColor( Color.green );
            
               g.fillPolygon( quad( 500 , 400 , 500 , 500 , 450 , 450 , 450 , 350 ) );

	}	
}
