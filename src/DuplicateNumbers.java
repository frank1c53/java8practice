import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateNumbers {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,22,32,1,2,3,2,3,22);
        HashSet<Integer> hashSet = new HashSet<>();
        List<Integer> list2 = list.stream().filter(e->!hashSet.add(e)).collect(Collectors.toList());
        list = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list);
        System.out.println(list2);

    }
}
