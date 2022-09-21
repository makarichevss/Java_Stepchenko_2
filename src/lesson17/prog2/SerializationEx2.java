/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson17.prog2;

import lesson17.prog1.Employee;

import java.io.*;

public class SerializationEx2 {
    public static void main(String[] args) {
        Employee employees;

        try (
                ObjectInputStream input = new ObjectInputStream(new FileInputStream("emp2.bin"));
        ) {
            employees = (Employee) input.readObject();
            System.out.println(employees);
        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
