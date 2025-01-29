package I.O_FileHandle;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWrite {
    public static void main(String[] args) {
        
        try(FileReader fr = new FileReader("Read.txt")){
            try(FileWriter fw = new FileWriter("Writer.txt",true)){
                while (fr.ready()) {
                    fw.write((char)fr.read());
                }
                fw.write('\n');
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
/*
 * Sipmle Here Read Each Character From Read File And Take It And Write Into The NExt File(Write.txt)
 */