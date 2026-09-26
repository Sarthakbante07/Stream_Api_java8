// TODO : Find sum and product of all number in list.

import java.util.Arrays;
import java.util.List;

public class SteamSeven {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // reduce function(initial, ongoing), By default Termination function and return Output.
        Integer i = list.stream()
                .reduce(0, (a,b) -> a+b);

        Integer j = list.stream()
                        .reduce(1,(a,b) -> a*b);

        System.out.println("SUM "+i);
        System.out.println("Multiplication " + j);
    }
}
