package day06;

import java.util.Comparator;

public class Comparetor implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        int i=(int)o1-(int)o2;
        return  i;
    }
}
