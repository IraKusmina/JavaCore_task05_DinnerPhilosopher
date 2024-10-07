package org.example;

public class ThreadPhil extends java.lang.Thread {
    public volatile boolean[] fork = {false, false, false, false, false};
    public Philosopher phil;

    public ThreadPhil(Philosopher philosopher) {
        this.phil = philosopher;
    }

    @Override
    public void run() {
        int num=0;
        while (num<4){
            //проверяем свободные вилки
            if (phil.getId()!=5){
                if (!fork[phil.getId()-1]&&!fork[phil.getId()]){
                    changeFork(phil.getId()-1, phil.getId());
                    num++;
                } else {
                    System.out.println(phil.getName() + " пока думает. Вилки заняты");
                }
            } else {
                changeFork(4, 0);
                num++;
            }
        }
        System.out.println(phil.getName() + " поел 3 раза и вышел из-за стола");
    }

    public void changeFork(int firstID, int secondID){
        fork[firstID] = true;
        fork[secondID] = true;
        System.out.println(phil.getName() + " начал есть");
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(phil.getName() + " закончил есть");
        fork[firstID] = false;
        fork[secondID] = false;
        System.out.println(phil.getName() + " начал мыслить");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void printFork(){
        for (boolean f: fork){System.out.print(f);}

    }
}
