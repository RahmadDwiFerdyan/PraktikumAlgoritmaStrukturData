package PraktikumAlgoritmaStrukturData.Pertemuan3;

import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Mahasiswa mhs = new Mahasiswa();

        System.out.print("Masukkan jumlah mahasiswa: ");
        mhs.jml = sc.nextInt();

        Mahasiswa[] mhsArray = new Mahasiswa[mhs.jml];

        for (int i = 0; i < mhs.jml; i++) {
            sc.nextLine();
            mhsArray[i] = new Mahasiswa();
            System.out.println(">> Mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama         : ");
            mhsArray[i].nama = sc.nextLine();
            System.out.print("Masukkan NIM          : ");
            mhsArray[i].nim = sc.nextLong();
            System.out.print("Masukkan jenis kelamin: ");
            mhsArray[i].gender = sc.next().charAt(0);
            System.out.print("Masukkan IPK          : ");
            mhsArray[i].ipk = sc.nextDouble();
            mhs.jmlIPK += mhsArray[i].ipk;
        }

        System.out.println();

        for (int i = 0; i < mhs.jml; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("Nama            : " + mhsArray[i].nama);
            System.out.println("NIM             : " + mhsArray[i].nim);
            System.out.println("Jenis kelamin   : " + mhsArray[i].gender);
            System.out.println("IPK             : " + mhsArray[i].ipk);
        }

        System.out.printf("\n## Rata-rata IPK dari " + (mhs.jml) + " mahasiswa tersebut adalah: %.2f", mhs.rataIPK());
        System.out.println("\n## Mahasiswa dengan nilai TERTINGGI ##");

        System.out.println("Nama            : " + mhsArray[mhs.ipkTertinggi(mhsArray)].nama);
        System.out.println("NIM             : " + mhsArray[mhs.ipkTertinggi(mhsArray)].nim);
        System.out.println("Jenis kelamin   : " + mhsArray[mhs.ipkTertinggi(mhsArray)].gender);
        System.out.println("IPK             : " + mhsArray[mhs.ipkTertinggi(mhsArray)].ipk);

    }
}
