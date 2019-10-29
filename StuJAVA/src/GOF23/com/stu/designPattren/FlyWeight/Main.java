package GOF23.com.stu.designPattren.FlyWeight;

public class Main {
    public static void main(String[] args) {
        InteriorChess chess1 = ChessFlyweightFactory.get("黑色" ,15,"圆形");
        InteriorChess chess2 = ChessFlyweightFactory.get("黑色" ,15,"圆形");
        InteriorChess chess3 = ChessFlyweightFactory.get("黑色" ,15,"圆形");
        InteriorChess chess4 = ChessFlyweightFactory.get("白色" ,15,"圆形");
        InteriorChess chess5 = ChessFlyweightFactory.get("蓝色" ,15,"圆形");
        InteriorChess chess6 = ChessFlyweightFactory.get("白色" ,15,"圆形");


        //给棋子添加坐标
         chess1.addOursideInfo(new OutsideChess(50.1 ,15.2));
         chess2.addOursideInfo(new OutsideChess(44.1 ,14.2));
         chess3.addOursideInfo(new OutsideChess(14.1 ,15.2));
         chess4.addOursideInfo(new OutsideChess(54.1 ,45.2));
         chess5.addOursideInfo(new OutsideChess(24.1 ,75.2));
         chess6.addOursideInfo(new OutsideChess(51.1 ,45.2));

        System.out.println(chess1);
        System.out.println(chess2);
        System.out.println(chess3);
        System.out.println(chess4);
        System.out.println(chess5);
        System.out.println(chess6);

    }
}
