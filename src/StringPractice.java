import java.util.HashMap;

public class StringPractice {
    public static void main(String[] args) {
        String s = "Frank";
        String s1 = "Frank";
        String s2 = s1;
        String s3 = new String("Frank");
        System.out.println(s==s1);
        System.out.println(s==s2);
        System.out.println(s==s3);
        System.out.println(s.equals(s3));
        s = "hello";

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i)))
                   map.put(s.charAt(i),1);
            else
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }

        System.out.println(map);
    }
}
