package GOF23.com.stu.designPattren.chainOfResponsibility;

/**
 *
 *  部长类
 * */
public class Minister implements InterfaceLead {
    // 名字
    private String name;
    // 职位
    private String jop;
    // 下一个领导
    private InterfaceLead nextLead;

    public Minister(String name, String jop) {
        this.name = name;
        this.jop = jop;
    }

    @Override
    public void requsetHanddle(Applicant staff) {

        if (staff.getNumberOfFunds() < 50000.0) {
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
            this.nextLead.requsetHanddle(staff);
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


