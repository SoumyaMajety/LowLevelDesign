package SingletonDesignPattern;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Singleton {

    public static Singleton obj;
   static Lock l = new ReentrantLock();
    private Singleton(){

    }


//    public static Singleton getInstance(){
//        if(obj==null) { // not thread safe
//            obj = new Singleton();
//        }
//        return obj;
//    }

    // not thread safe
    // do method synchronized or use locks to become thread safe
//    public static synchronized Singleton getInstance(){
//        if(obj==null) {
//            obj = new Singleton();
//        }
//        return obj;
//    }

    /// use locks
//        public static synchronized  Singleton getInstance(){
//        l.lock();
//        if(obj==null) {
//            obj = new Singleton();
//        }
//    l.unlock();
//        return obj;
//    }
    // both lock and sync are slow blocking other than critical code to execute
    // so we will go for double check solution
    public static  Singleton getInstance(){
        if(obj == null) {
            l.lock();
            if (obj == null) { // not thread safe
                obj = new Singleton();
            }
            l.unlock();
        }
        return obj;
    }
}
