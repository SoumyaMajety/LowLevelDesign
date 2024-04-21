package FactoryPattern;

import FactoryPattern.Components.*;

public class AndroidComponentFactory implements UIComponentFactory{
    public Button getButton() {
        return new AndroidButton();
    }

    @Override
    public Menu getMenu() {
        return new AndroidMenu();
    }
}
