package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;


public class Collection {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
//        List<String> strings1 = Collections.checkedList(strings, String.class);
        List object=strings;
        object.add(new Date());
        for (Object o : object) {
            System.out.println( o);
        }

    }
}
