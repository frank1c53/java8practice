import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstFiveNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,2,3,5,4,3,32);
        list = list.stream().limit(2).collect(Collectors.toList());
        System.out.println(list);
    }
}
