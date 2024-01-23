package ExceptionHandling;

import java.io.IOException;

import static ExceptionHandling.ExceptionHandling.callMethod;

public class ExceptionHandling {

    public static int callMethod() {
        try {
            int a = 0;
            if (a == 0) {
                throw new Exception("Exception");
            }
        } catch (Exception e) {
            return 1;
        }finally {
            return 2;
        }

    }




    public static void main(String[] args) {
        System.out.println(callMethod());
    }
}
