public class FizzBuzz {
    public static String of(int i) {
        if (i % 5 == 0) {
            return "Buzz";
        }
        if (i % 3 == 0) {
            return "Fizz";
        }
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else {
            return String.format("%d", i);
        }
    }

}
