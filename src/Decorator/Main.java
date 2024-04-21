package Decorator;

public class Main {
    public static void main(String[] args){
        Communicator communicator = new EmailService();
        communicator = new PhoneService(communicator);
        communicator = new FaxService(communicator);
        communicator.send();
    }
}
