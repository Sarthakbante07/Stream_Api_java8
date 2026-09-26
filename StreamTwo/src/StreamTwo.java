// ToDo : Filter even Number from List

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTwo {
    public static void main(String[] args) {
       List<Integer> list = Arrays.asList(3,34,546,432,21,43);

        Stream<Integer> Slist = list.stream()
                .filter(x -> x%2 ==0);

        Slist.forEach(System.out::println);
    }
}
