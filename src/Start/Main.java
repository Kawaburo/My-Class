package Start;

import Algorithms.Read;
import Algorithms.Write;
import Arrays.MyArray;
import Sort.MySort;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        long start = System.currentTimeMillis();
        int [] newArray = MyArray.randomArray(1000000,10);
        Thread.sleep(1000);
        MySort.bobbleSort(newArray);
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Прошло времени, мс: " + elapsed);
    }
}
