package Algorithms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

    public static Object readObject(String dest) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(dest);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        return objectInputStream;
    }
}