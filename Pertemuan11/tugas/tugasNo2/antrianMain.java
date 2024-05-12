package PraktikumAlgoritmaStrukturData.Pertemuan11.tugas.tugasNo2;

public class antrianMain {
    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();
        System.out.println("## Antrian:");
        queue.enqueue(111, "Anton");
        queue.print();
        queue.enqueue(112, "Prita");
        queue.print();
        queue.enqueue(113, "Yusuf");
        queue.print();
        queue.enqueue(114, "Doni");
        queue.print();
        queue.enqueue(115, "Sari");
        queue.print();
        System.out.println();

        System.out.println("## Elemen di depan antrian (peek): " + queue.peek());
        queue.dequeue();

        System.out.println();
        System.out.println("## Antrian setelah dequeue");
        queue.print();
        System.out.println();
    }
}
