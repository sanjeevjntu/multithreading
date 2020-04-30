package com.sanjeev.corejava.java11;

import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> {
            return "sanjeev";
        };

        supplier.get();
    }
}
