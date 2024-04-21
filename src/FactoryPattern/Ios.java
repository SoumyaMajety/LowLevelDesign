package FactoryPattern;

public class Ios implements Platform{
    public UIComponentFactory getFactory(){
        return new IosComponentFactory();
    }
}
