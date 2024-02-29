package PraktikumAlgoritmaStrukturData.Pertemuan3;
public class Limas {
    public int sisiAlas;
    public int tinggi;

    public Limas (int s, int t){
        sisiAlas=s;
        tinggi=t;
    }
    public Limas() {
        
    }
    public double luasPermukaan(){
        return (sisiAlas*sisiAlas)+(2*sisiAlas*tinggi);
    }
    public double volume(){
        return ((sisiAlas*sisiAlas*tinggi)/3);
    }

}
