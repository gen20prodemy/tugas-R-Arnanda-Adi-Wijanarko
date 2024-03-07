public abstract class Produk {
    private String nama;
    private double harga;
    private KategoriProduk kategori;

    public Produk(String nama, double harga, KategoriProduk kategori) {
        this.nama = nama;
        this.harga = harga;
        this.kategori = kategori;
    }

    public String getNama() {
        return nama;
    }

    public double getHargaAsli() {
        return harga;
    }
    //getter yang mengembalikan nama kategori dari objek kategori yang diasosiasikan dengan produk.
    public String getKategori() {
        return kategori.getNamaKategori();
    }
    //Method abstrak yang akan diimplementasikan oleh subclass
    public abstract double getHargaDiskon();

    public double hitungJumlahDiskon() {
        return getHargaAsli() - getHargaDiskon();
    }

    public void infoProduk() {
        System.out.println("----------------------------------");
        System.out.println("Nama Produk: " + getNama());
        System.out.println("Kategori: " + getKategori());
        System.out.println("Harga Asli: Rp" + getHargaAsli());
        System.out.println("Diskon: Rp" + hitungJumlahDiskon());
        System.out.println("Harga Setelah Diskon: Rp" + getHargaDiskon());
        System.out.println("-----------------------------------");
        System.out.println();
    }
}
