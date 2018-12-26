package day04;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {


    public static void main(String[] args) {

        SortedSet<String> sorter = new TreeSet<>();
        sorter.add("A");
        sorter.add("B");
        sorter.add("C");
        for (String s : sorter) {
            System.out.println(s);

        }
    }
}
