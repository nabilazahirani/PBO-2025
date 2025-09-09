public class Perhitungan {
    private String nama;
    private int nilai;

    public Perhitungan(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    public String getGrade() {
        if (nilai >= 85) {
            return "A";
        } else if (nilai >= 75) {
            return "B";
        } else if (nilai >= 65) {
            return "C";
        } else if (nilai >= 50) {
            return "D";
        } else {
            return "E";
        }
    }

    public String getStatus() {
        if (nilai >= 65) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }

    public void tampilkanHasil() {
        System.out.println("=== Kartu Hasil Mahasiswa ===");
        System.out.println("Nama   : " + nama);
        System.out.println("Nilai  : " + nilai);
        System.out.println("Grade  : " + getGrade());
        System.out.println("Status : " + getStatus());
        System.out.println("=============================\n");
    }
}
