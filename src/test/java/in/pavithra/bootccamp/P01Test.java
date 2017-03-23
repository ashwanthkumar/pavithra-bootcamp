package in.pavithra.bootccamp;

import org.junit.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class P01Test {
    @Test
    public void shouldFindLastElementFromAListOfAlphabets() throws Exception {
        assertThat(P01.last(asList("a", "b", "c", "d")), is(equalTo("d")));
    }

    @Test
    public void shouldFindLastElementFromListOfSizeOne() {
        assertThat(P01.last(asList("a")), is("a"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnExceptionOnEmptyList() {
        P01.last(new ArrayList<>());
    }

    @Test
    public void shouldFindFirstElementFromList() {
        assertThat(P01.first(asList("a", "b", "c", "d")), is(equalTo("a")));
    }

    @Test
    public void shouldGetNthElementFromList() {
        assertThat(P01.index(2, asList("a", "b", "c", "d")), is(equalTo("c")));
    }

    @Test(expected=IllegalArgumentException.class)
    public void shouldreturnExceptionOnEmptyList() {
        P01.first(new ArrayList<>());
    }

    @Test(expected=IllegalArgumentException.class)
    public void shouldreturnExceptionIndexexceedsListSize() {
        P01.index(2,asList("a"));
    }


    @Test(expected=IllegalArgumentException.class)
    public void shouldreturnExceptionIndexequaltoListsizeOne() {
        P01.index(0,new ArrayList<>());
    }

}
