package net.franklinps.chivallati.TextLab03;//Matthew Chivallati
// TextLab03st.java
// The Mortage Payment Program
// This the student, starting version of the TextLab03 assignment.


public class TextLab03v90Chivallati
{
    public static void main ( String args[] )
    {
        System.out.println ( "TextLab03, Student Version\n" );

        double downPayment = 0;
        double houseCost = 259000;
        double principal = houseCost - downPayment;                   // Principal Rate
        double annualRate = .0575;                    // Annual Intrest
        double numYears = 30;                       // Number of Years
        double monthlyRate = annualRate / 12; // Monthly Intrest
        double numMonths = numYears * 12;            // Number of Months in the Payment Period

        double monthlyPayment = (

                monthlyRate * Math.pow ( ( 1 + monthlyRate ), numMonths ) //numerator

        )

                /                                                        //division line

                (

                        Math.pow ( ( 1 + monthlyRate ), numMonths ) - 1           //denomonator

                ) * principal;                                                 // coeficient

        double totalPayment = ( Math.round ( monthlyPayment * 100.0 ) / 100.0 ) * numMonths;
        double totalIntrest = totalPayment - principal;


        System.out.println ( "Principal:       $" + principal );
        System.out.println ( "Anual Rate:       " + annualRate * 100 + "%" );
        System.out.println ( "Number of Years:  " + numYears );
        System.out.println ( "Monthly Payment: $" + Math.round ( monthlyPayment * 100.0 ) / 100.0 );
        System.out.println ( "Total Payment:   $" + totalPayment );
        System.out.println ( "Total Intrest:   $" + totalIntrest );
    }
}