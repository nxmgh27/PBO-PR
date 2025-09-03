import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Koperasi koperasi = new Koperasi();
        int pilihan;

        do {
            System.out.println("========================================");
            System.out.println("    KOPERASI SIMPAN PINJAM  KARYAWAN"    );
            System.out.println("========================================");
            System.out.println("[1] Setor Tabungan");
            System.out.println("[2] Tarik Tabungan");
            System.out.println("[3] Ajukan Pinjaman");
            System.out.println("[4] Bayar Pinjaman");
            System.out.println("[5] Lihat Data Karyawan");
            System.out.println("[0] Keluar");
            System.out.println("----------------------------------------");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1 -> { // setor tabungan
                    System.out.print("Masukkan nama karyawan: ");
                    String nama = sc.nextLine();
                    System.out.print("Jumlah setor: ");
                    double setor = sc.nextDouble();

                    Karyawan k1 = koperasi.cariKaryawan(nama);

                    if (k1 == null) {
                        // kalau belum ada → bikin baru
                        k1 = koperasi.tambahKaryawan(nama, setor);
                    } else {
                        k1.setorTabungan(setor);
                    }

                    System.out.println("\n+--------------------------------------+");
                    System.out.println("|          STRUK TABUNGAN              |");
                    System.out.println("+--------------------------------------+");
                    System.out.printf("| Nama Karyawan : %-20s |\n", k1.getNama());
                    System.out.printf("| Setoran       : Rp%,15.2f    |\n", setor);
                    System.out.printf("| Saldo Tabungan: Rp%,15.2f    |\n", k1.getTabungan());
                    System.out.println("+--------------------------------------+\n");
                }

                case 2 -> { // tarik tabungan
                    System.out.print("Masukkan nama karyawan: ");
                    String nama = sc.nextLine();
                    Karyawan k2 = koperasi.cariKaryawan(nama);

                    if (k2 == null) {
                        System.out.println("\nKaryawan tidak ditemukan!\n");
                    } else {
                        System.out.print("Jumlah tarik: ");
                        double tarik = sc.nextDouble();
                        if (k2.tarikTabungan(tarik)) {
                            System.out.println("\n+--------------------------------------+");
                            System.out.println("|          STRUK PENARIKAN             |");
                            System.out.println("+--------------------------------------+");
                            System.out.printf("| Nama Karyawan : %-20s |\n", k2.getNama());
                            System.out.printf("| Tarikan       : Rp%,15.2f    |\n", tarik);
                            System.out.printf("| Sisa Tabungan : Rp%,15.2f    |\n", k2.getTabungan());
                            System.out.println("+--------------------------------------+\n");
                        } else {
                            System.out.println("\nSaldo tabungan tidak mencukupi!\n");
                        }
                    }
                }

                case 3 -> { // ajukan pinjaman
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

                        System.out.println("\n+--------------------------------------+");
                        System.out.println("|            STRUK PINJAMAN              |");
                        System.out.println("+--------------------------------------+");
                        System.out.printf("| Nama Karyawan : %-20s |\n", k3.getNama());
                        System.out.printf("| Jumlah Pinjam : Rp%,15.2f    |\n", pinjam);
                        System.out.printf("| Cicilan/Minggu: Rp%,15.2f    |\n", cicilan);
                        System.out.printf("| Sisa Pinjaman : Rp%,15.2f    |\n", k3.getPinjaman());
                        System.out.println("+--------------------------------------+\n");
                    }
                }

                case 4 -> { // bayar pinjaman
                    System.out.print("Masukkan nama karyawan: ");
                    String nama = sc.nextLine();
                    Karyawan k4 = koperasi.cariKaryawan(nama);

                    if (k4 == null) {
                        System.out.println("\nKaryawan tidak ditemukan!\n");
                    } else if (k4.getPinjaman() == 0) {
                        System.out.println("\nPinjaman sudah LUNAS!\n");
                    } else {
                        k4.bayarPinjaman();
                        System.out.println("\n+--------------------------------------+");
                        System.out.println("|          STRUK PEMBAYARAN            |");
                        System.out.println("+--------------------------------------+");
                        System.out.printf("| Nama Karyawan : %-20s |\n", k4.getNama());
                        System.out.printf("| Cicilan Bayar : Rp%,15.2f    |\n", k4.getCicilan());
                        System.out.printf("| Sisa Pinjaman : %-17s        |\n",
                                (k4.getPinjaman() == 0 ? "LUNAS" : String.format("Rp%,.2f", k4.getPinjaman())));
                        System.out.println("+--------------------------------------+\n");
                    }
                }

                case 5 -> koperasi.tampilkanData();

                case 0 -> System.out.println("\nTerima kasih sudah menggunakan koperasi!\n");

                default -> System.out.println("\nMenu tidak tersedia!\n");
            }
        } while (pilihan != 0);

        sc.close();
    }
}