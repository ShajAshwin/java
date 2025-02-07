package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Find2HighestValue {

    public static void main(String[] args) {
        int numbers[] = {1,5,7,2,4,9,6};

         Arrays.stream(numbers)
                .boxed()
                .sorted((a,b)-> b.compareTo(a))
                .skip(1)
                .findFirst().ifPresent(System.out::println);


//        System.out.println(integers);

    }


}
