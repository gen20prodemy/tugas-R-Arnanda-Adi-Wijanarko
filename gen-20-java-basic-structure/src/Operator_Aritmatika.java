//Mengimpor kelas Scanner dari package java.util untuk membaca input dari pengguna
import java.util.Scanner;

public class Operator_Aritmatika {

    public static void main(String[] args){
        //Deklarasi variabel untuk menyimpan angka yang diinput oleh pengguna dan hasil dari operasi
        int angka1, angka2, hasil;

        //Membuat objek Scanner untuk membaca input dari terminal
        Scanner input = new Scanner (System.in);

        //Meminta pengguna memasukkan angka pertama
        System.out.print("Input angka-1: ");
        angka1 = input.nextInt();
        //Meminta pengguna memasukkan angka kedua
        System.out.print("Input angka-2: ");
        angka2 = input.nextInt();

        //Penjumlahan
        hasil = angka1 + angka2;
        System.out.println("Hasil penjumlahan =" + hasil);

        System.out.print("Input angka-1: ");
        angka1 = input.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = input.nextInt();

        //Pengurangan
        hasil = angka1 - angka2;
        System.out.println("Hasil pengurangan =" + hasil);

        System.out.print("Input angka-1: ");
        angka1 = input.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = input.nextInt();

        //Perkalian
        hasil = angka1 * angka2;
        System.out.println("Hasil perkalian =" + hasil);

        System.out.print("Input angka-1: ");
        angka1 = input.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = input.nextInt();

        //Pembagian
        hasil= angka1 / angka2;
        System.out.println("Hasil pembagian= " + hasil);

        System.out.print("Input angka-1: ");
        angka1 = input.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = input.nextInt();

        //Sisa Bagi atau Modulus
        hasil = angka1 % angka2;
        System.out.println("Hasil modulus =" + hasil);
    }
}