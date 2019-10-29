package GOF23.com.stu.designPattren.composite.demo;

/**
 *      使用组合模式 模拟一个杀毒软件
 *
 * */

public interface Component {
    // 杀毒
    void antiVirus();
}
/**
 *  容器
 * */
 interface AbstaricCompositeFiles extends Component {

    //增删  文件
    void add(Component file);
    void revemo(int index);

    @Override
     void antiVirus();
 }
 /**
  * 叶子
  * */
interface AbstaricCompositeFile extends Component {

    // 从命名文件夹
    void rename(String newNmae);

    @Override
    void antiVirus();
}
