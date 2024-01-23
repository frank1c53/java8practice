import java.util.Arrays;
import java.util.List;

public class FindFirstElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,4,2,5,62,1);
        int a = list.stream().mapToInt(e->e).findFirst().getAsInt();
        System.out.println(a);
    }
}
