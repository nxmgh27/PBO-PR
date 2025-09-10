package id.ac.polban.model;

import java.util.ArrayList;

public class Koperasi {
    private ArrayList<Karyawan> daftarKaryawan;

    public Koperasi() {
        daftarKaryawan = new ArrayList<>();
    }

    public Karyawan cariKaryawan(String nama) {
        for (Karyawan k : daftarKaryawan) {
            if (k.getNama().equalsIgnoreCase(nama)) {
                if (k.getTabungan() == 0 && k.getPinjaman() == 0) {
                    return null;
                }
                return k;
            }
        }
        return null;
    }

    public Karyawan tambahKaryawan(String nama, double setorAwal) {
        Karyawan baru = new Karyawan(nama);
        baru.setorTabungan(setorAwal);
        daftarKaryawan.add(baru);
        return baru;
    }

    public void tampilkanData() {
        if (daftarKaryawan.isEmpty()) {
            System.out.println("\nBelum ada data karyawan.\n");
            return;
        }

        System.out.println("\n+-----------------------------------------------+");
        System.out.println("| Nama       | Tabungan        | Pinjaman       |");
        System.out.println("+-----------------------------------------------+");
        for (Karyawan k : daftarKaryawan) {
            String pinjamanStr = (k.getPinjaman() == 0) ? "LUNAS" : String.format("Rp%,.2f", k.getPinjaman());
            System.out.printf("| %-10s | Rp%,12.2f | %-13s |\n",
                    k.getNama(), k.getTabungan(), pinjamanStr);
        }
        System.out.println("+-----------------------------------------------+\n");
    }
}
