package net.franklinps.chivallati.TextLab05;

import java.util.Scanner;


public class TextLab05v100Chivallati
{
    static int num, den;   // numerator and denominator of the rational number

    public static void main (String args[])
    {
        enterData();
        Rational r = new Rational(num,den);
        r.displayData();
    }

    public static void enterData()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the numerator ----> ");
        num = input.nextInt();
        System.out.print("\nEnter the denominator --> ");
        den = input.nextInt();
    }
}
