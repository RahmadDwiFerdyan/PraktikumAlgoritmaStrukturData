package PraktikumAlgoritmaStrukturData.UTS;

import java.util.Arrays;
import java.util.Scanner;
public class praktikum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        praktikumMethod method = new praktikumMethod();

        int data[] = { 33, 29, 2, 18, 47, 47, 8, 32, 44, 16, 46, 10, 26, 48, 24, 14, 26 };
        System.out.println("================ DATA AWAL ================= |");
        System.out.print("\n" + Arrays.toString(data));

        method.selectionSort(data);

        System.out.println("\n\n========== DATA SETELAH DIURUTKAN ========== | (Selection sort secara ascending)");
        System.out.println("\n" + Arrays.toString(data));


        System.out.println("\n\n================ CARI DATA ================= | (Binary search)");
        System.out.print("Masukkan data yang ingin Anda cari: ");
        int cari = scanner.nextInt();
        int index = method.FindBinarySearch(cari, 0, data.length - 1, data);
        if(index == -1){
            System.out.println("Data tidak ditemukan!");
        } else {
            System.out.println("Data ditemukan pada indeks ke-" + index);
        }
        
    }

    
}
