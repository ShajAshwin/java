package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorted {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        myList.stream()
                .sorted((a,b) -> b-a)
                .forEach(System.out::println);

//
//        myList.stream()
//                .sorted((a,b) -> b-a)
//                .mapToInt(x->x)
//                .summaryStatistics()
//                .getAverage();
    }

}
