package Week5.util;

public class Calculator {
    public static int add(int a, int b){
        return a + b;
    }

    public static int sub(int a , int b){
        return a - b;
    }

    public static int mul(int a, int b){
        return a*b;
    }

    public static int div(int a, int b) {
        int result;
        try {
            result = a / b;
        } catch (Exception e) {
            System.out.println("Can't divide integer by 0");
            return -1;
        }
        return result;
    }
    }
