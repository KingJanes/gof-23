package GOF23.com.stu.designPattren.chainOfResponsibility;

public class Mian {
    public static void main(String[] args) {

        InterfaceLead enp = new Minister("张三","部长");
        InterfaceLead enp1 = new Director("李四","经理");
        InterfaceLead enp2 = new ViceManger("王五","副总经理");
        InterfaceLead enp3 = new GeneralManager("赵六","总经理");
            enp.nextLead(enp1);
            enp1.nextLead(enp2);
            enp2.nextLead(enp3);

         Applicant applicant = new Applicant("小乔" ,"采购部" ,"采购CUP" ,562135.2);
            applicant.requset(enp);


    }
}
