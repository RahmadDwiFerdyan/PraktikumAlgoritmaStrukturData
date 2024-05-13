package PraktikumAlgoritmaStrukturData.Pertemuan12.tugasPraktikum;

import java.util.Scanner;

public class vaksinDLLMain {
    public static void main(String[] args) throws Exception {
        vaksinDLL antrean = new vaksinDLL();
        Scanner sc = new Scanner(System.in);
        int nomor;
        String nama;
        int pilih;

        do {
            System.out.println("[]");
            System.out.println("=================================");
            System.out.println("| PENGANTRI VAKSIN EXTRAVAGANZA |");
            System.out.println("=================================");
            System.out.println("1. Tambah data penerima vaskin");
            System.out.println("2. Hapus data pengantre vaksin");
            System.out.println("3. Daftar penerima vaksin");
            System.out.println("4. Keluar");
            System.out.println("=================================");
            System.out.print("Masukkan pilihan: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("---------------------------------");
                    System.out.println("Masukkan data penerima vaksin");
                    System.out.println("---------------------------------");
                    System.out.print("Nomor antrian: ");
                    nomor = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama penerima: ");
                    nama = sc.nextLine();
                    antrean.addLast(nomor, nama);
                    break;

                case 2:
                    System.out.println("---------------------------------");
                    System.out.println(antrean.getFirst() + " telah selesai divaksin.");
                    antrean.removeFirst();
                    System.out.println("---------------------------------");
                    System.out.println("===========================");
                    System.out.println("| Daftar Pengantri Vaksin |");
                    System.out.println("===========================");
                    System.out.println("|Nomor\t|Nama\t|");
                    antrean.print();
                    System.out.println("Sisa Antrian: " + antrean.size());
                    break;

                case 3:
                System.out.println("===========================");
                System.out.println("| Daftar Pengantri Vaksin |");
                System.out.println("===========================");
                    System.out.println("|Nomor\t|Nama\t|");
                    antrean.print();
                    System.out.println("Sisa Antrian: " + antrean.size());

            }
        } while (pilih == 1 || pilih == 2 || pilih == 3);

    }

}
