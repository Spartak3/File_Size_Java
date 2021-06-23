import java.io.File;

public class FileManager {
    public static long size=0;
    public volatile static boolean isEnded=false;

    public static void calculateFileSize(String filePath) throws Exception{
        calculate(filePath);
        isEnded=true;
    }

    private static int calculate(String path) throws Exception{
        //inadu erkaracnelu hamar
        Thread.sleep(1);
        File directory=new File(path);
        File[] content=directory.listFiles();
        if(content!=null) {
            for (File f : content) {
                String name=f.getName();
                if(!f.isDirectory()){
                    size+=f.length();
                }
                else{
                    calculate(f.getPath());
                }
            }
            return 0;
        }
        else{
            size+=directory.length();
            return 0;
        }
    }
}
