import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindDuplicateElementAndStoreInMap {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "a", "b", "b", "c", "c", "c");
        HashMap<String,Integer> map = new HashMap<>();
        int count = 0;

//        for(String element : list){
//            map.put(element,map.getOrDefault(element,0));
//        }
//
//        System.out.println(map);

        //Streams

        list.stream()
                .forEach(s->map.put(s,map.getOrDefault(s,0)+1));

        System.out.println(map);
  }

}
