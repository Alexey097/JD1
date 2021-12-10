package HomeWork_1;

import java.util.Objects;
import java.util.Scanner;

public class Task5_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя");

        String name = in.nextLine();

        boolean Vasya = Objects.equals(name,"Вася");
        boolean Nastya = Objects.equals(name,"Анастасия");

        if (Vasya){
            System.out.println("Привет!");
            System.out.print("Я тебя так долго ждал");
        }
        if (Nastya){
            System.out.print("Я тебя так долго ждал");
        }
        if (!Nastya & !Vasya){
            System.out.print("Добрый день, а вы кто?");
        }
    }
}
