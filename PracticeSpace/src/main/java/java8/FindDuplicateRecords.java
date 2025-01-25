package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateRecords {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,3,7,8,5,9,2);
        HashSet<Integer> hashSet = new HashSet<>();

        list.stream()
                .filter(s->!hashSet.add(s))
                .forEach(s-> System.out.println(s));

        System.out.println("********************************************************************");

        //Using Distinct to eliminate duplicate

        list.stream()
                .distinct()
                .forEach(s-> System.out.println(s));

    }


}
