/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson17.prog1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) {
        List<String> emp = new ArrayList<>();
        emp.add("Sergey");
        emp.add("Ivan");
        emp.add("Jack");

        try (
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("emp1.bin"));
        ) {
            output.writeObject(emp);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
