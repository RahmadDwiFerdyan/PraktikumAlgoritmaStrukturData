import java.util.Scanner;
public class GraphMain23 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Graph23 graph = new Graph23(6);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Update Jarak");
            System.out.println("7. Hitung Edge");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan gedung asal: ");
                    int asalAdd = scanner.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuanAdd = scanner.nextInt();
                    System.out.print("Masukkan jarak: ");
                    int jarakAdd = scanner.nextInt();
                    graph.addEdge(asalAdd, tujuanAdd, jarakAdd);
                    break;

                case 2:
                    System.out.print("Masukkan gedung asal: ");
                    int asalRemove = scanner.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuanRemove = scanner.nextInt();
                    graph.removeEdge(asalRemove, tujuanRemove);
                    break;

                case 3:
                    System.out.print("Masukkan gedung: ");
                    int asalDegree = scanner.nextInt();
                    graph.degree(asalDegree);
                    break;

                case 4:
                    graph.printGraph();
                    break;

                case 5:
                    System.out.print("Masukkan gedung asal: ");
                    int asalCek = scanner.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuanCek = scanner.nextInt();
                    if (graph.isPath(asalCek, tujuanCek)) {
                        System.out.println("Hasil: Gedung " + (char) ('A' + asalCek) + " dan Gedung " + (char) ('A' + tujuanCek) + " bertetangga");
                    } else {
                        System.out.println("Hasil: Gedung " + (char) ('A' + asalCek) + " dan Gedung " + (char) ('A' + tujuanCek) + " tidak bertetangga");
                    }
                    break;

                case 6:
                    System.out.print("Masukkan gedung asal: ");
                    int asalUpdate = scanner.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuanUpdate = scanner.nextInt();
                    System.out.print("Masukkan jarak baru: ");
                    int jarakUpdate = scanner.nextInt();
                    graph.updateJarak(asalUpdate, tujuanUpdate, jarakUpdate);
                    break;

                case 7:
                    int totalEdges = graph.hitungEdge();
                    System.out.println("Total edges dalam graf: " + totalEdges);
                    break;

                case 8:
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
        
    }
        /* 
        Graph23 gedung = new Graph23(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();
        
        gedung.removeEdge(1, 3);
        gedung.printGraph();

        System.out.print("Masukkan gedung asal: ");
        int asal = scanner.nextInt();

        System.out.print("Masukkan gedung tujuan: ");
        int tujuan = scanner.nextInt();

        if (gedung.isPath(asal, tujuan)) {
            System.out.println("Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan) + " bertetangga");
        } else {
            System.out.println("Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan) + " tidak bertetangga");
        }
        
        GraphMatriks23 gdg = new GraphMatriks23(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 1, 90);
        gdg.printGraph();
        System.out.println("Hasil setelah penghapusan edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();

        System.out.println();
        gdg.degree(0);
        */
}

