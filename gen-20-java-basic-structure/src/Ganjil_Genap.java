//Mengimpor kelas Scanner dari package java.util untuk membaca input dari pengguna
import java.util.Scanner;

public class Ganjil_Genap {

    public static void main(String[] args){
        //Mebuat objek Scanner untuk membaca input dari terminal
        Scanner input = new Scanner (System.in);

        //Menampilkan pesan kepada pengguna
        System.out.println("Menampilkan bilangan ganjil & genap");
        System.out.println("------------------------------");

        //Meminta pengguna untuk memasukan bilangan
        System.out.print("Masukan biangan: ");
        //Membaca bilangan bulat yang dimasukan pengguna dan menyimpannya dalam variabel x
        int x = input.nextInt();

        //Menggunakan modulus untuk menentukan nilai x ganjil atau genap
        if (x % 2 == 0){
            //Jika x dibagi dengan 2 memiliki sisa 0, maka x adalah bilangan genap
            System.out.println(x + " adalah bilangan genap");
        } else {
            //Jika x dibagi dengan 2 memiliki sisa bukan 0, maka x adalah bilangan ganjil
            System.out.println(x + " adalah bilangan ganjil");
        }
    }
}