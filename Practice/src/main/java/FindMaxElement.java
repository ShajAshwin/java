import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class FindMaxElement {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);

        Integer integer = list.stream()
                .max(Comparator.naturalOrder())
                .get();

        System.out.println(integer);
    }
}
