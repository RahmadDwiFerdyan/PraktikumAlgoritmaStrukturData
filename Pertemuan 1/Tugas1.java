import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        char kode[] = {'A','B','D','E','F','G','H','L','N','T'};
        char kota[][] ={
        {'B','A','N','T','E','N'},
        {'J','A','K','A','R','T','A'},
        {'B','A','N','D','U','N','G'},
        {'C','I','R','E','B','O','N'},
        {'B','O','G','O','R'},
        {'P','E','K','A','L','O','N','G','A','N'},
        {'S','E','M','A','R','A','N','G'},
        {'S','U','R','A','B','A','Y','A'},
        {'M','A','L','A','N','G'},
        {'T','E','G','A','L'},
        };
        
        System.out.print("Masukkan kode plat kendaraan: ");
        char plat = input.next().charAt(0);

        int indexKode = -1;
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == plat) {
                indexKode = i;
                break;
            }
        }
    
        if (indexKode != -1) {
            System.out.println("Kota untuk kode plat " + plat + " adalah : " + new String(kota[indexKode]));
        } else {
            System.out.println("Kode plat mobil tidak valid.");
        }

    }
}
