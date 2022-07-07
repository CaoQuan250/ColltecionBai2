package Collection.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int n;
        int z;
        int number ;
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của danh sách A: ");
        n = scanner.nextInt();
        for (int i = 1; i < n+1; i++) {
            System.out.print("Nhập phần tử thứ " + i  + ": ");
            number = scanner.nextInt();
            arrayList1.add(number);
            arrayList1.sort((o1, o2) ->  o1 - o2);
        }

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        System.out.println("Nhập vào số phần tử của danh sách B: ");
        z = scanner.nextInt();
        for (int i = 1; i < z+1; i++) {
            System.out.print("Nhập phần tử thứ " + i  + ": ");
            number = scanner.nextInt();
            arrayList2.add(number);
            arrayList2.sort((o1, o2) -> o2 - o1);
        }
        System.out.println("Danh sách của A+B là: "+arrayList1+" - "+arrayList2);
    }
}
