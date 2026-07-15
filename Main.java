import java.util.Scanner;

/**
 * Class Main
 * Program pengelolaan daftar buku perpustakaan menggunakan Single Linked List.
 * Menyediakan menu: Tambah, Hapus, Cari, Tampilkan Semua, dan Keluar.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList daftarBuku = new LinkedList();
        int pilihan;

        do {
            // Tampilan menu utama
            System.out.println("\n===== SISTEM DATA BUKU =====");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Lihat Semua Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = Integer.parseInt(sc.nextLine().trim());

            switch (pilihan) {
                case 1:
                    System.out.print("\nMasukkan Kode Buku: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan Judul: ");
                    String judul = sc.nextLine();
                    System.out.print("Masukkan Penulis: ");
                    String penulis = sc.nextLine();
                    daftarBuku.tambahBuku(kode, judul, penulis);
                    break;

                case 2:
                    daftarBuku.hapusBuku();
                    break;

                case 3:
                    System.out.print("\nMasukkan Kode Buku yang dicari: ");
                    String kodeCari = sc.nextLine();
                    daftarBuku.cariBuku(kodeCari);
                    break;

                case 4:
                    System.out.println();
                    daftarBuku.tampilkanSemua();
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
