package txtFile;
import java.io.*;
import java.util.*;
import java.util.logging.*;
public class Filetext {
    public static void main(String[] args){

        String file="userStrings.txt";
        Scanner sc=new Scanner(System.in);
        sc.useDelimiter("\\n");
        System.out.println("Enter 'done' to terminate");
        try(PrintWriter fw=new PrintWriter(new File(file))) {
            String line = null;
            while ((line = sc.nextLine()) != null) {
                if (line.trim().equalsIgnoreCase("done")) {
                    System.out.println("Exiting");
                    System.exit(0);
                }
            }
            fw.println(line);
        }catch(FileNotFoundException ex){
            //Logger.getLogger(MaxByTest.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }


