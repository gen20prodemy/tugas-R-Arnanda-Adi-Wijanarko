package main;

import base.CrudFile;
import base.CrudMap;
import implemen.CrudFileImpl;
import implemen.CrudMapImpl;
import pojo.DataSiswa;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        DataSiswa dataSiswa;
        int choice;

        // Implementasi CRUD Map
        CrudMap crudMap = new CrudMapImpl();
        do {
            System.out.println("\nMenu CRUD Map:");
            System.out.println("1. Tambah Element");
            System.out.println("2. Delete Element");
            System.out.println("3. Tampilkan Element");
            System.out.println("4. Update Element");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan ID: ");
                    int id = input.nextInt();
                    System.out.print("Masukkan Nama: ");
                    String nama = input.next();
                    System.out.print("Masukkan Nilai: ");
                    int nilai = input.nextInt();
                    dataSiswa = new DataSiswa(id, nama, nilai);
                    try {
                        crudMap.tambahElement(dataSiswa);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Masukkan ID yang ingin dihapus: ");
                    int idToDelete = input.nextInt();
                    crudMap.deleteElement(idToDelete);
                    break;
                case 3:
                    crudMap.tampilkanElement();
                    break;
                case 4:
                    System.out.print("Masukkan ID yang ingin diupdate: ");
                    int idToUpdate = input.nextInt();
                    System.out.print("Masukkan Nama: ");
                    String updatedNama = input.next();
                    System.out.print("Masukkan Nilai: ");
                    int updatedNilai = input.nextInt();
                    dataSiswa = new DataSiswa(idToUpdate, updatedNama, updatedNilai);
                    crudMap.updateElement(dataSiswa);
                    break;
                case 0:
                    System.out.println("Keluar dari Menu CRUD Map.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 0);

        // Implementasi CRUD File
        CrudFile crudFile = new CrudFileImpl();
        do {
            System.out.println("\nMenu CRUD File:");
            System.out.println("1. Tambah Row");
            System.out.println("2. Delete Row");
            System.out.println("3. Tampilkan Isi Row");
            System.out.println("4. Update Row");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan ID: ");
                    int id = input.nextInt();
                    System.out.print("Masukkan Nama: ");
                    String nama = input.next();
                    System.out.print("Masukkan Nilai: ");
                    int nilai = input.nextInt();
                    dataSiswa = new DataSiswa(id, nama, nilai);
                    crudFile.tambahRow(dataSiswa);
                    break;
                case 2:
                    System.out.print("Masukkan ID yang ingin dihapus: ");
                    int idToDelete = input.nextInt();
                    crudFile.deleteRow(idToDelete);
                    break;
                case 3:
                    crudFile.tampilkanIsiRow();
                    break;
                case 4:
                    System.out.print("Masukkan ID yang ingin diupdate: ");
                    int idToUpdate = input.nextInt();
                    System.out.print("Masukkan Nama: ");
                    String updatedNama = input.next();
                    System.out.print("Masukkan Nilai: ");
                    int updatedNilai = input.nextInt();
                    dataSiswa = new DataSiswa(idToUpdate, updatedNama, updatedNilai);
                    crudFile.updateRow(dataSiswa);
                    break;
                case 0:
                    System.out.println("Keluar dari Menu CRUD File.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 0);
    }
}

