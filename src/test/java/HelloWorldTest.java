import org.junit.Assert;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class HelloWorldTest {

    @Test
    public void hello_world_test() {
        assertThat("Hello World").isEqualTo("Hello World");
    }

    @Test
    public void should_be_mocked() {
        Dependency dependency = mock(Dependency.class);
        when(dependency.say()).thenReturn("Hello World");
        HelloWorld helloWorld = new HelloWorld(dependency);

        assertThat(helloWorld.beenCalled()).isEqualTo("Hello World");
    }

//    @Test
//    public void FizzBuzz() {
//        FizzBuzz fizzBuzz = new FizzBuzz();
//        //fizzBuzz.FizzBuzz();
//        System.out.println(fizzBuzz.FizzBuzz().toString());
//    }

    @Test
    public void testMultipleOf3() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assert.assertEquals("Fizz",fizzBuzz.of(3));
    }
}
