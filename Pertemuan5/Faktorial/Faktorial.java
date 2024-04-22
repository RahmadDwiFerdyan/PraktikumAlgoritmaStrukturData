package PraktikumAlgoritmaStrukturData.Pertemuan5.Faktorial;

public class Faktorial {
    public int nilai;

    int faktorialBF(int n) {
        int fakto = 1;
        for (int i = 1; i <= n; i++) {
            fakto *= i;
        }
        return fakto;
    }

    int faktorialDC(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }

}

//= 5 * faktorialDC(4)
//= 5 * (4 * faktorialDC(3))
//= 5 * (4 * (3 * faktorialDC(2))))
//= 5 * (4 * (3 * (2 * faktorialDC(1)))))
//= 5 * (4 * (3 * (2 * 1))))