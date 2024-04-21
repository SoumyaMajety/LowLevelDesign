package Adapter;

public class YesBankAdapter implements Bank{

    YesBank yesBank = new YesBank();
    @Override
    public void credit() {
        yesBank.balanceCredit();
    }

    @Override
    public void deposit() {
        yesBank.checkBalance();
    }
}
