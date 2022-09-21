/*
 * Copyright (c) 2022. By Sergey Makarichev
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TestClass3 {

    public static String[] getWeekends(String str) {
        String[] long1 = {"saturday", "sunday"};
        String[] short1 = {"sat", "sun"};
        return str.equals("long") ? long1 : short1;
    }
}
