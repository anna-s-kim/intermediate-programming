package Game;
import java.io.File;

public interface Game {

    //Data stuctures/setup
    //Need some sort od ata structure to store game classes globally, 
    //so a helper function like getScore() can access it 

    //Function Prototypes

    String getGameName(String highScore);

    //BuzzFeed (gameIntro()), JavaInterview, NumberGuessGame,and SuperStore contain (main *() - 
    //each of these has to contain a shared function across of them that allows them to be plaued
    //ex. .startGame() function

    void play(); // must be able to play a game

    //Pass the game name into this function to call play()

    String getScore(); // get a score - if there is no "score" you can return return "N/A" or something.

    void writeHighScore(File f); // writes the high score of this game to a file.

    //Function Code

    //important: identitfying the function that actually starts the game up and 
    //there will be different names for eacth type of game
        def play (String gameName) {
            if gameName == BuzzFeedQuiz {
                newGame = new BuzzFeedQuiz();
                newGame = new BuzzFeedQuiz();
                newGame.gameIntro();
            }

            if game Name ==ineterview, guess, store;
            Create newGame;
            call main ();
        }
            // Maybe this needs to be renamed to "getResult"
            // 2 games are win/lose
            // Interview game doesn't have win/lose or a score. result is ambiguous
            // Quiz game tells you about yourself. result is also ambiguous. not a score or win/lose
            getScore(String gameName) {
                if (gameName == JavaInterview) {
            // Need to tell if the player answered all interview questions. if so, they get 100. if not, a 0
            // To do this,  need an instance of this javaInterview class, and extract a result from it once the player's finished.
            // problem: Don't have an instance of the class to get the result of the interview from. we need some sort of a global instance
            if (gameName == BuzzFeedQuiz) {
            //get a character
            }

            if (gameGame == SuperScore) {
            //have to sepnd all of the money to win
            }


            if (gameName == NumberGuessGame){
            // win if guess within limit, otherwise lose
            }

        // need java.io.File import
        // File f is already a file descriptor, no need to open() a new file
        // goal is to overwrite the high score in the file, not append or create new file
         void writeHighScore(File f) {
         FileWriter mywriter = new FileWriter(f);
         String result = getScore();
         mywriter.write("This is your sesult" + result)
         mywriter.close()
}



