package Test;

import Algorithms.EasyNumber;
import Arrays.MyArray;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        int[] array = MyArray.inOrder(100, 0);
        EasyNumber.easyNumber(array);
    }

}