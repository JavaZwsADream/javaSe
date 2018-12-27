package day05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class utilSort {


    public static  <T extends Comparable> T max(Collection<T> c) {
        if (c.isEmpty())
            throw  new NoSuchElementException();
        Iterator<T> iter = c.iterator();
        T largest = iter.next();
        while (iter.hasNext())
        {
            T next = iter.next();
            if (largest.compareTo(next)<0)
                largest=next;
        }
        return  largest;


    }

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(4);
        integers.add(5);
        integers.add(7);
        Integer max = utilSort.max(integers);
        System.out.println(max);
    }
}
