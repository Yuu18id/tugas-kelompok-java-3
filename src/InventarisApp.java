import java.util.ArrayList;
import java.util.List;

public class InventarisApp <T extends Barang> {
    private List<T> inventaris = new ArrayList<>();

    public void tambahBarang(T barang) {
        inventaris.add(barang);
    }

    public void tampilkanDaftarBarang() {
        for(T barang : inventaris) {
            System.out.println("\nKode Barang\t: " +barang.namaBarang);
        }
    }

    public double hitungTotalNilaiInventaris() {
        double total = 0.0;
        for (T barang : inventaris) {
            total += barang.hitungNilai();
        }
        return total;
    }
}
