
/**
 *     功能将一个MP4视频文件进行切割 与合并
 *
 * */


package StuIO.separteAndMrege;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileSeparteMP4 {

    private static final int PORT_FILE_SICE = 1024 * 1024 * 5;

    public void slicing(String filePathAndName , String sourceFilePath) throws IOException {

        File sourceFile = new File(filePathAndName);

            if (!sourceFile.isFile()){
                throw new RuntimeException("文件不存在 无法进行切割");
            }

        File file = new File(sourceFilePath);

            if( ! (file.exists())) {
                file.mkdirs();
            }

        FileInputStream fileIn = new FileInputStream(sourceFile);

        FileOutputStream fileOut = null;

            byte[] buf = new byte[PORT_FILE_SICE];

            int line = 0;

            while( (line = fileIn.read(buf)) != -1)
        // for (line = (fileIn.read(buf)); line != -1;)
                {
                fileOut = new FileOutputStream(new File( sourceFilePath + System.currentTimeMillis() + ".port"));

                        fileOut .write(buf ,0 ,line);
                        fileOut.flush();
                }

            fileIn.close();
            fileOut.close();
    }


}
