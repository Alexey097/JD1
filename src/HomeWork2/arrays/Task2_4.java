package HomeWork2.arrays;

import HomeWork2.utils.ArraysUtilsTask2_1;

import java.util.Arrays;

public class Task2_4 {
    public static void main(String[] args) {
        twoFourFive245();
    }

    public static void twoFourOne241() {
        int k = 0;
        int[] array = ArraysUtilsTask2_1.arrayRandom(5, 99);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                if (array[i] % 2 == 0) {
                    k += array[i];
                }
            }
        }
        System.out.println(k);
    }

    public static void twoFourTwo242() {
        int[] array = ArraysUtilsTask2_1.arrayRandom(5, 99);
        int max = -1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                if (i % 2 == 0) {
                    max = array[i];
                }
            }
        }
        System.out.println(max + "m");
    }

    public static void twoFourThree243() {
        int[] array = ArraysUtilsTask2_1.arrayRandom(5, 99);
        int averageSum = 0;
        for (int i = 0; i < array.length; i++) {
            averageSum += array[i];
        }
        averageSum /= array.length;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < averageSum) {
                System.out.println(array[j] + "m");
            }
        }
    }

    public static void twoFourFour244() {
        int[] array = ArraysUtilsTask2_1.arrayRandom(5, 99);
        int min1 = array[0];
        int min2 = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min1 > array[i]) {
                min1 = array[i];
            }
        }
        for (int j = 0; j < array.length; j++) {
            if (min2 > array[j] && array[j] != min1) {
                min2 = array[j];
            }
        }
        System.out.println(min1 + "   " + min2);
    }

    public static void twoFourFive245() {
        int[] array = ArraysUtilsTask2_1.arrayRandom(5, 99);
        int x = 2;                                              // 2.4.5
        int[] stringArray = array;
        for(int i = 0; i < x; i++) {
            for (int j = x; j < stringArray.length - 1; j++) {
                stringArray[j] = stringArray[j + 1];
            }
            stringArray[stringArray.length - i - 1] = 0;
        }
        System.out.println(Arrays.toString(stringArray));
    }
    public static void twoFourSix246() {
        int[] array = ArraysUtilsTask2_1.arrayRandom(5, 199);
        int sum = 0;
        for (int i=0;i<array.length;i++){
            int x = array[i];
            while(array[i]>0){
                sum += array[i]%10;
                array[i]/=10;
            }
        array[i]=x;
        }
        System.out.println(sum);
        for (int i : array) {
            System.out.print(i+" ");
        }
}
}