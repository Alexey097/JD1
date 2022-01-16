package HomeWork_4;

import HomeWork_4.dto.DataContainer;

class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<String> container = new DataContainer<>(new String[1]);
        System.out.println(container);

        //Проверки по условию из задания:

        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");
        String text1 = container.get(index1);
        String text2 = container.get(index2);
        String text3 = container.get(index3);
        String text4 = container.get(index4);
        //Должно вывести на экран строку "Привет"
        System.out.println(text1);
        //Должно вывести на экран строку "Как дела"
        System.out.println(text2);
        //Должно вывести на экран строку "Работаю"
        System.out.println(text3);
        //Должно вывести на экран строку "Давай потом"
        System.out.println(text4);
        //Удаляем данные из массива
        container.delete(text1);
        //Должно вывести на экран строку "Как дела", так как данные со строкой "Привет" были удалены в предыдущем шаге
        System.out.println(container.get(index1)); //Как дела

        //Проверка сортировки данных массива
        container.sort(String::compareTo);
        System.out.println(container);
    }
}
