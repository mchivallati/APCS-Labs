package net.franklinps.chivallati.TextLab04;

import java.util.Scanner;

import net.franklinps.chivallati.Util;


public class TextLab04Runner
{

	public static void main( String args[] )
	{

		System.out.println( "\nTextLab04v80\n" );
		Scanner input = new Scanner( System.in );
		boolean notFinished;

		do {
			System.out.print( "Enter a string  ===>>  " );
			String str = input.nextLine( );

			Util.skip( 1 );

			System.out.println( "Entered String:        " + str );
			System.out.println( "Palindrome:            " + Palindrome.isPal( str ) );
			System.out.println( "Almost Palindrome:     " + Palindrome.almostPal( str ) );
			System.out.print( "Do you wish to repeat this program [Y/N]?  ===>>  " );
			String repeat = input.nextLine( );
			notFinished = ( repeat.equals( "Y" ) ) || ( repeat.equals( "y" ) );

			Util.skip( 1 );

		}
		while ( notFinished );
	}

}