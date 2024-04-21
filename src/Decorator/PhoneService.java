package Decorator;

public class PhoneService extends AddOnService{

    Communicator communicator;

    public PhoneService(Communicator communicator){
        this.communicator = communicator;
    }
    @Override
    public void send() {
        communicator.send();
        System.out.println("Message sent through phone");

    }
}
