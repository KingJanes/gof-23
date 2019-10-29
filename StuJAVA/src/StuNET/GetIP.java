
package StuNET;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIP {


    public void get() throws UnknownHostException {


        InetAddress ia = InetAddress.getByName("www.sina.com");

        System.out.println(ia.getHostAddress());
        System.out.println(ia.getHostName());
    }
}
