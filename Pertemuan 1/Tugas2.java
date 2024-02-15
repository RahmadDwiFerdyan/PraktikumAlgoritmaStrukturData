import java.util.Scanner;

public class Tugas2 {

    public static void hitungKecepatan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===================");
        System.out.print("Masukkan jarak (KM): ");
        double jarak = scanner.nextDouble();

        System.out.print("Masukkan waktu (JAM): ");
        double waktu = scanner.nextDouble();

        double kecepatan = jarak / waktu;

        System.out.printf(">>Kecepatannya adalah : %.2f km/jam", kecepatan);
        System.out.println();
        System.out.println("===================");
    }

    public static void hitungJarak() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===================");
        System.out.print("Masukkan kecepatan (KM/JAM): ");
        double kecepatan = scanner.nextDouble();

        System.out.print("Masukkan waktu (JAM): ");
        double waktu = scanner.nextDouble();

        double jarak = kecepatan * waktu;

        System.out.printf(">>Jaraknya adalah : %.2f km", jarak);
        System.out.println();
        System.out.println("===================");
    }

    public static void hitungWaktu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===================");
        System.out.print("Masukkan jarak (KM): ");
        double jarak = scanner.nextDouble();

        System.out.print("Masukkan kecepatan (KM/JAM): ");
        double kecepatan = scanner.nextDouble();

        double waktu = jarak / kecepatan;
        double waktuMenit = waktu*60;

        System.out.printf(">>Waktunya adalah : %.2f jam atau %.0f menit", waktu, waktuMenit);
        System.out.println();
        System.out.println("===================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===================");
        System.out.println("        MENU");
        System.out.println("===================");
        System.out.println("1. Kecepatan");
        System.out.println("2. Jarak");
        System.out.println("3. Waktu");
        System.out.println("===================");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                hitungKecepatan();
                break;
            case 2:
                hitungJarak();
                break;
            case 3:
                hitungWaktu();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}
