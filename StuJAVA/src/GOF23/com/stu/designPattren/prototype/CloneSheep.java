package GOF23.com.stu.designPattren.prototype;
import java.util.Date;
/**
 *   深克隆演示
 *
 * */
public class CloneSheep implements Cloneable{

    private String name;
    private Date date;

    public CloneSheep(String name, Date date) {
        this.name = name;
        this.date = date;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        CloneSheep cs = (CloneSheep) obj;
            //将属性进行深克隆
            cs.date = (Date) this.date.clone();
        return obj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }
}
