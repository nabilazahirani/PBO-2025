public class CekNilai {
    public static void main(String[] args) {
        // Membuat beberapa data mahasiswa (tanpa Scanner)
        Perhitungan mhs1 = new Perhitungan("Andi", 90);
        Perhitungan mhs2 = new Perhitungan("Budi", 72);
        Perhitungan mhs3 = new Perhitungan("Citra", 60);

        // Menampilkan hasil
        mhs1.tampilkanHasil();
        mhs2.tampilkanHasil();
        mhs3.tampilkanHasil();
    }
}
