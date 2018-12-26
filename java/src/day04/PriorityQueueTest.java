package day04;

import java.time.LocalDate;
import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {

        PriorityQueue<LocalDate> pq = new PriorityQueue<>();
        pq.add(LocalDate.of(2012,2,15));
        pq.add(LocalDate.of(2014,12,15));
        pq.add(LocalDate.of(2009,11,15));
        pq.add(LocalDate.of(2022,3,15));

        System.out.println("Iterrator over elements..");
        for (LocalDate lq:pq
             ) {
            System.out.println(lq);

        }
        System.out.println("Iterator is removing...");
        while (!pq.isEmpty())
        {
            System.out.println(pq.remove());
        }
    }
}
