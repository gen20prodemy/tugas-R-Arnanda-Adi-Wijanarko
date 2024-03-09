package implemen;

import pojo.DataSiswa;
import base.CrudFile;
import java.io.*;

public class CrudFileImpl extends CrudFile {
    private String filePath = "test.txt";

    @Override
    public void tambahRow(DataSiswa s) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(s.getId() + " " + s.getNama() + " " + s.getNilai() + "\n");
            System.out.println("Data berhasil ditambahkan.");
        }
    }

    @Override
    public void deleteRow(int id) throws IOException {
        File inputFile = new File(filePath);
        File tempFile = new File("temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            String lineToRemove = id + " ";
            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                if (!currentLine.startsWith(lineToRemove)) {
                    writer.write(currentLine + System.getProperty("line.separator"));
                }
            }
        }

        if (inputFile.delete()) {
            if (!tempFile.renameTo(inputFile)) {
                throw new IOException("Gagal mengganti nama file.");
            }
            System.out.println("Data berhasil dihapus.");
        } else {
            System.out.println("Data tidak ada.");
        }
    }

    @Override
    public void tampilkanIsiRow() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            System.out.println("Isi File:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    @Override
    public void updateRow(DataSiswa s) throws IOException {
        File inputFile = new File(filePath);
        File tempFile = new File("temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            String lineToUpdate = s.getId() + " ";
            String newLine = s.getId() + " " + s.getNama() + " " + s.getNilai();
            String currentLine;

            boolean found = false;
            while ((currentLine = reader.readLine()) != null) {
                if (currentLine.startsWith(lineToUpdate)) {
                    writer.write(newLine + System.getProperty("line.separator"));
                    found = true;
                } else {
                    writer.write(currentLine + System.getProperty("line.separator"));
                }
            }

            if (!found) {
                throw new IOException("Data tidak ditemukan.");
            }
        }

        if (inputFile.delete()) {
            if (!tempFile.renameTo(inputFile)) {
                throw new IOException("Gagal mengganti nama file.");
            }
            System.out.println("Data berhasil diupdate.");
        } else {
            System.out.println("Data tidak ada.");
        }
    }
}
