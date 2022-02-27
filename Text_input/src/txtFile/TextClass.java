package txtFile;
import java.util.*;
import java.io.*;
public class TextClass {
    public static void main(String[] args){

           String file = "userStrings.txt";
        try {
           Scanner sc = new Scanner(System.in);
           FileWriter fw = new FileWriter(file);
           while (true) {
               String input = sc.nextLine();
               if ("Done".equalsIgnoreCase(input.trim())) {
                   break;
               }
               fw.write(input);
           }
           sc.close();
           fw.close();
       }catch (IOException ex){

       }

    }
}
