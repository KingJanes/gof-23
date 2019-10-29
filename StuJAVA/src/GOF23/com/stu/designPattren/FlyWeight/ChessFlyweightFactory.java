package GOF23.com.stu.designPattren.FlyWeight;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 享元工厂类
 * */
public class ChessFlyweightFactory {

    private ChessFlyweightFactory() { }

//    public static Map<OutsideChess, InteriorChess> getInstance(){
//        return  ChessIncstanceMap.chessMap;
//    }
//    private static class ChessIncstanceMap{
        private static final Map<String ,InteriorChess> chessMap = new TreeMap<String,InteriorChess>();
//    }

    public static InteriorChess get(String colorName ,int ch ,String form){

       if (chessMap.get(colorName) != null) {
           return chessMap.get(colorName);
       }else{
           InteriorChess value = new InteriorChess(colorName,ch,form);
           chessMap.put(colorName,value);
           return value;
       }
    }
}
