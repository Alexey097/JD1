package HomeWork_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int[] byyte = {0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(Arrays.toString(byyte));
        Scanner in = new Scanner(System.in);
        System.out.println("Введите десятичное число для перевода в двоичную систему счисления");
        int chislo = in.nextInt();
        int c = chislo;
        //byyte[0]=1;
        //System.out.println(byyte[1]);
        //FirstCheck
        if (c > 1) {
            if (c % 2 == 0) {
                c = c / 2;
                byyte[7] = 0;
            } else {
                byyte[7] = 1;
            }
        } else {
            for (int i = 0; i < 8; i++) {
                System.out.print(byyte[i]);
            }
            }
        System.out.println("Check1");
        //SecondCheck
        if (c > 1) {
            if (c % 2 == 0) {
                c = c / 2;
                byyte[6] = 0;
            } else {
                byyte[6] = 1;
            }
        } else {
            for (int i = 0; i < 8; i++) {
                System.out.print(byyte[i]);
            }
        }
        System.out.println("Check2");
        //ThirdCheck
        if (c > 1) {
            if (c % 2 == 0) {
                c = c / 2;
                byyte[5] = 0;
            } else {
                byyte[5] = 1;
            }
        } else {
            for (int i = 0; i < 8; i++) {
                System.out.print(byyte[i]);
            }
        }
        System.out.println("Check3");
        //ForthCheck
        if (c > 1) {
            if (c % 2 == 0) {
                c = c / 2;
                byyte[4] = 0;
            } else {
                byyte[4] = 1;
            }
        } else {
            for (int i = 0; i < 8; i++) {
                System.out.print(byyte[i]);
            }
        }
        System.out.println("Check4");
        //FifthCheck
        if (c > 1) {
            if (c % 2 == 0) {
                c = c / 2;
                byyte[3] = 0;
            } else {
                byyte[3] = 1;
            }
        } else {
            for (int i = 0; i < 8; i++) {
                System.out.print(byyte[i]);
            }
        }
        System.out.println("Check5");
        //SixthCHeck
        if (c > 1) {
            if (c % 2 == 0) {
                c = c / 2;
                byyte[2] = 0;
            } else {
                byyte[2] = 1;
            }
        } else {
            for (int i = 0; i < 8; i++) {
                System.out.print(byyte[i]);
            }
        }
        System.out.println("Check6");
        //SeventhCheck
        if (c > 1) {
            if (c % 2 == 0) {
                c = c / 2;
                byyte[1] = 0;
            } else {
                byyte[1] = 1;
            }
        } else {
            for (int i = 0; i < 8; i++) {
                System.out.print(byyte[i]);
            }
        }
        System.out.println("Check7");
        //EightCheck
        if (c > 1) {
            if (c % 2 == 0) {
                c = c / 2;
                byyte[0] = 0;
            } else {
                byyte[0] = 1;
            }
        } else {
            for (int i = 0; i < 8; i++) {
                System.out.print(byyte[i]);
            }
        }
        for (int i = 0; i < 8; i++) {
            System.out.print(byyte[i]);
        }

    }
}
