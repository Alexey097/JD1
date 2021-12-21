package HomeWork2.loops;

public class Task1_1_1 {
    public static void main(String[] args) {

        String cifra = args[0];
        long chislo = Long.parseLong(cifra);
        long sosud = 1;

        if (chislo<0){
            System.out.println("Вы ввели отрицательное число");
        }else if (chislo>25){
            System.out.println("Вы ввели слишком большое число, попробуйте меньше");
        } else {
            for (int i = 0; i < chislo; ) {
                sosud = sosud * ++i;
            }
            System.out.println(sosud);
        }
    }
}
