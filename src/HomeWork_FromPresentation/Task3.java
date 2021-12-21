package HomeWork_FromPresentation;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Вводим число, числа которого нужно сложить
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int chislo = in.nextInt();
        //Задаю переменные куда буду помещать числа в зависимости от того четное оно или нет
        int odd = 0;
        int even = 0;
        //В цикле отделяю справа налево числа и проверяю в каждой итерации четное число или нечетное
        while (chislo > 0) {
            int partNumber = chislo % 10;
            if (partNumber % 2 == 0) {
                //Если четное - число прибавляю в переменную четных
                odd += partNumber;
            } else {
                //Если нечетное - число прибавляю в переменную нечетных
                even += partNumber;
            }
            chislo /= 10;
        }
        //Вывожу суммы в консоль
        System.out.println("Сумма четных цифр в числе равна "+odd);
        System.out.println("Сумма нечетных цифр в числе равна "+even);
    }
}