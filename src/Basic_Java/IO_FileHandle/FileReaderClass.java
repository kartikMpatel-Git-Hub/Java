package I.O_FileHandle;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass{
    public static void main(String[] args) {
        //It will use to print one character at the time 
        try(FileReader fr = new FileReader("Read.txt")){// it will read The File And Throw Exception if any..
            /*
            int letter = fr.read();// It will read the first Character From File 
            while (fr.ready()) {//It Will Check is File Is Ready To Read With First Charcter Until File ENd Or ENdOFFILE
                System.out.println((char)letter);//It Will Print The Int Value(Ascii) And convert To Char With Explicitly
                letter = fr.read();//It Will Read Next Character 
            }int letter = fr.read();// It will read the first Character From File 

            You Can Also Write It Like It */

            while (fr.ready()) {//It Will Check is File Is Ready To Read With First Charcter Until File ENd Or ENdOFFILE
                System.out.println((char)fr.read());//It Will Print The Int Value(Ascii) And convert To Char With Explicitly and Also Read Next Character 
            }
        }
        catch(IOException e){//It Will Handle Exception
            System.out.println(e.getMessage());
        }
        //To Read Entire Line 

        try(BufferedReader br = new BufferedReader(new FileReader("Read.txt"))){// It Use To Print One Line At a Time 
            while (br.ready()) {//It Will Itterate Untill Line 
                System.out.println(br.readLine());// It Will Display And Also Read Next Line 
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}