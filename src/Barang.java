// Barang.java
public abstract class Barang {
    protected String kodeBarang;
    protected String namaBarang;

    public Barang(String kodeBarang, String namaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
    }

    public abstract double hitungNilai();
    
    // Enum JenisBarang
    public enum JenisBarang {
        ELEKTRONIK, PAKAIAN
    }
}