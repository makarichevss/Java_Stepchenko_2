package lesson1;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("OK");
        list.add("Privet");
        for (String o : list) {
            System.out.println(o.length());
        }

    }
}
