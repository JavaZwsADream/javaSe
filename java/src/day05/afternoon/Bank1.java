package day05.afternoon;

import java.util.Arrays;

public class Bank1 {

    private double[] accounts;
    public Bank1(int n,double initialBalance)
    {
        accounts=new double[n];
        Arrays.fill(accounts,initialBalance);

    }
    public synchronized void  transfer(int from,int to,double amount) throws InterruptedException
    {
         while (accounts[from]<amount)
             wait();
         accounts[from]-=amount;
        System.out.println(Thread.currentThread().getName());
        System.out.printf("%10.2f from %d to %d", amount, from, to);
         accounts[to]+=amount;
        System.out.printf(" Total price :%10.2f%n,", getTotalBalance());
         notifyAll();

    }

    public synchronized double getTotalBalance()
    {

        double sum=0;
        for (double account : accounts) {
            sum+=account;
        }
        return  sum;

    }
    public int size()
    {
        return accounts.length;
    }
}
