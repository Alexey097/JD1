package HomeWork2.utils;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtilsTask2_1 {
    public static void main(String[] args) {
    }
    public static int[] arrayFromConsole() {
        Scanner razmer = new Scanner(System.in);
        System.out.println("Задайте размер массива");
        int arrayRazmer = razmer.nextInt();

        int[] newArray = new int[arrayRazmer];
        for (int i = 0; i < arrayRazmer; i++) {
            Scanner initialYacheek = new Scanner(System.in);
            System.out.println("Проинициализируйте ячейку №"+i+" нового массива");
            newArray[i] = initialYacheek.nextInt();
        }
        return newArray;
    }
    public static int[] arrayRandom(int size, int maxValueExclusion){
        int[] newArray = new int[size];
        for (int j=0;j<size;j++){
            Random random = new Random();
            newArray[j]=random.nextInt(maxValueExclusion);
        }
        return newArray;
    }
}


