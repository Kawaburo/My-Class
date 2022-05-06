package Test;

import Algorithms.EasyNumber;
import Arrays.MyArray;
import java.io.*;

//Hello World
public class Test {
    public static void main(String[] args) {
        TestDAO testDAO= new TestDAO();
        TestDB testDB = TestDAO.show(2);
        System.out.println(testDAO.index());
        System.out.println(testDB);

    }
}