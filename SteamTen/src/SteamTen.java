// TODO : SUM Of Square of even number in list

import java.util.Arrays;
import java.util.List;

public class SteamTen {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer i  = list.stream()
                .filter(x -> x%2 == 0)
                .map(x -> x*x)
                .reduce(0, (a,b) -> a+b);

        System.out.println(i);
    }
}
