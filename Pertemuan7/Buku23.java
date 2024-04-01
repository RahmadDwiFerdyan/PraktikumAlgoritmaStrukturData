package PraktikumAlgoritmaStrukturData.Pertemuan7;

public class Buku23 {
    int kodeBuku, tahunTerbit, stock;
    String judulBuku, pengarang;
    
    public Buku23(int kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }

    public Buku23() {

    }

    public void tampilDataBuku(){
        System.out.println("================================");
        System.out.println("Kode Buku   : " + kodeBuku);
        System.out.println("Judul Buku  : " + judulBuku);
        System.out.println("Tahun terbit: " + tahunTerbit);
        System.out.println("Pengarang   : " + pengarang);
        System.out.println("Stock       : " + stock);
    }

    // modifikasi kode --> method baru dengan nama FindBuku
    public static int findBuku(Buku23[] dataBuku, int cari) {
        int posisi = -1;
        for (int j = 0; j < dataBuku.length; j++) {
            if (dataBuku[j].kodeBuku == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }
}