package StuIO.separteAndMrege;

import java.io.IOException;

public class FileSeparteAndMregeTest {

    public static void main(String[] args) throws IOException {
//
//        String sourceFileName = "D:\\filepm4copy\\22-IO流(字节流-练习-复制MP3).mp4";
//        String portFilePath = "D:\\filepm4copy\\port\\";
//
//        new FileSeparteMP4().slicing(sourceFileName ,portFilePath);



        String sourceFilePath = "D:\\filepm4copy\\port";
        String targerFilePath = sourceFilePath + "newfile\\";
        String newFileNames = "newfile.mp4";
        new MergeMP4().merge(sourceFilePath ,targerFilePath ,newFileNames);
    }
}
