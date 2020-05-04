package com.sanjeev.corejava.comparators;

import java.util.*;

public class ProductComparisonTest {

    public static void main(String[] args) {
        Product p1 = new Product(1, "Sanjeev");
        Product p2 = new Product(2, "Chiru");
        Product p3 = new Product(3, "Keerti");

        System.out.println(p1.equals(p2));

        // List test
        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);

        products.stream()
                .sorted(new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                }).sorted(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getId() - o2.getId();
            }
        }).forEach(product -> {
            System.out.println("name: " + product.getName() + "id: " + product.getId());
        });

        // Set Test
        Set<Product> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);

        set.stream().sorted((prod1, prod2) -> {
            return prod2.getId() - prod1.getId();
        }).forEach(product -> {
            System.out.println(product.getId());
        });
    }
}
