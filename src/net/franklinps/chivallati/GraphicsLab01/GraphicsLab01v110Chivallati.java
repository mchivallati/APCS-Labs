// Matthew Chivallati
// GraphicsLab01st.java
// The AWT Graphics Program
// This is the student, starting version of Graphics Lab 01.


import java.awt.*;
import java.applet.*;


public class GraphicsLab01v110Chivallati extends Applet
{

	public void paint(Graphics g)
	{
   
      // Color Variable
         
         double Red = (double) Math.random() * 256;
         double Green = (double) Math.random() * 256;
         double Blue = (double) Math.random() * 256;
         
         int R = (int) Red;
         int G = (int) Green;
         int B = (int) Blue;
         
            Color randomColor = new Color ( R , G , B ); //random color
            
         // System.out.print( "\tR: " + R + "\tG: " + G + "\tB: " + B );
   
   
   
   
		// DRAW CUBE
      //g.setColor( cubeFace );
      g.setColor( randomColor ); // back and front face color
      
         g.drawRect( 550 , 75 , 200 , 200 ); // the back face
         g.drawRect( 650 , 125 , 200 , 200 ); // the bottom face
         
         
         // Color Variable
         double Red2 = (double) Math.random() * 256;
         double Green2 = (double) Math.random() * 256;
         double Blue2 = (double) Math.random() * 256;
         
         int R2 = (int) Red2;
         int G2 = (int) Green2;
         int B2 = (int) Blue2;
         
            Color randomColor2 = new Color ( R2 , G2 , B2 ); //random color

           g.setColor( randomColor2 ); // connecting line colors
        
            g.drawLine( 550 , 75 , 650 , 125 ); // line from top left to top left
            g.drawLine( 750 , 75 , 850 , 125 ); // line from top right to top right
            g.drawLine( 550 , 275 , 650 , 325 ); // line from bottom left to bottom left
            g.drawLine( 750 , 275 , 850 , 325 ); // line from bottom right to bottom right


		// DRAW SPHERE
      
      
      
         // Color Variable
         double Red3 = (double) Math.random() * 256;
         double Green3 = (double) Math.random() * 256;
         double Blue3 = (double) Math.random() * 256;
         
         int R3 = (int) Red3;
         int G3 = (int) Green3;
         int B3 = (int) Blue3;
         
            Color randomColor3 = new Color ( R3 , G3 , B3 ); //random color
      
      
      
      
      g.setColor( randomColor3 ); // outer circle color
    
         g.drawOval( 600 , 100 , 200 , 200 ); // original outside cirle
         
            // horizontal ovals
            
            
            
            
         // Color Variable
         double Red4 = (double) Math.random() * 256;
         double Green4 = (double) Math.random() * 256;
         double Blue4 = (double) Math.random() * 256;
         
         int R4 = (int) Red4;
         int G4 = (int) Green4;
         int B4 = (int) Blue4;
         
            Color randomColor4 = new Color ( R4 , G4 , B4 ); //random color
            
            
            
            g.setColor( randomColor4 );
         
               g.drawOval( 600 , 125 , 200 , 150 );
               g.drawOval( 600 , 150 , 200 , 100 );
               g.drawOval( 600 , 175 , 200 , 50 );
               
            // vertical ovals
            
               g.drawOval( 625 , 100 , 150 , 200 );
               g.drawOval( 650 , 100 , 100 , 200 );
               g.drawOval( 675 , 100 , 50 , 200 );
      
      
		// DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
      
         // Color Variable
         double Red5 = (double) Math.random() * 256;
         double Green5 = (double) Math.random() * 256;
         double Blue5 = (double) Math.random() * 256;
         
         int R5 = (int) Red5;
         int G5 = (int) Green5;
         int B5 = (int) Blue5;
         
            Color randomColor5 = new Color ( R5 , G5 , B5 ); //random color
      
      
      g.setColor( randomColor5 );
	
      		g.drawOval( 300 , 150 ,150 , 150); // circumscribed circle
            
      
         // Color Variable
         double Red6 = (double) Math.random() * 256;
         double Green6 = (double) Math.random() * 256;
         double Blue6 = (double) Math.random() * 256;
         
         int R6 = (int) Red6;
         int G6 = (int) Green6;
         int B6 = (int) Blue6;
         
            Color randomColor6 = new Color ( R6 , G6 , B6 ); //random color
      
      
      g.setColor( randomColor6 );
      
      		g.drawLine( 300 , 235 ,425 , 170); // triangle
      		g.drawLine( 300 , 235 ,375 , 300);
      		g.drawLine( 375 , 300 ,425 , 170);
            
         // Color Variable
         double Red7 = (double) Math.random() * 256;
         double Green7 = (double) Math.random() * 256;
         double Blue7 = (double) Math.random() * 256;
         
         int R7 = (int) Red7;
         int G7 = (int) Green7;
         int B7 = (int) Blue7;
         
            Color randomColor7 = new Color ( R7 , G7 , B7 ); //random color
      
      
      g.setColor( randomColor7 );
            
      		g.drawOval( 326 , 208 ,68 , 67); // inscribed circle
            

	// DRAW APCS
      
         // A
         g.setColor( Color.red );
         
            g.fillRect( 100 , 400 , 20 , 100 );
            g.fillRect( 100 , 400 , 60 , 20 );
            g.fillRect( 100 , 440 , 60 , 20 );
            g.fillRect( 140 , 400 , 20 , 100 );
         
         // P
         g.setColor( Color.orange );
         
            g.fillRect( 180 , 400 , 20 , 100 );
            g.fillRect( 180 , 400 , 60 , 20 );
            g.fillRect( 180 , 440 , 60 , 20 );
            g.fillRect( 220 , 400 , 20 , 60 );
         
         // C
         g.setColor( Color.yellow );
         
            g.fillRect( 260 , 400 , 20 , 100 );
            g.fillRect( 260 , 400 , 60 , 20 );
            g.fillRect( 260 , 480 , 60 , 20 );
         
         // S
         g.setColor( Color.green );
         
            g.fillRect( 340 , 400 , 60 , 20 );
            g.fillRect( 340 , 400 , 20 , 60 );
            g.fillRect( 340 , 440 , 60 , 20 );
            g.fillRect( 380 , 440 , 20 , 60 );
            g.fillRect( 340 , 480 , 60 , 20 );
         



		// DRAW PACMEN FLOWER
      
         // Color Variable
         double Red8 = (double) Math.random() * 256;
         double Green8 = (double) Math.random() * 256;
         double Blue8 = (double) Math.random() * 256;
         
         int R8 = (int) Red8;
         int G8 = (int) Green8;
         int B8 = (int) Blue8;
         
            Color randomColor8 = new Color ( R8 , G8 , B8 ); //random color
      
      g.setColor( randomColor8 );
      
         g.fillArc( 633 , 450 , 50 , 50 , 45 , 270 );  // right
         
         
         // Color Variable
         double Red9 = (double) Math.random() * 256;
         double Green9 = (double) Math.random() * 256;
         double Blue9 = (double) Math.random() * 256;
         
         int R9 = (int) Red9;
         int G9 = (int) Green9;
         int B9 = (int) Blue9;
         
            Color randomColor9 = new Color ( R9 , G9 , B9 ); //random color
         
      g.setColor( randomColor9 );
      
         g.fillArc( 600 , 417 , 50 , 50 , 135 , 270 ); // top
         
         
         // Color Variable
         double Red10 = (double) Math.random() * 256;
         double Green10 = (double) Math.random() * 256;
         double Blue10 = (double) Math.random() * 256;
         
         int R10 = (int) Red10;
         int G10 = (int) Green10;
         int B10 = (int) Blue10;
         
            Color randomColor10 = new Color ( R10 , G10 , B10 ); //random color
         
      g.setColor( randomColor10 );
      
         g.fillArc( 567 , 450 , 50 , 50 , 225 , 270 ); // left
         
         
         // Color Variable
         double Red11 = (double) Math.random() * 256;
         double Green11 = (double) Math.random() * 256;
         double Blue11 = (double) Math.random() * 256;
         
         int R11 = (int) Red11;
         int G11 = (int) Green11;
         int B11 = (int) Blue11;
         
            Color randomColor11 = new Color ( R11 , G11 , B11 ); //random color
         
      g.setColor( randomColor11 );
      
         g.fillArc( 600 , 483 , 50 , 50 , 315 , 270 ); // bottom


	}

}