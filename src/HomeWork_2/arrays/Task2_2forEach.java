package HomeWork_2.arrays;

import HomeWork_2.utils.ArraysUtilsTask2_1;

public class Task2_2forEach {
    public static void main(String[] args) {
        forEach1();
        forEach2();
        forEach3();
    }

    public static void forEach1() {
        int[] forArray = ArraysUtilsTask2_1.arrayFromConsole();
        for (int i : forArray) {
            System.out.print(i+" ");

        }
        System.out.println("");
        System.out.println("-------------------------");
    }

    public static void forEach2() {
        int[] forArray = ArraysUtilsTask2_1.arrayFromConsole();
        int x = 0;
        for (int i : forArray) {
            if (x%2!=0){
                System.out.print(i+" ");
            }
            x++;

        }
        System.out.println("");
        System.out.println("-------------------------");
    }

    public static void forEach3() {
        int[] forArray = ArraysUtilsTask2_1.arrayFromConsole();
        int x = forArray.length-1;
        for (int i : forArray){
            i=x;
            System.out.print(forArray[i]+" ");
            x--;
        }
    }

    }

