package ch14.example;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.IntPredicate;

public class OptionalEx1 {
    public static void main(String[] args) {
        Optional<String> optString = Optional.of("abcde");
        Optional<Integer> optInt = optString.map(String::length);

        System.out.println("optString = " + optString.get());
        System.out.println("optInt = " + optInt.get());

        int result1 = Optional.of("123").filter(x -> x.length() > 0).map(Integer::parseInt).get();
        int result2 = Optional.of("").filter(x -> x.length() > 0).map(Integer::parseInt).orElse(-1);

        System.out.println("result1 =" + result1);
        System.out.println("result2 =" + result2);

        Optional.of("456").map(Integer::parseInt).ifPresent(x -> System.out.printf("result3 = %d\n", x));

        OptionalInt optInt1 = OptionalInt.of(0);
        OptionalInt optInt2 = OptionalInt.empty();

        System.out.println(optInt1.isPresent()); // true
        System.out.println(optInt2.isPresent()); // false

        System.out.println(optInt1.getAsInt());
        // System.out.println(optInt2.getAsInt()); // NoSuchElementException
        System.out.println("optInt1 = " + optInt1);
        System.out.println("optInt2 = " + optInt2);
        System.out.println("optInt1.equals(optInt2) ? " + optInt1.equals(optInt2));

        Optional<String> opt = Optional.ofNullable(null); // null
        Optional<String> opt2 = Optional.empty(); // 빈 객체
        System.out.println("opt = " + opt);
        System.out.println("opt2 = " + opt2);
        System.out.println("opt.equals(opt2) ? " + opt.equals(opt2)); // true

        int result3 = optStringToInt(Optional.of("123"), 0);
        int result4 = optStringToInt(Optional.of(""), 0);

        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
    }

    static int optStringToInt(Optional<String> optString, int defaultValue) {
        try {
            return optString.map(Integer::parseInt).get();
        } catch (Exception e) {
            return defaultValue;
        }
    }
}
