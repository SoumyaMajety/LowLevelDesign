package TicTacToe_TC.BotStrategy;

import TicTacToe_TC.Models.BOT_DIFFICULTY;

public class BotStrategyFactory {

    public static BotStrategy getBotStragegy(BOT_DIFFICULTY b){
        if(b.equals(BOT_DIFFICULTY.EASY)){
            return new EasyBotStrategy();
        }
        return null;
    }
}
