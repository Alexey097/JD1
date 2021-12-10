package HomeWork_1;

import java.util.Objects;
import java.util.Scanner;

public class Task5_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя");

        String name = in.nextLine();

        boolean Vasya = Objects.equals(name,"Вася");
        boolean Nastya = Objects.equals(name,"Анастасия");

        switch (name){
            case "Вася":
                System.out.println("Привет!");
                System.out.print("Я тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.print("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }
    }
}
