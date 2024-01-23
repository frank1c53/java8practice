import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageOfSquareOfNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,2,1,6,4,6,1,31);
        list = list.stream().map(n->n*n*n).collect(Collectors.toList());
        Double avg = list.stream().map(n->n*n).mapToInt(e->e).average().getAsDouble();
        System.out.println(avg);
    }
}
