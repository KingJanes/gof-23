package GOF23.com.stu.designPattren.chainOfResponsibility;
/**
 *   资金申请人
 * */
public class Applicant {
    // 姓名
    private String name;
    // 部门
    private String department;
    // 申请原因
    private String cause;
    // 申请金额
    private double numberOfFunds;

    public Applicant(String name, String department, String cause, double numberOfFunds) {
        this.name = name;
        this.department = department;
        this.cause = cause;
        this.numberOfFunds = numberOfFunds;
    }

    //申请
    public void requset(InterfaceLead lead){

        lead.requsetHanddle(this);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public double getNumberOfFunds() {
        return numberOfFunds;
    }

    public void setNumberOfFunds(double numberOfFunds) {
        this.numberOfFunds = numberOfFunds;
    }
}
