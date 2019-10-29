package StuIO.separteAndMrege;

import java.io.File;
import java.io.FileFilter;

public class FileSuffixFilter implements FileFilter {

    private String suffix;

    public FileSuffixFilter(String suffix) {

        super();
        this.suffix = suffix;
    }

    @Override
    public boolean accept(File pathname) {
        return pathname.getName().endsWith(suffix);
    }
}
