package FactoryPattern.Components;

public class IosButton implements Button{

    @Override
    public void clickButton() {
        System.out.println("Ios Button clicked");
    }
}
