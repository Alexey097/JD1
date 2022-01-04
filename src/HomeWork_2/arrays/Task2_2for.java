package HomeWork_2.arrays;

import HomeWork_2.utils.ArraysUtilsTask2_1;

public class Task2_2for {
    public static void main(String[] args) {
        //forTask1();
        //forTask2();
        forTask3();
    }

    public static void forTask1() {
        int[] forArray = ArraysUtilsTask2_1.arrayFromConsole();

        for (int i = 0; i < forArray.length; i++) {
            System.out.print(forArray[i] + " ");
        }
        System.out.println("");
        System.out.println("-------------------------");
    }

    public static void forTask2() {
        int[] forArray = ArraysUtilsTask2_1.arrayFromConsole();
        //int number = 1;
        for (int i = 1; i <= forArray.length; ) {
            System.out.print(forArray[forArray.length - (forArray.length - i)] + " ");

        }
    }
    public static void forTask3() {
        int[] forArray = ArraysUtilsTask2_1.arrayFromConsole();
        for (int i =1;i<=forArray.length;i++){
            System.out.print(forArray[forArray.length-i]+" ");

        }
    }
}
