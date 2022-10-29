package OOPS;
//daemon thread;

public class thread003 extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("daemon thread");
        }else{
            System.out.println("user thread");
        }

    }

    public static void main(String[] args) {
        thread003 t1=new thread003();
        thread003 t2=new thread003();
        thread003 t3=new thread003();
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();

    }

}
