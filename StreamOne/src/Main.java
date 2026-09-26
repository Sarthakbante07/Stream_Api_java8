//TODO : Question - How Do You Create Streams in Java?

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("alice", "bob", "Joe", "don", "hari");
        // List -> Stream
        Stream<String> stream =  names.stream();

        String[] arr = {"Java", "Python", "C++", "C#", "Ruby"};
        // Array -> Stream
        Stream<String> stream1 = Arrays.stream(arr);

        //By using Stream.of Method
        Stream<Integer> integerStream= Stream.of(1,2,3,4,5,6,7,8,9,10);

        //By using Stream.generate Method
        Stream<Double> limit =  Stream.generate(Math::random).limit(10);



    }
}