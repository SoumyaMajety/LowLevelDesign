package TicTacToe_TC.Models;

import TicTacToe_TC.BotStrategy.BotStrategy;
import TicTacToe_TC.BotStrategy.BotStrategyFactory;

public class Bot extends Player{
    private BOT_DIFFICULTY bot_difficulty;
    BotStrategy botStrategy;

    public Bot (int id, String name, Symbol s, BOT_DIFFICULTY bot_difficulty){
            super(id,name,PLAYER_TYPE.BOT,s);
            this.bot_difficulty = bot_difficulty;
            botStrategy = BotStrategyFactory.getBotStragegy(bot_difficulty);
    }
    @Override
    public Move makeMove(Board b){
            Move m = botStrategy.makeMove(b);
            m.setPlayer(this);
            return m;
    }

    public BOT_DIFFICULTY getBot_difficulty() {
        return bot_difficulty;
    }

    public void setBot_difficulty(BOT_DIFFICULTY bot_difficulty) {
        this.bot_difficulty = bot_difficulty;
    }
}
