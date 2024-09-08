import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElement {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        Set<Integer> integerSet = new HashSet<>();

        Set<Integer> collect = myList.stream()
                .filter(s -> !integerSet.add(s))
                .collect(Collectors.toSet());

        System.out.println(collect);


    }
}
