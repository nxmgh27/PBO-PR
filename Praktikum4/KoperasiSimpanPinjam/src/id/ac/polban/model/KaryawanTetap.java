package KoperasiSimpanPinjam.src.id.ac.polban.model;

public class KaryawanTetap extends Karyawan {
    private double gajiPokok;

    public KaryawanTetap(String nama, double gajiPokok) {
        super(nama);
        this.gajiPokok = gajiPokok;
    }

    @Override
    public void pinjamUang(double jumlah) {
        if (jumlah <= 3 * gajiPokok) {
            super.pinjamUang(jumlah);
        } else {
            System.out.println("Pinjaman melebihi batas untuk karyawan tetap!");
        }
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Status: Karyawan Tetap | Gaji Pokok: Rp" + gajiPokok);
    }
}
