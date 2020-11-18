package Model;

public class Mahasiswa {
    private String nim;
    private String nama;
    private int angkatan;
    private String kodeJurusan;

    public Mahasiswa(String nim, String nama, int angkatan, String kodeJurusan) {
        this.nim = nim;
        this.nama = nama;
        this.angkatan = angkatan;
        this.kodeJurusan = kodeJurusan;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    public String getKodeJurusan() {
        return kodeJurusan;
    }

    public void setKodeJurusan(String kodeJurusan) {
        this.kodeJurusan = kodeJurusan;
    }
}
