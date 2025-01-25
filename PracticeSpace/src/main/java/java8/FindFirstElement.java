package java8;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6,3,7,8,5,9,2);

         list.stream()
//                .findFirst()
//                .ifPresent(System.out::println);

                 .max((s,m)-> m.compareTo(s))
                 .ifPresent(System.out::println);



    }
}
