package GOF23.com.stu.designPattren.chainOfResponsibility;
/**
 *   �ʽ�������
 * */
public class Applicant {
    // ����
    private String name;
    // ����
    private String department;
    // ����ԭ��
    private String cause;
    // ������
    private double numberOfFunds;

    public Applicant(String name, String department, String cause, double numberOfFunds) {
        this.name = name;
        this.department = department;
        this.cause = cause;
        this.numberOfFunds = numberOfFunds;
    }

    //����
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
