package GOF23.com.stu.designPattren.chainOfResponsibility;

public class Mian {
    public static void main(String[] args) {

        InterfaceLead enp = new Minister("����","����");
        InterfaceLead enp1 = new Director("����","����");
        InterfaceLead enp2 = new ViceManger("����","���ܾ���");
        InterfaceLead enp3 = new GeneralManager("����","�ܾ���");
            enp.nextLead(enp1);
            enp1.nextLead(enp2);
            enp2.nextLead(enp3);

         Applicant applicant = new Applicant("С��" ,"�ɹ���" ,"�ɹ�CUP" ,562135.2);
            applicant.requset(enp);


    }
}
