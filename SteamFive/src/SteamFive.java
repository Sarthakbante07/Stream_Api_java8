// TODO : Find the First number greater than 10 from list.

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SteamFive {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,10,4,53,6,35,354,33);

      Optional<Integer> num =  numbers.stream()
                .filter(x-> x > 10)
                .findFirst(); //Terminal Operation return 1st element from your result Return Optional type.

        System.out.println(num.get());
    }
}
