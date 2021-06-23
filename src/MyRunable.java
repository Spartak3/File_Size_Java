public class MyRunable implements Runnable{
    String path;
    public MyRunable(String path) {
        this.path=path;
    }

    @Override
    public void run() {
        try {
            FileManager.calculateFileSize(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
