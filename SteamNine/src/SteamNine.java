// TODO : Find the Maximum Number in List

import java.util.Arrays;
import java.util.List;

public class SteamNine {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(71, 23, 45, 15, 36, 57, 88, 99, 10);
        Integer i = list.stream()
                .reduce(0,(a,b) -> Integer.max(a,b));
        System.out.println(i);
    }
}
