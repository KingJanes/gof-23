/***
 * UPT 传输协议 演示
 *
 *              思路：
 *
 *                  建立UPD传输的接收端
 *
 *                      1.创建udp的socket 并监听 端口
 *                      2.创建一个字节缓冲区
 *                      3.通过socket 服务接收发送进来的数据  receive 函数
 *                      4. 对数据进行解析
 */
package StuNET.com.stu.udp.org;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiveDome {

    public void receiveDemo() throws IOException {

        System.out.println("接收端也打开。。。。。。。 " );

        // 创建socket服务 顶监听10000 端口
        DatagramSocket ds = new DatagramSocket(10000);


        // 创建一个缓冲区用于存储发送端发送的数据
        byte[] buf = new byte[1024];

        //创建一个数据包对象用来接收发送端发送的数据包
        DatagramPacket dp = new DatagramPacket(buf , buf.length );

            // 将socket发送端发进来的数据包接收到数据包对象中
            ds.receive(dp);

            // 对数据进行解析
            String host = dp.getAddress().getHostAddress();

            String hostName = dp.getAddress().getHostName();

            int port = dp.getPort();

            buf = dp.getData();

            String data = new String(buf ,0 ,dp.getLength());

            System.out.println("host : " + host );
            System.out.println("hostName : " + hostName );
            System.out.println("port : " + port );
            System.out.println("data : " + data );

            //  结束函数前 关闭资源
            ds.close();
    }
}
