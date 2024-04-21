package FactoryPattern;

import FactoryPattern.Components.Button;
import FactoryPattern.Components.Menu;

public class Main {
    public static void main(String[] args){
        Platform p = new Android();
        UIComponentFactory ui = p.getFactory();
        Button b = ui.getButton();
        b.clickButton();
        Menu m = ui.getMenu();
        m.createMenu();
    }
}
