package KoperasiSimpanPinjam.src.id.ac.polban.model;

public class KaryawanKontrak extends Karyawan {
    private int durasiKontrak; // bulan

    public KaryawanKontrak(String nama, int durasiKontrak) {
        super(nama);
        this.durasiKontrak = durasiKontrak;
    }

    @Override
    public void pinjamUang(double jumlah) {
        if (jumlah <= 1_000_000) {
            super.pinjamUang(jumlah);
        } else {
            System.out.println("Pinjaman melebihi batas untuk karyawan kontrak!");
        }
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Status: Karyawan Kontrak | Durasi: " + durasiKontrak + " bulan");
    }
}
