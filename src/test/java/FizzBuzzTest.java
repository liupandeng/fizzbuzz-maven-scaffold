
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FizzBuzzTest {
    private int number;
    private String expected;

    public FizzBuzzTest(int number, String expected) {
        this.number = number;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {3, "Fizz"},
                {5, "Buzz"},
                {15, "FizzBuzz"}
        });
    }

    @Test
    public void testMultipleOf3() {
//        assertThat(FizzBuzz.of(number)).isEqualTo(expected);
        assertEquals(expected, FizzBuzz.of(number));
    }
}

