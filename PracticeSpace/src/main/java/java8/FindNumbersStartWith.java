package java8;

import java.util.Arrays;
import java.util.List;

public class FindNumbersStartWith {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,12,34,44,21,13,78,61,19,87);

         list.stream()
                .map(s->s+"")
                .filter(s->s.startsWith("1"))
                .forEach(s-> System.out.println(s));

    }
}
