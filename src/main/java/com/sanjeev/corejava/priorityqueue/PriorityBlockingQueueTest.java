package com.sanjeev.corejava.priorityqueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueTest {

    public static void main(String[] args) {
        PriorityBlockingQueue<Product> products = new PriorityBlockingQueue<>(11, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return (int) (p2.getPrice() - p1.getPrice());
            }
        });
        Product p1 = new Product(1, "book", "java", 200);
        Product p2 = new Product(2, "book", "c++", 300);
        Product p3 = new Product(3, "book", "python", 700);
        Product p4 = new Product(4, "book", "javascript", 500);
        Product p5 = new Product(5, "book", "sql", 1000);
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);

        ArrayList<Product> polledProducts = new ArrayList<>();

        products.drainTo(polledProducts);

        System.out.println("products: " + products);
        System.out.println("polledProducts: " + polledProducts);
    }
}
