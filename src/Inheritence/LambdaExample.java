package Inheritence;

interface Adder{
    int add(int a,int b);
}
public class LambdaExample {

    public static void main(String[] args) {
        Adder a = (x,y)->x+y;
        int sum = a.add(15,16);
        System.out.println(sum);
    }

}
