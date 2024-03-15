public class BarangPakaian extends Barang {
    private double harga;

    // Konstruktor
    public BarangPakaian(String kodeBarang, String namaBarang, double harga) {
        super(kodeBarang, namaBarang);
        this.harga = harga;
    }

    // Implementasi metode hitungNilai untuk BarangPakaian
    @Override
    public double hitungNilai() {
        return harga;
    }
}