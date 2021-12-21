package HomeWork2.loops;

import java.util.Scanner;

public class Task1_1_2 {
    public static void main(String[] args) {
        String cifra = args[0];
        long chislo = Long.parseLong(cifra);

        if (chislo>0){
            if (chislo<26){
                System.out.println(recurse(chislo));
            } else {
                System.out.println("Вы ввели слишком большое число, попробуйте меньше");
            }
        } else {
            System.out.println("Вы ввели отрицательное число");
        }
    }
    public static long recurse(long x){
        if (x == 1){
            return 1;
        }
        return x * recurse(x - 1);
    }
}