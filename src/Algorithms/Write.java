package Algorithms;

import java.io.*;

public class Write {

    public static void  writeArray(String destWrite,int [] writeArray) throws FileNotFoundException {
        File file = new File(destWrite);
        PrintWriter printWriter = new PrintWriter(file);
        for (int i = 0; i < writeArray.length; i++) {
            printWriter.print(writeArray[i]+" ");
        }
        printWriter.close();
    }
}