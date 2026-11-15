import javax.swing.*;
import java.awt.*;
import java.text.NumberFormat;
import java.util.Locale;

public class KasirKantinKampus extends JFrame {

    private JTextField txtNama, txtHarga, txtJumlah, txtPembayaran;
    private JLabel lblTotal, lblKembalian;

    private long totalHarga = 0;

    public KasirKantinKampus() {

        setTitle("Aplikasi Kasir Kantin Kampus");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // Panel utama
        JPanel panel = new JPanel(new GridLayout(7, 2, 10, 15));
        panel.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));

        // Judul
        JLabel judul = new JLabel("KASIR KANTIN KAMPUS");
        judul.setFont(new Font("Arial", Font.BOLD, 22));
        judul.setHorizontalAlignment(SwingConstants.CENTER);

        // Komponen input
        txtNama = new JTextField();
        txtHarga = new JTextField();
        txtJumlah = new JTextField();
        txtPembayaran = new JTextField();

        lblTotal = new JLabel("Rp0");
        lblKembalian = new JLabel("Rp0");

        // Tombol
        JButton btnHitung = new JButton("HITUNG");
        JButton btnBayar = new JButton("BAYAR");
        JButton btnReset = new JButton("RESET");

        // Memasukkan komponen ke panel
        panel.add(new JLabel("Nama Makanan/Minuman"));
        panel.add(txtNama);

        panel.add(new JLabel("Harga Satuan"));
        panel.add(txtHarga);

        panel.add(new JLabel("Jumlah Pembelian"));
        panel.add(txtJumlah);

        panel.add(new JLabel("Uang Pembayaran"));
        panel.add(txtPembayaran);

        panel.add(new JLabel("Total Harga"));
        panel.add(lblTotal);

        panel.add(new JLabel("Uang Kembalian"));
        panel.add(lblKembalian);

        panel.add(btnHitung);
        panel.add(btnBayar);

        // Panel tombol reset
        JPanel panelBawah = new JPanel();
        panelBawah.add(btnReset);

        // Menampilkan komponen
        add(judul, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        add(panelBawah, BorderLayout.SOUTH);

        // Event tombol
        btnHitung.addActionListener(e -> hitungTotal());
        btnBayar.addActionListener(e -> prosesBayar());
        btnReset.addActionListener(e -> resetForm());

    }

    // Format angka menjadi Rupiah
    private String rupiah(long angka) {

        NumberFormat nf = NumberFormat.getCurrencyInstance(
                new Locale("id", "ID"));

        nf.setMaximumFractionDigits(0);

        return nf.format(angka);
    }

    // Menghitung total harga
    private boolean hitungTotal() {

        try {

            String nama = txtNama.getText().trim();
            String harga = txtHarga.getText().trim();
            String jumlah = txtJumlah.getText().trim();

            if (nama.isEmpty() || harga.isEmpty() || jumlah.isEmpty()) {

                JOptionPane.showMessageDialog(this,
                        "Nama barang, harga, dan jumlah wajib diisi!");

                return false;
            }

            long hargaSatuan = Long.parseLong(harga);
            long jumlahBeli = Long.parseLong(jumlah);

            if (hargaSatuan < 0 || jumlahBeli <= 0) {

                JOptionPane.showMessageDialog(this,
                        "Harga tidak boleh negatif dan jumlah harus lebih dari 0!");

                return false;
            }

            totalHarga = Math.multiplyExact(hargaSatuan, jumlahBeli);

            lblTotal.setText(rupiah(totalHarga));
            lblKembalian.setText("Rp0");

            return true;

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this,
                    "Harga dan jumlah harus berupa angka!");

            return false;

        } catch (ArithmeticException e) {

            JOptionPane.showMessageDialog(this,
                    "Nilai total harga terlalu besar!");

            return false;
        }
    }

    // Proses pembayaran
    private void prosesBayar() {

        if (!hitungTotal()) {
            return;
        }

        try {

            String pembayaran = txtPembayaran.getText().trim();

            if (pembayaran.isEmpty()) {

                JOptionPane.showMessageDialog(this,
                        "Uang pembayaran wajib diisi!");

                return;
            }

            long uangBayar = Long.parseLong(pembayaran);

            if (uangBayar < 0) {

                JOptionPane.showMessageDialog(this,
                        "Pembayaran tidak boleh negatif!");

                return;
            }

            if (uangBayar < totalHarga) {

                long kurang = totalHarga - uangBayar;

                lblKembalian.setText("Kurang " + rupiah(kurang));

                JOptionPane.showMessageDialog(this,
                        "Pembayaran kurang " + rupiah(kurang));

                return;
            }

            long kembalian = uangBayar - totalHarga;

            lblKembalian.setText(rupiah(kembalian));

            JOptionPane.showMessageDialog(this,
                    "PEMBAYARAN BERHASIL!\n\n"
                    + "Nama Barang: " + txtNama.getText()
                    + "\nTotal Harga: " + rupiah(totalHarga)
                    + "\nUang Bayar: " + rupiah(uangBayar)
                    + "\nKembalian: " + rupiah(kembalian));

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this,
                    "Uang pembayaran harus berupa angka!");

        }
    }

    // Mengosongkan formulir
    private void resetForm() {

        txtNama.setText("");
        txtHarga.setText("");
        txtJumlah.setText("");
        txtPembayaran.setText("");

        lblTotal.setText("Rp0");
        lblKembalian.setText("Rp0");

        totalHarga = 0;

        txtNama.requestFocus();

    }

    // Program utama
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            KasirKantinKampus aplikasi = new KasirKantinKampus();

            aplikasi.setVisible(true);

        });

    }

}
