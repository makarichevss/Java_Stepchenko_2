/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson17;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessF {
    public static void main(String[] args) {
        try(
                RandomAccessFile file = new RandomAccessFile("test3.txt","rw")
                ) {
            int a = file.read();
            String a2 = file.readLine();
            file.seek(96);
            String a3 = file.readLine();
            long pos = file.getFilePointer();
            file.seek(0);
            file.seek(file.length() - 1);
            file.writeBytes("\n\t\t\thi");
            System.out.println((char) a);
            System.out.println(a2);
            System.out.println(a3);
            System.out.println(pos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
