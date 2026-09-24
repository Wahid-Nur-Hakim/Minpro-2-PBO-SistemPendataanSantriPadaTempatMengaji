# Sistem Pendataan Santri Pada Tempat Mengaji - RQ Al-Hafizh

# Wahid Nur Hakim | 2509116016 | Sistem Informasi A'25

## Deskripsi Program
<p align="justify">
Sistem Manajemen Rumah Qur'an Al-Hafizh adalah program berbasis Java yang digunakan untuk mengelola data kegiatan mengaji dengan metode UMMI secara sederhana. Program ini berfokus pada tiga data utama, yaitu Santri (nama, umur, nomor telepon wali, dan kelas), Kelas Mengaji (kode, nama kelas, pengajar, dan kapasitas), serta Pengajar (nama, nomor telepon, dan kelas yang diajar). Melalui menu di konsol, pengguna dapat melakukan CRUD (Create, Read, Update, Delete) terhadap ketiga data tersebut. Setiap input divalidasi, misalnya umur santri harus 5 sampai 17 tahun dan kelas yang penuh tidak dapat menerima santri baru dan untuk tempat menyimpan data sementara di memori menggunakan ArrayList.
</p>

## Class yang dipakai Dalam Program
<p align="justify">
  
**1. MiniProject2**\
class yang berisi method main(), yaitu titik awal program. Class ini membuat objek Scanner, Menu, dan CrudUmmi.

**2. Menu**\
class yang bertugas menampilkan semua tampilan menu (utama, santri, kelas mengaji, dan pengajar), serta membaca input pengguna berupa angka maupun teks.

**3. CrudUmmi**\
class yang berisi logika utama program, yaitu proses tambah, lihat, ubah, dan hapus data, beserta validasi input dan penyimpanan data di ArrayList.

**4. RumahQuran**\
abstract class sebagai superclass yang menyimpan atribut umum, yaitu nama dan nomorTelepon, serta method abstrak getJenisPengguna().

**5. Santri**\
subclass dari RumahQuran yang menambahkan atribut umur dan kelasMengaji, untuk menyimpan data santri.

**6. Pengajar**\
subclass dari RumahQuran yang menambahkan atribut mengajar, untuk menyimpan data pengajar.

**7. KelasMengaji**\
class yang menyimpan data kelas, yaitu kodeKelas, namaKelas, pengajar, dan kapasitas. Class ini berdiri sendiri dan tidak mewarisi class lain.
</p>

## Alur Program
<p align="justify">
Program dimulai dari kelas MiniProject2 yang membuat objek Scanner, Menu, dan CrudUmmi. Kemudian, program menampilkan menu utama dengan pilihan untuk mengelola data santri, kelas mengaji, atau pengajar, serta pilihan keluar. Ketika pengguna memilih salah satu pengelolaan data, program masuk ke submenu yang berisi fitur tambah, lihat, ubah, dan hapus, lalu meminta input yang diperlukan. Setiap input diperiksa terlebih dahulu dengan validasi input dan pengguna diminta mengisi ulang jika belum sesuai, sedangkan data yang sudah valid langsung diproses dan hasilnya ditampilkan dalam bentuk pesan atau tabel. Setelah satu proses selesai, program kembali ke submenu dan pengguna dapat memilih kembali ke menu utama. Program berakhir ketika pengguna memilih menu keluar, dan program menampilkan ucapan penutup.
</p>

## Penerapan Encapsulation
Encapsulation diterapkan pada seluruh class pada package model, yaitu kelas mengaji, rumah quran, santri, dan pengajar.
  
<img width="547" height="165" alt="image" src="https://github.com/user-attachments/assets/772ba7ae-5174-4b6c-af0f-c81eac9c33c4" />

<p align="justify">
Seperti yang dapat dilihat pada gambar di atas, atribut nama dan nomorTelepon di dalam class RumahQuran, yang nantinya diturunkan ke subclass Santri dan Pengajar, dibuat private sehingga data tidak dapat diakses langsung dari luar class, termasuk dari subclass. Subclass hanya dapat mengakses atribut tersebut melalui getter dan setter yang disediakan.
</p>

<img width="710" height="122" alt="image" src="https://github.com/user-attachments/assets/053a1c2c-09c9-47c9-9aca-b697fe8272ca" />

<img width="271" height="37" alt="image" src="https://github.com/user-attachments/assets/508acf97-01b7-4353-a862-e523b9a8460c" />

Setiap atribut yang boleh diubah memiliki getter dan setter, sehingga perubahan data hanya bisa dilakukan lewat method yang sudah disediakan, terkecuali pada yang mempunyai sifat private final karena data tersebut tidak dapat diubah.

