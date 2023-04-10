import service.SelectService;
import util.AllTextFiles;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AllTextFiles allTextFiles=new AllTextFiles();
        SelectService service=new SelectService();
        allTextFiles.Header();
        service.SelectService();
    }
}