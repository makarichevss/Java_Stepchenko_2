/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson17.prog1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivan", 15.4);
        Employee employee2 = new Employee("Sasha", 95.4);
        Employee employee3 = new Employee("Sergey", 245.4);

        try (
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("emp2.bin"));
        ) {
            output.writeObject(employee2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
