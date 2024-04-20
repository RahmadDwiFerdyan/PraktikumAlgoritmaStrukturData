package PraktikumAlgoritmaStrukturData.Pertemuan8;

public class Gudang23 {
    Barang23[] tumpukan;
    int size, top;

    public Gudang23(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang23[size];
        top = -1;// 0
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang23 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh!");
        }
    }

    public Barang23 ambilBarang() {
        if (!cekKosong()) {
            Barang23 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang.");
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang:");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
    }

    public void lihatTeratas() {
        if (!cekKosong()) {
            System.out.println("Barang teratas: " + tumpukan[top].nama);
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
    }

    public void ubahKapasitas(int kapasitasBaru) {
        Barang23[] newTumpukan = new Barang23[kapasitasBaru];
        for (int i = 0; i <= top; i++) {
            newTumpukan[i] = tumpukan[i];
        }
        tumpukan = newTumpukan;
        size = kapasitasBaru;
        System.out.println("Kapasitas gudang berhasil diubah menjadi " + kapasitasBaru);
    }

    public String konversiDesimalKeBiner(int kode) {
        StackKonversi23 stack = new StackKonversi23();
        while (kode > 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
