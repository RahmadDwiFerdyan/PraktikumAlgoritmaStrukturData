import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] matkul = new String[8][2];
        double[][] nilai = new double[8][2];
        double[] bobotSKS = {2, 2, 2, 3, 2, 2, 3, 2};
        double jumlahSKS = 18;

    
        matkul[0][0] = "Pancasila                   ";
        matkul[1][0] = "Konsep Teknologi Informasi  ";
        matkul[2][0] = "CTPS                        ";
        matkul[3][0] = "Matematika Dasar            ";
        matkul[4][0] = "Bahasa Inggris              ";
        matkul[5][0] = "Dasar Pemrograman           ";
        matkul[6][0] = "Praktikum Dasar Pemrograman ";
        matkul[7][0] = "Keselamatan Kesehatan Kerja ";

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("PROGRAM MENGHITUNG IP SEMESTER");
        System.out.println("-----------------------------------------------------------------------");

        for (int i = 0; i<matkul.length; i++){
            System.out.print("Masukkan nilai ANGKA dari MK " + matkul[i][0] + ": ");
            nilai[i][0]=input.nextDouble();

            if(nilai[i][0]>80){
                matkul[i][1]="A ";
                nilai[i][1]=4;
            } else if (nilai[i][0]>73){
                matkul[i][1]="B+";
                nilai[i][1]=3.5;
            } else if (nilai[i][0]>65){
                matkul[i][1]="B ";
                nilai[i][1]=3;
            } else if (nilai[i][0]>60){
                matkul[i][1]="C+";
                nilai[i][1]=2.5;
            } else if (nilai[i][0]>50){
                matkul[i][1]="C ";
                nilai[i][1]=2;
            } else if (nilai[i][0]>39){
                matkul[i][1]="D ";
                nilai[i][1]=1;
            } else {
                matkul[i][1]="E ";
                nilai[i][1]=0;
            }
        }

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("|        Mata kuliah        | Nilai Angka | Nilai Huruf | Bobot Nilai");
        System.out.println("-----------------------------------------------------------------------");
        for (int k=0; k<matkul.length; k++){
            System.out.println(matkul[k][0] + "     " + nilai[k][0] + "            " + matkul[k][1] + "            " + nilai[k][1]);
        }

        //Mata Kuliah direpresentasikan dengan *matkul[n][0]*
        //Nilai Angka direpresentasikan dengan *nilai[n][0]*
        //Nilai Huruf direpresentasikan dengan *matkul[n][1]*
        //Bobot nilai direpresentasikan dengan *nilai[n][1]*

        double iP = 0;
        for (int j = 0; j<matkul.length; j++){
            iP += nilai[j][1]*bobotSKS[j];
        }

        iP/=18; //jumlah SKS adalah 18

        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("IP : %.2f", iP);

    }
}
