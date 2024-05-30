package PraktikumAlgoritmaStrukturData.Pertemuan13;

public class BinaryTreeMain23 {
    public static void main(String[] args) {
        BinaryTree23 bt = new BinaryTree23();
        bt.addRekursif(6);
        bt.addRekursif(4);
        bt.addRekursif(8);
        bt.addRekursif(3);
        bt.addRekursif(5);
        bt.addRekursif(7);
        bt.addRekursif(9);
        bt.addRekursif(10);
        bt.addRekursif(15);

        System.out.println("-----ADD SECARA REKURSIF----------------------");
        System.out.print("In-Order Traversal      : ");
        bt.traverseInOrder(bt.root);
        System.out.println("\n---------------------------------------------");
        System.out.println("Nilai terkecil          : " + bt.findMinim());
        System.out.println("Nilai terbesar          : " + bt.findMaxim());
        System.out.println("---------------------------------------------");
        System.out.print("Nilai nodes pada Leaf   :");
        bt.tampilDataLeaf(bt.root);
        System.out.println("\n---------------------------------------------");
        System.out.println("Jumlah nodes pada Leaf  : " + bt.hitungJmlLeaf(bt.root));
        System.out.println("---------------------------------------------");

        System.out.println();
        System.out.print("Pre-Order Traversal   : ");
        bt.traversePreOrder(bt.root);
        System.out.println();
        System.out.print("In-Order Traversal    : ");
        bt.traverseInOrder(bt.root);
        System.out.println();
        System.out.print("Post-Order Traversal  : ");
        bt.traversePostOrder(bt.root);
        System.out.println();
        System.out.println("Find Node             : " + bt.find(6));
        System.out.println("Delete Node 8 ");
        bt.delete(8);
        System.out.println();
        System.out.print("Pre-Order Traversal   : ");
        bt.traversePreOrder(bt.root);
        System.out.println();

        
    }

}
