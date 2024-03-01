# Laporan Algoritma dan Struktur Data - Pertemuan 3 (Array of Objects)
Dosen Pengampu: Septian Enggar Sukmana, S.Pd., M.T.  
![alt text](POLINEMA-LOGO.png)
Nama : Rahmad Dwi Ferdyan  
Kelas: TI-1H  
NIM : 2341720122  
No. Absen : 23

## 3.2 Percobaan 1: Membuat Array dari Object, Mengisi dan Menampilkan

### 3.2.1 Langkah-langkah Percobaan

### 3.2.2 Verifikasi Hasil Percobaan
![alt text](<Screenshot 2024-02-26 094721.png>)
### 3.2.3 Pertanyaan
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method? Jelaskan!
> Tidak selalu, sebuah class yang akan digunakan untuk membuat array of objects di tidak selalu harus memiliki atribut dan method. Class bisa membuat objek tanpa atribut dan method tertentu, tergantung pada kebutuhan.
2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan konstruktur pada baris program berikut :
![alt text](<Screenshot 2024-02-26 094550.png>)
> class PersegiPanjang tidak memiliki konstruktor, sehingga Java akan secara otomatis menyediakan konstruktor default. Maka dari itu, tetap terdapat pemanggilan konstruktor pada baris program tersebut.
3. Apa yang dimaksud dengan kode berikut ini:
![alt text](<Screenshot 2024-02-26 094627.png>)
> kode tersebut adalah deklarasi dan inisialisasi array "ppArray" yang berisi objek-objek dari class PersegiPanjang. 
4. Apa yang dimaksud dengan kode berikut ini:
![alt text](<Screenshot 2024-02-26 094634.png>)
> ppArray adalah array yang berisi objek dari tipe data PersegiPanjang. Kode program tersebut melakukan inisialisai elemen panjang dan lebar dan menyimpannya di indeks ke-1 array tersebut.
5. Mengapa class main dan  juga class PersegiPanjang dipisahkan pada uji coba 3.2?
>Class `main` dan `PersegiPanjang` dipisahkan agar program menjadi mudah dipahami dan mudah diatur. Pemisahan tersebut akan menjadikan program ini menjadi dua bagian, yaitu bagian yang menjalankan program dan bagian yang menentukan bagaimana `persegiPanjang` bekerja.

## 3.3 Percobaan 2: Menerima Input Isian Array Menggunakan Looping
### 3.3.1 Langkah-langkah Percobaan
### 3.3.2 Verifikasi Hasil Percobaan
![alt text](<Screenshot 2024-02-26 095909.png>)
### 3.3.3 Pertanyaan
1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi?
>Ya, bisa. Array of object dapat diimplementasikan dalam bentuk array 2 dimensi. 
2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan!
```
PersegiPanjang[][] ppArray = new PersegiPanjang[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ppArray[i][j] = new PersegiPanjang();
            }
        }
```
3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode dibawah ini akan memunculkan error saat dijalankan. Mengapa?
![alt text](<Screenshot 2024-02-26 100505.png>)
> karena konstruktor yang memiliki parameter untuk menginisialisasikan atribut sisi belum dipanggil.
``` pgArray[5] = new Persegi(20); ```
4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner!  
![alt text](<Screenshot 2024-02-26 102051.png>)

5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan pada ppArray[i] sekaligus ppArray[0]?Jelaskan !
> Tidak boleh. Ketika sudah melakukan instansiasi objek pada ppArray[0], maka tidak diperlukan lagi untuk menginstansiasi objek pada ppArray[i] dengan nilai i=0. Jika hal tersebut dilakukan, maka nilai sebelumnya (nilai awal) akan tergantikan.

## 3.4 Percobaan 3: Penambahan Operasi Matematika di Dalam Method
### 3.4.1 Langkah-langkah Percobaan
### 3.4.2 Verifikasi Hasil Percobaan
![alt text](<Screenshot 2024-03-01 093853.png>)
### 3.4.3 Pertanyaan
1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh!
>Bisa.

