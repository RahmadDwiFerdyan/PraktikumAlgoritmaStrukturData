package PraktikumAlgoritmaStrukturData.Pertemuan13;

public class BinaryTreeArrayMain23 {
    public static void main(String[] args) {
    BinaryTreeArray23 bta = new BinaryTreeArray23();
    int[] data = {6,4,8,3,5,7,9,0,0,0};
    int idxLast = 6;
    bta.populateData(data, idxLast);  
    System.out.print("\nIn-Order Traversal  : ");
    bta.traverseInOrder(0);
    System.out.println("\n");
    }
}


