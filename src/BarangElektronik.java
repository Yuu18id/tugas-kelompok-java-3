public class BarangElektronik extends Barang {
    // Konstruktor
    public BarangElektronik(String kodeBarang, String namaBarang, double hargaBarang) {
        super(kodeBarang, namaBarang, hargaBarang);
    }

    // Implementasi metode hitungNilai untuk BarangElektronik
    @Override
    public double hitungNilai() {
        return hargaBarang;
    }
}