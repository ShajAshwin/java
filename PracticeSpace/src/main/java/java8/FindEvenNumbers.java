package java8;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumbers {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        list.stream()
                .filter(f->f%2==0)
                .forEach(f-> System.out.println(f));

    }

}
