public class BarangElektronik extends Barang {
    private double harga;

    // Konstruktor
    public BarangElektronik(String kodeBarang, String namaBarang, double harga) {
        super(kodeBarang, namaBarang);
        this.harga = harga;
    }

    // Implementasi metode hitungNilai untuk BarangElektronik
    @Override
    public double hitungNilai() {
        return harga;
    }
}