package PraktikumAlgoritmaStrukturData.Pertemuan12.tugasPraktikum;

public class vaksinDLL {
    Node head;
    int size;

    public vaksinDLL() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int nomor, String nama) {
        if (isEmpty()) {
            head = new Node(null, nomor, nama, null);
        } else {
            Node newNode = new Node(null, nomor, nama, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int nomor, String nama) {
        if (isEmpty()) {
            addFirst(nomor, nama);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, nomor, nama, null);
            current.next = newNode;
            size++;
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian Vaksin masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian Vaksin masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public String getFirst() throws Exception {
        if(isEmpty()){
            throw new Exception("Antrean Vaksin kosong!");
        }
        return head.nama;
    }

    public int size() {
        return size;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println("|" +tmp.nomor + "\t|" + tmp.nama + "\t|");
                tmp = tmp.next;
            }
        } else {
            System.out.println("Antrian Vaksin kosong!");
        }
    }

}
