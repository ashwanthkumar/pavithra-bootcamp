package in.pavithra.bootccamp;

import java.util.List;

public class P01 {

    public static String last(List<String> input) {
        if (input.isEmpty()) throw new IllegalArgumentException();
        return input.get(input.size() - 1);
    }

    public static String first(List<String> input) {
        if (input.isEmpty()) throw new IllegalArgumentException();
        return input.get(0);
    }

    public static String index(int n, List<String> input) {
        if (input.size() >= (n + 1)) return input.get(n);
        throw new IllegalArgumentException();
    }


}
