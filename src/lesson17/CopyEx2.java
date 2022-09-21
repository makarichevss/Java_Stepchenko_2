/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson17;

import java.io.*;

public class CopyEx2 {
    public static void main(String[] args) {
        try (
            FileInputStream fis = new FileInputStream("D:\\YandexDisk\\Софт\\-1224875480.jpg");
            FileOutputStream fos = new FileOutputStream("picture.jpeg");
        ) {
            int i;
            while ((i = fis.read()) != -1) {
                fos.write(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
