public class KategoriProduk {
    //Mendefinisikan variabel private untuk menyimpan nama kategori
    private String namaKategori;

    //cosntructor dengan parameter namaKategori
    public KategoriProduk(String namaKategori) {
        this.namaKategori = namaKategori;
    }

    //Method getter untuk mengembalikan nilai
    public String getNamaKategori() {
        return namaKategori;
    }
}
