import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        InventarisApp<Barang> ia = new InventarisApp<>();
        BarangElektronik be1 = new BarangElektronik("01", "Laptop", 10_000_000);
        BarangPakaian bp1 = new BarangPakaian("02", "Jaket Sosial", 500_000);

        ia.tambahBarang(be1);
        ia.tambahBarang(bp1);

        Scanner scanner = new Scanner(System.in);
        int pilihan = 0; // inisialisasi pilihan di luar do-while loop
        do {
            try {
                System.out.println("\nAPLIKASI INVENTARIS BARANG - KELOMPOK 5");
                System.out.println("Menu:");
                System.out.println("0. Keluar");
                System.out.println("1. Tambah Barang");
                System.out.println("2. Tampilkan Daftar Barang");
                System.out.println("3. Hitung Total Nilai Inventaris");
                System.out.println("4. Hitung Rasio");
                System.out.println("0. Keluar");
                System.out.print("Pilih : ");
                pilihan = scanner.nextInt();
                scanner.nextLine(); // konsumsi newline karakter
                switch (pilihan) {
                    case 1:
                        String kodeBarang;
                        String namaBarang;
                        double hargaBarang;
                        BarangElektronik be;
                        BarangPakaian bp;

                        // Gunakan try catch untuk handling error dari kelas Scanner
                        try {
                            System.out.println("Tambah Barang");
                            System.out.print("Masukkan Kode Barang :");
                            kodeBarang = scanner.next();
                            System.out.print("Masukkan Nama Barang :");
                            namaBarang = scanner.next();
                            System.out.print("Masukkan Harga Barang :");
                            hargaBarang = scanner.nextDouble();
                            System.out.println("Pilih Kategori Barang");
                            System.out.println("1. Elektronik");
                            System.out.println("2. Pakaian");
                            byte pilihanKategori = scanner.nextByte();
                            if (pilihanKategori == 1) {
                                be = new BarangElektronik(kodeBarang, namaBarang, hargaBarang);
                                ia.tambahBarang(be);
                            } else if (pilihanKategori == 2) {
                                bp = new BarangPakaian(kodeBarang, namaBarang, hargaBarang);
                                ia.tambahBarang(bp);
                            } else {
                                System.out.println("Pilihan Tidak Valid");
                            }
                        } catch (Exception e) {
                            System.out.println("Error : " + e.getMessage());
                        }
                        break;
                    case 2:
                        System.out.println("Daftar Barang");
                        ia.tampilkanDaftarBarang();
                        break;
                    case 3:
                        DecimalFormat df = new DecimalFormat("#,##0.00"); // Format dengan dua desimal angka di belakang
                                                                          // koma dan pemisah ribuan
                        String nilaiFormatted = df.format(ia.hitungTotalNilaiInventaris());
                        System.out.println("Rp." + nilaiFormatted);
                        break;
                    case 4:
                        try{
                            System.out.println("Hitung Rasio");
                            System.out.println("Masukkan nilai pertama: ");
                            double nilai1 = scanner.nextDouble();
                            System.out.println("Masukkan nilai kedua: ");
                            double nilai2 = scanner.nextDouble();
                            double rasio = ia.hitungRasio(nilai1, nilai2);
                            System.out.println("Rasio nilai pertama dan kedua :" + rasio);       
                    } catch (ArithmeticException e){
                        System.out.println("Error: " + e.getMessage());
                    } catch (InputMismatchException e){
                        System.out.println("Error: Format input harus angka");
                        scanner.nextLine();
                    }
                    break;
                    case 0:
                        System.out.println("Terimakasih. Program Selesai");
                    default:
                        System.out.println("Pilihan tidak valid.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Format input harus angka");
                scanner.nextLine(); // membersihkan input yang tidak valid
            }
        } while (pilihan != 0);
        scanner.close();
    }
}
