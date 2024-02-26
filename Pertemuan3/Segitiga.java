package PraktikumAlgoritmaStrukturData.Pertemuan3;
public class Segitiga {
    public int alas;
    public int tinggi;

    public Segitiga (int a, int t){
        alas = a;
        tinggi = t;
    }

    public int hitungLuas(){
        return (alas*tinggi)/2;
    }
    public double hitungKeliling(){
        return Math.sqrt((alas*alas) + (tinggi*tinggi));
    }
}

