import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        //Mmebuat objek Scanner untuk dapat membaca input dari pengguna
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Masukan umur: ");
            int age = input.nextInt();
            //Memanggil metod validAge untuk memvalidasi parameter umur
            AgeValidation.validateAge(age);
        }
        //Menangkap dan menangani CustomAgeException untuk kesalahan pada validasi umur
        catch (CustomAgeException e){
            System.err.println("Terjadi kesalahan validasi: " + e.getMessage());
            e.printStackTrace();//Menampilkan exception yang terjadi
        }
        //Menangkap dan menangani InputMisMatchException untuk input non-angka
        catch (InputMismatchException e){
            System.err.println("Harap masukan angka");
            e.printStackTrace();

        }
        //Blok finally untuk menutup scanner
        finally {
                input.close();
                System.out.println("scanner telah ditutup");
        }
    }
}