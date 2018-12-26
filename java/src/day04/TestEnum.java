package day04;

import java.util.EnumSet;

public class TestEnum {
    public static void main(String[] args) {
        EnumSet<EnumWeekday> always = EnumSet.allOf(EnumWeekday.class);
        for (EnumWeekday alway : always) {
            System.out.println("a week has these day="+alway);

        }
        EnumSet<EnumWeekday> never = EnumSet.noneOf(EnumWeekday.class);

        for (EnumWeekday enumWeekday : never) {
            System.out.println("has never "+enumWeekday);
        }
        EnumSet<EnumWeekday> workday = EnumSet.range(EnumWeekday.MONDAY, EnumWeekday.FRIDAY);

        for (EnumWeekday enumWeekday : workday) {
            System.out.println("follwing day you should work="+enumWeekday);
        }

    }
}
