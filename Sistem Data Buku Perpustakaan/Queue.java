/**
 * Class Queue
 * Mengelola antrian pelanggan menggunakan prinsip FIFO (First In First Out).
 * Operasi utama: enqueue (tambah antrian) dan dequeue (layani pelanggan).
 */
public class Queue {
    private Node front; // pelanggan paling depan (akan dilayani lebih dulu)
    private Node rear;  // pelanggan paling belakang (terakhir masuk)
    private int jumlahAntrian;

    public Queue() {
        this.front = null;
        this.rear = null;
        this.jumlahAntrian = 0;
    }

    /**
     * Menambahkan pelanggan baru ke akhir antrian (Enqueue).
     */
    public void enqueue(String kodeAntrian, String namaPelanggan, double totalBelanja) {
        Node baru = new Node(kodeAntrian, namaPelanggan, totalBelanja);

        if (rear == null) {
            // Antrian masih kosong
            front = baru;
            rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }
        jumlahAntrian++;
        System.out.println("Data pelanggan ditambahkan ke antrian!");
    }

    /**
     * Melayani pelanggan paling depan dan mengeluarkannya dari antrian (Dequeue).
     * Mengembalikan node pelanggan yang dilayani, atau null jika antrian kosong.
     */
    public Node dequeue() {
        if (front == null) {
            System.out.println("Antrian kosong, tidak ada pelanggan untuk dilayani.");
            return null;
        }

        Node dilayani = front;
        front = front.next;

        if (front == null) {
            // Jika setelah dequeue antrian jadi kosong, reset rear juga
            rear = null;
        }
        jumlahAntrian--;
        return dilayani;
    }

    /**
     * Menampilkan seluruh pelanggan yang masih berada dalam antrian.
     */
    public void tampilkanAntrian() {
        if (front == null) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("Antrian Pelanggan Saat Ini:");
        Node current = front;
        int urutan = 1;
        while (current != null) {
            System.out.println(urutan + ". " + current.kodeAntrian +
                    " | " + current.namaPelanggan +
                    " | Rp" + current.totalBelanja);
            current = current.next;
            urutan++;
        }
        System.out.println("Total Antrian: " + jumlahAntrian);
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int getJumlahAntrian() {
        return jumlahAntrian;
    }
}
