package com.sanjeev.corejava.priorityqueue;

import java.util.Objects;
import java.util.PriorityQueue;

/**
 * Find second highest priced book from the given books
 */
public class PriorityQueueTest {

    public static void main(String[] args) {
        // minTree is default, maxTree with highest priced book first
        PriorityQueue<Product> products = new PriorityQueue<>((p1, p2) -> (int) (p2.getPrice() - p1.getPrice()));
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

        System.out.println("Products : " + products);

        System.out.println("print top priced book: "+products.peek());
        System.out.println("print top priced book and remove: "+products.poll());
        System.out.println("print 2nd top priced book: "+products.peek());
    }

}

class Product {
    // id, name , type - > used for eaqulaity
    private long id;
    private String name;
    private String type;
    private double price;

    public Product(long id, String name, String type, double price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id &&
                name.equals(product.name) &&
                type.equals(product.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
