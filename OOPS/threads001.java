package OOPS;

public class threads001 extends Thread {
    public void run(){
        System.out.println("child thread");
        System.out.print(Thread.currentThread().getPriority());

    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        threads001 t=new threads001();
        t.start();
    }

}
