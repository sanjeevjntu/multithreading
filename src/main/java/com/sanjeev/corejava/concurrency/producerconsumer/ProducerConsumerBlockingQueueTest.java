package com.sanjeev.corejava.concurrency.producerconsumer;

import java.util.Random;
import java.util.concurrent.PriorityBlockingQueue;

public class ProducerConsumerBlockingQueueTest {

    public static void main(String[] args) throws InterruptedException {
      //  var queue = new ArrayBlockingQueue<Integer>(10);// Thread safe collection queue
        var  queue = new PriorityBlockingQueue<Integer>(10);
        // Producer Threads
        Runnable producer = () -> {
          while(true) {
              try {
                  var number = new Random().nextInt();
                  queue.put(number);
                  Thread.sleep(1000);
                  System.out.println("Adding number: " + number);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }

        };
        new Thread(producer).start();
        new Thread(producer).start();
        new Thread(producer).start();
        new Thread(producer).start();

        Runnable consumer = () -> {
           while (true) {
               try {
                   var number = queue.take();
                   System.out.println("Removed number:" + number);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        };

        new Thread(consumer).start();
        new Thread(consumer).start();
    }
}
