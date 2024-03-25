package PraktikumAlgoritmaStrukturData.Pertemuan6.Latihan_Praktikum;

import java.util.Scanner;

public class MainHotel {
    public static void main(String[] abcd) {
        Scanner sc = new Scanner(System.in);
        HotelService daftar = new HotelService();
        Hotel h1 = new Hotel("Hotel Sabana  ", "Malang", 861000, (byte) 5);
        Hotel h2 = new Hotel("Hotel Taiga   ", "Tangerang", 149000, (byte) 1);
        Hotel h3 = new Hotel("Hotel Gurun   ", "Semarang", 270000, (byte) 3);
        Hotel h4 = new Hotel("Hotel Tundra  ", "Medan", 489000, (byte) 4);
        Hotel h5 = new Hotel("Hotel Tropis  ", "Jakarta", 209000, (byte) 2);
        Hotel h6 = new Hotel("Hotel Konifer ", "Surabaya", 399000, (byte) 4);

        daftar.tambah(h1);
        daftar.tambah(h2);
        daftar.tambah(h3);
        daftar.tambah(h4);
        daftar.tambah(h5);
        daftar.tambah(h6);

        System.out.println("== PILIHAN HOTEL ==");
        System.out.println("----------------------------------------");
        daftar.tampilAll();
        System.out.println();
        System.out.println("[FILTER]");
        System.out.println("[1]. Harga (terendah - tertinggi)");
        System.out.println("[2]. Bintang (tertinggi - terendah)");
        System.out.println();
        System.out.print("Masukkan pilihan: ");
        int pilihan = sc.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("\n[Sorting Harga]");
                daftar.selectionSort();
                daftar.tampilAll();
                break;
            case 2:
                System.out.println("\n{Sorting Bintang}");
                daftar.bubbleSort();
                daftar.tampilAll();
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                break;
        }

    }

}
