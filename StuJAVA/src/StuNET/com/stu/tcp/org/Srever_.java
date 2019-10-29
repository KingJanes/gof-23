/**
 *   创建服务端的思路
 *
 *      1.创建服务端使用ServerSocket  同时必须提供一个监听端口否则服务端无法建立连接
 *
 *      2.通过服务端的ServerSocket服务获取客服端的Socket服务对象
 *
 *      3.通过客服端的Socket 对象获取客服端的输入流 并读取并解析数据
 *
 *      4. 关闭客户端的资源 服务端资源不应该关闭
 */

package StuNET.com.stu.tcp.org;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Srever_ {

    public void startSrever() throws IOException {

        // 使用ServerSocket对象 创建服务端的Socket服务 同时必须提供一个监听端口否则客户端无法建立连接
        ServerSocket ss = new ServerSocket(10001);

        while(true) {

            // 获取服务端对象
            Socket s = ss.accept();

            // 获取服务端的输入流
            InputStream in = s.getInputStream();

            // 解析客户端发来的数据
            byte[] buf = new byte[1024];
            int line = in.read(buf);
            String data = new String(buf ,0 ,line);

            String host = s.getInetAddress().getHostAddress();

            System.out.println(host + "：  " +data);
            // 关闭服务端和客服端的资源      通常服务端不用关
             s.close();
//            ss.close();
        }
    }
}
