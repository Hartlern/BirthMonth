import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        System.out.println( "What is your birth month[1-12]?" );
        int birthMonth;
        String trash;


        if( scan.hasNextInt() )
        {
            birthMonth = scan.nextInt();
            if( birthMonth >= 1 && birthMonth <= 12 )
            {
                System.out.println( "Your birth month is: " + birthMonth );
            }
            else
            {
                System.out.println( "You entered an incorrect month value: " + birthMonth );
            }
        }
        else
        {
            trash = scan.nextLine();
            System.out.println( "\nYou said your birth month was " + trash );
            System.out.println( "Run the program again" );
        }
    }
}