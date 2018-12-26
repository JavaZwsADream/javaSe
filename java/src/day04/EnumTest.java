package day04;

import java.lang.reflect.Field;

public class EnumTest {

    private  String MONDAY="monday";
    private  String TUESDAY="TUESDAY";
    private  String WEDNESDAY="WEDNESDAY";
    private  String THURSDAY="THURSDAY";
    private  String FRIDAY="FRIDAY";
    private  String SATURDAY="SATURDAY";
    private  String SUNDAY="SUNDAY";

    public String getMONDAY() {
        return MONDAY;
    }

    public void setMONDAY(String MONDAY) {
        this.MONDAY = MONDAY;
    }

    public String getTUESDAY() {
        return TUESDAY;
    }

    public void setTUESDAY(String TUESDAY) {
        this.TUESDAY = TUESDAY;
    }

    public String getWEDNESDAY() {
        return WEDNESDAY;
    }

    public void setWEDNESDAY(String WEDNESDAY) {
        this.WEDNESDAY = WEDNESDAY;
    }

    public String getTHURSDAY() {
        return THURSDAY;
    }

    public void setTHURSDAY(String THURSDAY) {
        this.THURSDAY = THURSDAY;
    }

    public String getFRIDAY() {
        return FRIDAY;
    }

    public void setFRIDAY(String FRIDAY) {
        this.FRIDAY = FRIDAY;
    }

    public String getSATURDAY() {
        return SATURDAY;
    }

    public void setSATURDAY(String SATURDAY) {
        this.SATURDAY = SATURDAY;
    }

    public String getSUNDAY() {
        return SUNDAY;
    }

    public void setSUNDAY(String SUNDAY) {
        this.SUNDAY = SUNDAY;
    }

    public static void main(String[] args) {
        Class<EnumTest> enumTestClass = EnumTest.class;
        Field[] declaredFields = enumTestClass.getDeclaredFields();
        EnumTest enumTest = null;
        try {
            enumTest = enumTestClass.newInstance();
            System.out.println(enumTest.MONDAY.toUpperCase());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }
}
