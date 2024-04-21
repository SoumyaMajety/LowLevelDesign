package TicTacToe_TC.Models;
import java.util.Scanner;
public class Player {
   private int player_id;
    private String player_name;
   private Symbol symbol;
    private PLAYER_TYPE player_type;
    Scanner sc;

    public Player(int id, String name,PLAYER_TYPE player_type,Symbol symbol){
        this.player_id = id;
        this.player_name=name;
        this.player_type = player_type;
        this.symbol = symbol;
        sc = new Scanner(System.in);
    }

    public Move makeMove(Board b){
            System.out.println("Please mention row");
            int row = sc.nextInt();
            System.out.println("Please mention column");
            int col = sc.nextInt();

            return new Move(new Cell(row,col),this);
    }
    public int getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(int player_id) {
        this.player_id = player_id;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public PLAYER_TYPE getPlayer_type() {
        return player_type;
    }

    public void setPlayer_type(PLAYER_TYPE player_type) {
        this.player_type = player_type;
    }
}
