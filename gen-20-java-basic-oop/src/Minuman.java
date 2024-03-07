class Minuman extends Produk {
    public Minuman(String nama, double harga) {
        super(nama, harga, new KategoriProduk("Minuman"));
    }
    @Override
    public double getHargaDiskon() {
        //diskon 5% untuk semua minuman
        return getHargaAsli() * 0.95;
    }
}
