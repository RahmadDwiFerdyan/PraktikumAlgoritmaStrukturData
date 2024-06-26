public class GraphMatriks23 {
    int vertex;
    int[][] matriks;

    public GraphMatriks23(int v) {
        vertex = v;
        matriks = new int[v][v];

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                matriks[i][j] = -1;
            }
        }
    }

    public void makeEdge(int asal, int tujuan, int jarak){
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan){
        matriks[asal][tujuan] = -1;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char)('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if(matriks[i][j] != -1){
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m), ");
                } else if (matriks[i][j] == -1){
                    System.out.print("Gedung " + (char) ('A' + j) + " (0 m), ");
                }
            }
            System.out.println();
        }
        
    }

    public void degree(int asal) {
        int totalIn = 0, totalOut = 0;
        
        for (int i = 0; i < vertex; i++) {
            // inDegree
            if (matriks[i][asal] != -1) {
                totalIn++;
            }
            // outDegree
            if (matriks[asal][i] != -1) {
                totalOut++;
            }
        }

        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
    }


}
