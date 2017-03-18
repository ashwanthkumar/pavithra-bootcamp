package in.pavithra.bootccamp;

import java.util.List;

public class P02 {
    public static Integer secondLast(List<Integer> input) {
        if(input.size()<2) throw new IllegalArgumentException();

        return input.get(input.size()-2);
    }
}
