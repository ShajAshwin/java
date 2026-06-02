package codeDecode.java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class primeNumber {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1,2,4,5,6,8,9,0,4,2);
//
//        list.stream()
//                .filter(n->n%2==0)
//                .forEach(System.out::println);
//     }

        int[] arr = {10,15,8,49,25,98,32};

    Map<Boolean, List<Integer>> list = Arrays.stream(arr).boxed()
            .collect(Collectors.partitioningBy(num -> num % 2 == 0));

    System.out.println(list.get(true));


   }
}
