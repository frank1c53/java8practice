package HashPractice;

public class StringReverse {

    public static String stringRev(String s){
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }

        return rev;
    }
    public static void main(String[] args) {
        String s ="Hey frank how are you";
        String rev = "";
        String array[] =s.split(" ");
        for(int i=0;i<array.length;i++){
            rev+=stringRev(array[i]);
            rev+= " ";
        }
        System.out.println(rev);
    }

}
