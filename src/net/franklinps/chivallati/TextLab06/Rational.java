package net.franklinps.chivallati.TextLab06;

public class Rational
{

	private int firstNum, firstDen, reducedNum, reducedDen, gcf;

	public Rational ( int n, int d )
	{

		firstNum = n;
		firstDen = d;

	}

	public Rational ()
	{

		firstNum = 0;
		firstDen = 1;

	}

	public int getDen ()
	{

		return firstDen;

	}

	public int getNum ()
	{

		return firstNum;

	}

	public String getOriginal ()
	{

		return String.valueOf ( firstNum ) + "/" + String.valueOf ( firstDen );

	}

	public double getDecimal ()
	{

		return (double) firstNum / firstDen;

	}

	public String getReduced ()
	{

		getGCF ( firstNum, firstDen );

		return String.valueOf ( firstNum / gcf ) + "/" + String.valueOf ( firstDen / gcf );

	}

	public void multiply ( Rational r1, Rational r2 )
	{
		this.firstNum = r1.firstNum * r2.firstNum;
		this.firstDen = r1.getDen () * r2.firstDen;

	}

	public void divide ( Rational r1, Rational r2 )
	{

		this.firstNum = r1.firstNum * r2.firstDen;
		this.firstDen = r1.firstDen * r2.firstNum;

	}

	public void add ( Rational r1, Rational r2 )
	{

		this.firstNum = ( r1.firstNum * r2.firstDen ) + ( r2.firstNum * r1.firstDen );
		this.firstDen = r1.firstDen * r2.firstDen;

	}

	public void subtract ( Rational r1, Rational r2 )
	{

		this.firstNum = ( r1.firstNum * r2.firstDen ) - ( r2.firstNum * r1.firstDen );
		this.firstDen = r1.firstDen * r2.firstDen;

	}

	private void getGCF ( int n1, int n2 )
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

	public void displayData ()
	{
		System.out.println ();
		System.out.println ( getOriginal () + " equals " + getDecimal () );
		System.out.println ();
		System.out.println ( "and reduces to " + getReduced () );
		System.out.println ();
	}
}