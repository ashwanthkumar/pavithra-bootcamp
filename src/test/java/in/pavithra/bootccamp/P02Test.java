package in.pavithra.bootccamp;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class P02Test {
    @Test
    public void shouldFindSecondLastElementFromAList() throws Exception {
        List<Integer> numbers = asList(1, 2, 11, 4, 5, 8, 10, 6);
        assertThat(P02.secondLast(numbers), is(equalTo(10)));
    }

    @Test
    public void shouldFindSecondLastInListOfSizeTwo() {
        List<Integer> numbers = asList(1, 2);
        assertThat(P02.secondLast(numbers), is(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnExceptionForEmptyList() {
        P02.secondLast(new ArrayList<>());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionForListOfSize1() {
        P02.secondLast(asList(1));
    }

}