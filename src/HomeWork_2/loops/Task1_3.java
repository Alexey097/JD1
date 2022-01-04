package HomeWork_2.loops;

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        System.out.println("Вас приветствут программа возведения в степень, после слова ЧИСЛО, введите число , которое нужно " +
                "возвести в степень, после слова СТЕПЕНЬ , это и будет степенью первого числа ");
        Scanner chis = new Scanner(System.in);
        System.out.println("ЧИСЛО");
        double chislo = chis.nextDouble();

        Scanner step = new Scanner(System.in);
        System.out.println("СТЕПЕНЬ");

        if (step.hasNextInt()){
            int stepen = step.nextInt();
            if (stepen>0){
                double j=1d;
                for (int i =0;i<stepen;i++){
                    j*=chislo;
                }
                System.out.println(chislo+" ^ "+stepen+" = "+j);
            } else {
                System.out.println("Степень может быть только положительным числом");
            }
        } else {
            System.out.println("Степень может быть только целым числом");
        }

    }
}
