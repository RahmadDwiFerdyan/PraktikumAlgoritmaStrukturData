# Laporan Pertemuan 2

![alt text](POLINEMA-LOGO.png)

Nama : Rahmad Dwi Ferdyan  
Kelas: TI-1H  
NIM : 2341720122  
No. Absen : 23

## 2.1 Percobaan 1: Deklarasi Class, Atribut dan Method
### 2.1.1 Langkah-langkah Percobaan
### 2.1.2 Verifikasi Hasil Percobaan
Hasil running program menunjukkan bahwa file tidak dapat dieksekusi  
<img src="Screenshot 2024-02-19 100641.png">

### 2.1.3 Pertanyaan
1. Sebutkan dua karakteristik class atau object!  
>Karakteristik class atau object yakni memiliki atribut dan method   

2. Perhatikan class Buku pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh classBuku? Sebutkan apa saja atributnya!  
> Terdapat 5 atribut dalam class Buku, yakni:   
judul: String  
pengarang: String  
halaman: int  
stok: int  
harga: int  

3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!  
> Terdapat 4 method dalam class Buku, yakni:  
tampilInformasi(): void  
terjual(jml: int): void  
restock(n: int): void  
gantiHarga(hrg: int): int  

4. Perhatikan method terjual() yang terdapat di dalam class Buku. Modifikasi isi method tersebut sehingga proses pengurangan hanya dapat dilakukan jika stok masih ada (lebih besar dari 0)!  
> <img src="Screenshot 2024-02-19 102603.png"> .  

  
5. Menurut Anda, mengapa method restock() mempunyai satu parameter berupa bilangan int?  
>method restock() memiliki satu parameter berupa bilangan int sebagai sebuah variabel di dalam methode, yang nantinya akan digunakan untuk mengirim informasi (nilai) ke dalam method

6. Commit dan push kode program ke Github

## 2.2 Percobaan 2: Instansiasi Object, serta Mengakses Atribut dan Method
### 2.2.1 Langkah-langkah Percobaan
### 2.2.2 Verifikasi Hasil Percobaan
![alt text](<Screenshot 2024-02-19 110213.png>)
### 2.2.3 Pertanyaan
1. Pada class BukuMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan?
> ![alt text](<Screenshot 2024-02-19 114751.png>)  Nama objek yang dihasilkan adalah "bk1"
2. Bagaimana cara mengakses atribut dan method dari suatu objek?
> Cara mengakses atribut adalah dengan mengetikkan (namaObjek).(namaAtribut)  
Sedangkan untuk mengakses metode adalah dengan mengetikkan (namaObjek).(namaMethod())  
Contoh : akses atribut -> bk1.judul; akses method -> bk1.tampilan();
3. Mengapa hasil output pemanggilan method tampilInformasi() pertama dan kedua berbeda?
> Karena terdapat beberapa pemanggilan methode yang berisikan perintah/ proses untuk mengubah nilai. Dalam kode program ini, terdapat pemanggilan method terjual() untuk mengurangi jumlah stok dan method gantiHarga() untuk mengganti harga.

## 2.3 Percobaan 3: Membuat Konstruktor
### 2.3.1 Langkah-langkah Percobaan
### 2.3.2 Verifikasi Hasil Percobaan
![alt text](<Screenshot 2024-02-19 113930.png>)
### 2.3.3 Pertanyaan
1. Pada class Buku di Percobaan 3, tunjukkan baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter!
> ![alt text](<Screenshot 2024-02-19 114400.png>)
2. Perhatikan class BukuMain. Apa sebenarnya yang dilakukan pada baris program berikut?
![alt text](<Screenshot 2024-02-19 114550.png>)
> Yang dilakukan oleh program di baris tersebut adalah instansiasi dan mengakses atribut
3. Hapus konstruktor default pada class Buku, kemudian compile dan run program. Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!
>![alt text](<Screenshot 2024-02-19 114953.png>)  
Hasilnya adalah "undefined". Hal ini disebabkan tidak ada konstruktor khusus yang menjadi acuan dalam menjalankan prosesnya.
4. Setelah melakukan instansiasi object, apakah method di dalam class Buku harus diakses secara berurutan? Jelaskan alasannya!
> Ya, jika pengaksesan dilakukan didalam instansiasi. Karena dalam instansiasi memiliki urutan nilai/ tipe data suatu nilai yang telah ditentukan.
5. Buat object baru dengan nama buku NamaMahasiswa menggunakan konstruktor berparameter dari class Buku!
>![alt text](<Screenshot 2024-02-19 124608.png>)
6. Commit dan push kode program ke Github

