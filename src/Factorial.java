public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));

    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = num; i >= 1; i--)
            fact *= i;
        return fact;
    }

}