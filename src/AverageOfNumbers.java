import java.util.Arrays;
import java.util.List;

public class AverageOfNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,5,1,6,7,8);
        Double avg = list.stream().mapToInt(e->e).average().getAsDouble();
        System.out.println(avg);
    }
}
