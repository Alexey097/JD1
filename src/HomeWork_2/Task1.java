package HomeWork_2;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int povtor = 0;
        int countOfOdds = 0;
        float result;

        while (povtor<10000) {
            Random rnd = new Random();
            int chislo = rnd.nextInt(10000);
            if (chislo%2==0){
                countOfOdds++;
            }
//            System.out.println(chislo);
            povtor++;

        }
//        System.out.println(povtor);
//        System.out.println(countOfOdds);
        float a = (float) countOfOdds/100;
        System.out.println("Шанс получения четного числа из 10000 псевдорандомных чисел равен "+a+"%");
    }
}