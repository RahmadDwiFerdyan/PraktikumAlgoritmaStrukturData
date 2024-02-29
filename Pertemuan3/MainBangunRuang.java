package PraktikumAlgoritmaStrukturData.Pertemuan3;
import java.util.Scanner;
public class MainBangunRuang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // KERUCUT ===========================================================

        System.out.print(">>Masukkan jumlah kerucut: ");
        int jml = sc.nextInt();
        Kerucut[] krcArray = new Kerucut[jml];

        for (int i=0; i<jml; i++){
            krcArray[i] = new Kerucut();
            System.out.println("Kerucut ke-"+(i+1));
            System.out.print("Masukkan jari-jari: ");
            krcArray[i].jariJari = sc.nextInt();
            System.out.print("Masukkan sisi miring: ");
            krcArray[i].sisiMiring = sc.nextInt();
        }

        for (int i=0; i<jml; i++){
            System.out.println("Kerucut ke-"+(i+1));
            System.out.printf("Luas Permukaan: %.2f cm2", krcArray[i].luasPermukaan());
            System.out.printf("\nVolume: %.2f cm3", krcArray[i].volume());
        }

        //LIMAS PERSEGI ===========================================================

        System.out.println(" ");
        System.out.print("\n>>Masukkan jumlah limas: ");
        jml = sc.nextInt();
        Limas[] lmsArray = new Limas[jml];

        for (int i=0; i<jml; i++){
            lmsArray[i] = new Limas();
            System.out.println("Limas ke-"+(i+1));
            System.out.print("Masukkan sisi alas: ");
            lmsArray[i].sisiAlas = sc.nextInt();
            System.out.print("Masukkan tinggi: ");
            lmsArray[i].tinggi = sc.nextInt();
        }
    
        for (int i=0; i<jml; i++){
            System.out.println("Limas ke-"+(i+1));
            System.out.printf("Luas Permukaan: %.2f cm2", lmsArray[i].luasPermukaan());
            System.out.printf("\nVolume: %.2f cm3", lmsArray[i].volume());
        }

        //BOLA =====================================================================

        System.out.println(" ");
        System.out.print("\n>>Masukkan jumlah bola: ");
        jml = sc.nextInt();
        Bola[] blArray = new Bola[jml];

        for (int i=0; i<jml; i++){
            blArray[i] = new Bola();
            System.out.println("Bola ke-"+(i+1));
            System.out.print("Masukkan jari-jari: ");
            blArray[i].jariJari = sc.nextInt();
          
        }

        for (int i=0; i<jml; i++){
            System.out.println("Bola ke-"+(i+1));
            System.out.printf("Luas Permukaan: %.2f cm2", blArray[i].luasPermukaan());
            System.out.printf("\nVolume: %.2f cm3", blArray[i].volume());
        }

    }
}
