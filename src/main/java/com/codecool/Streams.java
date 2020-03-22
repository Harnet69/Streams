package com.codecool;

import java.util.ArrayList;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Streams {

    public static void main(String[] args) {
        /*
         * Create a stream out of the following array.
         */

        String[] a1 = {"one", "two", "three"};
        Stream<String> s1 = Stream.of(a1);
//        s1.forEach(System.out::println);

        /*
         * Create a stream containing the Strings "one" , "two" and "three"
         * without using an array
         */

        Stream<String> s2 = Stream.of("One", "Two", "Three");
//
//        /*
//         * Create a stream using a stream builder.
//         */
//
        Stream.Builder<String> b1 = Stream.builder();
        Stream<String> s3 = b1.add("Four").build();
//
//        /*
//         * Collect one of the above defined streams into a list.
//         *
//         * HINT: the keyword here is "collect"
//         */
//

        List<String> l1 = s2.collect(toList());
//
//        /*
//         * Streams can be infinite.  We obviously cannot create such a
//         * stream by supplying all the elements ourselves.
//         *
//         * HINT: When looking for methods to create such streams
//         * realize that:
//         * - These methods cannot belong to an instance
//         * - They are returning streams
//         */

            IntStream.iterate(0, i -> i + 1);

//        /*
//         * Create a stream of the powers of two.
//         */
//
        Integer twoToTheZeroth = 1;
        UnaryOperator<Integer> doubler = (Integer x) -> 2 * x;
        Stream<Integer> s4 = Stream.iterate(twoToTheZeroth, doubler);

//        /*
//         * Create a stream containing the first ten elements of s4.
//         */
//
        Stream<Integer> s5 = s4;
        s5
                .limit(10);
//                .forEach(System.out::println);

//
//        /*
//         * Create a stream containing the elements of the Fibonacci
//         * sequence.
//         *
//         * HINT: You will need to create a new class for this.
//         */
//
        Fibonacci fibSupp = new Fibonacci();
        Stream<Integer> s6 = fibSupp.getFibonacci(10);
        List<Integer> lists6 = s6
                .collect(Collectors.toList());
        System.out.println(lists6);

        // Another realization of Fibonacci
//        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
//                .limit(10)
//                .map(t -> t[0])
//                .forEach(System.out::println);

        // Sum of Fibonacci numbers
//        int sum = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
//                .limit(10)
//                .map(t -> t[0])
//                .mapToInt(Integer::intValue)
//                .sum();
//
//        System.out.println("Total : " + sum);
    }
}
