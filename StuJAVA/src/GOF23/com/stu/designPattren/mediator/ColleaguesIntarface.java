package GOF23.com.stu.designPattren.mediator;
/**
 *
 * 同事对象接口
 * */
public interface ColleaguesIntarface {

    //向中介者申请
    void external();
    //做本部门应该做的事
    void internal();

}
