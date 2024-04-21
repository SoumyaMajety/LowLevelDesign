package FactoryPattern;

import FactoryPattern.Components.Button;
import FactoryPattern.Components.IosButton;
import FactoryPattern.Components.IosMenu;
import FactoryPattern.Components.Menu;

public class IosComponentFactory implements UIComponentFactory{

    public Button getButton() {
        return new IosButton();
    }

    @Override
    public Menu getMenu() {
        return new IosMenu();
    }
}
