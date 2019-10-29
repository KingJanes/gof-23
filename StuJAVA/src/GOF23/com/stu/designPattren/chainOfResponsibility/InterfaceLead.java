package GOF23.com.stu.designPattren.chainOfResponsibility;

/**
 *
 *
 *      场景：
 *
 *          公司中SCM（Supply Chain Management 供应链管理）系统中采购生僻子系统的设计
 *
 *                  采购金额小于5万 主任审批
 *                  采购金额小于大于等于5万  小于10万 经理审批   director
 *                  采购金额小于大于等于10万  小于20万 副总理审批  vice manager
 *                  采购金额小于大于等于20万  总经理审批   general manager
 *                  采购金额大于20万 不通过

 * */

/**
 *
 * 抽象领导
 *
 */
public interface InterfaceLead {
    void requsetHanddle(Applicant staff);
    void nextLead(InterfaceLead nextLead);
}
