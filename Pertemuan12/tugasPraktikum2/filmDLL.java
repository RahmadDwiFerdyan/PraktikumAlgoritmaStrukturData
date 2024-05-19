package PraktikumAlgoritmaStrukturData.Pertemuan12.tugasPraktikum2;

public class filmDLL {
    Node head;
    int size;

    public filmDLL() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int id, String judul, double rating) {
        if (isEmpty()) {
            head = new Node(null, id, judul, rating, null);
        } else {
            Node newNode = new Node(null, id, judul, rating, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int id, String judul, double rating) {
        if (isEmpty()) {
            addFirst(id, judul, rating);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, id, judul, rating, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int index, int id, String judul, double rating) throws Exception {
        if (isEmpty()) {
            addFirst(id, judul, rating);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, id, judul, rating, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, id, judul, rating, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println("ID: " + tmp.id );
                System.out.println("\tJudul film    : " + tmp.judul);
                System.out.println("\tRating film   : " + tmp.rating);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Data kosong!");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Data masih kosong, tidak dapat mengahpus!");
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
            throw new Exception("Data masih kosong, tidak dapat dihapus!");
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

    public void remove(int index) throws Exception {
        if(isEmpty() || index >= size){
            throw new Exception("Nilai indeks diluar batas");
        } else if (index == 0){
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index){
                current = current.next;
                i++;
            }
            if (current.next == null){
                current.prev.next = null;
            } else if (current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public String getFirst() throws Exception {
        if(isEmpty()){
            throw new Exception("Linked List kosong!");
        }
        return head.judul;
    }

    public String getLast() throws Exception {
        if(isEmpty()){
            throw new Exception("Linked List kosong!");
        }
        Node tmp = head;
        while (tmp.next != null){
            tmp = tmp.next;
        }
        return tmp.judul;    
    }

    public String get (int index) throws Exception {
        if (isEmpty() || index >= size){
            throw new Exception("Linked List kosong!");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.judul;
    }

    public void findFilm(int id) {
        if (!isEmpty()) {
            Node tmp = head;
            int index = 0;
            while (tmp != null) {
                if (tmp.id == id) {
                    System.out.println("Ditemukan pada Node ke-" + index);
                    System.out.println("ID: " + tmp.id );
                    System.out.println("\tJudul film    : " + tmp.judul);
                    System.out.println("\tRating film   : " + tmp.rating);
                    return;
                }
                tmp = tmp.next;
                index++;
            }
            System.out.println("Film dengan ID " + id + " tidak ditemukan.");
        } else {
            System.out.println("Data kosong!");
        }
    }
    public void sortFilmByRating() {
        if (size > 1) {
            boolean berubah;

            do {
                Node current = head;
                Node previous = null;
                Node next = head.next;
                berubah = false;

                while (next != null) {
                    if (current.rating < next.rating) {
                        berubah = true;

                        if (previous != null) {
                            Node after = next.next;

                            previous.next = next;
                            next.next = current;
                            current.next = after;
                        } else {
                            Node after = next.next;

                            head = next;
                            next.next = current;
                            current.next = after;
                        }

                        Node temp = current;
                        current = next;
                        next = temp;
                    }

                    previous = current;
                    current = next;
                    next = next.next;
                }
            } while (berubah);
        }
    }
}
