import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Strings {
    public static void main(String[] args) {
       // write a java program to find and print the count of strings that start with letter 'a' and have exactly 3 letters ["apple","banana","ant","avocado","dog","cat"]
        //TCS interview
        List<String> list = Arrays.asList("apple","banana","ant","avocado","dog","cat");
        list = list.stream().filter(e->e.length()==3 & e.startsWith("a")).collect(Collectors.toList());
        System.out.println(list);

    }
}
