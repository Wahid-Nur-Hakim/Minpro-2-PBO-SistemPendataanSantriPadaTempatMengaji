package model;

public class Pengajar extends RumahQuran {

    private String mengajar;

    public Pengajar(String nama,String nomorTelepon,String mengajar) {
        super(nama, nomorTelepon);
        setMengajar(mengajar);
    }
    
    public static String getHeader(){
        return String.format(
            "%-4s | %-20s | %-15s | %-20s",
            "No", "Nama", "No. Telepon", "Mengajar");
    }

    public String getMengajar() {
        return mengajar;
    }

    public void setMengajar(String mengajar) {
        if (mengajar == null || mengajar.isBlank()) {
            throw new IllegalArgumentException("Mengajar tidak boleh kosong");
        }
        this.mengajar = mengajar.trim();
    }

    @Override
    public String getJenisPengguna() {
        return "Pengajar";
    }

    @Override
    public String toString() {
        return String.format(
                "%-20s | %-15s | %-9s",
                getNama(),getNomorTelepon(),mengajar);
    }
}