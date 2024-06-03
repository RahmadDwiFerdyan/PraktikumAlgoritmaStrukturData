public class Node23 {
    int data;
    Node23 prev, next;
    int jarak;

    Node23(Node23 prev, int data, int jarak, Node23 next){
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }
}
