import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        ArrayNumber arrnum = new ArrayNumber();

        //Array satu Dimensi
        int[] arraySatuDimensi = arrnum.arraySatuDimensi();
        System.out.println("Total array satu dimensi: " + arrnum.getTotal(arraySatuDimensi));
        arraySatuDimensi = arrnum.reverseArray(arraySatuDimensi);
        System.out.println("Array satu Dimensi setelah dibalik: ");
        for (int nilai : arraySatuDimensi) {
            System.out.print(nilai + " ");
        }
        System.out.println();

        //Array Dua Dimensi
        int[][] arrayDuaDimensi = arrnum.arrayDuaDimensi();
        int[] total2D = arrnum.getTotal2D(arrayDuaDimensi);
        System.out.println("Total setiap baris pada array dua dimensi: ");
        for (int total : total2D) {
            System.out.print(total + " ");
        }
        System.out.println();

        //Membaca file txt
        String isiFile = ReadText.textRead("Test.txt");
        System.out.println("Isi File:");
        System.out.println(isiFile);

        //Masukan text pada file txt
        Scanner inputText = new Scanner(System.in);
        System.out.println("Masukan teks: ");
        String input = inputText.nextLine();
        WriteText.writerText("Test.txt", input);
        System.out.println("Teks telah berhasil ditulis");

    }


}