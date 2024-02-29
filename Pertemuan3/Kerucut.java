package PraktikumAlgoritmaStrukturData.Pertemuan3;
public class Kerucut {
    public int jariJari;
    public int sisiMiring;

public Kerucut (int r, int m){
    jariJari = r;
    sisiMiring = m;
}
public Kerucut(){

}
public double luasPermukaan(){
    return (3.14*(jariJari)*(jariJari+sisiMiring));
}
public double volume(){
    return (3.14*jariJari*jariJari*Math.sqrt((sisiMiring*sisiMiring)-(jariJari*jariJari)))/3;
}
}
