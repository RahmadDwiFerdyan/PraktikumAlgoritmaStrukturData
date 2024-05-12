package PraktikumAlgoritmaStrukturData.Pertemuan11.tugas.tugasNo2;

public class QueueLinkedList {
    private antrianNode front, rear;

    void print() {
        if (!isEmpty()) {
            antrianNode tmp = front;
            System.out.print("Isi Antrian: ");
            while (tmp != null) {
                System.out.print("("+tmp.nim + " - " + tmp.nama + ")");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Antrian kosong");
        }
    }

    void enqueue(int data, String nama) {
        antrianNode newNode = new antrianNode(data, nama);

        if (isEmpty()) {
            this.front = this.rear = newNode;
            return;
        }
        this.rear.next = newNode;
        this.rear = newNode;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian sudah kosong");
            return;
        }

        antrianNode temp = this.front;
        this.front = this.front.next;

        if (this.front == null)
            this.rear = null;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return -1;
        }
        return this.front.nim;
    }

    boolean isEmpty() {
        return this.front == null;
    }
}
