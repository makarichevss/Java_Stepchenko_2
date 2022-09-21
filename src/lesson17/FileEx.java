/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson17;

import java.io.File;

public class FileEx {
    public static void main(String[] args) {
        File file = new File("test2.txt");
        File folder = new File("lesson17\\test");
        System.out.println(file.getAbsolutePath());
        System.out.println(folder.getAbsolutePath());
    }
}
