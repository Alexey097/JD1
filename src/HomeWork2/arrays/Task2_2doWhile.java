package HomeWork2.arrays;

import HomeWork2.utils.ArraysUtilsTask2_1;

public class Task2_2doWhile {
    public static void main(String[] args) {

        doWhileTask1();
        doWhileTask2();
        doWhileTask3();
    }
    public static void doWhileTask1() {
        int[] doWhile = ArraysUtilsTask2_1.arrayFromConsole();
        int i = 0;

        do {
            System.out.print(doWhile[i] + " ");
            i++;
        } while (i < doWhile.length);
        System.out.println("");
        System.out.println("-------------------------");
    }
    public static void doWhileTask2() {
        int[] doWhile = ArraysUtilsTask2_1.arrayFromConsole();
        int i = 1;
        do {
            System.out.print(doWhile[doWhile.length - (doWhile.length - i)] + " ");
            i += 2;

        } while (i < doWhile.length);
        System.out.println("");
        System.out.println("-------------------------");
    }
    public static void doWhileTask3(){
        int[] doWhile = ArraysUtilsTask2_1.arrayFromConsole();
        int i = 1;

        do {
            System.out.print(doWhile[doWhile.length-i]+" ");
            i++;

        }while (i<=doWhile.length);
    }

}
