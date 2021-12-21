package HomeWork_FromPresentation;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int [] fibonache = new int[]{1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711};
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество первых чисел Фибоначче для вывода");
        int count = in.nextInt();
        int i = 0;

        while (count>0){
            System.out.print(fibonache[i]+" ");
            count--;
            i++;
        }
    }
}