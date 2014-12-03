package net.franklinps.chivallati.TextLab02;// TextLab02st.java
// Student starting version of the TextLab02 assignment.
// Resave this program as TextLab02v80 for the 80 point version.
// Resave this program as TextLab02v100 for the 100 point version.


public class TextLab02v80
{
	public static void main(String args[])
	{
      int StartingSeconds; // variable for the starting seconds
      int remainder; //variable for the remainder
      int hours; // variable for the hours
      int minutes; // varibale for the minutes
      int seconds; // variable for the seconds
            
         StartingSeconds = 10000;
      
         remainder = StartingSeconds % 3600;
      
         hours = StartingSeconds / 3600;
      
         minutes = remainder / 60;
      
         seconds = remainder % 60;
      
            
		System.out.println("TextLab02, 80 Point Version\n");
	   
      System.out.println("Starting seconds: \t" + StartingSeconds);
      //System.out.println("Remainder:" + remainder);
      System.out.println("Hours: \t \t \t" + hours);
      System.out.println("Minutes: \t \t" + minutes);
      System.out.println("Seconds: \t \t" + seconds);
	}
	

}