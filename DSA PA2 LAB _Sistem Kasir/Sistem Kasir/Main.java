import java.util.Scanner;

/**
 * Class Main
 * Program sistem kasir toko menggunakan struktur data Queue (antrian pelanggan)
 * dan Stack (riwayat transaksi).
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue antrian = new Queue();
        Stack riwayat = new Stack();
        int pilihan;

        do {
            // Tampilan menu utama
            System.out.println("\n=== SISTEM KASIR TOKO ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Layani Pelanggan");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Lihat Riwayat Transaksi");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = Integer.parseInt(sc.nextLine().trim());

            switch (pilihan) {
                case 1:
                    System.out.print("\nMasukkan Nomor Antrian: ");
                    String nomor = sc.nextLine();
                    System.out.print("Masukkan Nama Pelanggan: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Total Belanja: ");
                    double total = Double.parseDouble(sc.nextLine().trim());
                    antrian.enqueue(nomor, nama, total);
                    break;

                case 2:
                    // Dequeue pelanggan terdepan, lalu push ke riwayat transaksi
                    Node dilayani = antrian.dequeue();
                    if (dilayani != null) {
                        System.out.println("Melayani pelanggan " + dilayani.kodeAntrian +
                                " (" + dilayani.namaPelanggan + ")");
                        riwayat.push(dilayani.kodeAntrian, dilayani.namaPelanggan, dilayani.totalBelanja);
                    }
                    break;

                case 3:
                    System.out.println();
                    antrian.tampilkanAntrian();
                    break;

                case 4:
                    System.out.println();
                    riwayat.tampilkanRiwayat();
                    break;

                case 5:
                    System.out.println("Terima kasih, program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        sc.close();
    }
}
