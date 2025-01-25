package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateElements {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,3,5,2,4,1,3,8,7,3,9);
        HashSet<Integer> set = new HashSet<>();

        list.stream()
                .distinct()
                .forEach(s-> System.out.println(s));




    }
}
