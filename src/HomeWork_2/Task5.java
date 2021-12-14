package HomeWork_2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите минимальное число");
        int min = in.nextInt();

        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите максимальное число");
        int max = in1.nextInt();

        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите шаг прибавления чисел");
        int shag = in2.nextInt();

        for (int min1=min;min<max;min1+=shag){
            if (min1>max){
                break;
            } else {System.out.print(min1+" ");
            }
        }
    }
}
