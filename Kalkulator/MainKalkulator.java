import java.util.Scanner;

public class MainKalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();

        System.out.println("=== Kalkulator Sederhana ===");

        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();
        
        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();

        int hasilTambah = kalkulator.tambah(angka1, angka2);
        System.out.println("Hasil penjumlahan: " + hasilTambah);

        int hasilKali = kalkulator.kali(angka1, angka2);
        System.out.println("Hasil perkalian: " + hasilKali);

        scanner.close();
    }
}
