package org.example;

import java.util.concurrent.CountDownLatch;

public class Philosopher {
    private String name;
    public int id;

    public Philosopher(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Филосов " + getId() + " " + getName();
    }
}
