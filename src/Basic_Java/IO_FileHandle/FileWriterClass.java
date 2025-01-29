package I.O_FileHandle;
import java.io.FileWriter;
//Import This Libarary TO Use FileWriter
import java.io.IOException;
//It Will Help To Prevent The Exception Like File Not open or file not found and somethig like it

public class FileWriterClass {
    public static void main(String[] args) {
        try(FileWriter fr = new FileWriter("Writer.txt",true)){
            /*you have to put it into a exeption to prevent file not found and other error 
            filewriter class is use to write any text inside the fine it take 1 conpulsory 
            and 2nd optional parameter 1st one is file name and second one is you want to append file or override it
            */
            fr.write("नैनं छिन्दन्ति शस्त्राणि नैनं दहति पावकः। न चैनं क्लेदयन्त्यापो न शोषयति मारुतः ॥\n");
            //write funtion is used to write any thing in text file with string or Character
        }
        catch(IOException e){
            //it will handle the exceptions 
            System.out.println(e.getMessage());
            //it display the exception 
        }
    }
}