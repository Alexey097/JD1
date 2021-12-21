package HomeWork_FromPresentation;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int povtor = 0;
        int countOfOdds = 0;

        while (povtor<10000) {
            Random rnd = new Random();
            int chislo = rnd.nextInt(10000);
            if (chislo%2==0){
                countOfOdds++;
            }
            povtor++;

        }
        float a = (float) countOfOdds/100;
        System.out.println("Шанс получения четного числа из 10000 псевдорандомных чисел равен "+a+"%");
    }
}
