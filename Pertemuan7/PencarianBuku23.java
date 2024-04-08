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

    public int findSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (left <= right) {
            mid = (left + right) / 2;
            if (listBk[mid].kodeBuku == cari) {
                return mid;
            }
            if (listBk[mid].kodeBuku > cari) {
                return FindBinarySearch(cari, mid+1, right);
            }
                return FindBinarySearch(cari, left, mid-1);
        }
        return -1;
    }


    public void tampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data >> " + x + " << ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data >> " + x + " << tidak ditemukan");
        }
    }

    public void TampilData (int x, int pos){
        if (pos != -1){
        System.out.println("Kode Buku   : " + x);
        System.out.println("Judul Buku  : " + listBk[pos]. judulBuku);
        System.out.println("Tahun terbit: " + listBk[pos].tahunTerbit);
        System.out.println("Pengarang   : " + listBk[pos].pengarang);
        System.out.println("Stock       : " + listBk[pos].stock);
        } else {
            System.out.println("Data >> " + x + " << tidak ditemukan");
        }
    }

}
