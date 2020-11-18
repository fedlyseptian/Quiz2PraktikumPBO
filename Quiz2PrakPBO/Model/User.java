package Model;


public class User {
    private String nim;
    private String nama;
    private int umur;
    private String alamat;
    private String telepon;

    public User(){

    }

    public User(String nim, String nama, int umur, String alamat, String telepon) {
        this.nim = nim;
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
        this.telepon = telepon;
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

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String toString() {
        return "User{" + "NIM=" + nim + ", Nama=" + nama + ", Umur=" + umur + ", Alamat=" + alamat + ", Telepon=" + telepon + '}';
    }
}
