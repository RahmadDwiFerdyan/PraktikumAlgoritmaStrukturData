package PraktikumAlgoritmaStrukturData.Pertemuan5.Latihan_Praktikum;

public class MainShowroom {
    public static void main(String[] args) {
        Showroom[] mobil = {
                new Showroom("BMW M2", "Coupe", 2016, 6816, 728),
                new Showroom("Ford", "Fiesta ST", 2014, 3921, 575),
                new Showroom("Nissan", "370Z", 2009, 4360, 657),
                new Showroom("Subaru", "BRZ", 2014, 4058, 609),
                new Showroom("Subaru", "Impreza WRX STI", 2013, 6255, 703),
                new Showroom("Toyota", "AE86 Trueno", 1986, 3700, 553),
                new Showroom("Toyota", "86/GT86", 2014, 4180, 609),
                new Showroom("Volkswagen", "Golf GTI", 2014, 4180, 631),
        };

        Showroom mbl = new Showroom();
        
        System.out.println("Top acceleration tertinggi  : " + mbl.accelTertinggi(mobil, 0, mobil.length - 1));
        System.out.println("Top acceleration terendah   : " + mbl.accelerationTerendah(mobil, 0, mobil.length - 1));
        System.out.printf("Rata-rata top power         : %.2f", mbl.AvgPowers(mobil));

    }
}
