public class Main {
    public static void main(String[] args) {
        //Instansi objek untuk tiap subclass Produk
        Produk mieInstan = new Makanan("Mie Instan", 5500);
        Produk airMineral = new Minuman("Air Mineral", 3000);
        Produk paracetamol = new Obat("Paracetamol", 8000);

        //Menampilkan informasi produk
        System.out.println("Informasi Produk:");
        mieInstan.infoProduk();
        airMineral.infoProduk();
        paracetamol.infoProduk();
    }
}
