/**
 * Class Node
 * Merepresentasikan satu simpul (node) yang menyimpan data pelanggan.
 * Digunakan bersama oleh class Queue (antrian) dan Stack (riwayat transaksi).
 */
public class Node {
    String kodeAntrian;
    String namaPelanggan;
    double totalBelanja;
    Node next; // referensi ke node berikutnya

    // Constructor untuk membuat node baru dengan data pelanggan
    public Node(String kodeAntrian, String namaPelanggan, double totalBelanja) {
        this.kodeAntrian = kodeAntrian;
        this.namaPelanggan = namaPelanggan;
        this.totalBelanja = totalBelanja;
        this.next = null;
    }
}
