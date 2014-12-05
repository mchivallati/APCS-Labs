package net.franklinps.chivallati.Tests;

/**
 * Created by CompSci-04 on 12/5/2014.
 * <p/>
 * <p/>
 * ⊂_ヽ I'M
 * 　 ＼＼ ＿
 * 　　 ＼(　•_•) F
 * 　　　 <　⌒ヽ A
 * 　　　/ 　 へ＼ B
 * 　　 /　　/　＼＼ U
 * 　　 ﾚ　ノ　　 ヽ_つ L
 * 　　/　/ O
 * 　 /　/| U
 * 　(　(ヽ S
 * 　|　|、＼
 * 　| 丿 ＼ ⌒)
 * 　| |　　) /
 * `ノ )　　Lﾉ
 * (_／﻿
 */

public class Name
{

	private static String firstName;
	private static char middleInitial;
	private static String lastName;

	public Name ( String firstName, char middleInitial, String lastName )
	{

		Name.firstName = firstName;
		Name.middleInitial = middleInitial;
		Name.lastName = lastName;

	}

	public static void main ( String[] args )
	{

		Name n = new Name ( "Matthew", 'E', "Chivallati" );

		System.out.println ( toString ( n ) );

	}

	public static String getFirstName () { return firstName; }

	public static char getMiddleInitial () { return middleInitial; }

	public static String getLastName () { return lastName; }

	public static String toString ( Name n )
	{

		return getFirstName () + " " + getMiddleInitial () + ". " + getLastName ();

	}

}
