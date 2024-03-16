public class BarangPakaian extends Barang {
    // Konstruktor
    public BarangPakaian(String kodeBarang, String namaBarang, double hargaBarang) {
        super(kodeBarang, namaBarang, hargaBarang);
    }

    // Implementasi metode hitungNilai untuk BarangPakaian
    @Override
    public double hitungNilai() {
        return hargaBarang;
    }
}