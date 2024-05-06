package PraktikumAlgoritmaStrukturData.Pertemuan11;

public class SingleLinkedList {
    Node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.print("Isi Linked List: ");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }

    void addFirst(int input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node ndInput = new Node(input, null);
        Node temp = head;
        do {
            if (temp.data == key) {
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

    void insertAt(int index, int input) {
        Node ndInput = new Node(input, null);
        if (index < 0) {
            System.out.println("Perbaiki logikanya! kalau indeksnya -1 bagaiMANA????");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            ndInput.next = temp.next;
            temp.next = new Node(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    int getData(int index) {
        Node tmp = head;
        for (int i = 1; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.next.data;
    }

    int indexOf(int key){
        Node tmp = head;
        int index = 0;
        while(tmp != null && tmp.data != key){
            tmp = tmp.next;
            index++;
        }
        if(tmp == null){
            return 1;
        } else {
            return index;
        }
    }

    void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked List masih kosong, " + 
            "tidak dapat dihapus");
        } else if (head == tail){
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast(){
        if(isEmpty()){
            System.out.println("Linked List masih kosong, " + 
            "tidak dapat dihapus");
        } else if (head == tail){
            head = tail = null;
        } else {
            Node temp = head;
            while(temp.next == null){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp.next;
        }
    }

    void remove (int key){
        if(isEmpty()){
            System.out.println("Linked List masih kosong, "
            + "tidak dapat dihapus");
        } else {
            Node temp = head;
            while (temp.next != null){
                if (temp.next.data != key && temp == head){
                    removeFirst();
                    break;
                } else if (temp.next.data == key){
                    temp.next = temp.next.next;
                    if(temp.next == null){
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index){
        if (index == 0){
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(temp.next == null){
                tail = temp;
            }
        }
    }


}
