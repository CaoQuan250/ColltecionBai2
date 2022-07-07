package Collection.Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai3 {
    public <T> java.util.List<T> intersection(java.util.List<T> list1, java.util.List<T> list2) {
        List<T> list = new ArrayList<T>();

        for (T t : list1) {
            if(list2.contains(t)) {
                list.add(t);
            }
        }

        return list;
    }
    public static void main(String[] args){
        int n;
        int number ;
        int z;
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của ArrayList A: ");
        n = scanner.nextInt();
        for (int i = 1; i < n+1; i++) {
            System.out.print("Nhập phần tử thứ " + i  + ": ");
            number = scanner.nextInt();
            arrayList1.add(number);
        }
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        System.out.println("Nhập vào số phần tử của ArrayList B: ");
        z = scanner.nextInt();
        for (int i = 1; i < z+1; i++) {
            System.out.print("Nhập phần tử thứ " + i  + ": ");
            number = scanner.nextInt();
            arrayList2.add(number);
        }
        System.out.println("\nCác phần tử trong ArrayList A là: "+ arrayList1);
        System.out.println("\nCác phần tử trong ArrayList B là: "+ arrayList2);
        System.out.println("\nCác phần tử trùng của A và B là: "+ new Collection.Bai1.Bai3().intersection(arrayList1,arrayList2));
    }
}
