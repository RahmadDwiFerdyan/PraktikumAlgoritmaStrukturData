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

        return -1;
    }
    public int[] findSeqSearchByTitle(String cariJudul) {
        int[] positions = new int[listBk.length];
        int count = 0;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].judulBuku.equalsIgnoreCase(cariJudul)) {
                positions[count++] = j;
            }
        }
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = positions[i];
        }
        return result;
    }
    public int[] findBinarySearchByTitle(String cariJudul, int left, int right) {
        int mid;
        if (left <= right) {
            mid = (left + right) / 2;
            int comparisonResult = listBk[mid].judulBuku.compareToIgnoreCase(cariJudul);
            if (comparisonResult == 0) {
                return new int[] { mid };
            } else if (comparisonResult < 0) {
                return findBinarySearchByTitle(cariJudul, mid + 1, right);
            } else {
                return findBinarySearchByTitle(cariJudul, left, mid - 1);
            }
        }
        return new int[0];
    }

    public void mergeSort() {
        mergeSort(0, idx - 1);
    }

    private void mergeSort(int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(left, mid);
            mergeSort(mid + 1, right);
            merge(left, mid, right);
        }
    }

    private void merge(int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        Buku23[] L = new Buku23[n1];
        Buku23[] R = new Buku23[n2];
        for (int i = 0; i < n1; ++i) {
            L[i] = listBk[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = listBk[mid + 1 + j];
        }
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i].judulBuku.compareToIgnoreCase(R[j].judulBuku) <= 0) {
                listBk[k] = L[i];
                i++;
            } else {
                listBk[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            listBk[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            listBk[k] = R[j];
            j++;
            k++;
        }
    }

    public void tampilPosisi(String cari, int pos) {
        if (pos != -1) {
            System.out.println("Data >> " + cari + " << ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data >> " + cari + " << tidak ditemukan");
        }
    }

    public void TampilData(String cari, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku   : " + cari);
            System.out.println("Judul Buku  : " + listBk[pos].judulBuku);
            System.out.println("Tahun terbit: " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang   : " + listBk[pos].pengarang);
            System.out.println("Stock       : " + listBk[pos].stock);
        } else {
            System.out.println("Data >> " + cari + " << tidak ditemukan");
        }
    }

    public void tampilPosisiByTitle(String cariJudul, int[] positions) {
        if (positions.length == 0) {
            System.out.println("Data dengan judul >> " + cariJudul + " << tidak ditemukan");
        } else if (positions.length == 1) {
            System.out.println("Data dengan judul >> " + cariJudul + " << ditemukan pada indeks " + positions[0]);
        } else {
            System.out.println("Peringatan: Terdapat lebih dari satu hasil untuk judul >> " + cariJudul + " <<");
        }
    }

    public void tampilDataByTitle(String cariJudul, int[] positions) {
        for (int pos : positions) {
            System.out.println("--------------------------------");
            System.out.println("Kode Buku   : " + listBk[pos].kodeBuku);
            System.out.println("Judul Buku  : " + listBk[pos].judulBuku);
            System.out.println("Tahun terbit: " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang   : " + listBk[pos].pengarang);
            System.out.println("Stock       : " + listBk[pos].stock);

        }
    }

}
