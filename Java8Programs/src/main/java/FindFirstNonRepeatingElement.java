import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingElement {

    public static void main(String[] args) {
        String str = "gloomysunday";
        String string[] = str.split("");

        String key = Arrays.stream(string)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(s -> s.getValue() == 1)
                .findFirst().get().getKey();

        System.out.println(key);

    }


}
