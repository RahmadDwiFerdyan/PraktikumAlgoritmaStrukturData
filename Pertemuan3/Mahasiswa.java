package PraktikumAlgoritmaStrukturData.Pertemuan3;

public class Mahasiswa {
    public String nama;
    public long nim;
    public char gender;
    public double ipk;
    public double jmlIPK;
    public int jml;

    public Mahasiswa(String nama, long nim, char gender, double ipk, int jml) {
        this.nama = nama;
        this.nim = nim;
        this.gender = gender;
        this.ipk = ipk;
    }

    public Mahasiswa() {

    }

    public double rataIPK() {
        return jmlIPK / jml;
    }

    public int ipkTertinggi(Mahasiswa[] mhsArray) {
        double ipkCompare = mhsArray[0].ipk;
        int indexIPKtertinggi = 0;

        for (int i = 1; i < jml; i++) {
            if (mhsArray[i].ipk > ipkCompare) {
                ipkCompare = mhsArray[i].ipk;
                indexIPKtertinggi = i;
            }
        }

        return indexIPKtertinggi;
    }

}
