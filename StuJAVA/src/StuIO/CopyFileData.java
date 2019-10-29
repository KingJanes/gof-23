


/**
 *   功能     copy 先循环创建3个文本文件并写入数据
 *
 *             mergerFile 将写好的文件加载进内存并将其中所有的数据重新写入另一个新的文件
 * */
package StuIO;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class CopyFileData {


    private String filePath = "C:\\Users\\Administrator\\IdeaProjects\\StuJAVA\\StuIO\\filedatatest\\";
    private String fileName = "filedatatest";
    private String fileSuffix = ".txt";


    public void mergeFile () throws IOException{

        ArrayList<FileInputStream> arrayList = new ArrayList<FileInputStream>(3);

            for (int x = 1 ; x <= 3 ; x++) {

                FileInputStream fs = new FileInputStream(filePath + fileName + x + fileSuffix);

                arrayList.add(fs);

            }

            Iterator<FileInputStream> fileIt = arrayList.iterator();

            Enumeration<FileInputStream> fileEnum = Collections.enumeration(arrayList);

        // 因为SequenceIuputStream 构造函数要接收一个Eunmeationt接口 所以创建了一个匿名内部内 可以使用集合工具类的enumeration函数获取一个Enumeration

        SequenceInputStream sis = new SequenceInputStream(new Enumeration<InputStream>() {
            @Override
            public boolean hasMoreElements() {
                return fileIt.hasNext();
            }

            @Override
            public InputStream nextElement() {
                return fileIt.next();
            }
        });

        BufferedInputStream bufr =new BufferedInputStream(sis);
        BufferedOutputStream bufw = new BufferedOutputStream( new FileOutputStream(new File(filePath + "mergefile" + fileSuffix)));

            byte[] bytes = new byte[1024];
            for(int line = 0; (line = bufr.read(bytes)) != -1;){

                bufw.write(bytes ,0 ,line);
            }

            bufr.close();
            bufw.close();

    }






    public void copy (String fileName) throws IOException {

        for (int i = 1 ; i <= 3 ; i++) {

            File file = new File(fileName+ i + ".txt");

            if (!file.exists()){

//                file.mkdir();
                file.createNewFile();
            }

            BufferedWriter bufw = new BufferedWriter(new FileWriter(file));

            for (int x = 0 ; x < 100 ; x++) {

                if ( !( x == 0 ) && (x % 20) == 0) {
                    bufw.newLine();
                }
                bufw.write(String.valueOf(i));
                bufw.flush();
            }
            bufw.newLine();
            bufw.flush();
            bufw.close();
        }

    }
}
