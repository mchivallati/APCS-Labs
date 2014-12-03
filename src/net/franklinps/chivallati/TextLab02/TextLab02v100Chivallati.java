// TextLab02st.java
// Student starting version of the TextLab02 assignment.
// Resave this program as TextLab02v80 for the 80 point version.
// Resave this program as TextLab02v100 for the 100 point version.


public class TextLab02v100Chivallati
{
	public static void main(String[] args)
	{
      int startingMiliSeconds = 10000123; // variable for the StartingSeconds
      
      int remainder = startingMiliSeconds % 3600000; // this is the equation used to get the 'remainder' variable
      
      int hours = startingMiliSeconds / 3600000; // this is the equation use to get the 'hours' variable
      
      int minutes = remainder / 60000; // this is the equation usde to get the 'minutes' variable
      
      int seconds = (remainder % 60000) / 1000; //equation to used to get the 'seconds' variable
      
      int miliSeconds = startingMiliSeconds % 1000000; // this is the equation use to get the 'MiliSeconds' variable
      
            
            
		System.out.println("TextLab02, 100 Point Version\n");
      
	   
      System.out.println("Starting Mili Seconds: \t" + startingMiliSeconds); // output for the 'SartingMiliSeconds' equation
      
      //System.out.println("Remainder:" + remainder); // output for the 'remainder' equation [NOTE: THIS WAS NOT NECESSARY FOR THE OUTPUT IT IS JUST FOR ORGANIZATION]
      
      System.out.println("Hours: \t \t \t" + hours); // output for the 'housr' equation
      
      System.out.println("Minutes: \t \t" + minutes); // output for the 'minutes' equation
      
      System.out.println("Seconds: \t \t" + seconds); // output for the 'seconds' equation
      
      System.out.println("Mili Seconds: \t \t" + miliSeconds); // output for the 'MiliSeconds' equation
	}
	

}