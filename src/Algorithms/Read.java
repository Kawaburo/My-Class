package Algorithms;

import java.io.*;

public class Read {
    private String dest;
    private Object object;

    {
        try {
            FileInputStream fileInputStream = new FileInputStream(dest);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            object = objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error read file");
        }
    }
}
