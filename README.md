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
