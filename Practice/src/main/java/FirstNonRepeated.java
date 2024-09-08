import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeated {
    public static void main(String[] args) {
        String input = "Java articles are Awesome";
        String character[] = input.split("");

        String key = Arrays.stream(character)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(s -> s.getValue() == 1)
                .findFirst().get().getKey();

        System.out.println(key);


    }
}
