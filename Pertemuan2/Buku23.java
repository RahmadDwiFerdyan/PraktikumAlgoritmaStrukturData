package PraktikumAlgoritmaStrukturData.Pertemuan2;
public class Buku23 {
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilanInformasi(){
        System.out.println();
        System.out.println("Judul           : " + judul);
        System.out.println("Pengarang       : " + pengarang);
        System.out.println("Jumlah halaman  : " + halaman);
        System.out.println("Sisa stok       : " + stok);
        System.out.println("Harga           : Rp" + harga);
    }

    void terjual (int jml){
        if (stok>0){
          stok -= jml;  
        }
    }
    void restock (int jml){
        stok += jml;
    }
    void gantiHarga (int hrg){
        harga = hrg;
    }

    void hitungHargaTotal(int jmlTerjual){
        int hargaTotal = harga*jmlTerjual;

        System.out.println("Harga total     : "+hargaTotal);
    }

    void hitungDiskon(int jmlTerjual){
        int hargaTotal = harga*jmlTerjual;
        double diskon = 0;

        if (hargaTotal > 150000) {
            diskon = 0.12;
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            diskon = 0.05;
        }
        double jmlDiskon = diskon*hargaTotal;
        System.out.println("Diskon yang didapat: " + jmlDiskon);
    }

    void hitungHargaBayar(int jmlTerjual) {
        int hargaTotal = harga*jmlTerjual;
        double diskon = 0;

        if (hargaTotal > 150000) {
            diskon = 0.12;
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            diskon = 0.05;
        }

        double nilaiDiskon = diskon*hargaTotal;
        double hargaBayar = hargaTotal - nilaiDiskon;
        System.out.println("Harga bayar     : " + hargaBayar);
    }


    public Buku23(){

    }
    public Buku23(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

}
