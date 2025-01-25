package core;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindLargestString {
    public static void main(String[] args) {
        String string[] = {"java","spring","springBoot","microservices"};

        String largestString = Arrays.stream(string)
                .reduce((a,b) -> a.length()<b.length()?a:b)
                .get();

        System.out.println(largestString);


    }
}
