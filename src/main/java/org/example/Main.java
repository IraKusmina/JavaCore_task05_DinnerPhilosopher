package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Philosopher philosopher1 = new Philosopher("Аристотель", 1);
        Philosopher philosopher2 = new Philosopher("Платон", 2);
        Philosopher philosopher3 = new Philosopher("Евклид", 3);
        Philosopher philosopher4 = new Philosopher("Сократ", 4);
        Philosopher philosopher5 = new Philosopher("Пифагор", 5);

        ThreadPhil thread1 = new ThreadPhil(philosopher1);
        ThreadPhil thread2 = new ThreadPhil(philosopher2);
        ThreadPhil thread3 = new ThreadPhil(philosopher3);
        ThreadPhil thread4 = new ThreadPhil(philosopher4);
        ThreadPhil thread5 = new ThreadPhil(philosopher5);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}