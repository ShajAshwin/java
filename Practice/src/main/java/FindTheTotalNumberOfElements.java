import java.lang.reflect.Array;
import java.util.Arrays;

public class FindTheTotalNumberOfElements {
    public static void main(String[] args) {
        int[] myList = {10,15,8,49,25,98,32};

        Integer integer = Arrays.stream(myList)
                .boxed()
                .reduce((a, b) -> a + b)
                .get();

        System.out.println(integer);
    }
}
