package day04;

import java.time.LocalDate;

public class Compare01 implements Comparable<LocalDate> {
    public Compare01(int year) {
        this.year = year;
    }

    private int year;

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(LocalDate o) {
        return Integer.compare(getYear(),o.getDayOfYear());
    }
}
