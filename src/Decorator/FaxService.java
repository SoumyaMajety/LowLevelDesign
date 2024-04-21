package Decorator;

public class FaxService extends AddOnService{
    Communicator communicator;
    public FaxService(Communicator communicator){
        this.communicator = communicator;
    }

    @Override
    public void send() {
        communicator.send();
        System.out.println("Message sent through fax");

    }
}
