package HomeWork_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,10,-2,4,-3,2};
        int sum = 0;
        for (int i = 0;i< arr.length;i++){
            if (arr[i]>0 && arr[i]%2==0){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}
