package Arrays;

public class MyArray {

    public static int[] randomArray(int size, int maxVal) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            int randomVal = (int) (Math.random() * maxVal);
            array[i] = randomVal;
        }
        return array;
    }

    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) System.out.print(" " + array[i]);
    }

}
