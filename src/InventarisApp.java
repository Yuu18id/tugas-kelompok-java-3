import java.util.ArrayList;
import java.util.List;

public class InventarisApp <T extends Barang> {
    private List<T> inventaris = new ArrayList<>();

    // Method untuk menambahkan barang
    public void tambahBarang(T barang) {
        inventaris.add(barang);
    }

    // Method untuk menampilkan daftar barang
    public void tampilkanDaftarBarang() {
        for(T barang : inventaris) {
            System.out.println("\nKode Barang\t: " +barang.kodeBarang+ "\nNama Barang\t: "+barang.namaBarang+ "\nHarga Barang\t: "+ barang.hargaBarang);
        }
    }

    // Method untuk menghitung total nilai barang
    public double hitungTotalNilaiInventaris() {
        double total = 0.0;
        for (T barang : inventaris) {
            total += barang.hitungNilai();
        }
        return total;
    }

    // Method untuk menghitung rasio dua nilai
    public double hitungRasio(double nilai1, double nilai2) {
        // Penanganan exception untuk pembagian dengan nol
        if (nilai2 == 0) {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan");
        }
        return nilai1 / nilai2;
    }
}
