package PraktikumAlgoritmaStrukturData.Pertemuan12.tugasPraktikum;

public class Node {
    int nomor; 
    String nama;
    Node prev, next;

    Node (Node prev, int nomor, String nama, Node next) {
        this.prev = prev;
        this.nomor = nomor;
        this.nama = nama;
        this.next = next;
    }
}
