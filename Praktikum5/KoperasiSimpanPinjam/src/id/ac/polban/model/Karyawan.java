package KoperasiSimpanPinjam.src.id.ac.polban.model;

public class Karyawan {
    protected String nama;
    protected double tabungan;
    protected double pinjaman;

    public Karyawan(String nama) {
        this.nama = nama;
        this.tabungan = 0;
        this.pinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public void setorTabungan(double jumlah) {
        tabungan += jumlah;
        System.out.println(nama + " setor Rp" + jumlah);
    }

    public void tarikTabungan(double jumlah) {
        if (jumlah <= tabungan) {
            tabungan -= jumlah;
            System.out.println(nama + " tarik Rp" + jumlah);
        } else {
            System.out.println("Saldo tabungan " + nama + " tidak cukup");
        }
    }

    public void pinjamUang(double jumlah) {
        pinjaman += jumlah;
        System.out.println(nama + " pinjam Rp" + jumlah);
    }

    public void bayarCicilan(double jumlah) {
        if (pinjaman == 0) {
            System.out.println("Pinjaman " + nama + " sudah lunas.");
        } else if (jumlah < pinjaman) {
            pinjaman -= jumlah;
            System.out.println(nama + " bayar cicilan Rp" + jumlah + ". Sisa pinjaman: Rp" + pinjaman);
        } else {
            System.out.println(nama + " bayar cicilan Rp" + jumlah + ". Pinjaman lunas!");
            pinjaman = 0;
        }
    }

    public void info() {
        System.out.println("Karyawan: " + nama +
                           " | Tabungan: Rp" + tabungan +
                           " | Pinjaman: Rp" + pinjaman);
    }
}
