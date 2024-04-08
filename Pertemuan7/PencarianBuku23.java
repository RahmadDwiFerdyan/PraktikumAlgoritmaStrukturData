package PraktikumAlgoritmaStrukturData.Pertemuan7;

public class PencarianBuku23 {
    Buku23 listBk[] = new Buku23[5];
    int idx;

    void tambah(Buku23 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku23 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int findSeqSearch(String cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku.equals(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public int FindBinarySearch(String cari, int left, int right) {
    if (left <= right) {
        int mid = (left + right) / 2;
        int num = Integer.parseInt(listBk[mid].kodeBuku);
        int num1 = Integer.parseInt(cari);
        
        if (num == num1) {
            return mid; 
        }
        
        if (num < num1) {
            
            return FindBinarySearch(cari, mid + 1, right);
        } else {
           
            return FindBinarySearch(cari, left, mid - 1);
        }
    }
    // Element not found
    return -1;
}



    public void tampilPosisi(String cari, int pos) {
        if (pos != -1) {
            System.out.println("Data >> " + cari + " << ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data >> " + cari + " << tidak ditemukan");
        }
    }

    public void TampilData (String cari, int pos){
        if (pos != -1){
        System.out.println("Kode Buku   : " + cari);
        System.out.println("Judul Buku  : " + listBk[pos]. judulBuku);
        System.out.println("Tahun terbit: " + listBk[pos].tahunTerbit);
        System.out.println("Pengarang   : " + listBk[pos].pengarang);
        System.out.println("Stock       : " + listBk[pos].stock);
        } else {
            System.out.println("Data >> " + cari + " << tidak ditemukan");
        }
    }

}
