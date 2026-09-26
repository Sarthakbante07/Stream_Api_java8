// TODO Convert number in list to there Square

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamThree {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        List<Integer> newstream = numbers.stream()
                .map(x->x*x)
                .collect(Collectors.<Integer>toList());

        System.out.println(newstream);
    }
}
