import Upload.UploadUtil;
import sun.swing.FilePane;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    private static String FILEPATH = "<File Address in your computer>";
    private static String FILEPATH2 = "<File Address in your computer>";
    
    public static void main(String[] args) throws FileNotFoundException {
        String[] strings = FILEPATH.split("/");
        String filedir = "image";
        String filename = strings[strings.length - 1];
        UploadUtil uploadUtil = new UploadUtil();
        uploadUtil.uploadImage(filedir, FILEPATH);
        String callBackUrl = uploadUtil.getUrl(filedir + "/" + filename);
        System.out.println("Image Url is " + callBackUrl);

        File file = new File(FILEPATH2);
        uploadUtil.uploadImage(file, filedir);
        String callBackUrl2 = uploadUtil.getUrl(filedir + "/" + file.getName());
        System.out.println("Image Url is " + callBackUrl2);

        uploadUtil.destory();
    }
}
