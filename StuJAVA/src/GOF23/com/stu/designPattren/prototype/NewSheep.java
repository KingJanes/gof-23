package GOF23.com.stu.designPattren.prototype;

import java.time.Instant;
import java.util.Date;

public class NewSheep implements Cloneable{

    private String name;
    private Date date;

    public NewSheep(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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
