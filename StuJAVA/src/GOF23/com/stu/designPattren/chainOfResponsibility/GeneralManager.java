package GOF23.com.stu.designPattren.chainOfResponsibility;
/**
 *
 *  总经理类
 * */
public class GeneralManager implements InterfaceLead {
    // 名字
    private String name;
    // 职位
    private String jop;
    // 下一个领导
    private InterfaceLead nextLead;

    public GeneralManager(String name, String jop) {
        this.name = name;
        this.jop = jop;
    }
    @Override
    public void requsetHanddle(Applicant staff) {
        if (staff.getNumberOfFunds() < 200000.0) {
            //申请成功

            System.out.println(" 姓名：" + staff.getName());
            System.out.println(" 部门：" + staff.getDepartment());
            System.out.println(" 申请说明：" + staff.getCause());
            System.out.println(" 申请金额：" + staff.getNumberOfFunds());
            System.out.println("            申请通过........");
            System.out.println(" ");
            System.out.println("                                          审批人：" + this.getName());
            System.out.println("                                          审批部门：" + this.getJop());
            System.out.println("                                          申请金额：" + staff.getNumberOfFunds());


        }else{
            //申请失败 或则权限不够  交给下一个处理者
            if ( this.nextLead != null){
                this.nextLead.requsetHanddle(staff);
            }else{
                System.out.println("申请不通过..");
                System.out.println("                                          审批人：" + this.getName());
                System.out.println("                                          审批部门：" + this.getJop());
                System.out.println("                                          申请金额：" + staff.getNumberOfFunds());

            }
        }
    }

    @Override
    public void nextLead(InterfaceLead nextLead) {

        this.nextLead =nextLead;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJop() {
        return jop;
    }

    public void setJop(String jop) {
        this.jop = jop;
    }

    public InterfaceLead getNextLead() {
        return nextLead;
    }
}