import java.util.Scanner;
public class Pemilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilaiTgs, nilaiKuis, nilaiUTS, nilaiUAS;
        double nilaiAkhir;
        String konversi;

        System.out.println("PROGRAM MENGHITUNG NILAI AKHIR");
        System.out.println("------------------------------");
        System.out.print("Masukkan nilai TUGAS  : ");
        nilaiTgs = input.nextInt();
        System.out.print("Masukkan nilai KUIS   : ");
        nilaiKuis = input.nextInt();
        System.out.print("Masukkan nilai UTS    : ");
        nilaiUTS = input.nextInt();
        System.out.print("Masukkan nilai UAS    : ");
        nilaiUAS = input.nextInt();

        if (nilaiTgs<=100 && nilaiKuis<=100 && nilaiUTS<=100 && nilaiUAS<=100) {
            nilaiAkhir = ((nilaiTgs*0.2) + (nilaiKuis*0.2) + (nilaiUTS*0.3) + (nilaiUAS*0.3));
            
            if (nilaiAkhir>80){
                konversi = "A";
            } else if (nilaiAkhir>73){
                konversi = "B+";
            } else if (nilaiAkhir>65){
                konversi = "B";
            } else if (nilaiAkhir>60){
                konversi = "C+";
            } else if (nilaiAkhir>50){
                konversi = "C";
            } else if (nilaiAkhir>39){
                konversi = "D";
            } else {
                konversi = "E";
            }

            System.out.println("------------------------------");
            System.out.println("Nilai Akhir     : " + nilaiAkhir);
            System.out.println("Nilai Huruf     : " + konversi);
            System.out.println("------------------------------");

            if (nilaiAkhir>50){
                System.out.println("## SELAMAT, ANDA LULUS! ##");
            } else {
                System.out.println(" ## MAAF, ANDA TIDAK LULUS ##");
            }

        } else {
            System.out.println("------------------------------");
            System.out.println(" ## MAAF, NILAI TIDAK VALID ##");
            System.out.println("------------------------------");
        }

    }
}