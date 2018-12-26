package day04;

import java.util.Objects;

public class Item implements Comparable<Item>{

    private  String descrition;
    private int partNumber;

    public Item(String descrition, int partNumber) {
        this.descrition = descrition;
        this.partNumber = partNumber;

    }

    public String getDescrition() {
        return descrition;
    }

    @Override
    public String toString() {
        return "Item{" +
                "descrition='" + descrition + '\'' +
                ", partNumber=" + partNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return partNumber == item.partNumber &&
                Objects.equals(descrition, item.descrition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descrition, partNumber);
    }

    @Override
    public int compareTo(Item o) {
        int diff=Integer.compare(partNumber,o.partNumber);
        return diff !=0 ? diff:descrition.compareTo(o.descrition);
    }
}
