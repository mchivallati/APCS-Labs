package net.franklinps.chivallati.LabsForSubmission;

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

class Rational
{

	private int firstNum, firstDen, gcf;

	public Rational( int n, int d )
	{

		firstNum = n;
		firstDen = d;

	}

	public Rational()
	{

		firstNum = 0;
		firstDen = 1;

	}

	public int getDen() { return firstDen; }

	public int getNum() { return firstNum; }

	public String getOriginal()
	{

		return String.valueOf( firstNum ) + "/" + String.valueOf( firstDen );

	}

	public double getDecimal()
	{

		return (double) firstNum / firstDen;

	}

	public String getReduced()
	{

		getGCF( firstNum, firstDen );

		return String.valueOf( firstNum / gcf ) + "/" + String.valueOf( firstDen / gcf );

	}

	public void multiply( Rational r1, Rational r2 )
	{
		this.firstNum = r1.firstNum * r2.firstNum;
		this.firstDen = r1.getDen() * r2.firstDen;

	}

	public void divide( Rational r1, Rational r2 )
	{

		this.firstNum = r1.firstNum * r2.firstDen;
		this.firstDen = r1.firstDen * r2.firstNum;

	}

	public void add( Rational r1, Rational r2 )
	{

		this.firstNum = ( r1.firstNum * r2.firstDen ) + ( r2.firstNum * r1.firstDen );
		this.firstDen = r1.firstDen * r2.firstDen;

	}

	public void subtract( Rational r1, Rational r2 )
	{

		this.firstNum = ( r1.firstNum * r2.firstDen ) - ( r2.firstNum * r1.firstDen );
		this.firstDen = r1.firstDen * r2.firstDen;

	}

	private void getGCF( int n1, int n2 )
	{
		int rem;
		do {
			rem = n1 % n2;
			if ( rem == 0 ) {
				gcf = n2;
			} else {
				n1 = n2;
				n2 = rem;
			}
		}
		while ( rem != 0 );
	}

	public void displayData()
	{
		System.out.println();
		System.out.println( getOriginal() + " equals " + getDecimal() );
		System.out.println();
		System.out.println( "and reduces to " + getReduced() );
		System.out.println();
	}
}