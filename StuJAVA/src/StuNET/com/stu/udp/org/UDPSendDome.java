/***
 * UPT 传输协议 演示
 *
 *              思路：
 *
 *                  建立UPD传输的发送端
 *
 *                      1.创建udp的socket
 *                      2.对要发送的数据进行封包
 *                      3.通过udp的socket服务发送数据
 *                      4.关闭支援
 */

package StuNET.com.stu.udp.org;
import java.io.IOException;
import java.net.*;

import static java.net.InetAddress.*;

public class UDPSendDome {

    public void sendDome() throws IOException {

        //创建UPUPD服务使用DatagramSocket对象
        DatagramSocket ds = new DatagramSocket();

        //传输数据并将其转为字节数据进行传输
        String data = "UPD 传输演示数据  这样也行？...";
        byte[] buf = data.getBytes();

        // 将对要发送的数据进行数据封包  并指定要发送的数据 和数据长度 主机对象 和端口
        DatagramPacket dp = new DatagramPacket(buf ,buf.length , getByName("192.168.1.100"), 10000);

        // 通过Socket发送数据包
        ds.send(dp);

        // 关闭资源
        ds.close();

        System.out.println("数据也发送......." );
    }
}
