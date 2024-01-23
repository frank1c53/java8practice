import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,3,1,2,3,6,4,3,2);
       list = list.stream().filter(e->e%2==0).collect(Collectors.toList());
        System.out.println(list);

        list = list.stream().filter(e->!(e%2==0)).collect(Collectors.toList());
        System.out.println(list);

    }
}
