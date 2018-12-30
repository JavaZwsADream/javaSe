package day05.afternoon;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {

    private Lock bankLock=new ReentrantLock();

    private final double[] accounts;

    private Condition sufficientFunds;

    public  Bank(int n,double initialBalance)
    {
        accounts=new double[n];
        Arrays.fill(accounts,initialBalance);
        sufficientFunds=bankLock.newCondition();
    }

    public void transfer(int from,int to,double amount)
    {
        bankLock.lock();
        try {
            while (accounts[from] < amount)
               sufficientFunds.await();
            System.out.println(Thread.currentThread());
            accounts[from] -= amount;
            System.out.printf("%10.2f from %d to %d", amount, from, to);
            accounts[to] += amount;
            System.out.printf(" Total price :%10.2f%n,", getTotalPrice());
            sufficientFunds.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            bankLock.unlock();
        }

    }

    public double getTotalPrice() {
        bankLock.lock();
        try {
            double sum = 0;
            for (double account : accounts) {
                sum += account;
            }
            return sum;
        }
        finally {
            bankLock.unlock();
        }
    }

    public int size()
    {
        return accounts.length;
    }
}
