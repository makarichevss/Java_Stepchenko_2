package lesson1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Petr");
        list.add("Ivan");
        list.add("Roman");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
