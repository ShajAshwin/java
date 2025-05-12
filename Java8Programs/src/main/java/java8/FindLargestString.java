package java8;

import java.util.Arrays;
import java.util.Comparator;

public class FindLargestString {
    public static void main(String[] args) {
        String string[] = {"java","spring", "springBoot.txt","microservices"};

        String largestString = Arrays.stream(string)
                .reduce((a,b) -> a.length()<b.length()?a:b)
                .get();

        System.out.println(largestString);


    }
}
