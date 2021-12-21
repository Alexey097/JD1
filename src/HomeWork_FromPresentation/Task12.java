package HomeWork_FromPresentation;

public class Task12 {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 12, 133, 14, 15, 16};
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            int c = arr[i];
            int a = 0;
            while (c > 0) {
                c /= 10;
                a++;
            }
            int d = 0;
            for (; a > 0; a--) {
                while (arr[i] > 0) {
                    d += arr[i] % 10;
                    arr[i] /= 10;
                    System.out.print("число д " + d);

                }
                //System.out.print("число а " + a);
            }
        }
    }
}
