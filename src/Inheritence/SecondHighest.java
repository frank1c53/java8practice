package Inheritence;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SecondHighest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,61,7,2,3,5,30);
        Integer i = list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
        System.out.println(i);
    }
}
