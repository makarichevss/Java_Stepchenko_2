/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson17;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        try (
                BufferedReader reader = new BufferedReader(new FileReader("test2.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("test3.txt"));
        ) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
