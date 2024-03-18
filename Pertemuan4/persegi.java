package PraktikumAlgoritmaStrukturData.Pertemuan4;

public class persegi {
    int luas;

void sisi (int sisi){
luas =  sisi*sisi;
}

public static void main(String[] args) {
    persegi prsg[] = new persegi[2];

    for (int i = 0; i < prsg.length; i++) {
        prsg[i] = new persegi();
        prsg[i].sisi(5);
    }
}
}
