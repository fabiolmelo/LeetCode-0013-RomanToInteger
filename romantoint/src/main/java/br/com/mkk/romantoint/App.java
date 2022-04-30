package br.com.mkk.romantoint;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        long start = System.currentTimeMillis();
        int result = RomanToInt.romanToIntUsingMap("MMMMMMMMMMMMMMMMMMMMMMDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVII");
        long elapsed = System.currentTimeMillis()-start;
        System.out.println( "Roman to Int Using HashMap - Result: " + result + " Time: "+ elapsed + " ms.");
    }
}
