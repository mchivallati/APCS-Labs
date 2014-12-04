package net.franklinps.chivallati.GraphicsLab02;// GraphicsLab02Chivallati.java
// This is the student, starting version of the GraphicsLab02 assignment.

import java.awt.*;
import java.applet.*;

public class GraphicsLab02v110Chivallati extends Applet
{

                                            // Random Color Functions//
//---------------------------------------------------------------------------------------------------------------//

   public static int R() // function for r in rgb
   {

       double Red = Math.random () * 256;
         
      int R = (int) Red;
      
      return R;
   
   }
   public static int G() // function for g in rgb
   {

       double Green = Math.random () * 256;
      
      int G = (int) Green;
      
      return G;
   
   }
   public static int B() // function for b in rgb
   {

       double Blue = Math.random () * 256;
   
      int B = (int) Blue;
   
      return B;
   
   }
   public static Color randomColor()
   {
   
      Color randomColor = new Color ( R() , G() , B() );
      
      return randomColor;
   
   }

//---------------------------------------------------------------------------------------------------------------//

	public void paint(Graphics g)
	{

                             // Large outer rectangle//
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
   
      int width = 980;
      int height = 630;
         
      g.drawRect( 10 , 10 , width , height );
//============================//        
    // Draw bottom-right //
//----------------------------//
      
      int xInitial = 10;
      int yInitial = 10;
      int pRate = 0;
      int RED = 0;
      int GREEN = 0;
      int BLUE = 0;

      for (int qVCL = 0 ; qVCL <= 630 ; qVCL += 13 )
      {
      
         Color grayScale = new Color ( RED , GREEN , BLUE );
         
         g.setColor( grayScale );
      
         g.drawLine( xInitial + pRate , height + yInitial , width + xInitial , ( height + yInitial ) - qVCL );
         pRate += 20;
         
         RED += 16;
         GREEN += 16;
         BLUE += 16;
         
         if ( RED > 239 )
         {
         
            RED = 0;
            GREEN = 0;
            BLUE = 0;
         
         }
         
       }
//===========================//         
    // Draw bottom-left //
//---------------------------//
      
      xInitial = 10;
      yInitial = 10;
      pRate = 0;
      RED = 0;
      GREEN = 0;
      BLUE = 0;
      
      for (int qVCL = 0 ; qVCL <= 630 ; qVCL += 13 )
      {
      
         Color grayScale = new Color ( RED , GREEN , BLUE );
         
         g.setColor( grayScale );
      
         g.drawLine( xInitial + pRate , height + yInitial , 0 + xInitial , ( 0 + yInitial ) + qVCL );
         pRate += 20;
         
         RED += 16;
         GREEN += 16;
         BLUE += 16;
         
         if ( RED > 239 )
         {
         
            RED = 0;
            GREEN = 0;
            BLUE = 0;
         
         }
         
      }
//========================//    
    // Draw top-left //
//------------------------//
      
      xInitial = 10;
      yInitial = 10;
      pRate = 0;
      RED = 0;
      GREEN = 0;
      BLUE = 0;
      
      for (int qVCL = 0 ; qVCL <= 630 ; qVCL += 13 )
      {
      
         Color grayScale = new Color ( RED , GREEN , BLUE );
         
         g.setColor( grayScale );
      
         g.drawLine( xInitial + pRate , 0 + yInitial , 0 + xInitial , ( height + yInitial ) - qVCL );
         pRate += 20;
         
         RED += 16;
         GREEN += 16;
         BLUE += 16;
         
         if ( RED > 239 )
         {
         
            RED = 0;
            GREEN = 0;
            BLUE = 0;
         
         }
         
      }
//========================//    
    // Draw top-right //
//------------------------//
      
      xInitial = 10;
      yInitial = 10;
      pRate = 0;
      RED = 0;
      GREEN = 0;
      BLUE = 0;
      
      for (int qVCL = 0 ; qVCL <= 630 ; qVCL += 13 )
      {
      
         Color grayScale = new Color ( RED , GREEN , BLUE );
         
         g.setColor( grayScale );
      
         g.drawLine( xInitial + pRate , 0 + yInitial , width + xInitial , ( 0 + yInitial ) + qVCL );
         pRate += 20;
         
         RED += 16;
         GREEN += 16;
         BLUE += 16;
         
         if ( RED > 239 )
         {
         
            RED = 0;
            GREEN = 0;
            BLUE = 0;
         
         }
         
      }
      
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//

                            //Inner Rectangle//
//____________________________________________________________________//

      width = 980;
      height = 630;
      
      g.setColor( Color.black );
         
      g.drawRect( 252 , 168 , width / 2 , height / 2 );
      
              //bottom right//
//-------------------------------------------//

      xInitial = 252;
      yInitial = 168;
      pRate = 0;
      RED = 0;
      GREEN = 0;
      BLUE = 0;

      for (int qVCL = 0 ; qVCL <= (height / 2) - 20 ; qVCL += 6.5 )
      {
      
         Color grayScale = new Color ( RED , GREEN , BLUE );
         
         g.setColor( grayScale );
      
         g.drawLine( xInitial + pRate , height / 2 + yInitial , width / 2 + xInitial , ( height / 2 + yInitial ) - qVCL );
         pRate += 10;
         
         RED += 16;
         GREEN += 16;
         BLUE += 16;
         
         if ( RED > 239 )
         {
         
            RED = 0;
            GREEN = 0;
            BLUE = 0;
         
         }
         
       }
       
                 //bottom left//
//-----------------------------------------------//
       
      xInitial = 252;
      yInitial = 168;
      pRate = 0;
      RED = 0;
      GREEN = 0;
      BLUE = 0;
      
      for (int qVCL = 0 ; qVCL <= height / 2 ; qVCL += 6.5 )
      {
      
         Color grayScale = new Color ( RED , GREEN , BLUE );
         
         g.setColor( grayScale );
      
         g.drawLine( xInitial + pRate , height / 2 + yInitial , 0 + xInitial , ( 0 + yInitial ) + qVCL );
         pRate += 10;
         
         RED += 16;
         GREEN += 16;
         BLUE += 16;
         
         if ( RED > 239 )
         {
         
            RED = 0;
            GREEN = 0;
            BLUE = 0;
         
         }
         
      }
      
             //top left//
//-----------------------------------------//
         
      xInitial = 252;
      yInitial = 168;
      pRate = 0;
      pRate = 0;
      RED = 0;
      GREEN = 0;
      BLUE = 0;
      
      for (int qVCL = 0 ; qVCL <= height / 2 ; qVCL += 6.5 )
      {
      
         Color grayScale = new Color ( RED , GREEN , BLUE );
         
         g.setColor( grayScale );
      
         g.drawLine( xInitial + pRate , 0 + yInitial , 0 + xInitial , ( height / 2 + yInitial ) - qVCL );
         pRate += 10;
         
         RED += 16;
         GREEN += 16;
         BLUE += 16;
         
         if ( RED > 239 )
         {
         
            RED = 0;
            GREEN = 0;
            BLUE = 0;
         
         }
         
      }
      
             //top right//
//-----------------------------------------//
      
      xInitial = 252;
      yInitial = 168;
      pRate = 0;
      RED = 0;
      GREEN = 0;
      BLUE = 0;
      
      for (int qVCL = 0 ; qVCL <= ( height / 2 ) - 20 ; qVCL += 6.5 )
      {
      
         Color grayScale = new Color ( RED , GREEN , BLUE );
         
         g.setColor( grayScale );
      
         g.drawLine( xInitial + pRate , 0 + yInitial , width / 2 + xInitial , ( 0 + yInitial ) + qVCL );
         pRate += 10;
         
         RED += 16;
         GREEN += 16;
         BLUE += 16;
         
         if ( RED > 239 )
         {
         
            RED = 0;
            GREEN = 0;
            BLUE = 0;
         
         }
         
      }
         
      
//____________________________________________________________________//


      
	}
}