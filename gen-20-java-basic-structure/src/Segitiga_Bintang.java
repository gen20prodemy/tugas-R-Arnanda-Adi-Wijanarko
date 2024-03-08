public class Segitiga_Bintang {

    public static void main(String[] args) {

        //Mengisi variabel x dengan nilai 5 yang menentukan tinggi segitiga
        int x = 5;

        //Loop utama untuk mencetak baris dari segitiga
        for (int i=1; i <= x; i++){
            //Loop ini mencetak spasi. Jumlah spasi berkurang setiap bertambahnya baris
            for (int j = 4; j>= i; j--){
                System.out.print(" ");
            }
            //Loop ini mencetak bintang di sisi kiri segitiga
            for (int k = 1; k<= i; k++){
                System.out.print("*");
            }
            //Loop ini mencetak bintang di sisi kanan segitiga
            //Dimulai dari baris kedua karena baris pertama hanya memiliki satu bintang
            for (int l = 1; l <= i - 1; l++){
                System.out.print("*");
            }
            //Pindah ke baris baru setelah satu baris segitiga tercetak
            System.out.println();
        }
    }
}