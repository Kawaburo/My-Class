package Start;

import Arrays.MyArray;
import Sort.MySort;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int [] newArray = MyArray.randomArray(10,50);
        MyArray.displayArray(newArray);
        System.out.println("");
        MySort.bobbleSort(newArray);
        MyArray.displayArray(newArray);

    }
}
