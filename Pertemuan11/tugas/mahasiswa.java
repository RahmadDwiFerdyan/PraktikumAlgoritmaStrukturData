package PraktikumAlgoritmaStrukturData.Pertemuan11.tugas;

public class mahasiswa {
    node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            node tmp = head;
            System.out.print("Data Linked List: ");
            while (tmp != null) {
                System.out.print("(" + tmp.nim + " - " + tmp.namaMhs + ")\t");
                tmp = tmp.next;
            }
            System.out.println("\n");
        } else {
            System.out.println("Data Linked List kosong");
        }
    }

    void addFirst(int nim, String nama) {
        node ndInput = new node(nim, nama, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int nim, String nama) {
        node ndInput = new node(nim, nama, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int nim, String nama) {
        node ndInput = new node(nim, nama, null);
        node temp = head;
        do {
            if (temp.nim == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    void insertAt(int index, int nim, String nama) {
        node ndInput = new node(nim, nama, null);
        if (index < 0) {
            System.out.println("!");
        } else if (index == 0) {
            addFirst(nim, nama);
        } else {
            node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            ndInput.next = temp.next;
            temp.next = new node(nim, nama, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
