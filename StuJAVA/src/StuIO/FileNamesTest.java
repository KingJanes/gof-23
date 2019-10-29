package StuIO;

import java.io.File;
import java.util.ArrayList;

public class FileNamesTest {

    public static void main(String[] args) {

        String dir = "d:\\";
        String suffix = ".class";
        File outFile = new File("file_names.txt");
    FileNames fn = new FileNames();
    ArrayList arrayList = fn.fileNames(dir, suffix);
        fn.WriterToFile(arrayList ,outFile);

                }
                }
