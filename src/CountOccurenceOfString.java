public class CountOccurenceOfString {
    public static void main(String[] args) {
        String a = "frank is awesome";

        long n = a.chars().filter(e->e=='a').count();
        System.out.println(n);


    }
}
