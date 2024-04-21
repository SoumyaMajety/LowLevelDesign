package Decorator;

public class EmailService implements Communicator{
    @Override
    public void send() {
        System.out.println("Email Sent");
    }
}
