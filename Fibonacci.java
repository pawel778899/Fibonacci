import java.util.Random;

public class Fibonacci {
    public static void main(String[] args) {

        Random random = new Random();
        long number = random.nextLong(50);
        System.out.println(fibonacci(number));

    }
    public static long fibonacci(long number){
        if(number<2) return 1;
        return fibonacci(number-1) + fibonacci(number-2);
    }
}
