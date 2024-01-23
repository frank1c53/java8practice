import java.util.Arrays;
import java.util.List;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,3,1,2,4,10);
        Integer sum = list.stream().reduce(0,(a,b) -> a+b);
        System.out.println(sum);
    }
}
