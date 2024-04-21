package introToThreads;

import IntroToThreads.HelloWorldPrinter;
import IntroToThreads.PrintNumber;

import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
//        HelloWorldPrinter hw = new HelloWorldPrinter();
//        hw.doSomething();
//        Thread t = new Thread(hw);
//        t.start();
//        System.out.println("Current Thread: "+ Thread.currentThread().getName());

//        for(int i=0; i<=100; i++){
//            Runnable pn = new PrintNumber(i);
//            Thread t1 = new Thread(pn);
//            t1.start();
//        }
////
//
        ExecutorService es = Executors.newFixedThreadPool(5);

//        ExecutorService es = Executors.newCachedThreadPool();
        for(int i=0; i<=10; i++){
            if(i==80){
                System.out.println("hey");
            }
            Runnable pn = new PrintNumber(i);
            es.execute(pn);

        }

        HashMap
    }

}