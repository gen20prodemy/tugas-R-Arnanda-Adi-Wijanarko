import java.util.*;

public class Main{

    public static ArrayList<String> inputListBarang(Scanner input){
        System.out.print("Jumlah barang yang akan diinput: ");
        int jumlahBarang = Integer.parseInt(input.nextLine()); //Meminta jumlah dari barang yang akan diinput oleh pengguna
        ArrayList<String> barang = new ArrayList<>();          //deklarasi ArrayList untuk menyimpan barang

        for(int i = 0; i <jumlahBarang; i++){
            System.out.print("Barang ke-" + (i + 1)+ ": ");
            barang.add(input.nextLine());
        }
        return barang;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Menampilkan semua barang pada ArrayList
        ArrayList<String> barangArrayList = inputListBarang(input);
        System.out.println("\n----- Barang Menggunakan ArrayList -----");
        for(String barang : barangArrayList){
            System.out.println(barang);
        }

        // Menampilkan salah satu barang yang ingin ditampilkan
        if (!barangArrayList.isEmpty()) {
            System.out.println("\nSalah satu barang dari ArrayList: " + barangArrayList.get(0));
        }

        //Mengkonversi menjadi LinkedList
        System.out.println("\n----- Barang menggunakan LinkedList -----");
        LinkedList<String> barangLinkedList = new LinkedList<>(barangArrayList);
        for(String barang : barangLinkedList){
            System.out.println(barang);
        }

        //Mengkonversi menjadi HashSet
        System.out.println("\n----- Barang menggunakan HashSet -----");
        HashSet<String> barangHashSet = new HashSet<>(barangArrayList);
        for(String barang : barangHashSet){
            System.out.println(barang);
        }
        //Mengkonversi menjadi TreeSet
        System.out.println("\n----- Barang menggunakan TreeSet -----");
        TreeSet<String> barangTreeSet = new TreeSet<>(barangArrayList);
        for(String barang: barangTreeSet){
            System.out.println(barang);
        }
    }
}