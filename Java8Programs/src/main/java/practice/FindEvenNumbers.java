package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindEvenNumbers {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,5,6,8);

        list.stream()
                .filter(n->n%2==0)
                .forEach(System.out::println);

    }

}
