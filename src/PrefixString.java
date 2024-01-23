import HashPractice.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrefixString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Frank","Fabin","Tapas","Dhwani","Shreya");
        list = list.stream().filter(e->e.contains("r")).collect(Collectors.toList());
        System.out.println(list);
    }
}
