package Test;

import Arrays.MyArray;

import java.io.*;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        int [] testArray = MyArray.randomArray(10,10);
        File file = new File("test");
        PrintWriter printWriter = new PrintWriter(file);

        for (int i = 0; i < testArray.length; i++) {
            printWriter.print(testArray[i]+" ");
        }
        printWriter.close();
        MyArray.displayArray(testArray);
    }

}