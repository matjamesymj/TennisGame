package uk.co.allwebwork;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Player mathew_james = new Player("Mathew James");
        Player laura_james = new Player("Laura James");
        TennisGame tennisGame = new TennisGame(mathew_james, laura_james);
        tennisGame.PointScored(mathew_james);
        System.out.println( tennisGame.Score());
    }
}
