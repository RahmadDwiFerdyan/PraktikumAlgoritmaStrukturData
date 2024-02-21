package PraktikumAlgoritmaStrukturData.Pertemuan2;
import java.util.Scanner;
public class DragonMain23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dragon23 drg = new Dragon23();
        drg.x = 5;
        drg.y = 5;
        drg.width = 9;
        drg.height = 9;
        
        System.out.print("Input jumlah langkah ke kiri  : ");
        int left = input.nextInt();
        System.out.print("Input jumlah langkah ke kanan : ");
        int right = input.nextInt();
        System.out.print("Input jumlah langkah ke atas  : ");
        int up = input.nextInt();
        System.out.print("Input jumlah langkah ke bawah : ");
        int down = input.nextInt();
        
        drg.moveLeft(left);
        drg.moveRight(right);
        drg.moveUp(up);
        drg.moveDown(down);
        drg.printPosition();
        drg.detectCollision();
        
        
        

    }
}
