package HomeWork_2;

public class Task9 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        int averageSum=0;
        for (int i=0;i< arr.length;i++){
            averageSum+=arr[i];
        }
        averageSum/=arr.length;
        for (int j=0;j< arr.length;j++){
            if (arr[j]<averageSum){
                System.out.println(arr[j]);
            }
        }
    }
}
