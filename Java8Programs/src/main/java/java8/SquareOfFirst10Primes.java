package java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SquareOfFirst10Primes {
    public static void main(String[] args) {

        List<Double> collect = Stream.iterate(2, i -> i + 1)
                .filter(SquareOfFirst10Primes::isPrime).peek(System.out::println)
                .map(Math::sqrt)
                .limit(10)
                .collect(Collectors.toList());

        System.out.println(collect);

    }

    public static boolean isPrime(int num){
        return num>1 && IntStream.range(2,num).noneMatch(i->num%i==0);
    }
}
