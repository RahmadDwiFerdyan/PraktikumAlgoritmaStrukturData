package PraktikumAlgoritmaStrukturData.Pertemuan2;

public class Dragon23 {
    int x, y, width, height;

    void moveLeft(int stepKiri){
        x-=stepKiri;
    }
    void moveRight(int stepKanan){
        x+=stepKanan;
    }
    void moveUp (int stepAtas){
        y-=stepAtas;
    }
    void moveDown (int stepBawah){
        y+=stepBawah;
    }

    void detectCollision (){
        if ((x<0 || x>width)||(y<0 || y>height)){
            System.out.println("## GAME OVER ##\n");
        }
    }

    void printPosition(){
        System.out.println("Posisi Doragon adalah: " + x + ", " + y);
    }

}
