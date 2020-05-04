package com.sanjeev.corejava.interview;

import java.util.Objects;

public class Fulfillment {

    private int id;
    private String name;
    private String type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fulfillment that = (Fulfillment) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(type, that.type);
    }

    public int hashCode() {
        return Objects.hash(id, name, type);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
