import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindLargestandMiinumum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,5,2,1,11,3,5);
        Integer max = list.stream().mapToInt(e->e).max().getAsInt();
        System.out.println(max);
        Integer min = list.stream().mapToInt(e->e).min().getAsInt();
        System.out.println(min);
    }
}
