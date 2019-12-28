

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FizzBuzzTest {
    private int[] number = {3, 5, 15};
    private String[] expected = {"Fizz", "Buzz", "FizzBuzz"};

    @Test
    public void testMultipleOf3() {
        for (int i = 0; i < number.length; i++) {
            assertEquals(expected[i], FizzBuzz.of(number[i]));
        }
    }
}