package net.franklinps.chivallati.TextLab05;

public class Rational
{

    private static int num , den , gcf;

    public Rational( int n , int d )
    {

        num = n;
        den = d;

    }

   public static int getDen()
    {

        return den;

    }

    public static int getNum()
    {

        return num;

    }

    public static String getOriginal()
    {

        return String.valueOf( num ) + "/" + String.valueOf( den );

    }

    public static double getDecimal()
    {

        return (double)num / (double)den;

    }

    public static String getReduced()
    {

        getGCF( num , den );

        return String.valueOf( num / gcf ) + "/" + String.valueOf( den / gcf );

    }

    private static void getGCF ( int n1, int n2 )
    {
        int rem = 0;
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
        System.out.println(getOriginal() + " equals " + getDecimal());
        System.out.println();
        System.out.println("and reduces to " + getReduced());
        System.out.println();
    }
}