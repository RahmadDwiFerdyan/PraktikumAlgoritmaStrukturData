package PraktikumAlgoritmaStrukturData.Pertemuan3;
import java.util.Scanner;
public class bioskop {
    int jml;
    int harga;

public bioskop(){

}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    bioskop []bsk = new bioskop[2];
    for (int i = 0; i < bsk.length; i++) {
        bsk[i]=new bioskop();
        System.out.print("jumlah: "); 
        bsk[i].jml = sc.nextInt();
        System.out.print("harga: "); 
        bsk[i].harga = sc.nextInt();
    }

    for (int i = 0; i < bsk.length; i++) {
        System.out.println("jumlah " + (i+1) + " = " + bsk[i].jml);
        System.out.println("harga " + (i+1) + " = " + bsk[i].harga);
    }
}

}

