package PraktikumAlgoritmaStrukturData.Pertemuan7;

import java.util.Scanner;

public class BukuMain23 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku23 data = new PencarianBuku23();
        int jumBuku = 5;
        
        System.out.println("--------------------------------");
        System.out.println("Masukkan data buku secara urut dari kode buku terkecil: ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("--------------------------------");
            System.out.print("Kode buku   \t: ");
            String kodeBuku = s1.nextLine();
            System.out.print("Judul Buku  \t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun terbit\t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang   \t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stock       \t: ");
            int stock = s.nextInt();
            
            Buku23 m = new Buku23(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }

        System.out.println("_________________________________");
        System.out.println("_________________________________");
        System.out.println("Pencarian data: ");
        System.out.println("Masukkan kode buku yang dicari: ");
        System.out.print("Kode buku: ");
        String cari = s1.nextLine();
        System.out.println("==================================");
        System.out.println("*Menggunakan SEQUENTIAL SEARCH");
        int posisi = data.findSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        data.TampilData (cari, posisi);
        System.out.println("==================================");
        System.out.println("*Menggunakan BINARY SEARCH");
        posisi = data.FindBinarySearch(cari, 0, jumBuku-1); 
        data.tampilPosisi(cari, posisi);
        data.TampilData (cari, posisi);    

        System.out.println("_________________________________");
        System.out.println("_________________________________");
        System.out.println("Pencarian data: ");
        System.out.println("Masukkan judul buku yang dicari: ");
        System.out.print("Judul buku: ");
        String cariJudul = s1.nextLine();
        System.out.println("==================================");
        System.out.println("*Menggunakan SEQUENTIAL SEARCH");
        int[] posisiSeqSearch = data.findSeqSearchByTitle(cariJudul);
        data.tampilPosisiByTitle(cariJudul, posisiSeqSearch);
        data.tampilDataByTitle(cariJudul, posisiSeqSearch);

        System.out.println("==================================");
        System.out.println("*Menggunakan BINARY SEARCH");
        data.mergeSort();
        int[] posisiBinarySearch = data.findBinarySearchByTitle(cariJudul, 0, jumBuku - 1);
        data.tampilPosisiByTitle(cariJudul, posisiBinarySearch);
        data.tampilDataByTitle(cariJudul, posisiBinarySearch);
    }
}
