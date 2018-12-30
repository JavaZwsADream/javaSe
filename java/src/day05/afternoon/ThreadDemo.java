package day05.afternoon;

public class ThreadDemo implements Runnable{


    @Override
    public void run() {
        prin();
    }

    public static void main(String[] args) throws  InterruptedException{
        ThreadDemo r=new ThreadDemo();
        Thread t=new Thread(r);
        Thread t1=new Thread(r);
        Thread t2=new Thread(r);
        Thread t3=new Thread(r);
        Thread t4=new Thread(r);
        Thread t5=new Thread(r);
        t.start();

        t1.setPriority(1);
        t1.start();
        t2.setPriority(2);
        t2.start();
        t3.setPriority(3);
        t3.start();
        t4.setPriority(4);
        t4.start();
        t5.setPriority(5);
        t5.start();


    }
    public synchronized  void  prin()
    {
        int i=0;
        while ( i<10) {
            System.out.println("thread " + Thread.currentThread().getName() + " is working");
            i++;
        }

    }

}
