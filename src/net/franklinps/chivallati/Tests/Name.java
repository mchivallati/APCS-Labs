package net.franklinps.chivallati.Tests;

import net.franklinps.chivallati.Util;

import java.util.Scanner;

/**
 * Created by CompSci-04 on 12/5/2014.
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

		Scanner input = new Scanner ( System.in );

		System.out.print ( "Enter your first name:       " );
		String firstName = input.nextLine ();

		Util.skip ( 1 );

		System.out.print ( "Enter your middle initial:   " );
		char middleInitial = input.nextLine ().charAt ( 0 );

		Util.skip ( 1 );

		System.out.print ( "Enter your Last name:        " );
		String lastName = input.nextLine ();

		Name n = new Name ( firstName, middleInitial, lastName );

		Util.skip ( 2 );

		System.out.println ( "Your name is " + toString ( n ) );

	}

	public static String getFirstName () { return firstName; }

	public static char getMiddleInitial () { return middleInitial; }

	public static String getLastName () { return lastName; }

	public static String toString ( Name n )
	{

		return getFirstName () + " " + getMiddleInitial () + ". " + getLastName ();

	}

}