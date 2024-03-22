package PraktikumAlgoritmaStrukturData.Pertemuan5;

public class Showroom {
    public String merk, tipe;
    public int tahun, top_accel, top_power;

    Showroom(String merk, String tipe, int tahun, int top_accel, int top_power) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.top_accel = top_accel;
        this.top_power = top_power;
    }

    public Showroom() {

    }

    int accelTertinggi(Showroom[] mobil, int left, int right) {
        if (left == right) {
            return mobil[left].top_accel;
        } else if (left < right) {
            int mid = (left + right) / 2;
            int leftmax = accelTertinggi(mobil, left, mid);
            int rightmax = accelTertinggi(mobil, mid + 1, right);

            if (leftmax > rightmax) {
                return leftmax;
            } else {
                return rightmax;
            }
        }
        return -1;
    }

    int accelerationTerendah(Showroom[] mobil, int left, int right) {
        if (left == right) {
            return mobil[left].top_accel;
        } else if (left < right) {
            int mid = (left + right) / 2;
            int leftmin = accelerationTerendah(mobil, left, mid);
            int rightmin = accelerationTerendah(mobil, mid + 1, right);

            if (leftmin < rightmin) {
                return leftmin;
            } else {
                return rightmin;
            }
        }
        return -1;
    }

    double AvgPowers (Showroom [] mobil){
        double total = 0;
        for (int i = 0; i < mobil.length; i++) {
            total += mobil[i].top_power;
        }
        return total/mobil.length;
    }

}
