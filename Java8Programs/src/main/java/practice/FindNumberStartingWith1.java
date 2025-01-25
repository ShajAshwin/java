package practice;

import java.util.Arrays;
import java.util.List;

public class FindNumberStartingWith1 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,10,4,56,16,34,19,66);

        list.stream()
                .map(m->m+"")
                .filter(n->n.startsWith("1"))
                .forEach(s -> System.out.println(s));


    }
}
