package PraktikumAlgoritmaStrukturData.Pertemuan3;
import java.util.Scanner;
public class ArrayObjects {
    public static void main(String[] args) {
        PersegiPanjang[] ppArray = new PersegiPanjang[3];

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah persegi: ");
        int iJml = sc.nextInt();
        System.out.println();

        for (int i=0; i<iJml; i++){
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-"+i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();

        }
        System.out.println();
        for (int i=0; i<iJml; i++){
            System.out.println("Persegi panjang ke-"+i);
            System.out.println("Panjang: "+ppArray[i].panjang + ", lebar: "+ppArray[i].lebar);
        }
        
    }

    public static int[] copyOf(int[] positions, int count) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'copyOf'");
    }
}
