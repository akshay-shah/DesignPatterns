package Singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by ashah on 12/7/17.
 * Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine.
 * It seems to be a very simple design pattern but when it comes to implementation, it comes with a lot of implementation concerns.
 * The implementation of Singleton pattern has always been a controversial topic among developers
 */
public class SingletonTester  {


    /**
     * Using java reflection singleton class can create 2 objects
     */
//    public static void main(String[] args) {
//        //Create the 1st instance
//        SingletonClass instance1 = SingletonClass.getInstance();
//
//        //Create 2nd instance using Java Reflection API.
//        SingletonClass instance2 = null;
//        try {
//            Class<SingletonClass> clazz = SingletonClass.class;
//            Constructor<SingletonClass> cons = clazz.getDeclaredConstructor();
//            cons.setAccessible(true);
//            instance2 = cons.newInstance();
//        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException | InstantiationException e) {
//            e.printStackTrace();
//        }
//
//        //now lets check the hash key.
//        System.out.println("Instance 1 hash:" + instance1.hashCode());
//        System.out.println("Instance 2 hash:" + instance2.hashCode());
//    }

    /**
     * Thread Safe
     * @param args
     */

//    public static void main(String[] args) {
//        //Thread 1
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                SingletonClass instance1 = SingletonClass.getInstance();
//                System.out.println("Instance 1 hash:" + instance1.hashCode());
//            }
//        });
//
//        //Thread 2
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                SingletonClass instance2 = SingletonClass.getInstance();
//                System.out.println("Instance 2 hash:" + instance2.hashCode());
//            }
//        });
//
//        //start both the threads
//        t1.start();
//        t2.start();
//    }


    /**
     * Serialization Deserialization Singleton Object
     * @param args
     */
    public static void main(String[] args) {

        try {
            SingletonClass instance1 = SingletonClass.getInstance();
            ObjectOutput out = null;

            out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
            out.writeObject(instance1);
            out.close();

            //deserialize from file to object
            ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
            SingletonClass instance2 = (SingletonClass) in.readObject();
            in.close();

            System.out.println("instance1 hashCode=" + instance1.hashCode());
            System.out.println("instance2 hashCode=" + instance2.hashCode());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
