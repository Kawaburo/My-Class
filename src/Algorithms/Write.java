package Algorithms;

import java.io.*;

public class Write {
    //private FileOutputStream fileOutputStream;
    private String dest;
    private Object object;

    public Write(String dest, Object object) throws FileNotFoundException {
        this.dest = dest;
        this.object = object;

    }

    {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(dest);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(object);
        } catch (IOException e) {
            System.out.println("File Not Found");
        }
    }

}
