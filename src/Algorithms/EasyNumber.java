package Algorithms;

public class EasyNumber {

    //проврка одного числа
    public static void easyNumber(int number) {
        if (number % 2 != 1 && number % 3 != 1) {
            System.out.println("число составное");
        } else System.out.println("число простое");
    }
    //проверка массива
    public static void easyNumber(int[] array) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 1 && array[i] % 3 != 1) {
                x++;
                System.out.println(array[i]+"простое");
            } else y++;
        }
        System.out.println("в массиве "+y+" составных чисел");
        System.out.println("в массиве "+x+" простых чисел");
    }
}