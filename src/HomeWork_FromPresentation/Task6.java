package HomeWork_FromPresentation;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, которое нужно перевернуть");
        int first = in.nextInt();
        int numberCount = 0;
        int a;
        int b=0;
        int second=first;
        while (first>0){
            numberCount++;
            first/=10;
        }
        while (numberCount>0){
            a=second%10;
            b+= a*Math.pow(10,(numberCount-1));
            numberCount--;
            second/=10;
        }
        System.out.print(b);
    }
}
