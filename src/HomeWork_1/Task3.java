

package HomeWork_1;

public class Task3 {
    public static void main(String[] args) {
        int a = 16;
        System.out.println(Math.toRadians(a)); //Перевод числа в радианы
        System.out.println(Math.pow(a,2)); //Возведение числа в степень
        System.out.println(Math.sqrt(a)); //Корнь от числа
        System.out.println(Math.hypot(5.0,9.0)); //Вычисление гипотенузы по двум катетам (квадрат суммы двух квадратных чисел)
        System.out.println(Math.floor(15.9)); //Округление в "меньшую" сторону
        System.out.println(Math.round(15.9)); //Округление в "большую" сторону
        System.out.println(Math.random()); //Получение рандомного числа
        System.out.println(Math.random()*1001); //Получение рандомного числа от 0 до 1001
        System.out.println(Math.floor(Math.random()*10)); //Округление рандомного числа (до 10) в меньшую сторону

    }
}
