package FactoryPattern;
import FactoryPattern.Components.*;
public interface UIComponentFactory {
   public Button getButton();
   public Menu getMenu();

}
