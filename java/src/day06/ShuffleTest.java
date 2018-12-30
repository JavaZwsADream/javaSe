package day06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleTest {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i=0;i<=49;i++)
        {
         numbers.add(i);
        }
        Collections.shuffle(numbers);
        List<Integer> integers = numbers.subList(0, 6);
        Collections.sort(integers);
        System.out.println(integers);
    }
}
