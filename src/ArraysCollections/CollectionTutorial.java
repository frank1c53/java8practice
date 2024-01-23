package ArraysCollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CollectionTutorial {


    public static void main(String[] args) {

        List<Integer> list =  Arrays.asList(4,56,2,1,5,6,7);
        double avg  = list.stream().mapToInt(e->e).average().getAsDouble();
        System.out.println(Math.nextAfter(avg,2));
        HashSet<Integer> hashSet = new HashSet<>();

     }
}
