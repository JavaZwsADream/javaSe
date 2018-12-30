package day06;


import day05.Collection;

import java.util.*;

public class Collectiondemo {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        while (i<10)
        {
            int j= (int) (Math.random()*10)+1;
            System.out.println(j);
            list.add(j);
            i++;

        }
        System.out.println("list="+list+"size="+list.size());
        ArrayList<Object> objects = new ArrayList<>();
        boolean b = objects.addAll(list);
        System.out.println(b);
        System.out.println(objects.size());
        Collections.copy(objects,list);
        System.out.println("linked"+objects);
        Integer max = Collections.max(list, new Comparetor());
        System.out.println("max="+max);

    }

}
