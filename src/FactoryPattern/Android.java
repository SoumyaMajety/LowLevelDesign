package FactoryPattern;

public class Android implements Platform{
    public UIComponentFactory getFactory(){
        return new AndroidComponentFactory();
    }
}
