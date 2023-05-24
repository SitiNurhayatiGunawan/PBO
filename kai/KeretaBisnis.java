package kai;

public class KeretaBisnis extends KeretaApi {
    private int jumlahKursi;

    public KeretaBisnis(String nama, int jumlahPenumpang, int jumlahKursi) {
        super(nama, jumlahPenumpang);
        this.jumlahKursi = jumlahKursi;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public void info() {
        System.out.println("Kereta Bisnis");
        System.out.println("Nama: " + getNama());
        System.out.println("Jumlah Penumpang: " + getJumlahPenumpang());
        System.out.println("Jumlah Kursi: " + jumlahKursi);
    }
}