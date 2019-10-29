/**
 *
 *           客户端发送数据到服务端
 *
 *              tcp传输   客户端建立的过程
 *
 *                  1 创建tcp客户端的服务是Socket 对象
 *                      建立该对象的就应该指定目的 要连接的主机和端口
 *
 *                  2 如果建立成功就说明该数据传输通道已建立  该通道叫Socket流
 *                      也叫网络传输流 是底层建立好的 该流可以获取IO流中的InputStream和OutputStream 对象
 *
 *                  3 使用网络流获取的IO输出流写出数据
 *
 *                  4 关闭网络流资源  网络流获取的IO流资源不用关 应为该IO流是基于网络流的
 *                          一旦网络流关闭 该IO流的存在也没有意义
 * */

package StuNET.com.stu.tcp.org;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Clinet {

    public void write() throws IOException {

        // 创建客户端的souket服务 并指定主机和端口号
        Socket s = new Socket("127.0.0.1" , 10001);

        // 获取网络流中的IO流
        OutputStream out = s.getOutputStream();

        // 通过IO流写出数据
        out.write("TUP传输协议演示第2 次....".getBytes());

        // 关闭网络流资源
        s.close();

    }
}
