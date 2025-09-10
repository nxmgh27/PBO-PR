package id.ac.polban.service;

import id.ac.polban.model.Karyawan;
import id.ac.polban.model.Koperasi;
import java.util.Scanner;

public class MenuService {
    private static final Scanner sc = new Scanner(System.in);

    public static int tampilkanMenu() {
        System.out.println("========================================");
        System.out.println("    KOPERASI SIMPAN PINJAM  KARYAWAN"   );
        System.out.println("========================================");
        System.out.println("[1] Setor Tabungan");
        System.out.println("[2] Tarik Tabungan");
        System.out.println("[3] Ajukan Pinjaman");
        System.out.println("[4] Bayar Pinjaman");
        System.out.println("[5] Lihat Data Karyawan");
        System.out.println("[0] Keluar");
        System.out.println("----------------------------------------");
        System.out.print("Pilih menu: ");
        return sc.nextInt(); 
    }

    public static void jalankanPilihan(int pilihan, Koperasi koperasi) {
        sc.nextLine(); 
        switch (pilihan) {
            case 1 -> { 
                System.out.print("Masukkan nama karyawan: ");
                String nama = sc.nextLine();
                System.out.print("Jumlah setor: ");
                double setor = sc.nextDouble();

                Karyawan k1 = koperasi.cariKaryawan(nama);
                if (k1 == null) {
                    k1 = koperasi.tambahKaryawan(nama, setor);
                } else {
                    k1.setorTabungan(setor);
                }
                System.out.println("Setor berhasil untuk " + k1.getNama());
            }

            case 2 -> { 
                System.out.print("Masukkan nama karyawan: ");
                String nama = sc.nextLine();
                Karyawan k2 = koperasi.cariKaryawan(nama);

                if (k2 == null) {
                    System.out.println("\nKaryawan tidak ditemukan!\n");
                } else {
                    System.out.print("Jumlah tarik: ");
                    double tarik = sc.nextDouble();
                    if (k2.tarikTabungan(tarik)) {
                        System.out.println("Penarikan berhasil!");
                    } else {
                        System.out.println("\nSaldo tabungan tidak mencukupi!\n");
                    }
                }
            }

            case 3 -> { 
                System.out.print("Masukkan nama karyawan: ");
                String nama = sc.nextLine();
                Karyawan k3 = koperasi.cariKaryawan(nama);

                if (k3 == null) {
                    System.out.println("\nKaryawan tidak ditemukan! Harus setor tabungan dulu.\n");
                } else {
                    System.out.print("Jumlah pinjaman: ");
                    double pinjam = sc.nextDouble();
                    System.out.print("Cicilan per minggu: ");
                    double cicilan = sc.nextDouble();
                    k3.ajukanPinjaman(pinjam, cicilan);
                    System.out.println("Pinjaman berhasil diajukan!");
                }
            }

            case 4 -> { 
                System.out.print("Masukkan nama karyawan: ");
                String nama = sc.nextLine();
                Karyawan k4 = koperasi.cariKaryawan(nama);

                if (k4 == null) {
                    System.out.println("\nKaryawan tidak ditemukan!\n");
                } else if (k4.getPinjaman() == 0) {
                    System.out.println("\nPinjaman sudah LUNAS!\n");
                } else {
                    k4.bayarPinjaman();
                    System.out.println("Cicilan berhasil dibayar!");
                }
            }

            case 5 -> koperasi.tampilkanData();

            case 0 -> System.out.println("\nTerima kasih sudah menggunakan koperasi!\n");

            default -> System.out.println("\nMenu tidak tersedia!\n");
        }
    }
}
