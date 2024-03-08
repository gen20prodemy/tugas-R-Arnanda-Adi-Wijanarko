import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadText {

    //method static untuk membaca teks dari file yang pathnya diberikan sebagai argumen
    public static String textRead(String filePath){
        //StringBuilder untuk mengumpulkan konten file
        StringBuilder content = new StringBuilder();

        //mencoba membuka dan membaca file
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            //membaca file per baris
            while((line = br.readLine()) !=null){
                //menambahkan setiap baris ke StringBuilder dan diikuiti oleh newline
                content.append(line).append("\n");
            }
            //menangkap dan menangani IOException yang mungkin terjadi selama operasi file
        } catch(IOException e){
            //menampilka  pesan error jika terjadi kesalahan saat membaca file
            System.err.println("Error saat membaca file: "+ e.getMessage());
        }
        //mengembalikan konten file sebagai string
        return content.toString();
    }
}