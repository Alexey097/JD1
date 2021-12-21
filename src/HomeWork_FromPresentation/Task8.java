package HomeWork_FromPresentation;

public class Task8 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,10,-2,12,-3,8};
        int max = -1;
        for (int i =1;arr[i]%2==0;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

    }
}
