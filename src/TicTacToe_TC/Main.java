package TicTacToe_TC;

import TicTacToe_TC.Controller.GameController;
import TicTacToe_TC.Models.*;
import TicTacToe_TC.Strategy.ColumnStrategy;
import TicTacToe_TC.Strategy.DiagonalStartegy;
import TicTacToe_TC.Strategy.RowStartegy;
import TicTacToe_TC.Strategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        GameController gc = new GameController();
        Scanner sc = new Scanner(System.in);

        try {

            int size = 3;
            List<Player> P = new ArrayList<>();
            P.add(new Player(1,"Soumya", PLAYER_TYPE.HUMAN,new Symbol( 'x')));
            P.add(new Bot(2,"Bot",new Symbol( 'o'),BOT_DIFFICULTY.EASY));

            List<WinningStrategy> w = new ArrayList<>();
            w.add(new RowStartegy());
            w.add(new ColumnStrategy());
            w.add(new DiagonalStartegy());
            Game g= gc.startGame(size, P,w);
            gc.displayBoard(g);
            while(g.getGame_status().equals(GAME_STATUS.IN_PROGRESS)){
                gc.makeMove(g);
                System.out.println("Want to undo move? press 1 for Yes.. 0 for No..)");

                int undoanswer = sc.nextInt();
                if(undoanswer == 1){
                    System.out.println("Undoing...");
                    gc.undoMove(g);
                }

                gc.displayBoard(g);
            }
            if(g.getGame_status().equals(GAME_STATUS.DRAW)){
                System.out.println("Game Draw !!");
            }
            else if(g.getGame_status().equals(GAME_STATUS.SUCCESS)){
                System.out.println("Winner is "+ g.getWinner().getPlayer_name());
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
