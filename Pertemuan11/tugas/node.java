package PraktikumAlgoritmaStrukturData.Pertemuan11.tugas;

public class node {
    int nim;
    String namaMhs;
    node next;

    node(int nim, String namaMhs, node berikutnya) {
        this.nim = nim;
        this.namaMhs = namaMhs;
        next = berikutnya;
    }
}
