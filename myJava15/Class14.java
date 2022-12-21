package myJava15;

class PrePaid extends Thread {
    int sum = 200;

    public void talk(double f) {
        try {
            Thread.sleep((int) (5000 * Math.random()));
        } catch (InterruptedException e) {
        }
        sum -= f;
        System.out.println("Sum : " + sum);
    }

    public void run() {
        double fee = Math.random() * 100;
        if (sum > 10) {
            this.talk(fee);
        }
    }
}

public class Class14 {
    public static void main(String[] args) {
        PrePaid ph = new PrePaid();
        ph.run();
    }
}
