// TODO: Find sum of even number in List

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SteamEight {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

       Integer i =  list.stream()
                .filter(x -> x%2 ==0 )
                .reduce(0,(a,b) -> a+b);

       System.out.println(i);
    }
}
