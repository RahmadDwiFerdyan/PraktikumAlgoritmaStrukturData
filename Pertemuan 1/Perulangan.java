import java.util.Scanner;
public class Perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM : ");
        long nim = input.nextLong();

        long duaDigit = nim%100;

        if (duaDigit<10){
            duaDigit+=10;
        }

        System.out.println("-----------------------");
        System.out.println("batas n = " + duaDigit);
        System.out.println("-----------------------");

        for (int i=1; i <= duaDigit; i++){
            if (i==6 || i==10){
                continue;
            }
            if (i%2==0){
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
        System.out.println();

    }
}
