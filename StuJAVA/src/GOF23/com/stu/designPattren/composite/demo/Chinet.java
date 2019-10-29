package GOF23.com.stu.designPattren.composite.demo;
/**
 * 模拟杀毒软件入口
 * */
public class Chinet {
    public static void main(String[] args) {
        AbstaricCompositeFiles root = new DirectoryFile("我的收藏");
        AbstaricCompositeFiles dir = new DirectoryFile("我的视频");
        AbstaricCompositeFiles dir1 = new DirectoryFile("我的文件");
        AbstaricCompositeFile f1, f2, f3, f4, f5 ;

             f1 = new ImageFile("cat.jpg");
             f2 = new TxtFile("info.txt");
             f5 = new ImageFile("dog.jpg");

             dir1.add(f1);
             dir1.add(f5);
             dir1.add(f2);

             f3 = new VideoFile("大话西游.mp4");
             f4 = new VideoFile("树人.pm4");
             dir.add(f3);
             dir.add(f4);

             root.add(dir1);
             root.add(dir);
             root.antiVirus();
    }
}
