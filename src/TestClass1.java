import java.util.ArrayList;
import java.util.List;

public class TestClass1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 5, 6, 8, 10, 11);
        List<Integer> result = removeEven(list);
        System.out.println(result);
    }

    private static List<Integer> removeEven(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (Integer value : list) {
            if (value % 2 != 0)
                result.add(value);
        }
        return result;
    }
}
