package Week16;


import java.io.File;
import java.util.Arrays;

public class Ls {

    public static void main(String[] args) {
        Ls fileList = new Ls();
        fileList.launch();

    }

    public void launch(){

        File dir = new File(".");
        System.out.println(Arrays.toString(dir.list()));
        System.out.println();
    }
}
