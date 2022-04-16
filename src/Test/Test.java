package Test;

import java.io.*;

public class Test {
    private FileOutputStream fileOutputStream;
    private String dest;
    private Object object;

    public Test(String dest, Object object) throws FileNotFoundException {
        this.dest = dest;
        this.object = object;

    }

    {
        try {
            fileOutputStream = new FileOutputStream(dest);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(object);
        } catch (IOException e) {
            System.out.println("File Not Found");
        }
    }

}