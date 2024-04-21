package TicTacToe_TC.Controller;

import TicTacToe_TC.Models.Board;
import TicTacToe_TC.Models.Game;
import TicTacToe_TC.Models.Player;
import TicTacToe_TC.Strategy.WinningStrategy;

import java.util.List;

public class GameController {

   // private Game game;
        public Game startGame(int size, List<Player> players, List<WinningStrategy> strategies){
                // valoidate, create obj, set status
            Game  game = Game.getInstance()
                      .setSize(size)
                      .setPlayers(players)
                      .setWinningStrategies(strategies)
                      .build();
            return game;
    }
    public void displayBoard(Game game){
            // displaying board
                game.getBoard().printBoard();
    }

    public void makeMove(Game game){

            game.makeMove();

    }

    public void undoMove(Game g){
            g.undo();
    }

//    public Game getGame() {
//        return game;
//    }
//
//    public void setGame(Game game) {
//        this.game = game;
//    }
    //1. should start game --create game object
            //1.1 select size and board
             // add players
             // select symbol
    //2.game im progress
            // display board
            //make move
            // next player
    //3 based on game state we will display
        // Draw : show board
        //win : show player
    //4 undo
}
