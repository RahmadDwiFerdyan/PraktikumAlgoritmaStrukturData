package PraktikumAlgoritmaStrukturData.Pertemuan10.praktikum2;

import java.util.Scanner;

public class queueMain {
    public static void menu() {
        System.out.println("---------------------------");
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian keluat");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek antrian paling belakang");
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan kapasitas queue: ");
        int jumlah = sc.nextInt();
        nasabah antri = new nasabah(jumlah);

        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("No Rekening : ");
                    String norek = sc.nextLine();
                    System.out.print("Nama        : ");
                    String nama = sc.nextLine();
                    System.out.print("Alamat      : ");
                    String alamat = sc.nextLine();
                    System.out.print("Umur        : ");
                    int umur = sc.nextInt();
                    System.out.print("Saldo       : ");
                    double saldo = sc.nextDouble();
                    nasabah nb = new nasabah(norek, nama, alamat, umur, saldo);
                    sc.nextLine();
                    antri.enqueue(nb);
                    break;
                case 2:
                    nasabah data = antri.dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat)
                            && data.umur != 0 && data.saldo != 0) {
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama
                                + " " + data.alamat + " " + data.umur + " " + data.saldo);
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                antri.peekRear();
                break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}
