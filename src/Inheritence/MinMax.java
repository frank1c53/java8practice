package Inheritence;

import java.util.Arrays;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,3,2,6,3,2);
        int max = list.stream().mapToInt(e->e).max().getAsInt();
        int min = list.stream().mapToInt(e->e).min().getAsInt();


    }
}
