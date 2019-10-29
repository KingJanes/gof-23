package GOF23.com.stu.designPattren.composite;


/**
 *
 * Component  抽象构建  定义了叶子和容器的共同点
 * */
public interface AbstaictComponent {
    // 容器 和叶子的共同点
    void opertion();
}
/**
 *  叶子构建    没有子节点的就是叶子
 * */
interface AbstaictLeaf extends AbstaictComponent{
    @Override
    void opertion();
}
/**
 *
 *  容器构建   有容器自己的特征 有节点
 * */
interface AbstarictComposite extends  AbstaictComponent {

    //增删修改
    void add();
    void remove();
    void reprice();
    void set(int index , AbstaictLeaf childre);

    @Override
    void opertion();
}

