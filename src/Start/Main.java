package Start;

import Algorithms.ReadObject;
import Algorithms.Write;
import Arrays.MyArray;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String dest = "E:\\java\\My-Class\\files\\newArray";
        int [] newArray = MyArray.inOrder(69,3);
        Write.writeArray(dest,newArray);
    }
}
