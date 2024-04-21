package Adapter;

public class KotakBankAdapter implements Bank{

    KotakBank kotakBank = new KotakBank();
    @Override
    public void credit() {
        kotakBank.creditAmount();
    }

    @Override
    public void deposit() {
        kotakBank.viewBalance();
    }
}
