import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Aaron Coders on 8/14/2017.
 */
 
public class WorkingFile {

    public static void main(String [] args){

        File myFile = new File("E:\\Advise.txt");

        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNext()){
                System.out.println(sc.next());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
