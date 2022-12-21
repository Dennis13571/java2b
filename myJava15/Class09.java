package myJava15;

class timer implements Runnable {
    Double s;
    String name;

    public timer(String n, Double t) {
        name = n;
        s = t;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep((int) (s * 1000));
            } catch (InterruptedException e) {
            }
            System.out.println("Thread " + name + " is running");
        }
    }
}

public class Class09 {
    public static void main(String[] args) {
        timer t1 = new timer("1", 1.0);
        timer t2 = new timer("2", 2.5);
        Thread tt1 = new Thread(t1);
        Thread tt2 = new Thread(t2);
        tt1.start();
        tt2.start();
    }
}