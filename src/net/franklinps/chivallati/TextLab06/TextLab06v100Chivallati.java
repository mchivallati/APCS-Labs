package net.franklinps.chivallati.TextLab06;

import java.util.Scanner;

/*

⊂_ヽ I'M
　 ＼＼ ＿
　　 ＼(　•_•) F
　　　 <　⌒ヽ A
　　　/ 　 へ＼ B
　　 /　　/　＼＼ U
　　 ﾚ　ノ　　 ヽ_つ L
　　/　/ O
　 /　/| U
　(　(ヽ S
　|　|、＼
　| 丿 ＼ ⌒)
　| |　　) /
`ノ )　　Lﾉ
(_／﻿

 */


public class TextLab06v100Chivallati
{
	static int num1, den1;   // numerator and denominator of the 1st rational number
	static int num2, den2;   // numerator and denominator of the 2nd rational number

	public static void main( String args[] )
	{
		enterData();

		Rational r1 = new Rational( num1, den1 );
		Rational r2 = new Rational( num2, den2 );
		Rational r3 = new Rational();

		r3.multiply( r1, r2 );
		System.out.println( "\n\n" + r1.getOriginal() + " * " + r2.getOriginal() + "  =  " + r3.getReduced() );
		r3.divide( r1, r2 );
		System.out.println( "\n" + r1.getOriginal() + " / " + r2.getOriginal() + "  =  " + r3.getReduced() );

//      100 Point Version Only

		r3.add( r1, r2 );
		System.out.println( "\n" + r1.getOriginal() + " + " + r2.getOriginal() + "  =  " + r3.getReduced() );
		r3.subtract( r1, r2 );
		System.out.println( "\n" + r1.getOriginal() + " - " + r2.getOriginal() + "  =  " + r3.getReduced() );
		System.out.println();
	}


	public static void enterData()
	{
		Scanner input = new Scanner( System.in );
		System.out.print( "\nEnter the 1st numerator ----> " );
		num1 = input.nextInt();
		System.out.print( "\nEnter the 1st denominator --> " );
		den1 = input.nextInt();
		System.out.print( "\nEnter the 2nd numerator ----> " );
		num2 = input.nextInt();
		System.out.print( "\nEnter the 2nd denominator --> " );

		den2 = input.nextInt();
	}
}