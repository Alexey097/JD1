package HomeWork_2.loops;

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        System.out.println("��� ����������� ��������� ���������� � �������, ����� ����� �����, ������� ����� , ������� ����� " +
                "�������� � �������, ����� ����� ������� , ��� � ����� �������� ������� ����� ");
        Scanner chis = new Scanner(System.in);
        System.out.println("�����");
        double chislo = chis.nextDouble();

        Scanner step = new Scanner(System.in);
        System.out.println("�������");

        if (step.hasNextInt()){
            int stepen = step.nextInt();
            if (stepen>0){
                double j=1d;
                for (int i =0;i<stepen;i++){
                    j*=chislo;
                }
                System.out.println(chislo+" ^ "+stepen+" = "+j);
            } else {
                System.out.println("������� ����� ���� ������ ������������� ������");
            }
        } else {
            System.out.println("������� ����� ���� ������ ����� ������");
        }

    }
}
