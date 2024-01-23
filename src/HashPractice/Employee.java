package HashPractice;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    int id;
    String name;
    String position;

    public Employee(int id, String name, String position, int salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        Salary = salary;
    }

    int Salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Salary == employee.Salary && Objects.equals(name, employee.name) && Objects.equals(position, employee.position);
    }
/*
    @Override
    public int hashCode() {
        return Objects.hash(id, name, position, Salary);
    }
*/

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", Salary=" + Salary +
                '}';
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101,"Frank Fernandes","Software Engineer",25000);
        Employee e2 = new Employee(102,"Tapas Das","Data Engineer",26000);
        Employee e3 = new Employee(103,"Dhwani Chaudary","Project Co-ordinator",3500);

        Employee e4 = new Employee(104,"Pritam Singh","HR",2500);
        Employee e5 = new Employee(105,"Pragati Singh","Project Co-ordinator",2500);
        Employee e6 = new Employee(101,"Frank Fernandes","Software Engineer",25000);




        List<Employee> employeeList = Arrays.asList(e1,e2,e3,e4,e5);
      /*  Map<Boolean,List<Employee>> employeeMap = employeeList.stream().collect(Collectors.partitioningBy(emp -> emp.getSalary()>3000));
        System.out.println(employeeMap);*/

       /* Optional<Employee> employeeOptionalmax = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println(employeeOptionalmax);

        Optional<Employee> employeeOptionalmin = employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
        System.out.println(employeeOptionalmin);*/

        Comparator<Employee>  employeeComparator = Comparator.comparing(Employee::getName);
        Comparator<Employee> employeeSalary  = (o1,o2) -> o2.getSalary()-o1.getSalary();
        List<Employee> employeeList1 = employeeList.stream().sorted(employeeComparator).sorted(employeeSalary).collect(Collectors.toList());
        //System.out.println(employeeList1);
        HashSet<Employee> employeeHashSet = new HashSet<>();
        employeeHashSet.add(e1);
        employeeHashSet.add(e2);
        employeeHashSet.add(e3);
        employeeHashSet.add(e4);
        employeeHashSet.add(e5);
        employeeHashSet.add(e6);
        System.out.println(employeeHashSet);

        HashMap<Integer,Employee> map = new HashMap<>();
        map.put(e1.getId(),e1);
        map.put(e2.getId(),e2);
        map.put(e3.getId(),e3);
        map.put(e4.getId(),e4);
        map.put(e5.getId(),e5);
        map.put(e6.getId(),e6);
       // System.out.println(map);








    }

}
