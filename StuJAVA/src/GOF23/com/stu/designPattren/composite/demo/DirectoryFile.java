package GOF23.com.stu.designPattren.composite.demo;

import java.util.ArrayList;
import java.util.List;

public class DirectoryFile implements AbstaricCompositeFiles {

    private String dirName;
    // 内部容器 存储实体文件
    private List<Component>chiled ;

    public DirectoryFile(String dirName) {
        this.dirName = dirName;
        chiled = new ArrayList<Component>();
    }

    @Override
    public void add(Component file) {
        chiled.add(file);
    }

    @Override
    public void revemo(int index) {
        chiled.remove(index);
    }

    @Override
    public void antiVirus() {

        System.out.println( this.getDirName()+ "  ---目录杀毒中........");
            for (Component files : chiled){
                files.antiVirus();
            }
       // System.out.println( this.getDirName()+ "  目录杀毒完成.....");

    }

    public String getDirName() {
        return dirName;
    }
}
class TxtFile implements AbstaricCompositeFile {
    private String fileName;

    public TxtFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void rename(String newNmae) {
        this.setFileName(newNmae);
    }

    @Override
    public void antiVirus() {
        System.out.println( this.getFileName()+ "  Txt文件杀毒中........");
        System.out.println( this.getFileName()+ "  Txt文件杀毒完成.....");
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
class VideoFile implements AbstaricCompositeFile {
    private String fileName;

    public VideoFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void rename(String newNmae) {
        this.setFileName(newNmae);
    }

    @Override
    public void antiVirus() {
        System.out.println( this.getFileName()+ "  video文件杀毒中........");
        System.out.println( this.getFileName()+ "  video文件杀毒完成.....");
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
class ImageFile implements AbstaricCompositeFile {
    private String fileName;

    public ImageFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void antiVirus() {
        System.out.println( this.getFileName()+ "  Image文件杀毒中........");
        System.out.println( this.getFileName()+ "  Image文件杀毒完成.....");
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void rename(String newNmae) {
        this.setFileName(newNmae);
    }
}

