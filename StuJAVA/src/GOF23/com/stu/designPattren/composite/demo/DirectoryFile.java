package GOF23.com.stu.designPattren.composite.demo;

import java.util.ArrayList;
import java.util.List;

public class DirectoryFile implements AbstaricCompositeFiles {

    private String dirName;
    // �ڲ����� �洢ʵ���ļ�
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

        System.out.println( this.getDirName()+ "  ---Ŀ¼ɱ����........");
            for (Component files : chiled){
                files.antiVirus();
            }
       // System.out.println( this.getDirName()+ "  Ŀ¼ɱ�����.....");

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
        System.out.println( this.getFileName()+ "  Txt�ļ�ɱ����........");
        System.out.println( this.getFileName()+ "  Txt�ļ�ɱ�����.....");
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
        System.out.println( this.getFileName()+ "  video�ļ�ɱ����........");
        System.out.println( this.getFileName()+ "  video�ļ�ɱ�����.....");
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
        System.out.println( this.getFileName()+ "  Image�ļ�ɱ����........");
        System.out.println( this.getFileName()+ "  Image�ļ�ɱ�����.....");
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

