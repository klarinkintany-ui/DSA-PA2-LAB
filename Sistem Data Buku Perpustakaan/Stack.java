/**
 * Class Stack
 * Menyimpan riwayat transaksi pelanggan yang sudah dilayani.
 * Menggunakan prinsip LIFO (Last In First Out): transaksi terbaru berada paling atas.
 */
public class Stack {
    private Node top; // transaksi paling atas (paling baru)
    private int jumlahTransaksi;

    public Stack() {
        this.top = null;
        this.jumlahTransaksi = 0;
    }

    /**
     * Menambahkan transaksi baru ke puncak stack (Push).
     */
    public void push(String kodeAntrian, String namaPelanggan, double totalBelanja) {
        Node baru = new Node(kodeAntrian, namaPelanggan, totalBelanja);
        baru.next = top; // node baru menunjuk ke top lama
        top = baru;       // node baru menjadi top
        jumlahTransaksi++;
        System.out.println("Transaksi disimpan ke riwayat.");
    }

    /**
     * Menampilkan seluruh riwayat transaksi dari yang terbaru ke yang paling lama.
     */
    public void tampilkanRiwayat() {
        if (top == null) {
            System.out.println("Belum ada riwayat transaksi.");
            return;
        }

        System.out.println("Riwayat Transaksi (terbaru ke lama):");
        Node current = top;
        int urutan = 1;
        while (current != null) {
            System.out.println(urutan + ". " + current.kodeAntrian +
                    " | " + current.namaPelanggan +
                    " | Rp" + current.totalBelanja);
            current = current.next;
            urutan++;
        }
        System.out.println("Total Transaksi: " + jumlahTransaksi);
    }

    public boolean isEmpty() {
        return top == null;
    }
}
