package PraktikumAlgoritmaStrukturData.Pertemuan10.tugas;

import java.util.Scanner;

public class pembeliMain {
    public static void menu() {
        System.out.println("---------------------------");
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrean baru");
        System.out.println("2. Antrean keluar");
        System.out.println("3. Cek antrean terdepan");
        System.out.println("4. Cek antrean paling belakang");
        System.out.println("5. Cek semua antrean");
        System.out.println("6. Cek posisi pembeli");
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan kapasitas antrean: ");
        int jumlah = sc.nextInt();
        pembeli antri = new pembeli(jumlah);

        int pilih;

        do {
            menu();
            System.out.print("Masukkan pilihan: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                System.out.println("---------------------------");
                    System.out.print("Nama        : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP       : ");
                    int noHP = sc.nextInt();
                    pembeli nb = new pembeli(nama, noHP);
                    sc.nextLine();
                    antri.enqueue(nb);
                    break;
                case 2:
                    System.out.println("---------------------------");
                    pembeli data = antri.dequeue();
                    if (!"".equals(data.nama) && data.noHP != 0) {
                        System.out.println("Antrian yang keluar: " + data.nama + "\t| " + data.noHP);
                    }
                    break;
                case 3:
                    System.out.println("---------------------------");
                    antri.peek();
                    break;
                case 4:
                    System.out.println("---------------------------");
                    antri.peekRear();
                    break;
                case 5:
                    System.out.println("---------------------------");
                    antri.daftarPembeli();
                    break;
                case 6:
                    System.out.println("---------------------------");
                    System.out.println("Masukkan nama pembeli: ");
                    String namaPembeli = sc.nextLine();
                    antri.peekPosition(namaPembeli);
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }
}
