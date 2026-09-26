// TODO : How many number Are Greater Than 5 in list

import java.util.Arrays;
import java.util.List;

public class SteamSix {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int x =0;

        long count = list.stream()
                .filter(a -> a > 7)
                .count();

    System.out.println(count);
    }
}
