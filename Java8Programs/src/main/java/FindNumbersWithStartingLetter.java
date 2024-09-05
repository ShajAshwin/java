import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindNumbersWithStartingLetter {
    public static void main(String[] args) {

        int[] integers = {1,2,5,7,9,34,21,19,15};

        List<String> list = Arrays.stream(integers)
                .boxed()
                .map(s -> s + "")
                .filter(s -> s.startsWith("2"))
                .collect(Collectors.toList());

        System.out.println(list);

    }
}
