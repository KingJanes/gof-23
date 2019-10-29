package GOF23.com.stu.designPattren.chainOfResponsibility;

/**
 *
 *  ������
 * */
public class Minister implements InterfaceLead {
    // ����
    private String name;
    // ְλ
    private String jop;
    // ��һ���쵼
    private InterfaceLead nextLead;

    public Minister(String name, String jop) {
        this.name = name;
        this.jop = jop;
    }

    @Override
    public void requsetHanddle(Applicant staff) {

        if (staff.getNumberOfFunds() < 50000.0) {
            //����ɹ�

            System.out.println(" ������" + staff.getName());
            System.out.println(" ���ţ�" + staff.getDepartment());
            System.out.println(" ����˵����" + staff.getCause());
            System.out.println(" �����" + staff.getNumberOfFunds());
            System.out.println("            ����ͨ��........");
            System.out.println(" ");
            System.out.println("                                          �����ˣ�" + this.getName());
            System.out.println("                                          �������ţ�" + this.getJop());
            System.out.println("                                          �����" + staff.getNumberOfFunds());


        }else{
            //����ʧ�� ����Ȩ�޲���  ������һ��������
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


