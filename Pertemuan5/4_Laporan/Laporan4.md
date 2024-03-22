# Laporan Algoritma dan Struktur Data - Pertemuan 3 (Array of Objects)
Dosen Pengampu : Septian Enggar Sukmana, S.Pd., M.T.  
![alt text](POLINEMA-LOGO.png)
Nam : Rahmad Dwi Ferdyan  
Kelas: TI-1H  
NIM : 2341720122  
No. Absen : 23  

## 4.2 Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer
### 4.2.1 Langkah-langkah Percobaan
### 4.2.2 Verifikasi Hasil Percobaan
![alt text](<Screenshot 2024-03-22 215242.png>)
### 4.2.3 Pertanyaan
1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else!
```
int faktorialDC(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
```
> IF : kode pada IF digunakan untuk menangani jika nilai yang di faktorialkan adalah 0 atau 1. Jika nilai yang difaktorialkan 0 atau 1 maka akan memberi nilai return 1  
ELSE : kode pada ELSE merupakan pengulangan rekursif untuk menghitung n-faktorial. Dengan cara mengisi method faktorialDC() dengan (n-1) secara terus menerus sampai iterasi berakhir (saat hasil  n-1 bernilai 1)
2. Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan for?Buktikan!
> Bisa, dengan menggunakan `while`
```
int fakto = 1;
int i = 1;

while (i <= n) {
    fakto *= i;
    i++;
}

return fakto;
```
3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !
> Pada `fakto *= i;`, kode menggunakan perkalian untuk menghitung nilai faktorial. Setiap iterasi, fakto mengalikan nilai fakto itu sendiri dengan nilai `i` increment dan berhenti sampai syarat terpenuhi.
Pada int `fakto = n * faktorialDC(n-1);`, kode menggunakan rekursi untuk menghitung nilai faktorial. Setiap perulangan, nilai fakto berisi nilai n yang dikalikan dengan faktorialDC dari n-1.

## 4.3 Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer
### 4.3.1 Langkah-langkah Percobaan
### 4.3.2 Verifikasi Hasil Percobaan
![alt text](<Screenshot 2024-03-22 215422.png>)
### 4.3.3 Pertanyaan
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()!
> pangkatBF: pada metode ini pangkat dari suatu bilangan dihitung dengan mengalikan bilangan tersebut dengan dirinya sendiri sebanyak pangkat yang diinginkan.
Misalnya, untuk menghitung bilangan `a^n`, makan `a` akan dikalikan dengan dirinya sendiri sebanyak `n` kali.
pangkatDC : metode ini membagi perhitungan pangkat menjadi dua bagian
Pertama, bagian untuk `n/2` dan yang lainnya untuk 
`n-n/2`. Kemudian, hasilnya dikalikan kembali.
Jika `n` adalah bilangan ganjil, maka satu bagian tambahan `a` juga akan dikalikan pada tahap teakhir.

2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!
> Sudah termasuk tahap combine
```
if (n % 2 == 1) {
    return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a);
} else {
    return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2));
}
```

3. Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan konstruktor.
> Menambahkan kode pada class Pangkat.java
```
Pangkat (int nilai, int pangkat){
        this.nilai = nilai;
        this.pangkat = pangkat;
    }
```
> Menambahkan kode pada class MainPangkat.java
```
for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai yang hendak dipangkatkan   : ");
            int nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat                  : ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat(nilai, pangkat); //<--penambahan
        }
```

4. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan menggunakan switch-case!


## 4.4 Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer
### 4.4.1 Langkah-langkah Percobaan
### 4.4.2 Verifikasi Hasil Percobaan
![alt text](<Screenshot 2024-03-22 215632.png>)
### 4.4.3 Pertanyaan
1. Mengapa terdapat formulasi return value berikut?Jelaskan!
![alt text](<Screenshot 2024-03-22 215025.png>)
2. Kenapa dibutuhkan variable mid pada method TotalDC()?
3. Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja. Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa perusahaan.(Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan dengan program!

