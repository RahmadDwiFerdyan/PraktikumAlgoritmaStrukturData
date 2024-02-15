public class Fungsi {

        static int hrgAglonema = 75000;
        static int hrgKeladi = 50000;
        static int hrgAlocasia = 60000;
        static int hrgMawar = 10000;

        static int[][] stokBunga = {
                {10, 5, 15, 7},
                {6, 11, 9, 12},
                {2, 10, 10, 5},
                {5, 7, 12, 9}
        };

        static void tampilkanPendapatan() {
            System.out.println("===============================================");
            for (int i = 0; i < stokBunga.length; i++) {
                int pendapatan = 0;
                for (int j = 0; j < stokBunga[i].length; j++) {
                    switch (j) {
                        case 0:
                            pendapatan += stokBunga[i][j] * hrgAglonema;
                            break;
                        case 1:
                            pendapatan += stokBunga[i][j] * hrgKeladi;
                            break;
                        case 2:
                            pendapatan += stokBunga[i][j] * hrgAlocasia;
                            break;
                        case 3:
                            pendapatan += stokBunga[i][j] * hrgMawar;
                            break;
                    }
                }
                System.out.println("Pendapatan Cabang " + (i + 1) + ": " + pendapatan);
            }
        }
    
        static void tampilkanStokRoyalGarden4() {
            int[] stokBungaRoyalGarden4 = {5, 7, 12, 9};
    
            int penguranganAglonema = -1;
            int penguranganKeladi = -2;
            int penguranganAlocasia = 0;
            int penguranganMawar = -5;

            stokBungaRoyalGarden4[0] += penguranganAglonema;
            stokBungaRoyalGarden4[1] += penguranganKeladi;
            stokBungaRoyalGarden4[2] += penguranganAlocasia;
            stokBungaRoyalGarden4[3] += penguranganMawar;
    
            System.out.println("===============================================");
            System.out.println("STOK ROYALGARDEN 4 (Setelah pengurangan stok)");
            System.out.println("Stok Aglonema  : " + stokBungaRoyalGarden4[0]);
            System.out.println("Stok Keladi    : " + stokBungaRoyalGarden4[1]);
            System.out.println("Stok Alocasia  : " + stokBungaRoyalGarden4[2]);
            System.out.println("Stok Mawar     : " + stokBungaRoyalGarden4[3]);
            System.out.println("===============================================");
        }

    public static void main(String[] args) {

            tampilkanPendapatan();
    
            tampilkanStokRoyalGarden4();
        }

}