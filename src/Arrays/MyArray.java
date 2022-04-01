package Arrays;

public class MyArray {

    //массив со случайными числами
    public static int[] randomArray(int size, int maxVal) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            int randomVal = (int) (Math.random() * maxVal);
            array[i] = randomVal;
        }
        return array;
    }

    //вывод в консоль
    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) System.out.print(" " + array[i]);
    }
     //массив по порядку
    public static int[] inOrder(int size, int startNumber) {
        int[] array = new int[size];
        array[0]=startNumber;
        for (int i = 1; i < array.length; i++) {
            startNumber++;
            array[i]=startNumber;
        }
        return array;
    }

}
