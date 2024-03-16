// Barang.java
public abstract class Barang {
    protected String kodeBarang;
    protected String namaBarang;
    protected double hargaBarang;

    public Barang(String kodeBarang, String namaBarang, double hargaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    public abstract double hitungNilai();
    
    // Enum JenisBarang
    public enum JenisBarang {
        ELEKTRONIK, PAKAIAN
    }
}