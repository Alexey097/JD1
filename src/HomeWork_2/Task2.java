package HomeWork_2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int chislo = in.nextInt();
        int dublicatChisla = chislo;
        int kolvo = 0;
        while (dublicatChisla > 0) {
            int partNumber = dublicatChisla % 10;
            //System.out.println(chislo);
            kolvo++;
            dublicatChisla /= 10;
        }
        //System.out.println(kolvo);
        //int[] odd = new int[kolvo];
        //int[] even = new int[kolvo];

        int odd = 0;
        int even = 0;
        //System.out.println(chislo);
        while (chislo > 0) {
            int partNumber = chislo % 10;
            //System.out.println(chislo);
            if (partNumber % 2 == 0) {
                odd += partNumber;
            } else {
                even += partNumber;
            }
            chislo /= 10;
        }
        System.out.println("Сумма четных цифр в числе равна "+odd);
        System.out.println("Сумма нечетных цифр в числе равна "+even);
    }
}