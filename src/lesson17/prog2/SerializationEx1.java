/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson17.prog2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) {
        List<String> emp1;

        try (
                ObjectInputStream input = new ObjectInputStream(new FileInputStream("emp1.bin"))
        ) {
            emp1 = (ArrayList<String>) input.readObject();
            System.out.println(emp1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
