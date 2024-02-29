package PraktikumAlgoritmaStrukturData.Pertemuan3;
public class Bola {
    public int jariJari;

    public Bola (int r){
        jariJari = r;
    }
    public Bola(){

    }
    public double luasPermukaan(){
        return 4*3.14*jariJari*jariJari;
    }
    public double volume(){
        return ((4/3)*3.14*jariJari*jariJari*jariJari);
    }

}
