package GOF23.com.stu.designPattren.prototype;

import java.util.Date;

public class Prototype {

    // 浅克隆  会将原形和克隆对象使用同一个属性比如时间 但不会克隆属性
    // 如果修改属性值原形和克隆对象的属性都会随之改变
    static void newClone() throws CloneNotSupportedException {
        Date time = new Date(1544624645646L);
        NewSheep s = new NewSheep("少例羊" ,time);

        System.out.println(s.getName() + "   " + s.getDate().toString());


        NewSheep s1 = (NewSheep) s.clone();


        time.setTime(96565656564L);
        System.out.println("从新设置时间后....." + s.getName() + "   " + s.getDate().toString());
        System.out.println(s1.getName() + "   " + s1.getDate().toString());
    }



    //深克隆 会将属性分离 形成1对1 互不干扰
    static void cloneSheep() throws CloneNotSupportedException {

        System.out.println( "   -----------------------分割线------------------------------------" );


        Date time = new Date(1844624645646L);
        CloneSheep s1 = new CloneSheep("欧萨",time);
            System.out.println(s1.getName() + "   " + s1.getDate().toString());

            CloneSheep s2 = (CloneSheep) s1.clone();
            time.setTime(66565656564L);
        System.out.println("从新设置时间后....." + s1.getName() + "   " + s1.getDate().toString());
        System.out.println(s2.getName() + "   " + s2.getDate().toString());
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        newClone();
        cloneSheep();
    }
}
