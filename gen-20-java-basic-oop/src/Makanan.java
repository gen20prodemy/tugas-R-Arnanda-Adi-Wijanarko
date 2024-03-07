public class Makanan extends Produk {
    public Makanan(String nama, double harga) {
        super(nama, harga, new KategoriProduk("Makanan"));
    }

    @Override
    public double getHargaDiskon() {
        //Mmberikan diskon 10% jika harga melebihi 5000
        if (getHargaAsli() > 5000) {
            return getHargaAsli() * 0.9;
        } else {
            return getHargaAsli();
        }
    }
}