## Penerapan Inheritance
<p align="justify">
  
               RumahQuran
          - nama, nomorTelepon
           /                 \
      Santri               Pengajar
     - umur                - mengajar
     - kelasMengaji
Inheritance (pewarisan) diterapkan pada paket model, yaitu class RumahQuran sebagai superclass yang diturunkan ke dua subclass, Santri dan Pengajar.

<img width="547" height="165" alt="Screenshot 2026-09-24 215816" src="https://github.com/user-attachments/assets/c121ce40-ba42-4d42-86f4-d58bf9ce8596" />

Class RumahQuran menyimpan atribut yang sama-sama dimiliki santri dan pengajar, yaitu nama dan nomorTelepon, lengkap dengan getter dan setter-nya, sehingga kode tidak perlu ditulis ulang di setiap subclass.

<img width="768" height="204" alt="image" src="https://github.com/user-attachments/assets/44f5c5a3-cc48-4608-983b-205b11a87a02" />

<img width="634" height="168" alt="image" src="https://github.com/user-attachments/assets/732c4077-7cb0-4038-8151-cf670a3fa85c" />

<p align="justify">
Class Santri dan Pengajar memakai kata kunci extends RumahQuran dan memanggil constructor superclass melalui super(nama, nomorTelepon), lalu menambahkan atribut khusus masing-masing: Santri memiliki umur dan kelasMengaji, sedangkan Pengajar memiliki mengajar.
</p>

## Penerapan Nilai Tambah

Pada program saya juga menerapkan nilai tambah, yaitu penerapan pola MVC dan Polymorphism.

### MVC (Model-View-Controller)

<p align="justify">
MVC digunakan agar kode program tidak tercampur dalam satu class besar. Dengan MVC, tampilan menu, penyimpanan data, dan proses logika program dipisah menjadi tiga bagian dengan tanggung jawabnya masing-masing, sehingga program lebih rapi, lebih mudah ditelusuri kalau ada kesalahan, dan lebih mudah dikembangkan tanpa mengganggu bagian lain.
</p>

<img width="265" height="267" alt="image" src="https://github.com/user-attachments/assets/77159888-5d85-415c-accb-4b11eeb1db38" />

<p align="justify">
Program ini disusun dengan pola MVC (Model-View-Controller), yaitu pemisahan kode ke dalam tiga bagian berdasarkan tugasnya agar lebih rapi dan mudah diperbaiki, seperti terlihat pada struktur paket di gambar. Paket model berisi class RumahQuran, Santri, Pengajar, dan KelasMengaji yang menyimpan data beserta aturan validasinya. Paket view berisi class Menu yang menampilkan menu ke layar dan membaca input dari pengguna. Paket controller berisi class CrudUmmi yang menjadi penghubung keduanya, yaitu menerima pilihan pengguna, memvalidasi input, lalu memproses data (tambah, lihat, ubah, hapus) pada objek model yang disimpan di ArrayList. Adapun class MiniProject2 pada paket utama hanya berfungsi sebagai titik awal program (main) yang membuat objek Menu dan CrudUmmi, lalu menjalankan menu utama.
</p>

### Polymorphism
<img width="389" height="24" alt="image" src="https://github.com/user-attachments/assets/2005aa44-207e-4cc2-9d66-04820ab9175f" />

<p align="justify">
Polymorphism digunakan agar satu method dengan nama yang sama dapat menghasilkan perilaku berbeda tergantung jenis objeknya, tanpa harus membuat percabangan untuk mengecek jenis objek satu per satu. Pada gambar di atas, dapat dilihat bahwa polymorphism diterapkan melalui method overriding pada method getJenisPengguna() yang dideklarasikan sebagai method abstrak di superclass RumahQuran. Method ini di-override oleh subclass Santri dan Pengajar, sehingga meskipun dipanggil dengan cara yang sama, hasilnya berbeda tergantung jenis objeknya.
</p>

<img width="665" height="108" alt="image" src="https://github.com/user-attachments/assets/d296b5ff-6048-4f73-8f40-2e851f02f630" />

<p align="justify">
Jika objeknya Santri, getJenisPengguna() akan mengembalikan teks "Santri", dan toString() akan menampilkan nama, umur, nomor telepon wali, dan kode kelas.
</p>

<img width="455" height="107" alt="image" src="https://github.com/user-attachments/assets/54079c30-62be-4aad-8cf4-86c6d3570a0a" />

<p align="justify">
Jika objeknya Pengajar, getJenisPengguna() akan mengembalikan teks "Pengajar", dan toString() akan menampilkan nama, nomor telepon, dan kelas yang diajar.
</p>
