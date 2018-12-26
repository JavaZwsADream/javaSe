package day04;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {


    public static void main(String[] args) {
        SortedSet<Item> parts = new TreeSet<>();
        parts.add(new Item("Total",2));
        parts.add(new Item("widgest",3));
        parts.add(new Item("modem",22));
        System.out.println(parts);
        NavigableSet<Item> sortByDescription = new TreeSet<>(
                Comparator.comparing(Item::getDescrition)
        );
        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);


    }
}
