package BlockingQueue;

/**
 * Created by ashah on 10/10/17.
 * Project : DesignPatterns.
 */

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueExample {

    static PriorityBlockingQueue<String> priorityQueue = new PriorityBlockingQueue<String>();

    public static void main(String[] args) {

        new Thread() {
            public void run() {
                try {
                    System.out.println("inside removing");
                    System.out.println(priorityQueue.take() + " is removed from priorityQueue object");
                    System.out.println("outside removing");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        new Thread() {
            public void run() {
                System.out.println("inside adding");
                priorityQueue.add("string variable");
                System.out.println("Added an element to the queue");
            }
        }.start();
    }
}
