package lesson1;

import java.util.stream.Stream;

public class Main {

    private int number;

    public static void main(String... args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2;
        sb2 = sb1.append("123");
        //TODO
        System.out.println(sb1);
        Stream<Integer> integerStream = Stream.of(1, 5, 6, 9);
        System.out.print(integerStream);
    }

    public void method(int a, int b) {

    }
}
