import java.util.Arrays;
import java.util.List;

public class FindNumberStartingWith1 {
    public static void main(String[] args) {
        int[] myList = {10,15,8,49,25,98,32};

        Arrays.stream(myList)
                .boxed()
                .map(s->s + "")
                .filter(s-> s.startsWith("4"))
                .forEach(s-> System.out.println(s));

    }
}
