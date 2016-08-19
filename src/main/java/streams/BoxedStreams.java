package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Ken Kousen on 8/15/16.
 */
public class BoxedStreams {
    public static void main(String[] args) {
        List<Integer> ints = IntStream.of(3, 1, 4, 1, 5, 9)
//                .collect(Collectors.toList());
                .collect(ArrayList<Integer>::new, ArrayList::add, ArrayList::addAll);

        List<Integer> listOfInt = IntStream.of(3, 1, 4, 1, 5, 9)
                .boxed()
                .collect(Collectors.toList());

//        IntStream.of(3, 1, 4, 1, 5, 9)
//                .collect(Collectors.toCollection(ArrayList<Integer>::new));

        int[] intArray = IntStream.of(3, 1, 4, 1, 5, 9)
                .toArray();
    }
}
