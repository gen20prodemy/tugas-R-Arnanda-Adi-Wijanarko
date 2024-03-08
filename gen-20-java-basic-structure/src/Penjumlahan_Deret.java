//Mengimpor kelas Scanner dari package java.util untuk membaca input dari pengguna
import java.util.Scanner;
public class Penjumlahan_Deret {

    public static void main(String[] args){
        //Mmebuat Objek Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Penjumlahan Deret Angka");
        System.out.println("-----------------------------");

        //Deklarasi variabel
        int i, n, total;

        //Meminta pengguna untuk memasukan angka untuk dilakukan penjumlahan deret
        System.out.print("Masukan angka: ");

        //Membaca angka yang dimasukan
        n = input.nextInt();

        //Inisialisasi total dengan angka pertama dari deret
        total = 1;

        //Menampilkan angka pertama dari deret
        System.out.print(1);

        //Inisialisasi i dengan 2 untuk iterasi berikutnya
        i = 2;

        //Menggunakan loop while untuk menghitung dan menampilkan deret hingga n
        while (i <= n){
            System.out.print(" + " + i); //Menampilkan angka deret saat ini
            total = total + i;           //Menambahkan angka deret saat ini ke total
            i++;                         //Meningkatkan nilai i untuk iterasi berikutnya
        }
        //Menampilkan hasil total penjumlahan deret
        System.out.println(" = "+ total);

        //Menutup Scanner
        input.close();
    }
}