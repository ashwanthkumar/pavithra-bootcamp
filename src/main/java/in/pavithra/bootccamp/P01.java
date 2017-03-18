package in.pavithra.bootccamp;

import java.util.List;

public class P01 {

    public static String last(List<String> input) {
        if (input.isEmpty()) throw new IllegalArgumentException();
        return input.get(input.size() - 1);
    }
}
