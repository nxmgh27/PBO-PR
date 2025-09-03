public class Karyawan {
    private String nama;
    private double tabungan;
    private double pinjaman;
    private double cicilan;

    public Karyawan(String nama) {
        this.nama = nama;
        this.tabungan = 0;
        this.pinjaman = 0;
        this.cicilan = 0;
    }

    public String getNama() {
        return nama;
    }

    public double getTabungan() {
        return tabungan;
    }

    public double getPinjaman() {
        return pinjaman;
    }

    public void setorTabungan(double jumlah) {
        tabungan += jumlah;
    }

    public boolean tarikTabungan(double jumlah) {
        if (jumlah <= tabungan) {
            tabungan -= jumlah;
            return true;
        }
        return false;
    }

    public void ajukanPinjaman(double jumlah, double cicilan) {
        this.pinjaman = jumlah;
        this.cicilan = cicilan;
    }

    public boolean bayarPinjaman() {
        if (pinjaman > 0) {
            pinjaman -= cicilan;
            if (pinjaman < 0) pinjaman = 0;
            return true;
        }
        return false;
    }

    public double getCicilan() {
        return cicilan;
    }
}
