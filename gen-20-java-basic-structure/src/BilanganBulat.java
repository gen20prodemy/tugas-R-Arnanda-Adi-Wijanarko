//Mengimpor kelas Scanner dari package java.util untuk membaca input dari pengguna
import java.util.Scanner;

public class BilanganBulat {

    public static void main(String[] args) {
        //Membuat Objek Scanner untuk membaca input
        Scanner input = new Scanner(System.in);

        //Meminta pengguna memasukan nilai n
        System.out.print("Masukan nilai n: ");

        //Membaca nilai n yang diberikan oleh pengguna
        int n = input.nextInt();

        //Inisialisasi count untuk menghitung angka yang dicetak
        int count = 0;
        //Mulai dari 1 sebagai angka pertama yang di periksa
        int number = 1;

        //Terus mencari dan mencetak angka sampai count sama dengan n
        while (count < n) {
            //Menggunakan modulus untuk mengetahui angka tersebut dibagi 3 habis atau tidak habis dibagi 2
            if(number % 3 == 0 && number % 2 != 0){
                System.out.print(" " + number);
                //Menambah count jika telah menemukan angka yang memenuhi
                count++;
            }
            //Pindah ke angka berikutnya untuk iterasi selanjutnya
            number++;
        }
    }
}