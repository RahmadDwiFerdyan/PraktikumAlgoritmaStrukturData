package PraktikumAlgoritmaStrukturData.Pertemuan5;
import java.util.Scanner;
public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========================");
        System.out.print("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();

        System.out.println();
        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat();
            System.out.print("Masukkan nilai yang hendak dipangkatkan   : ");
            int nilai = sc.nextInt();
            png[i].nilai = nilai;
            System.out.print("Masukkan nilai pemangkat                  : ");
            int pangkat = sc.nextInt();
            png[i].pangkat = pangkat;
        }

        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (int i = 0; i<elemen; i++){
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }

        System.out.println("HASIL PANGKAT - DIVIDE CONQUER");
        for (int i = 0; i<elemen; i++){
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }



}
}