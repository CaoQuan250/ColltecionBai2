package Collection.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int n;
        int z;
        int number ;
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của ArrayList thứ nhất: ");
        n = scanner.nextInt();
        for (int i = 1; i < n+1; i++) {
            System.out.print("Nhập phần tử thứ " + i  + ": ");
            number = scanner.nextInt();
            arrayList1.add(number);
        }
        System.out.println("Các phần tử trong ArrayList thứ nhất là: "+ arrayList1);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        System.out.println("Nhập vào số phần tử của ArrayList thứ hai: ");
        z = scanner.nextInt();
        for (int i = 1; i < z+1; i++) {
            System.out.print("Nhập phần tử thứ " + i  + ": ");
            number = scanner.nextInt();
            arrayList2.add(number);
        }
        System.out.println("Các phần tử trong ArrayList thứ hai là: "+ arrayList2);
    }
}
