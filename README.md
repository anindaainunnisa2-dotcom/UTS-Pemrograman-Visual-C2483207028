# UTS PEMROGRAMAN VISUAL
## Aplikasi Kasir Kantin Kampus

### Identitas Mahasiswa

- Nama: Aninda Ainunnisa
- NIM: C2483207028
- Program Studi: S1 Pendidikan Teknologi Informasi
- Semester/Kelas: V / PTI5
- Mata Kuliah: Pemrograman Visual
- Dosen Pengampu: Taofik Muhammad, M.Kom
- Universitas: Universitas Muhammadiyah Tasikmalaya

### 1. Deskripsi Aplikasi

Aplikasi Kasir Kantin Kampus merupakan aplikasi desktop sederhana yang dibuat menggunakan bahasa pemrograman Java dan Java Swing melalui Apache NetBeans IDE.

Aplikasi ini bertujuan membantu proses transaksi penjualan makanan dan minuman di kantin kampus. Aplikasi dapat menghitung total harga pembelian, menerima pembayaran, menghitung uang kembalian, serta memberikan pesan apabila terjadi kesalahan input atau pembayaran kurang.

### 2. Fitur Aplikasi

1. Input nama makanan atau minuman.
2. Input harga satuan.
3. Input jumlah pembelian.
4. Input uang pembayaran.
5. Menghitung total harga secara otomatis.
6. Menghitung uang kembalian.
7. Validasi input kosong dan bukan angka.
8. Validasi harga, jumlah, dan pembayaran.
9. Memberikan peringatan jika pembayaran kurang.
10. Tombol Reset untuk mengosongkan formulir transaksi.

### 3. Komponen Java Swing yang Digunakan

- JFrame: Membuat jendela aplikasi.
- JPanel: Mengatur tata letak komponen.
- JLabel: Menampilkan informasi dan keterangan.
- JTextField: Menerima input pengguna.
- JButton: Menjalankan perintah Hitung, Bayar, dan Reset.
- JOptionPane: Menampilkan pesan informasi dan peringatan.
- SwingUtilities: Menjalankan antarmuka aplikasi.

### 4. Rumus Perhitungan

Total Harga = Harga Satuan × Jumlah Pembelian

Uang Kembalian = Uang Pembayaran − Total Harga

### 5. Pengujian Aplikasi

| Nama Barang | Harga | Jumlah | Pembayaran | Hasil |
|---|---:|---:|---:|---|
| Nasi Goreng | Rp15.000 | 2 | Rp50.000 | Total Rp30.000, kembali Rp20.000 |
| Mie Ayam | Rp12.000 | 3 | Rp40.000 | Total Rp36.000, kembali Rp4.000 |
| Es Teh | Rp5.000 | 4 | Rp10.000 | Pembayaran kurang Rp10.000 |

### 6. Dokumentasi Screenshot

#### Tampilan Utama Aplikasi
<img width="1366" height="768" alt="Tampilan Utama" src="https://github.com/user-attachments/assets/3efad7e5-fb5b-4b7f-9c61-e4e28c1f8588" />

#### Hasil Perhitungan Total Harga
<img width="1366" height="768" alt="Hasil Perhitungan Nasi Goreng" src="https://github.com/user-attachments/assets/4c0d9d97-c6b3-40c8-8d7c-64847e438fc7" />
<img width="1366" height="768" alt="Hasil Perhitungan Mie Ayam" src="https://github.com/user-attachments/assets/5a7458b3-b769-4e45-adae-7e06a07d5b2f" />
<img width="1366" height="768" alt="Hasil Perhitungan Es Teh" src="https://github.com/user-attachments/assets/8423ee4a-4aca-43b5-b41c-efde63711848" />



#### Hasil Pembayaran dan Uang Kembalian
<img width="1366" height="768" alt="Hasil Perhitungan Nasi Goreng" src="https://github.com/user-attachments/assets/3b07ee4e-ca45-4230-b241-82e3ab592e2a" />

### 7. Cara Menjalankan Aplikasi

1. Pastikan Java Development Kit (JDK) dan Apache NetBeans IDE sudah terinstal.
2. Clone atau download repository ini.
3. Buka Apache NetBeans IDE.
4. Pilih File → Open Project.
5. Cari folder UTS_Pemrograman_Visual.
6. Buka project tersebut.
7. Klik kanan file KasirKantinKampus.java.
8. Pilih Run File untuk menjalankan aplikasi.

### 8. Teknologi yang Digunakan

- Bahasa Pemrograman: Java
- GUI: Java Swing
- IDE: Apache NetBeans IDE 31
- Database: Tidak menggunakan database

---

**Universitas Muhammadiyah Tasikmalaya**  
Program Studi S1 Pendidikan Teknologi Informasi  
Tahun Akademik 2026/2027
