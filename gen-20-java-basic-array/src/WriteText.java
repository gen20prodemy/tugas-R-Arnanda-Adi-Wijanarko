import java.io.FileWriter;
import java.io.IOException;

public class WriteText {

    //methode static writerText digunakan untuk menulis konten di file txt
    public static void writerText (String filePath, String content){
        //mencoba untuk membuat objek FileWritter dan menulis konten ke file txt
        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(content);
            //menangkap dan menangani IOException yang mungkin terjadi selama operasi file
        }catch(IOException e){
            //menampilka  pesan error jika terjadi kesalahan saat menulis teks
            System.err.println("Error saat menulis file: " + e.getMessage());
        }
    }
}