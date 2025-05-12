import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class KeyIntValueList {
    public static void main(String[] args) {

        String[] strings = {"xxx", "yyy", "zzz"};

        List<String> strings1 = Arrays.stream(strings).toList();

        Map<Integer,String> map = IntStream.range(0,strings1.size())
                                           .boxed()
                                           .collect(Collectors.toMap(s->s+1,s->strings1.get(s)));

        System.out.println(map);



    }
}
