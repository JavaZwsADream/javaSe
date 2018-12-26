package day04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MapTest {
    public static void main(String[] args) {
        HashMap<String, Employee> HashMap = new HashMap<>();
        HashMap.put("144-26-5646",new Employee("Amy"));
        HashMap.put("789-92-22",new Employee("Harry"));
        HashMap.put("167-28-33",new Employee("ww"));
        HashMap.put("456-33-31",new Employee("jinguo"));
        System.out.println(HashMap);
        HashMap.remove("789-92-22");
        HashMap.put("456-33-31",new Employee("zouwensheng"));
        System.out.println(HashMap.get("456-33-31"));
        Set<Map.Entry<String, Employee>> entries = HashMap.entrySet();
        for (Map.Entry<String, Employee> entry : entries) {
            String k=entry.getKey();
            Employee nihao = entry.setValue(new Employee(entry.getValue()+"1"));
            System.out.println(nihao);
            Employee value = entry.getValue();

            System.out.println("key="+k+"value="+value);
        }

    }
}
