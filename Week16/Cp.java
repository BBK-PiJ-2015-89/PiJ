package Week16;

import java.io.*;
import java.util.Scanner;

/**
 * Created by graemewilkinson on 08/02/16.
 */
public class Cp {

    public static void main(String[] args) {
        Cp cp = new Cp();
        if (args.length == 2){
            cp.launch(args[0], args[1]);
        }
        else{
            System.out.println("You did not enter exactly two file names");
        }

    }
    public void launch(String source, String destination){
        File sourceFile = new File(source);
        File destinationFile = new File(destination);

        if (destinationFile.exists()){
            System.out.println("Do you want to overwrite " + destination + " - Y/N?: ");
            if(! new Scanner(System.in).nextLine().toUpperCase().equals("Y")) {
                System.out.println("Program Terminated, no further action to complete")
            }else{
                BufferedReader in = null;
                PrintWriter out = null;
                try{
                    in =  new BufferedReader(new FileReader(sourceFile));
                    out = new PrintWriter(destinationFile);
                    String line;
                    while ((line = in.readLine()) != null){
                        out.println(line);
                    }
                    System.out.println("Finished copying to destination");
                }catch (FileNotFoundException ex){
                    System.out.println("File not found");
                }catch (IOException ex){
                    ex.printStackTrace();
                }finally {
                    closeReader(in);
                    if (out != null){
                        out.close();
                    }
                }
            }
        }
    }

    public void  closeReader(Reader reader){
        try{
            if (reader != null){
                reader.close();
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
