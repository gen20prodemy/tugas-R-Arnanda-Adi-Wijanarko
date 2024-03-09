package pojo;

public class DataSiswa {
    private int id;
    private String nama;
    private int nilai;

    public DataSiswa(int id, String nama, int nilai) {
        this.id = id;
        this.nama = nama;
        this.nilai = nilai;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getNilai() {
        return nilai;
    }
}
