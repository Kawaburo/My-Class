package Start;

import Algorithms.EasyNumber;
import Arrays.MyArray;
import Sort.MySort;
import Test.Test;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main implements Serializable {
    public static void main(String[] args) {
        int [] array = MyArray.inOrder(99,1);
        EasyNumber.easyNumber(array);
    }
}
