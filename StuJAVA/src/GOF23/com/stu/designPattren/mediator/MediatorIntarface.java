package GOF23.com.stu.designPattren.mediator;


/**
 *
 * 中介者对象接口
 * */
public interface MediatorIntarface {

    //关联同事对象
    void relevance( String name , ColleaguesIntarface colleagues);

    //对外提供通知同事对象并执行
    void command(String name);

}
