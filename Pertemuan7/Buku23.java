package PraktikumAlgoritmaStrukturData.Pertemuan7;

public class Buku23 {
    int tahunTerbit, stock;
    String judulBuku, pengarang, kodeBuku;
    
    public Buku23(String kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }

    public void tampilDataBuku(){
        System.out.println("================================");
        System.out.println("Kode Buku   : " + kodeBuku);
        System.out.println("Judul Buku  : " + judulBuku);
        System.out.println("Tahun terbit: " + tahunTerbit);
        System.out.println("Pengarang   : " + pengarang);
        System.out.println("Stock       : " + stock);
    }
}