package chapter4.chapter4.functionalInterfaces;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Combining {
    private static boolean answerPredicate(int num, Predicate<Integer> pred){
        return pred.test(num);

    }
    public static void main(String [] args){
        System.out.println("Witaj w pierwszej klasie");
        Boolean a = answerPredicate(15, param -> param<25);
        Predicate<Integer> pred1 = i -> i < 15;
        Predicate<Integer> pred2 = i -> i > 3;
        Predicate<Integer> predCombined = pred1.and(pred2);
        System.out.println(predCombined.test(20));

        IntStream generate = IntStream.iterate(1, c -> c + 4).limit(15);

        System.out.println(generate.sum());

        // Will cause exception as stream was closed already
        //generate.forEach(System.out::println);
    }

}