```
public class Buku {
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    // Konstruktor pertama 
    public Mobil() {
        judul = "Malin Kundang";
        pengarang = "Djojo Rahardjo";
        tahunTerbit = 2001;
    }

    // Konstruktor kedua 
    public Mobil(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }
```
2. Jika diketahui terdapat class Segitiga seperti berikut ini: Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi.
```
public class Segitiga {
    public int alas;
    public int tinggi;

    public Segitiga (int a, int t){
        alas = a;
        tinggi = t;
    }
```
3. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga tersebut. Asumsi segitiga adalah segitiga siku-siku. (Hint: Anda dapat menggunakan bantuan library Math pada Java untuk mengkalkulasi sisi miring)
```
public int hitungLuas(){
        return (alas*tinggi)/2;
    }
    public double hitungKeliling(){
        return Math.sqrt((alas*alas) + (tinggi*tinggi));
    }
```
4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing
atributnya sebagai berikut:  
sgArray ke-0 alas: 10, tinggi: 4  
sgArray ke-1 alas: 20, tinggi: 10  
sgArray ke-2 alas: 15, tinggi: 6  
sgArray ke-3 alas: 25, tinggi: 10  
```
Segitiga[] sgArray = new Segitiga[4];
        sgArray[0] = new Segitiga(10, 4);
        sgArray[1] = new Segitiga(20, 10);
        sgArray[2] = new Segitiga(15, 6);
        sgArray[3] = new Segitiga(25, 10);
```
5. Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method hitungLuas() dan hitungKeliling().
```
for (int i=0; i<4; i++){
            System.out.println("Segitiga ke-"+i);
            System.out.println("Luas        : " + sgArray[i].hitungLuas());
            System.out.println("Kelling     : " + sgArray[i].hitungKeliling());
        }
```

## 3.5 Latihan Praktikum
1. Buatlah program yang dapat menghitung luas permukaan dan volume bangun ruang kerucut,
limas segi empat sama sisi, dan bola. Buatlah 3 (tiga) class sesuai dengan jumlah jenis bangun ruang. Buatlah satu main class untuk membuat array of objects yang menginputkan atribut-atribut yang ada menggunakan konstruktor semua bangun ruang tersebut. Dengan ketentuan,  
a. Buat looping untuk menginputkan masing-masing atributnya, kemudian tampilkan luas permukaan dan volume dari tiap jenis bangun ruang tersebut.  
b. Pada kerucut, inputan untuk atribut hanya jari-jari dan sisi miring  
c. Pada limas segi empat sama sisi, inputan untuk atribut hanya panjang sisi alas dan tinggi limas  
d. Pada bola, inpuntan untuk atribut hanya jari-jari  

> Class main: `MainBangunRuang.java`  
> Class bangun ruang: `Kerucut.java` `Limas.java` `Bola.java`
![alt text](<Screenshot 2024-03-01 095820.png>)
![alt text](<Screenshot 2024-03-01 095813.png>)

2. Sebuah kampus membutuhkan program untuk menampilkan informasi mahasiswa berupa nama, nim, jenis kelamin dan juga IPK mahasiswa. Program dapat menerima input semua informasi tersebut, kemudian menampilkanya kembali ke user. Implementasikan program tersebut jika
dimisalkan terdapat 3 data mahasiswa yang tersedia. 
> Class main: `MahasiswaMain.java`  
> class: `Mahasiswa.java`
![alt text](<Screenshot 2024-03-01 093642.png>)  

3. Modifikasi program Latihan no.2 di atas, sehingga bisa digunakan untuk menghitung rata-rata IPK, serta menampilkan data mahasiswa dengan IPK terbesar! (gunakan method untuk masing-masing proses tersebut)
>![alt text](<Screenshot 2024-03-01 093704.png>)

