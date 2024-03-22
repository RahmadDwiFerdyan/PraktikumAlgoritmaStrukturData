package PraktikumAlgoritmaStrukturData.Pertemuan5.Sum;
import java.util.Scanner;
public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan juta; misal: 5.9)");

        System.out.print("Masukkan jumlah perusahaan: ");
        int elem = sc.nextInt();

        Sum[][] sm = new Sum[elem][];
        for (int i = 0; i < elem; i++) {
            System.out.println("================================================================");
            System.out.print("Masukkan jumlah bulan untuk perusahaan " + (i + 1) + ": ");
            int elm = sc.nextInt();
            sm[i] = new Sum[elm];

            for (int j = 0; j < elm; j++) {
                System.out.print(" > Masukkan keuntungan di bulan ke-" + (j + 1) + ": ");
                sm[i][j] = new Sum(1);
                sm[i][j].keuntungan[0] = sc.nextDouble();
            }
        }

        System.out.println("================================================================");
        for (int i = 0; i < elem; i++) {
            System.out.println(">> PERUSAHAAN " + (i + 1));
            double[] untung = new double[sm[i].length];
            for (int j = 0; j < sm[i].length; j++) {
                untung[j] = sm[i][j].keuntungan[0]; 
            }
            System.out.println("== Brute Force ==");
            System.out.println("Total keuntungan perusahaan selama " + sm[i].length + " bulan   : "
                    + new Sum(sm[i].length).totalBF(untung));
                    System.out.println("== Divide Conquer ==");
            System.out.println("Total keuntungan perusahaan selama " + sm[i].length + " bulan   : "
                    + new Sum(sm[i].length).totalDC(untung, 0, sm[i].length - 1));
            System.out.println();

    }
}
}
