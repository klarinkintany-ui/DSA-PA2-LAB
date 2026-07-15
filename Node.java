/**
 * Class Node
 * Merepresentasikan satu simpul (node) dalam Single Linked List.
 * Setiap node menyimpan data satu buku dan referensi ke node berikutnya.
 */
public class Node {
    String kodeBuku;
    String judul;
    String penulis;
    Node next; // referensi ke node selanjutnya

    // Constructor untuk membuat node baru dengan data buku
    public Node(String kodeBuku, String judul, String penulis) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.next = null;
    }
}
