package HomeWork_2;

import java.lang.reflect.Array;

public class Task12 {
    public static void main(String[] args) {
        int[] arr = new int[]{11,12,133,14,15,16};
        int b=0;
        for (int i=0;i< arr.length;i++){
            int c=arr[i];
            int a=0;
            int d=0;
            int f;
            while (c>0){
                c/=10;
                a++;
            }
            for (int j=0;j<a;j++){
                f=arr[i];
                while (f!=0){
                    d+=f%10;
                    f/=10;
                }
                System.out.println(d+" ");

               /* int d;
                b= f%10;
                System.out.println(b);
                f/=10;*/
            }
            //System.out.println(a);
        }
    }
}
