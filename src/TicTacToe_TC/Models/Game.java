package TicTacToe_TC.Models;

//import BuilderPattern.Builder;
import TicTacToe_TC.Strategy.WinningStrategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Game {
    private List<Player> players;
    private Board board;
    private List<Move> moves;
    private GAME_STATUS game_status;
    private List<WinningStrategy> winningStrategies;
    private int next_player_turn;
    private Player winner;


    // constructor
    private Game(GameHelper builder) {
        this.board = new Board(builder.getSize());

        this.players = builder.getPlayers();
        this.winningStrategies = builder.getWinningStrategies();
        this.game_status = GAME_STATUS.IN_PROGRESS;
        this.moves = new ArrayList<>();
        next_player_turn = 0;
    }

    public void makeMove(){
        Player currentPlayer = players.get(next_player_turn);
        System.out.println("Current Player turn is "+ currentPlayer.getPlayer_name());
        Move m = currentPlayer.makeMove(board);
         if(!validateMove(m)){
             System.out.println("Invalid Move!!");
             return;
         }
        int r = m.getCell().getRow();
        int c = m.getCell().getColumn();
        Cell cellToUpadte = board.getBoard().get(r).get(c);
        cellToUpadte.setCell_state(CELL_STATE.FILLED);
        cellToUpadte.setPlayer(currentPlayer);

        Move finalMove = new Move(cellToUpadte,currentPlayer);
        moves.add(finalMove);

        next_player_turn ++;
        next_player_turn %= players.size();

        if(checkWinner(board,finalMove)){
            game_status = GAME_STATUS.SUCCESS;
            winner= currentPlayer;
           // System.out.println("Winner is "+currentPlayer.getPlayer_name());
        } else if (moves.size() == board.getBoard_size()* board.getBoard_size()){
            game_status = GAME_STATUS.DRAW;
        }

        System.out.println("Current Player "+ currentPlayer.getPlayer_name()+" moved at "+ r+" , "+c);
    }

    public boolean checkWinner(Board b,Move m){
        for(WinningStrategy w : winningStrategies){
            if(w.checkWinner(b,m)){
                return true;
            }
        }
        return false;

    }

    public boolean validateMove(Move m){
        int r = m.getCell().getRow();
        int c = m.getCell().getColumn();
        if(r>= board.getBoard().size()){
            return false;
        }
        if( c >= board.getBoard().size()){
            return false;
        }

        return board.getBoard().get(r).get(c).getCell_state().equals(CELL_STATE.EMPTY);
    }

    public void undo(){
        if(moves.isEmpty()){
            System.out.println("No Moves Left");
            return;
        }
        Move m = moves.get(moves.size()-1);
        moves.remove(m);
        Cell c = m.getCell();
        c.setPlayer(null);
        c.setCell_state(CELL_STATE.EMPTY);
        next_player_turn--;
        next_player_turn %= players.size();
        for(WinningStrategy ws : winningStrategies){
            ws.handleUndo(board,m);
        }
        if(this.game_status.equals(GAME_STATUS.SUCCESS)){
            game_status = GAME_STATUS.IN_PROGRESS;
        }
    }
    public static GameHelper getInstance() {
        return new GameHelper();
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GAME_STATUS getGame_status() {
        return game_status;
    }

    public void setGame_status(GAME_STATUS game_status) {
        this.game_status = game_status;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public int getNext_player_turn() {
        return next_player_turn;
    }

    public void setNext_player_turn(int next_player_turn) {
        this.next_player_turn = next_player_turn;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }


    public static class GameHelper {
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;
        private int size;

        public GameHelper setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }


        public GameHelper setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public List<Player> getPlayers() {
            return players;
        }

        public List<WinningStrategy> getWinningStrategies() {
            return winningStrategies;
        }

        public int getSize() {
            return size;
        }

        public GameHelper setSize(int size) {
            this.size = size;
            return this;
        }

        public void validate() {
            if (this.size == 0) {
                throw new IllegalArgumentException("Board Size should not be Zero");
            }
            if (players.size() == 0) {
                throw new IllegalArgumentException("Players should not be Zero");
            }
            if (size != players.size() + 1) {
                throw new IllegalArgumentException("Players size should be less than boardsize");
            }
            if (winningStrategies.size() <= 0) {
                throw new IllegalArgumentException("There should be atleast one winning strategy selected");
            }
            int botCount = 0;
            for (Player p : players) {
                if (p.getPlayer_type().equals(PLAYER_TYPE.BOT)) {
                    botCount++;
                }
            }
            if (botCount > 1) {
                throw new IllegalArgumentException("There should be only one Bot in Game");
            }
            // symbol validation
            HashSet<Character> hs = new HashSet<>();
            for (Player p : players) {
                if (!hs.contains(p.getSymbol().getSymbol())) {
                    hs.add(p.getSymbol().getSymbol());
                } else throw new IllegalArgumentException("Each player should have a distinct symbol");
            }
        }

        public Game build() {
            validate();
            return new Game(this);
        }
    }
}
