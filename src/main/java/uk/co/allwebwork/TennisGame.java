package uk.co.allwebwork;

public class TennisGame {

    private Player PlayerOne;
    private Player PlayerTwo;


    public TennisGame(Player playerOne, Player playerTwo) {
        PlayerOne = playerOne;
        PlayerTwo = playerTwo;
    }

    public String Score() {
        if (IsGameDraw()) {
            return GetDrawScore(PlayerOne.getScore());
        }
        if(IsAdvantageGame()){
            return GetAdvantageScore();
        }
        if(PlayerOneWon()){
            return PlayerOne.getName() + " Won";
        }
        if(PlayerTwoWon()){
            return PlayerTwo.getName() + " Won";
        }
        return GetAnyOtherTypeOfScore();

    }

    private String GetAnyOtherTypeOfScore() {
        String playerOneScore = getScoreStringForPlayer(PlayerOne.getScore());
        String playerTwoScore = getScoreStringForPlayer(PlayerTwo.getScore());
        return PlayerOne.getName() + " :" + playerOneScore + " " +
                PlayerTwo.getName() + " :" + playerTwoScore;
    }

    private String GetAdvantageScore() {
        if(PlayerOne.getScore()-PlayerTwo.getScore() > 0){
            return "Advantage " + PlayerOne.getName();
        } else if(PlayerTwo.getScore()- PlayerOne.getScore() > 0){
            return "Advantage " + PlayerTwo.getName();
        }
        return null;
    }

    public void PointScored(Player player) {
        player.setScore(player.getScore() + 1);
    }

    public String getScoreStringForPlayer(Integer score) {
        String scoreString;
        switch (score) {
            case 0:
                scoreString = "Love";
                break;
            case 1:
                scoreString = "Fifteen";
                break;
            case 2:
                scoreString = "Thirty";
                break;
            case 3:
                scoreString = "Fourty";
                break;
            default:
                scoreString = "Love";
                break;
        }
        return scoreString;
    }

    private Boolean IsGameDraw() {
        return PlayerOne.getScore() == PlayerTwo.getScore();
    }

    private Boolean IsAdvantageGame() {
        return PlayerOne.getScore() >= 3 & (PlayerTwo.getScore() >= 3) & (Math.abs(PlayerOne.getScore() - PlayerTwo.getScore()) > 0);
    }

    private Boolean PlayerOneWon(){
        return (PlayerOne.getScore()>3 || PlayerTwo.getScore()>3) & (PlayerOne.getScore() - PlayerTwo.getScore() >=2);
    }

    private Boolean PlayerTwoWon(){
        return (PlayerOne.getScore()>3 || PlayerTwo.getScore()>3) & (PlayerTwo.getScore() - PlayerOne.getScore() >=2);
    }

    private String GetDrawScore(Integer score) {
        String scoreString;
        switch (score) {
            case 0:
                scoreString = "Love All";
                break;
            case 1:
                scoreString = "Fifteen All";
                break;
            case 2:
                scoreString = "Thirty All";
                break;
            case 3:
                scoreString = "Deuce";
                break;
            default:
                scoreString = "Love all";
                break;
        }
        return scoreString;

    }


}
