package HomeWork_1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        boolean weekday = false;
        boolean vacation = false;

        //Узнаем нужна ли проверка продолжения сна
        Scanner in = new Scanner(System.in);
        System.out.println("Хотите узнать можно ли в данный момент спать дольше или пора вставать?");
        String wakeUp = in.nextLine();

        if (wakeUp.equals("Да")){

            //Если да, просим ввести какой день недели и передаем указанный день в переменную
            Scanner in1 = new Scanner(System.in);
            System.out.println("Какой сегодня день?");
            String firstQuestion = in1.nextLine();

            //Узнаем отпуск ли сегодня и передаем ответ в переменную
            System.out.println("Может быть сегодня у вас отпуск?");
            String secondQuestion = in1.nextLine();

            //Устанавливаем для переменной рабочий день или выходной путем булиевого значения
            if (firstQuestion.equals("Понедельник")){
                weekday = false;
            } else if (firstQuestion.equals("Вторник")){
                weekday = false;
            } else if (firstQuestion.equals("Среда")){
                weekday = false;
            } else if (firstQuestion.equals("Четверг")){
                weekday = false;
            } else if (firstQuestion.equals("Пятница")){
                weekday = false;
            } else if (firstQuestion.equals("Суббота")){
                weekday = true;
            } else if (firstQuestion.equals("Воскресенье")){
                weekday = true;
            }

            //Устанавливаем для переменной отпуск или нет путем булиевого значения
            if (secondQuestion.equals("Да")) {
                vacation = true;
            } else {
                vacation = false;
            }

            //Вызываем метод проверки можем ли спать дальше
            Task4_1 s = new Task4_1();
            System.out.println(Task4_1.sleepIn(weekday,vacation));

        }
        System.out.println("До свидания!");


    }

}

