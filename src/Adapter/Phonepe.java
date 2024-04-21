package Adapter;

public class Phonepe {

    Bank b ;

    public Phonepe(){
       b = new YesBankAdapter();
    }

   public void credit(){
        b.credit();
   }
   public void deposit(){
        b.deposit();
   }
}
