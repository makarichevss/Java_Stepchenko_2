/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson17;

import java.io.*;

public class DataStreams {
    public static void main(String[] args) {
        try (
                DataOutputStream out = new DataOutputStream(new FileOutputStream("my_test.bin"));
                DataInputStream in = new DataInputStream(new FileInputStream("my_test.bin"));
        ) {
            out.writeBoolean(true);
            out.writeByte(5);
            out.writeInt(1);
            out.writeFloat(123.4f);

            System.out.println(in.readBoolean());
            System.out.println(in.readByte());
            System.out.println(in.readInt());
            System.out.println(in.readFloat());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
