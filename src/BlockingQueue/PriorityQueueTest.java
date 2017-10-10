package BlockingQueue;

import java.util.PriorityQueue;

/**
 * Created by ashah on 10/10/17.
 * Project : DesignPatterns.
 */
public class PriorityQueueTest {

    static PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
    private static Object lock = new Object();

    public static void main(String[] args) {

        new Thread() {
            public void run() {
                synchronized (lock) {
                    try {
                        while (priorityQueue.isEmpty()) {
                            System.out.println("inside wait");
                            lock.wait();
                        }
                        System.out.println("outside wait");
                        System.out.println(priorityQueue.remove() + " is removed from priorityQueue object");
                        lock.notify();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        new Thread() {
            public void run() {
                synchronized (lock) {
                    System.out.println("inside adding");
                    priorityQueue.add("string variable");
                    System.out.println("Added an element to the queue");
                    lock.notify();
                }
            }
        }.start();
    }
}
