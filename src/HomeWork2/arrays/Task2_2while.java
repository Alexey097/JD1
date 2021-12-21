package HomeWork2.arrays;

import HomeWork2.utils.ArraysUtilsTask2_1;

public class Task2_2while {
    public static void main(String[] args) {
        //doWhileTask1();
        doWhileTask2();
        //doWhileTask3();
    }
    public static void doWhileTask1() {
        int[] whileTask = ArraysUtilsTask2_1.arrayFromConsole();
        int i = 0;

        while (i < whileTask.length) {
            System.out.print(whileTask[i] + " ");
            i++;
        }
        System.out.println("");
        System.out.println("-------------------------");
        i = 0;
    }
    public static void doWhileTask2() {
        int[] whileTask = ArraysUtilsTask2_1.arrayFromConsole();
        int i = 1;
        while (i <= whileTask.length) {
            System.out.print(whileTask[whileTask.length - (whileTask.length - i)] + " ");
            i += 2;
        }
        System.out.println("");
        System.out.println("-------------------------");
        i = 1;
    }
    public static void doWhileTask3() {
        int[] whileTask = ArraysUtilsTask2_1.arrayFromConsole();
        int i = 1;
        while (i<=whileTask.length){
            System.out.print(whileTask[whileTask.length-i]+" ");
            i++;
        }
    }
}
