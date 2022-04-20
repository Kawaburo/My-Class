package Algorithms;

import java.math.BigDecimal;

public class EasyNumber {

    //проврка одного числа
    public static void easyNumber(int number) {
        float floatNumber = number;
        floatNumber = (floatNumber * floatNumber - 1) / 24;
        if (number == 0 || number == 1 || number == 2 || number == 3) {
            System.out.println(number + " простое число");
        }
        else if (BigDecimal.valueOf(floatNumber).scale() > 2)
            System.out.println(number + " составное число");
        else System.out.println(number + " простое число");
    }

    //проверка массива
    public static void easyNumber(int[] array) {
        int easyNumber =0;
        int notEasyNumber =0;

        for (int i = 0; i < array.length; i++) {
            double y =(double) (array[i]*array[i]-1)/24;
            float z = (float) (y-(int)y);
            if (array[i] == 0 || array[i] == 1 || array[i] == 2 || array[i] == 3|| z==0) {
                easyNumber++;
            }
            else notEasyNumber++;
        }
        System.out.println("В массиве "+easyNumber+" простых и "+notEasyNumber+" составных чисел ");


    }
    //новая проверка на простые числа

}