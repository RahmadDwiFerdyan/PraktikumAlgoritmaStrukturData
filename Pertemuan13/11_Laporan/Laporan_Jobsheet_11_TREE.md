# Laporan Algoritma dan Struktur Data - Jobsheet 11 (TREE)
Dosen Pengampu : Septian Enggar Sukmana, S.Pd., M.T.  
![alt text](POLINEMA-LOGO.png)
Nama : Rahmad Dwi Ferdyan  
Kelas : TI-1H  
NIM : 2341720122  
No. Absen : 23  
-
## 13.2 Kegiatan Praktikum 1 | Implementasi Binary Search Tree menggunakan Linked List 
### Verifikasi Hasil Percobaan   
`Hasil seharusnya (dari jobsheet) `   
![alt text](image-1.png)  
`Hasil percobaan`    
![alt text](image.png)
### 13.2.2 Pertanyaan Percobaan
1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa?
> Binary search treem memiliki aturan yang jelas mengenai dimana data-data tersebut ditempatkan. Sehingga membuat pencarian lebih cepat dan efisien dibandingkan dengan binary tree biasa yang tidak memiliki aturan khusus. Binary tree biasa tidak lebih efisien  karena kita program tersebut akan melakukan pencarian satu-persatu.

2. Untuk apakah di class Node, kegunaan dari atribut left dan right?
> Atribut left dan right adalah sebagai pointer atau penunjuk dimana letak data child/ anak. Atribut left menunjukkan ke child disebelah kiri, dan right menunjukkan ke child disebelah kanan.

3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree? 
>  Atribut root adalah sebagai node utama/ induk dari sebuah tree  

b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?
> Ketika objek tree pertama kali dibuat, nilai dari root akan dinisiasi ke null terlbeih dahulu.
4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?
> Ketika tree masih kosong dan kemudian ditambahkan node baru, maka akan terjadi proses pengecekan terlbih dahulu, yaitu mengecek apakah tree kosong (menggunakan method isEmpty()), jika iya, maka node baru akan ditambahkan dan dijadikan sebagai root.
5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan secara detil untuk apa baris program tersebut?

```
if(data < current.data){
 if (current.left!=null) {
    current = current.left;
 } else {
    current.left = new Node(data);
    break;
  }
}
```
> Pertama, akan dilakukan pengecekan apakah `data yang ditmabahkan` lebih kecil dari `data di node saat ini`. JIka iya, maka akan dilanjutkan proses pengecekan berikutnya, yakni apakah node anak kiri dari node saat ini tidak null/ kosong. Jika tidak null, maka pointer current/ pointer `node-saat-ini` akan dipindahkan ke `node-anak-kiri` dari `node-saat-ini`. Namun jika current.left (`anak-kiri` dari `node-saat-ini`) adalah kosong, maka data yang akan ditambahkan akan diletakkan di node `current.left` ini.

## 13.3 Kegiatan Praktikum 2 | Implementasi binary tree dengan array
### Verifikasi Hasil Percobaan   
`Hasil seharusnya (dari jobsheet)`   
 ![alt text](image-3.png)  
`Hasil percobaan`    
![alt text](image-2.png)  

### 13.3.2 Pertanyaan Percobaan
1. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?
> Atribut data adalah variabel yang digunakan untuk menyimpan data atua nilai, dan idxLast adalah indeks terkahir dari node yang ada pada data.
2. Apakah kegunaan dari method populateData()?
> Method `populateData()` digunakan untuk mengisi nilai pada `data` dan mengatur nilai indeks terakhir dari data yang disimpan.
3. Apakah kegunaan dari method traverseInOrder()?
> method `traverseInOrder()` digunakan untuk melakukan penelusuran pada binary tree yang nantinya akan diprint dalam bentuk urutan nilai dengan urutan left-root-right
4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left child dan rigth child masin-masing?
> Dengan root yang dimulai dari index 0,   
maka anak kiri dari node 2 berada di indeks ke  = 2*i+1 = 2*(2)+1 = 5  
dan anak kanan dari node 2 berada di indeks ke  = 2*i+2 = 2*(2)+2 = 6
5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?
> statement `int idxLast = 6` digunakan untuk menginisialisai variabel idxLast dengan nilai 6, yang menunjukkan bahwa akan ada 7 nilai yang diprint atau kurang dari sama dengan indeks ke-6.

## 13.4 Tugas Praktikum
*Kode program terlampir di file didalam folder ini
1. Buat method di dalam class BinaryTree yang akan menambahkan node dengan cara rekursif.  
>![alt text](image-4.png)
2. Buat method di dalam class BinaryTree untuk menampilkan nilai paling kecil dan yang paling besar yang ada di dalam tree.  
>![alt text](image-5.png)
3. Buat method di dalam class BinaryTree untuk menampilkan data yang ada di leaf.  
>![alt text](image-6.png)
4. Buat method di dalam class BinaryTree untuk menampilkan berapa jumlah leaf yang ada di dalam tree.  
>![alt text](image-7.png)
5. Modifikasi class BinaryTreeArray, dan tambahkan:  
• method add(int data) untuk memasukan data ke dalam tree  
>![alt text](image-8.png) 

• method traversePreOrder() dan traversePostOrder()  
>![alt text](image-9.png)

