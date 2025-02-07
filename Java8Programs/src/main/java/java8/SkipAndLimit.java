package java8;

import java.util.stream.IntStream;

public class SkipAndLimit {
    public static void main(String[] args) {

        IntStream.range(1,10)
                .skip(2)
                .limit(5)
                .forEach(s-> System.out.print(s+" "));
    }
}
