import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws Exception {

        //paths
        String path="/Users/user/Desktop/ProgramsJava";
        String path3="/Users/user/Desktop/test";
        String path2="/Users/user/DeveloperF";

        //thread for calculating size
        Thread thread=new Thread(new MyRunable(path2));
        thread.start();

        //print size during execution
        while (!FileManager.isEnded){
            System.out.println(FileManager.size);
            Thread.sleep(100);
        }
        thread.join();

        System.out.println(FileManager.size);

    }
}
