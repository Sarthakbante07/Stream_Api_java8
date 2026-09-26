// TODO Square even number from list

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamFour {
    public static void main(String[] args){
        List<Integer> number = Arrays.asList(1,2,3,4,5);

        List<Integer> snumber = number.stream()
                .filter(x -> x%2==0)
                .map(x->x*x)
                .collect(Collectors.toList());

        System.out.println(snumber);
    }
}
