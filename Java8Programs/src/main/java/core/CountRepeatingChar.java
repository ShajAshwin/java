package core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountRepeatingChar {
    public static void main(String[] args) {

        String line = "cloudysunday";

        String lineArray[] = line.split("");


        Map<String, Long> map = new HashMap<>();


                map = Arrays.stream(lineArray)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));



        System.out.println(map);

//Another method

        String lineArray1[] = line.split("");
        Map<String, Integer> mapp = new HashMap<>();

        Arrays.stream(lineArray1)
                .forEach(s -> mapp.put(s,mapp.getOrDefault(s,0)+1));

        System.out.println(mapp);

    }
}
