package KoperasiSimpanPinjam.src.id.ac.polban.service;
import KoperasiSimpanPinjam.src.id.ac.polban.model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\n=== MENU KOPERASI SIMPAN PINJAM ===");
            System.out.println("1. Tambah Karyawan Tetap");
            System.out.println("2. Tambah Karyawan Kontrak");
            System.out.println("3. Setor Tabungan");
            System.out.println("4. Tarik Tabungan");
            System.out.println("5. Pinjam Uang");
            System.out.println("6. Bayar Cicilan");
            System.out.println("7. Lihat Data Semua Karyawan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> tambahKaryawanTetap();
                case 2 -> tambahKaryawanKontrak();
                case 3 -> setorTabungan();
                case 4 -> tarikTabungan();
                case 5 -> pinjamUang();
                case 6 -> bayarCicilan();
                case 7 -> lihatDataKaryawan();
                case 0 -> System.out.println("Terima kasih, program selesai.");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }

    private static void tambahKaryawanTetap() {
        System.out.print("Nama karyawan tetap: ");
        String nama = scanner.nextLine();
        System.out.print("Gaji pokok: ");
        double gaji = scanner.nextDouble();
        daftarKaryawan.add(new KaryawanTetap(nama, gaji));
        System.out.println("Karyawan tetap berhasil ditambahkan!");
    }

    private static void tambahKaryawanKontrak() {
        System.out.print("Nama karyawan kontrak: ");
        String nama = scanner.nextLine();
        System.out.print("Durasi kontrak (bulan): ");
        int durasi = scanner.nextInt();
        daftarKaryawan.add(new KaryawanKontrak(nama, durasi));
        System.out.println("Karyawan kontrak berhasil ditambahkan!");
    }

    private static Karyawan cariKaryawan(String nama) {
        for (Karyawan k : daftarKaryawan) {
            if (k.getNama().equalsIgnoreCase(nama)) {
                return k;
            }
        }
        return null;
    }

    private static void setorTabungan() {
        System.out.print("Nama karyawan: ");
        String nama = scanner.nextLine();
        Karyawan k = cariKaryawan(nama);
        if (k != null) {
            System.out.print("Jumlah setor: ");
            double jml = scanner.nextDouble();
            k.setorTabungan(jml);
        } else {
            System.out.println("Karyawan tidak ditemukan!");
        }
    }

    private static void tarikTabungan() {
        System.out.print("Nama karyawan: ");
        String nama = scanner.nextLine();
        Karyawan k = cariKaryawan(nama);
        if (k != null) {
            System.out.print("Jumlah tarik: ");
            double jml = scanner.nextDouble();
            k.tarikTabungan(jml);
        } else {
            System.out.println("Karyawan tidak ditemukan!");
        }
    }

    private static void pinjamUang() {
        System.out.print("Nama karyawan: ");
        String nama = scanner.nextLine();
        Karyawan k = cariKaryawan(nama);
        if (k != null) {
            System.out.print("Jumlah pinjam: ");
            double jml = scanner.nextDouble();
            k.pinjamUang(jml);
        } else {
            System.out.println("Karyawan tidak ditemukan!");
        }
    }

    private static void bayarCicilan() {
        System.out.print("Nama karyawan: ");
        String nama = scanner.nextLine();
        Karyawan k = cariKaryawan(nama);
        if (k != null) {
            System.out.print("Jumlah cicilan: ");
            double jml = scanner.nextDouble();
            k.bayarCicilan(jml);
        } else {
            System.out.println("Karyawan tidak ditemukan!");
        }
    }

    private static void lihatDataKaryawan() {
        if (daftarKaryawan.isEmpty()) {
            System.out.println("Belum ada karyawan terdaftar.");
        } else {
            for (Karyawan k : daftarKaryawan) {
                k.info();
                System.out.println("-------------------------");
            }
        }
    }
}
