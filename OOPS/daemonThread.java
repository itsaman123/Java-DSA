package OOPS;

class daemonThread extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread");

        }
        else{
            System.out.println("user thread");
        }

    }
    public static void main(String[] args){
        daemonThread t1=new daemonThread();
        daemonThread t2=new daemonThread();
        daemonThread t3=new daemonThread();
        t1.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();
    }

}
