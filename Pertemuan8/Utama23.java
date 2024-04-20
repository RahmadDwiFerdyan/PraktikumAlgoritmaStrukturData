package PraktikumAlgoritmaStrukturData.Pertemuan8;

import java.util.Scanner;

public class Utama23 {
    public static void main(String[] args) {
        Gudang23 gudang = new Gudang23(7);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat barang teratas");
            System.out.println("5. Ubah kapasitas gudang");
            System.out.println("6. Keluar");
            System.out.println("--------------------------------");
            System.out.print("Pilih operasi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = scanner.nextLine();
                    Barang23 barangBaru = new Barang23(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;

                case 2:
                    gudang.ambilBarang();
                    break;

                case 3:
                    gudang.tampilkanBarang();

                case 4:
                    gudang.lihatTeratas();
                    break;

                case 5:
                System.out.print("Masukkan kapasitas baru gudang: ");
                    int kapasitasBaru = scanner.nextInt();
                    gudang.ubahKapasitas(kapasitasBaru);
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");

            }
        }
    }
}
