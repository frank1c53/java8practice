package HashPractice;

import java.util.Objects;

public class HashCodeAndEquals {
    public static void main(String[] args) {
        Pen pen1 = new Pen(10,"blue");
        Pen pen2 = new Pen(13,"green");
        Pen pen3 = new Pen(10,"blue");
        System.out.println(pen1);
        System.out.println(pen3);
        System.out.println(pen1.equals(pen3));

    }
}

class Pen{
    int price;
    String color;

    public Pen(int price, String color) {
        this.price = price;
        this.color = color;
    }

   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return price == pen.price && Objects.equals(color, pen.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, color);
    }
}
