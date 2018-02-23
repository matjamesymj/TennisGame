package uk.co.allwebwork;

import junit.framework.TestCase;

public class TennisGameTest extends TestCase {


    public void testDrawScoreLoveAll() throws Exception {
        Player mathew_james = new Player("Mathew James");
        Player laura_james = new Player("Laura James");
        TennisGame tennisGame = new TennisGame(mathew_james, laura_james);
        assertTrue(tennisGame.Score().equals("Love All"));
    }

    public void testDrawScoreFifteenAll() throws Exception {
        Player mathew_james = new Player("Mathew James");
        Player laura_james = new Player("Laura James");
        TennisGame tennisGame = new TennisGame(mathew_james, laura_james);
        tennisGame.PointScored(mathew_james);
        tennisGame.PointScored(laura_james);
        assertTrue(tennisGame.Score().equals("Fifteen All"));
    }
    public void testDrawScoreThirtyAll() throws Exception {
        Player mathew_james = new Player("Mathew James");
        Player laura_james = new Player("Laura James");
        TennisGame tennisGame = new TennisGame(mathew_james, laura_james);
        tennisGame.PointScored(mathew_james);
        tennisGame.PointScored(laura_james);
        tennisGame.PointScored(mathew_james);
        tennisGame.PointScored(laura_james);
        assertTrue(tennisGame.Score().equals("Thirty All"));

    }

    public void testDrawScoreDeuce() throws Exception {
        Player mathew_james = new Player("Mathew James");
        Player laura_james = new Player("Laura James");
        TennisGame tennisGame = new TennisGame(mathew_james, laura_james);
        tennisGame.PointScored(mathew_james);
        tennisGame.PointScored(laura_james);
        tennisGame.PointScored(mathew_james);
        tennisGame.PointScored(laura_james);
        tennisGame.PointScored(mathew_james);
        tennisGame.PointScored(laura_james);
        assertTrue(tennisGame.Score().equals("Deuce"));

    }
    public void testAdvantageScorePlayerOne() throws Exception {
        Player mathew_james = new Player("Mathew James");
        Player laura_james = new Player("Laura James");
        TennisGame tennisGame = new TennisGame(mathew_james, laura_james);
        tennisGame.PointScored(mathew_james);
        tennisGame.PointScored(laura_james);
        tennisGame.PointScored(mathew_james);
        tennisGame.PointScored(laura_james);
        tennisGame.PointScored(mathew_james);
        tennisGame.PointScored(laura_james);
        tennisGame.PointScored(mathew_james);
        assertTrue(tennisGame.Score().equals("Advantage Mathew James"));

    }

    public void testAdvantageScorePlayerTwo() throws Exception {
        Player mathew_james = new Player("Mathew James");
        Player laura_james = new Player("Laura James");
        TennisGame tennisGame = new TennisGame(mathew_james, laura_james);
        tennisGame.PointScored(mathew_james);
        tennisGame.PointScored(laura_james);
        tennisGame.PointScored(mathew_james);
        tennisGame.PointScored(laura_james);
        tennisGame.PointScored(mathew_james);
        tennisGame.PointScored(laura_james);
        tennisGame.PointScored(laura_james);
        assertTrue(tennisGame.Score().equals("Advantage Laura James"));

    }

    public void testWinPlayerOne() throws Exception {
        Player mathew_james = new Player("Mathew James");
        Player laura_james = new Player("Laura James");
        TennisGame tennisGame = new TennisGame(mathew_james, laura_james);
        tennisGame.PointScored(mathew_james);
        tennisGame.PointScored(mathew_james);
        tennisGame.PointScored(mathew_james);
        tennisGame.PointScored(mathew_james);
        assertTrue(tennisGame.Score().equals("Mathew James Won"));

    }
    public void testWinPlayerTwo() throws Exception {
        Player mathew_james = new Player("Mathew James");
        Player laura_james = new Player("Laura James");
        TennisGame tennisGame = new TennisGame(mathew_james, laura_james);
        tennisGame.PointScored(laura_james);
        tennisGame.PointScored(laura_james);
        tennisGame.PointScored(laura_james);
        tennisGame.PointScored(laura_james);
        assertTrue(tennisGame.Score().equals("Laura James Won"));

    }


}