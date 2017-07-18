package Singleton;

import java.io.Serializable;

/**
 * Created by ashah on 12/7/17.
 */
public class SingletonClass implements Serializable {

    /**
     * Eager Initialization
     */
    private static volatile SingletonClass sSoleInstance = new SingletonClass();

    //private constructor.
    private SingletonClass(){}

    public static SingletonClass getInstance() {
        return sSoleInstance;
    }


    /**
     * Lazy Initialization
     */
//    private static SingletonClass sSoleInstance;
//
//    private SingletonClass(){}  //private constructor.
//
//    public static SingletonClass getInstance(){
//        if (sSoleInstance == null){ //if there is no instance available... create new one
//            sSoleInstance = new SingletonClass();
//        }
//
//        return sSoleInstance;
//    }


    /**
     * Java reflection Singleton
     */
//    private static SingletonClass sSoleInstance;
//
//    //private constructor.
//    private SingletonClass(){
//
//        //Prevent form the reflection api.
//        if (sSoleInstance != null){
//            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
//        }
//    }
//
//    public static SingletonClass getInstance(){
//        if (sSoleInstance == null){ //if there is no instance available... create new one
//            sSoleInstance = new SingletonClass();
//        }
//
//        return sSoleInstance;
//    }


    /**
     *Thread Safe way to create Singleton class
     */
//    private static SingletonClass sSoleInstance;
//
//    private SingletonClass(){}  //private constructor.
//
//    public synchronized static SingletonClass getInstance(){
//        if (sSoleInstance == null){ //if there is no instance available... create new one
//            sSoleInstance = new SingletonClass();
//        }
//
//        return sSoleInstance;
//    }

    /**
     * Double check locking method
     */

//    private static SingletonClass sSoleInstance;
//
//    //private constructor.
//    private SingletonClass(){
//
//        //Prevent form the reflection api.
//        if (sSoleInstance != null){
//            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
//        }
//    }
//
//    public static SingletonClass getInstance() {
//        //Double check locking pattern
//        if (sSoleInstance == null) { //Check for the first time
//
//            synchronized (SingletonClass.class) {   //Check for the second time.
//                //if there is no instance available... create new one
//                if (sSoleInstance == null) sSoleInstance = new SingletonClass();
//            }
//        }
//
//        return sSoleInstance;
//    }

    /**
     * Serialization Deserialization Safe Singleton class
     */

//    private static volatile SingletonClass sSoleInstance;
//
//    //private constructor.
//    private SingletonClass(){
//
//        //Prevent form the reflection api.
//        if (sSoleInstance != null){
//            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
//        }
//    }
//
//    public static SingletonClass getInstance() {
//        if (sSoleInstance == null) { //if there is no instance available... create new one
//            synchronized (SingletonClass.class) {
//                if (sSoleInstance == null) sSoleInstance = new SingletonClass();
//            }
//        }
//
//        return sSoleInstance;
//    }
//
//    //Make singleton from serialize and deserialize operation.
//    protected Object readResolve() {
//        return getInstance();
//    }


}
