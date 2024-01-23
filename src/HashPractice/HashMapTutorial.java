package HashPractice;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapTutorial {
    public static void main(String[] args) {
        Employee e1 = new Employee(101,"Frank Fernandes","Software Engineer",25000);
        Employee e2 = new Employee(102,"Tapas Das","Data Engineer",26000);
        Employee e3 = new Employee(103,"Dhwani Chaudary","Project Co-ordinator",3500);

        Employee e4 = new Employee(104,"Pritam Singh","HR",2500);
        Employee e5 = new Employee(105,"Pragati Singh","Project Co-ordinator",2500);
        Employee e6 = new Employee(101,"Frank Fernandes","Software Engineer",25000);

        List<Employee> list = Arrays.asList(e1,e2,e3,e4,e5,e6);
        //list = list.stream().filter(e->e.getSalary()>10000).collect(Collectors.toList());
        //System.out.println(list);
        Set<Employee> employeeSet = new HashSet<>();
        employeeSet  = list.stream().collect(Collectors.toSet());
        System.out.println(employeeSet);


    }
}
