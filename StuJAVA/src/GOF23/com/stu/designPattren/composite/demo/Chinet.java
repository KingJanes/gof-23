package GOF23.com.stu.designPattren.composite.demo;
/**
 * ģ��ɱ��������
 * */
public class Chinet {
    public static void main(String[] args) {
        AbstaricCompositeFiles root = new DirectoryFile("�ҵ��ղ�");
        AbstaricCompositeFiles dir = new DirectoryFile("�ҵ���Ƶ");
        AbstaricCompositeFiles dir1 = new DirectoryFile("�ҵ��ļ�");
        AbstaricCompositeFile f1, f2, f3, f4, f5 ;

             f1 = new ImageFile("cat.jpg");
             f2 = new TxtFile("info.txt");
             f5 = new ImageFile("dog.jpg");

             dir1.add(f1);
             dir1.add(f5);
             dir1.add(f2);

             f3 = new VideoFile("������.mp4");
             f4 = new VideoFile("����.pm4");
             dir.add(f3);
             dir.add(f4);

             root.add(dir1);
             root.add(dir);
             root.antiVirus();
    }
}
