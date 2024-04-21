package FactoryPattern.Components;

public class AndroidMenu implements Menu{

    @Override
    public void createMenu() {
        System.out.println("Android menu Created");
    }
}
