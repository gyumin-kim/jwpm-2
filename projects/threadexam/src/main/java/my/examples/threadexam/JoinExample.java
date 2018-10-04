package my.examples.threadexam;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();

        try {
            sumThread.join();
        } catch (InterruptedException ie) {}

        System.out.println("1~100 합: " + sumThread.getSum());
    }
}
