package PraktikumAlgoritmaStrukturData.Pertemuan6.Latihan_Praktikum;

public class Hotel {
    String nama;
    String kota;
    int harga;
    Byte bintang;

    Hotel(String n, String k, int h, Byte b) {
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    void tampilAll() {
        System.out.println("Nama    : " + nama + "  | Bintang " + bintang + " |");
        System.out.println("Lokasi  : " + kota);
        System.out.println("Harga   : Rp_" + harga);

    }

}
