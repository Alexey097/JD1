package HomeWork_1;

public class Task4_1 {
    public static boolean sleepIn(boolean weekday,boolean vacation){

        if(weekday || vacation){
            System.out.println("Можем спокойно спать дальше");
            return true;
        }
        return false;
    }
}
