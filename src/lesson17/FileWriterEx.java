/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson17;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = "TestClass string";
        try (FileWriter writer = new FileWriter("test2.txt", true)) {
            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
