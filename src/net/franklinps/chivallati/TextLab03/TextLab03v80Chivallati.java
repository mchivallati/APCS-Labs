package net.franklinps.chivallati.TextLab03;//Matthew Chivallati
// TextLab03st.java
// The Mortage Payment Program
// This the student, starting version of the TextLab03 assignment.


public class TextLab03v80Chivallati
{
	public static void main(String args[])
	{
		System.out.println("TextLab03, Student Version\n");

		double principal      = 259000;                   // Principal Rate
		double annualRate     = .0575;                    // Annual Intrest
		double numYears       = 30;                       // Number of Years
        double monthlyRate = annualRate / 12;            // Monthly Intrest
        double numMonths = numYears * 12;              // Number of Months in the Payment Period
        double monthlyPayment =                             // Equation for the Monthly Payment
                                 (
                                    ( 
                                  
                                       monthlyRate * Math.pow( (1 +  monthlyRate) , numMonths ) //numerator
                                    
                                    ) 
                                   
                                       /                           //division line
                                    
                                    ( 
                                   
                                       Math.pow( (1 +  monthlyRate) , numMonths ) - 1 //denomonator
                                    
                                    ) 
                                   
                                 ) * principal; // coeficient 



		System.out.println("Principal:       $" + principal);
      System.out.println("Anual Rate:       " + annualRate*100 + "%");
      System.out.println("Number of Years:  " + numYears);
      System.out.println("Monthly Payment: $" + monthlyPayment);
	}
}