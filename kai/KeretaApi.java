package kai;

public class KeretaApi {
    private String nama;
    private int jumlahPenumpang;

    public KeretaApi(String nama, int jumlahPenumpang) {
        this.nama = nama;
        this.jumlahPenumpang = jumlahPenumpang;
    }

    public String getNama() { 
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlahPenumpang() {
        return jumlahPenumpang;
    }

    public void setJumlahPenumpang(int jumlahPenumpang) {
        this.jumlahPenumpang = jumlahPenumpang;
    }
}