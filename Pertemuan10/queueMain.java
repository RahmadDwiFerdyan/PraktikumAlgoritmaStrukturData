package PraktikumAlgoritmaStrukturData.Pertemuan10;

import java.util.Scanner;

public class queueMain {
    public static void menu() {
        System.out.println("[Masukkan operasi yang diinginkan]");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int n = sc.nextInt();
        queue Q = new queue(n);

        int pilih;

        do {
            menu();
            System.out.print(" >Masukkan pilihan: ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("--------------------------------");
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    Q.enqueue(dataMasuk);
                    System.out.println("--------------------------------");
                    break;
                case 2:
                    System.out.println("--------------------------------");
                    int dataKeluar = Q.dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                        System.out.println("--------------------------------");
                        break;
                    }
                case 3:
                    System.out.println("--------------------------------");
                    Q.print();
                    System.out.println("--------------------------------");
                    break;
                case 4:
                    System.out.println("--------------------------------");
                    Q.peek();
                    System.out.println("--------------------------------");
                    break;
                case 5:
                    System.out.println("--------------------------------");
                    Q.clear();
                    System.out.println("--------------------------------");
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
