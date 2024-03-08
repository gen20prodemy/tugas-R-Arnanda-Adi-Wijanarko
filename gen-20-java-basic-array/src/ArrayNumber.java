import java.util.Scanner;

public class ArrayNumber {

    private Scanner number; //Inialisasi Scanner untuk membaca input dari pengguna

    //kontruktor untuk class ArrayNumber
    public ArrayNumber(){
        this.number = new Scanner(System.in);
    }

    //Method untuk menampilkan array satu dimensi
    public int[] arraySatuDimensi(){
        System.out.print("Panjang Array 1 Dimensi: ");
        int panjang = number.nextInt();
        int[] array = new int[panjang];

        //mengisi tiap elemen array oleh pengguna
        for(int i = 0; i<panjang; i++){
            System.out.printf("Masukan elemen ke-%d: ", i+1);
            array[i] = number.nextInt();
        }
        return array;
    }

    //method untuk menampikan array dua dimensi
    public int[][] arrayDuaDimensi(){
        System.out.print("Masukan Jumlah Baris: ");
        int baris = number.nextInt();
        System.out.print("Masukan Jumlah Kolom: ");
        int kolom = number.nextInt();
        int[][] array = new int[baris][kolom];

        //pengguna mengisi array dua dimensi untuk tiap elemen
        for (int i = 0; i<baris; i++){
            for(int j = 0; j<kolom; j++){
                System.out.printf("Masukan elemen [%d][%d]: ", i, j);
                array[i][j] = number.nextInt();
            }
        }
        return array;
    }

    //method untuk menghitung total dari semua elemen pada array satu dimensi
    public int getTotal(int[] array){
        int total = 0;
        for(int nilai:array){
            total += nilai; //menambahkan setiap elemen ke total
        }
        return total;
    }

    //method untuk menghitung total dari semua elemen dalam tiap baris array dua dimensi
    public int[] getTotal2D(int[][] array){
        int[] hasil = new int[array.length];
        for(int i = 0; i<array.length; i++){
            for(int nilai:array[i]){
                hasil[i] += nilai; //menambahkan setiap elemen ke hasil baris
            }
        }
        return hasil;
    }

    //method membalikan urutan elemen
    public int[] reverseArray(int[] array){
        int[] reverse = new int[array.length];
        for(int i = 0; i<array.length; i++){
            reverse[i] = array[(array.length - 1) - i]; //menyalin elemen dalam urutan terbalik
        }
        return reverse;
    }
}