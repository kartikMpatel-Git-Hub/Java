package I.O_FileHandle;
import java.io.*;
import java.util.Scanner;

public class CreateNewFile {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String fileName = new String();
        String writeWhat = new String();
        System.out.println("Enter File Name :");
        fileName = S.nextLine();
        try{
            File fc = new File(fileName);
            fc.createNewFile();
            try(FileWriter fw = new FileWriter(fileName,true)){
                System.out.println("Enter What You Want To Write In File :");
                writeWhat = S.nextLine();
                fw.write(writeWhat);
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

        try(BufferedReader fr = new BufferedReader(new FileReader(fileName))){
            fr.readLine();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }   
}
