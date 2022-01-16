package HomeWork_4.dto;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {
    private T[] data;

    //Конструктор класса
    public DataContainer(T[] data) {
        this.data = data;
    }

    //Метод для добавления данных в массив
    public int add(T item) {
        int i = 0;
        if (item == null) {
            return -1;
        }
        //Условие добавления если массив переполнен , то добавляем ячейку с помощью копирования массива
        if (data[data.length - 1] != null) {
            data = Arrays.copyOf(data, data.length + 1);
        }
        //Добавляем данные в первую свободную ячейку
        for (i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                return i;
            }
        }
        return i;
    }

    //Метод вызова донных по индексу из массива
    public T get(int index){
        return data[index];
    }

    //Метод вызова целого массива
    public T[] getItems(){
        return data;
    }

    //Метод поиндексового удаления данных из массива
    public boolean delete(int index) {
        //Условие проверяющее верные данные (индексы) для массива, Проверяем ввод индекса меньше 1 или индекса большего
        //чем длинна массива
        if (index < 0 && index > data.length) {
            return false;
        }
        //Условие проверяющее если удаляем индекс 1
        if (index == 1) {
            data = Arrays.copyOfRange(data, 1,data.length);
            return true;
        }
        //Условие проверяющее если удаляем максимальрный индекс массива
        else if (index == data.length) {
            data = Arrays.copyOf(data, data.length - 1);
            return true;
        }
        T[] dataNew1 = Arrays.copyOf(data, index - 1);
        T[] dataNew2 = Arrays.copyOfRange(data, index, data.length);
        data = Arrays.copyOf(data, data.length - 1);
        int count = 0;
        for (int i = 0; i < dataNew1.length; i++) {
            data[i] = dataNew1[i];
            count++;
        }
        for (int j = 0; j < dataNew2.length; j++) {
            data[count] = dataNew2[j];
            count++;
        }
        return true;
    }

    //Метод удаления из массива по прямому параметру хранящемуся в массиве
    public boolean delete(T item) {
        for (int i = 0; i < data.length; i++) {
            if(data[i].equals(item)) {
                delete(i+1);
                return true;
            }
        }
        return false;
    }

    //Метод сортировки данных добавленных в массив
    public void sort(Comparator<T> comparator) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = data.length - 1; j > i; j--) {
                if (comparator.compare(data[j - 1], data[j]) > 0) {
                    T tmp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = tmp;
                }
            }
        }

    }

    //Переопределяем метод вывода массива
    @Override
    public String toString() {
        if (data[0] == null) {
            return "Пока ничего не добавлено...";
        }
        return "DataContainer" + Arrays.toString(data);
    }
}
