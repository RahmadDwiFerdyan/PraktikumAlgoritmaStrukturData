package PraktikumAlgoritmaStrukturData.Pertemuan7;

import java.util.Scanner;

public class BukuMain23 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        Buku23[] dataBuku = new Buku23[5];
        int jumBuku = 5;

        System.out.println("--------------------------------");
        System.out.println("Masukkan data buku secara urut dari kode buku terkecil: ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("--------------------------------");
            System.out.print("Kode buku   \t: ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul Buku  \t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun terbit\t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang   \t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stock       \t: ");
            int stock = s.nextInt();

            Buku23 m = new Buku23(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            dataBuku[i] = m;
        }

        System.out.println("--------------------------------");
        for (Buku23 buku : dataBuku) {
            buku.tampilDataBuku();
        }

        System.out.println("_________________________________");
        System.out.println("_________________________________");
        System.out.println("Pencarian data: ");
        System.out.println("Masukkan kode buku yang dicari: ");
        System.out.print("Kode buku: ");
        int cari = s.nextInt();
        System.out.println("*Menggunakan SEQUENTIAL SEARCH");
        
        // modifikasi kode --> method baru dengan nama FindBuku
        int posisi = Buku23.findBuku(dataBuku, cari);

        if (posisi != -1) {
            dataBuku[posisi].tampilDataBuku();
        } else {
            System.out.println("Kode tidak ditemukan.");
        }
        System.out.println("_________________________________");
    }
}
