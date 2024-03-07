class Obat extends Produk {
    public Obat(String nama, double harga) {
        super(nama, harga, new KategoriProduk("Obat"));
    }

    @Override
    public double getHargaDiskon() {
        return getHargaAsli(); // Tidak ada diskon untuk obat
    }
}
