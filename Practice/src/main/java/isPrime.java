import java.util.stream.IntStream;

public class isPrime {
    public static void main(String[] args) {

        int i = 6;

        boolean b = IntStream.range(2, i)
                .noneMatch(s -> i%s == 0);

        if(b==true) System.out.println("The number is prime");
        if(b==false) System.out.println("The number is NOT prime");

    }
}
