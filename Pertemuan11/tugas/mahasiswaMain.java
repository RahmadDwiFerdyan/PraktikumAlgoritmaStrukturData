package PraktikumAlgoritmaStrukturData.Pertemuan11.tugas;

public class mahasiswaMain {
    public static void main(String[] args) {
        mahasiswa linkedList = new mahasiswa();
        linkedList.addLast(114, "Doni");
        linkedList.print();
        linkedList.insertAt(0, 113, "Yusuf");
        linkedList.print();
        linkedList.addFirst(111, "Anton");
        linkedList.print();
        linkedList.insertAfter(111, 112, "Prita");
        linkedList.print();
        linkedList.addLast(115, "Sari");
        linkedList.print();
    }
}
