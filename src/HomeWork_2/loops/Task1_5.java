package HomeWork_2.loops;

public class Task1_5 {
    public static void main(String[] args) {
        int a=1;
        int x=1;
        int b=2;
        int d=4;
        int f=6;
        int n=10;

        for(int i =0;i<n;i++){
            int b1=0;
            for (int j = 1;j<=d;j++){
                b1=b*a;
                if (b1/10==0){
                    System.out.print("|"+b+"x"+a+"=  "+b1+"|");
                } else if (b1/10!=0&a/10!=0){
                    System.out.print("|"+b+"x"+a+"="+b1+"|");
                } else {
                    System.out.print("|"+b+"x"+a+"= "+b1+"|");
                }
                b++;
                }
            b= 2;
            a++;
            System.out.println();
            }
        System.out.println("====================================");
        for(int o =0;o<n;o++){
            int z=0;
            for (int j = 1;j<=d;j++){
                z=f*x;
                if (z/10==0){
                    System.out.print("|"+f+"x"+x+"=  "+z+"|");
                } else if (z/10!=0&x/10!=0){
                    System.out.print("|"+f+"x"+x+"="+z+"|");
                } else {
                    System.out.print("|"+f+"x"+x+"= "+z+"|");
                }
                f++;
            }
            f= 6;
            x++;
            System.out.println();
        }
        }
}
