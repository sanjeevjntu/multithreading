package com.sanjeev.corejava.codecompletion;

import java.util.List;

public class CodeCompletion {

    private Shape complete() {
        Square square = new Square();
        Cirlce cirlce = new Cirlce();
        String string = "Test Something";
        List<Square> squares = List.of();
        List<String> lists;

        for (Square square1 : squares) {
            if (!square1.getId().isBlank()) {
                System.out.println(square1.getId());
                try {
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return square1;
            }

        }
        //   square.getId();
        return cirlce;
    }



    private interface Shape {
    }

    private class Cirlce implements Shape {
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    private class Square implements Shape {

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        private String id;
    }
}
