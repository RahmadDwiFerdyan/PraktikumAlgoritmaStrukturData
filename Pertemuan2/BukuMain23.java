package PraktikumAlgoritmaStrukturData.Pertemuan2;
public class BukuMain23 {
    public static void main(String[] args) {
        
    Buku23 bk1 = new Buku23();
    bk1.judul = "Today Ends Tomorrow Comes";
    bk1.pengarang = "Denada Pratiwi";
    bk1.halaman = 198;
    bk1.stok = 13;
    bk1.harga = 71000;

    bk1.tampilanInformasi();
    bk1.terjual(5);
    bk1.gantiHarga(60000);
    bk1.tampilanInformasi();

    Buku23 bk2 = new Buku23("Self Reward", "Maheera Ayesha", 160, 29, 59000);
    bk2.terjual(11);
    bk2.tampilanInformasi();

    Buku23 bukuFerdy = new Buku23("Algoritma Struktur Data", "Rahmad Dwi Ferdyan", 111, 23, 21000);
    bukuFerdy.terjual(11);
    bukuFerdy.tampilanInformasi();

    }
}
