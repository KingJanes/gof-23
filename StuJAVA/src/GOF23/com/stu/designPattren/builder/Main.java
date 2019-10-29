package GOF23.com.stu.designPattren.builder;

import GOF23.com.stu.designPattren.builder.builderanddirecyor.TomAriShipBuilder;
import GOF23.com.stu.designPattren.builder.builderanddirecyor.TomAriShipDirctor;
import GOF23.com.stu.designPattren.builder.entity.AriShip;

public class Main {

    public static void main(String[] args) {
        TomAriShipDirctor dirctor =new TomAriShipDirctor(new TomAriShipBuilder());
        AriShip ship = dirctor.cerateAriShip();
        ship.run();
    }
}
