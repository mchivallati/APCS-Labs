// TextLab04vst.java
// The "Palindrome" Program
// This is the student starting file.

import java.util.Scanner;


public class TextLab04v100Chivallati
{

	public static void main( String args[] )
	{

		System.out.println( "\nTextLab04v100\n" );
		Scanner input = new Scanner( System.in );
		boolean notFinished;

		do {
			System.out.print( "Enter a string  ===>>  " );
			String str = input.nextLine( );

			System.out.println();

			System.out.println( "Entered String:        " + str );
			System.out.println( "Palindrome:            " + Palindrome.isPal( str ) );
			System.out.println( "Almost Palindrome:     " + Palindrome.almostPal( str ) );
			System.out.print( "Do you wish to repeat this program [Y/N]?  ===>>  " );
			String repeat = input.nextLine( );
			notFinished = ( repeat.equals( "Y" ) ) || ( repeat.equals( "y" ) );

			System.out.println();

		}
		while ( notFinished );
	}

}


class Palindrome
{

	/*
	 * Precondition:  s is an arbitrary String.
	 * Postcondition: The value of true is returned if s is a Palindrome, false otherwise.
	 * Note:          >>>>> This method is required for both the 80 point and the 100 point versions  <<<<<
	 */
	public static boolean isPal( String s )
	{


		return revString( s ).equals( s );


	}

	/*
	 * Precondition:  s is a String of one character.
	 * Postcondition: The value of true is returned if s is a letter and false otherwise.
	 * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
	 */
	private static boolean isLetter( String letter )
	{

		char c = letter.charAt( 0 );

		if ( c >= 65 && c <= 90 )
			return true;

	}

	/*
	 * Precondition:  s is an arbitrary String.
	 * Postcondition: All non-letter characters are removed from s, and this "purged" String is returned.
	 * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
	 */
	private static String purge( String s )
	{



			for ( int i = 0 ; i < (s.length() - 1) ; i++ ) {

				String c = s.substring( i , i + 1 );


				if ( !isLetter( c ) ) {

					s -= c;

				}

			}



	}

	/*
	 * Precondition:  s is an arbitrary String.
	 * Postcondition: After purging all non-letter characters from s,
	 *                the value of true is returned if the resulting String is a Palindrome, false otherwise.
	 * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
	 */
	public static boolean almostPal( String s )
	{

		if ( revString( s ).equals( s ) ) { return false; }

		return revString( purge( s ) ).equalsIgnoreCase( purge( s ) );

	}

	public static String revString( String s )                                                //method that reverses any string
	{

		int limit = s.length( );                                                                //variable will be used as the limiter for the fixed loop. this is universal for all entered strings because it uses .length()
		String reverse = "";                                                                //initializes the string that will become the reversed version of the original passed from the actual param
		int x = limit - 1;                                                                    //almost the same as the limit except it must be subtracted by 1 for use in the .substring method. without the -1 java will throw a bounds exception

		for ( int i = 0 ; i < limit ; i++ )                                                    //starts the for loop that go for only as many times as the length of the passed string
		{

			reverse += s.substring( x, x + 1 );                                            //adds on the characters of the passed string in reversed order to the precondition string that was made outside of the fixed loop. x + 1 is essential so the correct substring is chosen
			x--;                                                                            //subtracts x by 1 so the substring instance travels one character towards the beginning of the original string. Writes the new string from end to start of the original string.

		}

		return reverse;                                                                        //returns the reversed string

	}


}