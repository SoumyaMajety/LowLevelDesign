package SingletonDesignPattern;

import javax.xml.transform.stream.StreamSource;

public class Main {
    public static void main(String[] args) {


      //  we cant create constructor as it is private
       // Singleton s1 = new Singleton();
        // so we are creating object using getInstance() method which returns Singleton OBJ
        Singleton s = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s);
        System.out.println(s2);
    }

}
